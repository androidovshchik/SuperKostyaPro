package main.scene

import Phaser.Sound.BaseSound
import Phaser.Types.Scenes.SettingsConfig
import main.UNIT
import main.extension.jsObject
import main.maze.Cell
import main.maze.OrthogonalCell
import main.maze.OrthogonalMaze
import main.maze.generator.EllerGenerator
import main.maze.generator.KruskalGenerator
import main.maze.generator.PrimGenerator
import main.maze.generator.WilsonGenerator
import kotlin.math.max

abstract class GameScene(config: SettingsConfig) : BaseScene(config) {

    protected var background: BaseSound? = null

    override fun create() {
        background = sound.add("bg$tag", jsObject {
            loop = true
        })
        //background.play()
    }

    protected fun generateMap(level: Int) {
        val north = OrthogonalCell.Side.NORTH
        val east = OrthogonalCell.Side.EAST
        val south = OrthogonalCell.Side.SOUTH
        val west = OrthogonalCell.Side.WEST
        val cols = max(level, 2) * (SCALE_Y + 0)
        val rows = max(level, 2) * (SCALE_X + 0)
        val graphics = add.graphics()
        cameras.main.setSize(UNIT * (cols * SCALE_X + 1), UNIT * (rows * SCALE_Y + 1))
        console.log("${UNIT * (cols * SCALE_X + 1)} ${UNIT * (rows * SCALE_Y + 1)}")
        val maze = OrthogonalMaze(cols, rows)
        when (level) {
            1 -> WilsonGenerator()
            2 -> EllerGenerator()
            3 -> KruskalGenerator()
            else -> PrimGenerator()
        }.generate(maze)
        maze.forEachCellIndexed { col, row, cell ->
            val x = UNIT * (col * SCALE_X + 0.5f)
            val y = UNIT * (row * SCALE_Y + 0.5f)
            graphics.lineStyle(16, 0x00ff00)
                .strokeRect(x, y, UNIT * SCALE_X, UNIT * SCALE_Y)
                .lineStyle(4, 0xff0000)
            if (cell.hasSide(north) || cell.hasSide(east)) {
                val top = cell.getCellOnSide(north)
                if (top == null || !top.hasSide(south) && !top.hasSide(east)) {
                    createBlock(x + UNIT * SCALE_X, y)
                }
            }
            if (cell.hasSide(OrthogonalCell.Side.NORTH) || cell.hasSide(OrthogonalCell.Side.WEST)) {
                val top = cell.getCellOnSide(OrthogonalCell.Side.NORTH)
                val topLeft = cell.getCellOnPoint(OrthogonalCell.NORTH_WEST)
                val left = cell.getCellOnSide(OrthogonalCell.Side.WEST)
                if (
                    (top == null || (!top.hasSide(OrthogonalCell.Side.SOUTH) && !top.hasSide(
                        OrthogonalCell.Side.WEST
                    ))) &&
                    (topLeft == null || (!topLeft.hasSide(OrthogonalCell.Side.SOUTH) && !topLeft.hasSide(
                        OrthogonalCell.Side.EAST
                    ))) &&
                    (left == null || (!left.hasSide(OrthogonalCell.Side.NORTH) && !left.hasSide(
                        OrthogonalCell.Side.EAST
                    )))
                ) {
                    createBlock(x, y)
                }
            }
            if (cell.hasSide(south) || cell.hasSide(west)) {
                val left = cell.getCellOnSide(west)
                val bottomLeft = cell.getCellOnPoint(OrthogonalCell.SOUTH_WEST)
                if (
                    (left == null || (!left.hasSide(OrthogonalCell.Side.SOUTH) && !left.hasSide(
                        OrthogonalCell.Side.EAST
                    ))) &&
                    (bottomLeft == null || (!bottomLeft.hasSide(OrthogonalCell.Side.NORTH) && !bottomLeft.hasSide(
                        OrthogonalCell.Side.EAST
                    )))
                ) {
                    createBlock(x, y + UNIT * SCALE_Y)
                }
            }
            if (cell.hasSide(south) || cell.hasSide(east)) {
                createBlock(x + UNIT * SCALE_X, y + UNIT * SCALE_Y)
            }
            if (cell.hasSide(north)) {
                val exists = cell.getCellOnSide(north)?.hasSide(south) ?: false
                if (!exists) {
                    (1 until SCALE_X).forEach {
                        createBlock(x + UNIT * it, y)
                    }
                }
            }
            if (cell.hasSide(west)) {
                val exists = cell.getCellOnSide(west)?.hasSide(east) ?: false
                if (!exists) {
                    (1 until SCALE_Y).forEach {
                        createBlock(x, y + UNIT * it)
                    }
                }
            }
            if (cell.hasSide(east)) {
                (1 until SCALE_Y).forEach {
                    createBlock(x + UNIT * SCALE_X, y + UNIT * it)
                }
            }
            if (cell.hasSide(south)) {
                (1 until SCALE_X).forEach {
                    createBlock(x + UNIT * it, y + UNIT * SCALE_Y)
                }
            }
        }
    }

    abstract fun createBlock(cX: Float, cY: Float, vararg sides: Cell.Side)

    companion object {

        const val SCALE_X = 3
        const val SCALE_Y = 5
    }
}