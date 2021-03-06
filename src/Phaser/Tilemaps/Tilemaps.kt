@file:JsQualifier("Phaser.Tilemaps")

package Phaser.Tilemaps

import Phaser.*
import Phaser.Cameras.Scene2D.Camera
import Phaser.GameObjects.Components.*
import Phaser.GameObjects.GameObject
import Phaser.GameObjects.Graphics
import Phaser.GameObjects.Sprite
import Phaser.Geom.Circle
import Phaser.Geom.Line
import Phaser.Geom.Rectangle
import Phaser.Geom.Triangle
import Phaser.Math.Vector2
import Phaser.Renderer.WebGL.WebGLPipeline
import Phaser.Textures.Texture
import Phaser.Types.GameObjects.GameObjectConfig
import Phaser.Types.Tilemaps.FilteringOptions
import Phaser.Types.Tilemaps.StyleConfig
import Phaser.Types.Tilemaps.TiledObject
import org.khronos.webgl.WebGLTexture

open external class DynamicTilemapLayer : GameObject, Alpha, BlendMode, ComputedSize, Depth, Flip, GetBounds, Origin, Pipeline, ScrollFactor, Transform, Visible {
    constructor(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: String, x: Number, y: Number)
    constructor(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: Array<String>, x: Number, y: Number)
    constructor(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: Tileset, x: Number, y: Number)
    constructor(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: Array<Tileset>, x: Number, y: Number)
    open var isTilemap: Boolean
    open var tilemap: Tilemap
    open var layerIndex: integer
    open var layer: LayerData
    open var tileset: Array<Tileset>
    open var culledTiles: Array<Any>
    open var skipCull: Boolean
    open var tilesDrawn: integer
    open var tilesTotal: integer
    open var cullPaddingX: integer
    open var cullPaddingY: integer
    open var cullCallback: Function<*>
    open var gidMap: Array<Tileset>
    open fun setRenderOrder(renderOrder: integer): DynamicTilemapLayer /* this */
    open fun setRenderOrder(renderOrder: String): DynamicTilemapLayer /* this */
    open fun calculateFacesAt(tileX: integer, tileY: integer): DynamicTilemapLayer
    open fun calculateFacesWithin(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally): DynamicTilemapLayer
    open fun createFromTiles(indexes: integer, replacements: integer, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally, camera: Camera = definedExternally): Array<Sprite>
    open fun createFromTiles(indexes: integer, replacements: Array<Any>, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally, camera: Camera = definedExternally): Array<Sprite>
    open fun createFromTiles(indexes: Array<Any>, replacements: integer, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally, camera: Camera = definedExternally): Array<Sprite>
    open fun createFromTiles(indexes: Array<Any>, replacements: Array<Any>, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally, camera: Camera = definedExternally): Array<Sprite>
    open fun cull(camera: Camera = definedExternally): Array<Tile>
    open fun copy(srcTileX: integer, srcTileY: integer, width: integer, height: integer, destTileX: integer, destTileY: integer, recalculateFaces: Boolean = definedExternally): DynamicTilemapLayer
    override fun destroy(removeFromTilemap: Boolean)
    open fun fill(index: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, recalculateFaces: Boolean = definedExternally): DynamicTilemapLayer
    open fun filterTiles(callback: Function<*>, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally): Array<Tile>
    open fun findByIndex(index: integer, skip: integer = definedExternally, reverse: Boolean = definedExternally): Tile
    open fun findTile(callback: FindTileCallback, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally): Tile
    open fun forEachTile(callback: EachTileCallback, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally): DynamicTilemapLayer
    open fun getTileAt(tileX: integer, tileY: integer, nonNull: Boolean = definedExternally): Tile
    open fun getTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean = definedExternally, camera: Camera = definedExternally): Tile
    open fun getTilesWithin(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally): Array<Tile>
    open fun getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally): Array<Tile>
    open fun getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally): Array<Tile>
    open fun getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally): Array<Tile>
    open fun getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally): Array<Tile>
    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally): Array<Tile>
    open fun hasTileAt(tileX: integer, tileY: integer): Boolean
    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: Camera = definedExternally): Boolean
    open fun putTileAt(tile: integer, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally): Tile
    open fun putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally): Tile
    open fun putTileAtWorldXY(tile: integer, worldX: Number, worldY: Number, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally): Tile
    open fun putTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally): Tile
    open fun putTilesAt(tile: Array<integer>, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally): DynamicTilemapLayer
    open fun putTilesAt(tile: Array<Array<integer>>, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally): DynamicTilemapLayer
    open fun putTilesAt(tile: Array<Tile>, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally): DynamicTilemapLayer
    open fun putTilesAt(tile: Array<Array<Tile>>, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally): DynamicTilemapLayer
    open fun randomize(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, indexes: Array<integer> = definedExternally): DynamicTilemapLayer
    open fun removeTileAt(tileX: integer, tileY: integer, replaceWithNull: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally): Tile
    open fun removeTileAtWorldXY(worldX: Number, worldY: Number, replaceWithNull: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally): Tile
    open fun renderDebug(graphics: Graphics, styleConfig: StyleConfig): DynamicTilemapLayer
    open fun replaceByIndex(findIndex: integer, newIndex: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally): DynamicTilemapLayer
    open fun setSkipCull(value: Boolean = definedExternally): DynamicTilemapLayer /* this */
    open fun setCullPadding(paddingX: integer = definedExternally, paddingY: integer = definedExternally): DynamicTilemapLayer /* this */
    open fun setCollision(indexes: integer, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, updateLayer: Boolean = definedExternally): Tilemap
    open fun setCollision(indexes: Array<Any>, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, updateLayer: Boolean = definedExternally): Tilemap
    open fun setCollisionBetween(start: integer, stop: integer, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally): DynamicTilemapLayer
    open fun setCollisionByProperty(properties: Any?, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally): DynamicTilemapLayer
    open fun setCollisionByExclusion(indexes: Array<integer>, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally): DynamicTilemapLayer
    open fun setCollisionFromCollisionGroup(collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally): DynamicTilemapLayer
    open fun setTileIndexCallback(indexes: integer, callback: Function<*>, callbackContext: Any?): DynamicTilemapLayer
    open fun setTileIndexCallback(indexes: Array<integer>, callback: Function<*>, callbackContext: Any?): DynamicTilemapLayer
    open fun setTileLocationCallback(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, callback: Function<*> = definedExternally, callbackContext: Any? = definedExternally): DynamicTilemapLayer
    open fun shuffle(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally): DynamicTilemapLayer
    open fun swapByIndex(tileA: integer, tileB: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally): DynamicTilemapLayer
    open fun tileToWorldX(tileX: integer, camera: Camera = definedExternally): Number
    open fun tileToWorldY(tileY: integer, camera: Camera = definedExternally): Number
    open fun tileToWorldXY(tileX: integer, tileY: integer, point: Vector2 = definedExternally, camera: Camera = definedExternally): Vector2
    open fun weightedRandomize(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, weightedIndexes: Array<Any?> = definedExternally): DynamicTilemapLayer
    open fun worldToTileX(worldX: Number, snapToFloor: Boolean = definedExternally, camera: Camera = definedExternally): Number
    open fun worldToTileY(worldY: Number, snapToFloor: Boolean = definedExternally, camera: Camera = definedExternally): Number
    open fun worldToTileXY(worldX: Number, worldY: Number, snapToFloor: Boolean = definedExternally, point: Vector2 = definedExternally, camera: Camera = definedExternally): Vector2
    override fun clearAlpha(): DynamicTilemapLayer /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): DynamicTilemapLayer /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): DynamicTilemapLayer /* this */
    override fun setBlendMode(value: BlendModes): DynamicTilemapLayer /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): DynamicTilemapLayer /* this */
    override fun setDisplaySize(width: Number, height: Number): DynamicTilemapLayer /* this */
    override var depth: Number
    override fun setDepth(value: integer): DynamicTilemapLayer /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): DynamicTilemapLayer /* this */
    override fun toggleFlipY(): DynamicTilemapLayer /* this */
    override fun setFlipX(value: Boolean): DynamicTilemapLayer /* this */
    override fun setFlipY(value: Boolean): DynamicTilemapLayer /* this */
    override fun setFlip(x: Boolean, y: Boolean): DynamicTilemapLayer /* this */
    override fun resetFlip(): DynamicTilemapLayer /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Rectangle> getBounds(output: O): O
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): DynamicTilemapLayer /* this */
    override fun setOriginFromFrame(): DynamicTilemapLayer /* this */
    override fun setDisplayOrigin(x: Number, y: Number): DynamicTilemapLayer /* this */
    override fun updateDisplayOrigin(): DynamicTilemapLayer /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): DynamicTilemapLayer /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): DynamicTilemapLayer /* this */
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): DynamicTilemapLayer /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): DynamicTilemapLayer /* this */
    override fun setRotation(radians: Number): DynamicTilemapLayer /* this */
    override fun setAngle(degrees: Number): DynamicTilemapLayer /* this */
    override fun setScale(x: Number, y: Number): DynamicTilemapLayer /* this */
    override fun setX(value: Number): DynamicTilemapLayer /* this */
    override fun setY(value: Number): DynamicTilemapLayer /* this */
    override fun setZ(value: Number): DynamicTilemapLayer /* this */
    override fun setW(value: Number): DynamicTilemapLayer /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): DynamicTilemapLayer /* this */
}

open external class ImageCollection(name: String, firstgid: integer, width: integer = definedExternally, height: integer = definedExternally, margin: integer = definedExternally, spacing: integer = definedExternally, properties: Any? = definedExternally) {
    open var name: String
    open var firstgid: integer
    open var imageWidth: integer
    open var imageHeight: integer
    open var imageMarge: integer
    open var imageSpacing: integer
    open var properties: Any?
    open var images: Array<Any>
    open var total: integer
    open fun containsImageIndex(imageIndex: integer): Boolean
    open fun addImage(gid: integer, image: String): ImageCollection
}

open external class LayerData(config: Phaser.Types.Tilemaps.LayerDataConfig = definedExternally) {
    open var name: String
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open var tileWidth: Number
    open var tileHeight: Number
    open var baseTileWidth: Number
    open var baseTileHeight: Number
    open var widthInPixels: Number
    open var heightInPixels: Number
    open var alpha: Number
    open var visible: Boolean
    open var properties: Array<Any?>
    open var indexes: Array<Any>
    open var collideIndexes: Array<Any>
    open var callbacks: Array<Any>
    open var bodies: Array<Any>
    open var data: Array<Array<Tile>>
    open var tilemapLayer: dynamic /* Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */
}

open external class MapData(config: Phaser.Types.Tilemaps.MapDataConfig = definedExternally) {
    open var name: String
    open var width: Number
    open var height: Number
    open var infinite: Boolean
    open var tileWidth: Number
    open var tileHeight: Number
    open var widthInPixels: Number
    open var heightInPixels: Number
    open var format: integer
    open var orientation: String
    open var renderOrder: String
    open var version: String
    open var properties: Any?
    open var layers: dynamic /* Array<Phaser.Tilemaps.LayerData> | Phaser.Tilemaps.ObjectLayer */
    open var images: Array<Any>
    open var objects: Any?
    open var collision: Any?
    open var tilesets: Array<Tileset>
    open var imageCollections: Array<Any>
    open var tiles: Array<Any>
}

open external class ObjectLayer(config: Phaser.Types.Tilemaps.ObjectLayerConfig = definedExternally) {
    open var name: String
    open var opacity: Number
    open var properties: Any?
    open var propertyTypes: Any?
    open var type: String
    open var visible: Boolean
    open var objects: Array<TiledObject>
}

external fun ParseToTilemap(scene: Scene, key: String = definedExternally, tileWidth: integer = definedExternally, tileHeight: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, data: Array<Array<integer>> = definedExternally, insertNull: Boolean = definedExternally): Tilemap

open external class StaticTilemapLayer : GameObject, Alpha, BlendMode, ComputedSize, Depth, Flip, GetBounds, Origin, Pipeline, Transform, Visible, ScrollFactor {
    constructor(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: String, x: Number, y: Number)
    constructor(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: Array<String>, x: Number, y: Number)
    constructor(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: Tileset, x: Number, y: Number)
    constructor(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: Array<Tileset>, x: Number, y: Number)
    open var isTilemap: Boolean
    open var tilemap: Tilemap
    open var layerIndex: integer
    open var layer: LayerData
    open var tileset: Array<Tileset>
    open var culledTiles: Array<Any>
    open var skipCull: Boolean
    open var tilesDrawn: integer
    open var tilesTotal: integer
    open var cullPaddingX: integer
    open var cullPaddingY: integer
    open var cullCallback: Function<*>
    open var gidMap: Array<Tileset>
    open fun upload(camera: Camera, tilesetIndex: integer): StaticTilemapLayer
    open fun setRenderOrder(renderOrder: integer): StaticTilemapLayer /* this */
    open fun setRenderOrder(renderOrder: String): StaticTilemapLayer /* this */
    open fun calculateFacesAt(tileX: integer, tileY: integer): StaticTilemapLayer
    open fun calculateFacesWithin(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally): StaticTilemapLayer
    open fun createFromTiles(indexes: integer, replacements: integer, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally, camera: Camera = definedExternally): Array<Sprite>
    open fun createFromTiles(indexes: integer, replacements: Array<Any>, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally, camera: Camera = definedExternally): Array<Sprite>
    open fun createFromTiles(indexes: Array<Any>, replacements: integer, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally, camera: Camera = definedExternally): Array<Sprite>
    open fun createFromTiles(indexes: Array<Any>, replacements: Array<Any>, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally, camera: Camera = definedExternally): Array<Sprite>
    open fun cull(camera: Camera = definedExternally): Array<Tile>
    open fun setSkipCull(value: Boolean = definedExternally): StaticTilemapLayer /* this */
    open fun setCullPadding(paddingX: integer = definedExternally, paddingY: integer = definedExternally): StaticTilemapLayer /* this */
    open fun findByIndex(index: integer, skip: integer = definedExternally, reverse: Boolean = definedExternally): Tile
    open fun findTile(callback: Function<*>, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally): Tile
    open fun filterTiles(callback: Function<*>, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally): Array<Tile>
    open fun forEachTile(callback: Function<*>, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally): StaticTilemapLayer
    open fun getTileAt(tileX: integer, tileY: integer, nonNull: Boolean = definedExternally): Tile
    open fun getTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean = definedExternally, camera: Camera = definedExternally): Tile
    open fun getTilesWithin(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally): Array<Tile>
    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally): Array<Tile>
    open fun getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally): Array<Tile>
    open fun getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally): Array<Tile>
    open fun getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally): Array<Tile>
    open fun getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally): Array<Tile>
    open fun hasTileAt(tileX: integer, tileY: integer): Boolean
    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: Camera = definedExternally): Boolean
    open fun renderDebug(graphics: Graphics, styleConfig: StyleConfig): StaticTilemapLayer
    open fun setCollision(indexes: integer, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, updateLayer: Boolean = definedExternally): StaticTilemapLayer
    open fun setCollision(indexes: Array<Any>, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, updateLayer: Boolean = definedExternally): StaticTilemapLayer
    open fun setCollisionBetween(start: integer, stop: integer, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally): StaticTilemapLayer
    open fun setCollisionByProperty(properties: Any?, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally): StaticTilemapLayer
    open fun setCollisionByExclusion(indexes: Array<integer>, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally): StaticTilemapLayer
    open fun setTileIndexCallback(indexes: integer, callback: Function<*>, callbackContext: Any?): StaticTilemapLayer
    open fun setTileIndexCallback(indexes: Array<Any>, callback: Function<*>, callbackContext: Any?): StaticTilemapLayer
    open fun setCollisionFromCollisionGroup(collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally): StaticTilemapLayer
    open fun setTileLocationCallback(tileX: integer, tileY: integer, width: integer, height: integer, callback: Function<*>, callbackContext: Any? = definedExternally): StaticTilemapLayer
    open fun tileToWorldX(tileX: integer, camera: Camera = definedExternally): Number
    open fun tileToWorldY(tileY: integer, camera: Camera = definedExternally): Number
    open fun tileToWorldXY(tileX: integer, tileY: integer, point: Vector2 = definedExternally, camera: Camera = definedExternally): Vector2
    open fun worldToTileX(worldX: Number, snapToFloor: Boolean = definedExternally, camera: Camera = definedExternally): Number
    open fun worldToTileY(worldY: Number, snapToFloor: Boolean = definedExternally, camera: Camera = definedExternally): Number
    open fun worldToTileXY(worldX: Number, worldY: Number, snapToFloor: Boolean = definedExternally, point: Vector2 = definedExternally, camera: Camera = definedExternally): Vector2
    override fun destroy(removeFromTilemap: Boolean)
    override fun clearAlpha(): StaticTilemapLayer /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): StaticTilemapLayer /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): StaticTilemapLayer /* this */
    override fun setBlendMode(value: BlendModes): StaticTilemapLayer /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): StaticTilemapLayer /* this */
    override fun setDisplaySize(width: Number, height: Number): StaticTilemapLayer /* this */
    override var depth: Number
    override fun setDepth(value: integer): StaticTilemapLayer /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): StaticTilemapLayer /* this */
    override fun toggleFlipY(): StaticTilemapLayer /* this */
    override fun setFlipX(value: Boolean): StaticTilemapLayer /* this */
    override fun setFlipY(value: Boolean): StaticTilemapLayer /* this */
    override fun setFlip(x: Boolean, y: Boolean): StaticTilemapLayer /* this */
    override fun resetFlip(): StaticTilemapLayer /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Rectangle> getBounds(output: O): O
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): StaticTilemapLayer /* this */
    override fun setOriginFromFrame(): StaticTilemapLayer /* this */
    override fun setDisplayOrigin(x: Number, y: Number): StaticTilemapLayer /* this */
    override fun updateDisplayOrigin(): StaticTilemapLayer /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): StaticTilemapLayer /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): StaticTilemapLayer /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): StaticTilemapLayer /* this */
    override fun setRotation(radians: Number): StaticTilemapLayer /* this */
    override fun setAngle(degrees: Number): StaticTilemapLayer /* this */
    override fun setScale(x: Number, y: Number): StaticTilemapLayer /* this */
    override fun setX(value: Number): StaticTilemapLayer /* this */
    override fun setY(value: Number): StaticTilemapLayer /* this */
    override fun setZ(value: Number): StaticTilemapLayer /* this */
    override fun setW(value: Number): StaticTilemapLayer /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): StaticTilemapLayer /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): StaticTilemapLayer /* this */
}

open external class Tile(layer: Phaser.Tilemaps.LayerData, index: integer, x: integer, y: integer, width: integer, height: integer, baseWidth: integer, baseHeight: integer) : Alpha, Flip, Visible {
    open var layer: LayerData
    open var index: integer
    open var x: integer
    open var y: integer
    open var width: integer
    open var height: integer
    open var baseWidth: integer
    open var baseHeight: integer
    open var pixelX: Number
    open var pixelY: Number
    open var properties: Any
    open var rotation: Number
    open var collideLeft: Boolean
    open var collideRight: Boolean
    open var collideUp: Boolean
    open var collideDown: Boolean
    open var faceLeft: Boolean
    open var faceRight: Boolean
    open var faceTop: Boolean
    open var faceBottom: Boolean
    open var collisionCallback: Function<*>
    open var collisionCallbackContext: Any?
    open var tint: Number
    open var physics: Any?
    open fun containsPoint(x: Number, y: Number): Boolean
    open fun copy(tile: Tile): Tile
    open fun getCollisionGroup(): Any?
    open fun getTileData(): Any?
    open fun getLeft(camera: Camera = definedExternally): Number
    open fun getRight(camera: Camera = definedExternally): Number
    open fun getTop(camera: Camera = definedExternally): Number
    open fun getBottom(camera: Camera = definedExternally): Number
    open fun getBounds(camera: Camera = definedExternally, output: Rectangle = definedExternally): dynamic /* Phaser.Geom.Rectangle | Any? */
    open fun getCenterX(camera: Camera = definedExternally): Number
    open fun getCenterY(camera: Camera = definedExternally): Number
    open fun destroy()
    open fun intersects(x: Number, y: Number, right: Number, bottom: Number): Boolean
    open fun isInteresting(collides: Boolean, faces: Boolean): Boolean
    open fun resetCollision(recalculateFaces: Boolean = definedExternally): Tile
    open fun resetFaces(): Tile
    open fun setCollision(left: Boolean, right: Boolean = definedExternally, up: Boolean = definedExternally, down: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally): Tile
    open fun setCollisionCallback(callback: Function<*>, context: Any?): Tile
    open fun setSize(tileWidth: integer, tileHeight: integer, baseWidth: integer, baseHeight: integer): Tile
    open fun updatePixelXY(): Tile
    open var canCollide: Boolean
    open var collides: Boolean
    open var hasInterestingFace: Boolean
    open var tileset: Tileset
    open var tilemapLayer: dynamic /* Phaser.Tilemaps.StaticTilemapLayer | Phaser.Tilemaps.DynamicTilemapLayer */
    open var tilemap: Tilemap
    override fun clearAlpha(): Tile /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Tile /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Tile /* this */
    override fun toggleFlipY(): Tile /* this */
    override fun setFlipX(value: Boolean): Tile /* this */
    override fun setFlipY(value: Boolean): Tile /* this */
    override fun setFlip(x: Boolean, y: Boolean): Tile /* this */
    override fun resetFlip(): Tile /* this */
    override var visible: Boolean
    override fun setVisible(value: Boolean): Tile /* this */
}

open external class Tilemap(scene: Phaser.Scene, mapData: Phaser.Tilemaps.MapData) {
    open var scene: Scene
    open var tileWidth: integer
    open var tileHeight: integer
    open var width: Number
    open var height: Number
    open var orientation: String
    open var renderOrder: String
    open var format: Number
    open var version: Number
    open var properties: Any?
    open var widthInPixels: Number
    open var heightInPixels: Number
    open var imageCollections: Array<ImageCollection>
    open var images: Array<Any>
    open var layers: Array<LayerData>
    open var tilesets: Array<Tileset>
    open var objects: Array<ObjectLayer>
    open var currentLayerIndex: integer
    open fun setRenderOrder(renderOrder: integer): Tilemap /* this */
    open fun setRenderOrder(renderOrder: String): Tilemap /* this */
    open fun addTilesetImage(tilesetName: String, key: String = definedExternally, tileWidth: integer = definedExternally, tileHeight: integer = definedExternally, tileMargin: integer = definedExternally, tileSpacing: integer = definedExternally, gid: integer = definedExternally): Tileset
    open fun convertLayerToStatic(layer: String = definedExternally): StaticTilemapLayer
    open fun convertLayerToStatic(layer: integer = definedExternally): StaticTilemapLayer
    open fun convertLayerToStatic(layer: DynamicTilemapLayer = definedExternally): StaticTilemapLayer
    open fun copy(srcTileX: integer, srcTileY: integer, width: integer, height: integer, destTileX: integer, destTileY: integer, recalculateFaces: Boolean = definedExternally, layer: String = definedExternally): Tilemap
    open fun copy(srcTileX: integer, srcTileY: integer, width: integer, height: integer, destTileX: integer, destTileY: integer, recalculateFaces: Boolean = definedExternally, layer: integer = definedExternally): Tilemap
    open fun copy(srcTileX: integer, srcTileY: integer, width: integer, height: integer, destTileX: integer, destTileY: integer, recalculateFaces: Boolean = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun copy(srcTileX: integer, srcTileY: integer, width: integer, height: integer, destTileX: integer, destTileY: integer, recalculateFaces: Boolean = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun createBlankDynamicLayer(name: String, tileset: String, x: Number = definedExternally, y: Number = definedExternally, width: integer = definedExternally, height: integer = definedExternally, tileWidth: integer = definedExternally, tileHeight: integer = definedExternally): DynamicTilemapLayer
    open fun createBlankDynamicLayer(name: String, tileset: Array<String>, x: Number = definedExternally, y: Number = definedExternally, width: integer = definedExternally, height: integer = definedExternally, tileWidth: integer = definedExternally, tileHeight: integer = definedExternally): DynamicTilemapLayer
    open fun createBlankDynamicLayer(name: String, tileset: Tileset, x: Number = definedExternally, y: Number = definedExternally, width: integer = definedExternally, height: integer = definedExternally, tileWidth: integer = definedExternally, tileHeight: integer = definedExternally): DynamicTilemapLayer
    open fun createBlankDynamicLayer(name: String, tileset: Array<Tileset>, x: Number = definedExternally, y: Number = definedExternally, width: integer = definedExternally, height: integer = definedExternally, tileWidth: integer = definedExternally, tileHeight: integer = definedExternally): DynamicTilemapLayer
    open fun createDynamicLayer(layerID: integer, tileset: String, x: Number = definedExternally, y: Number = definedExternally): DynamicTilemapLayer
    open fun createDynamicLayer(layerID: integer, tileset: Array<String>, x: Number = definedExternally, y: Number = definedExternally): DynamicTilemapLayer
    open fun createDynamicLayer(layerID: integer, tileset: Tileset, x: Number = definedExternally, y: Number = definedExternally): DynamicTilemapLayer
    open fun createDynamicLayer(layerID: integer, tileset: Array<Tileset>, x: Number = definedExternally, y: Number = definedExternally): DynamicTilemapLayer
    open fun createDynamicLayer(layerID: String, tileset: String, x: Number = definedExternally, y: Number = definedExternally): DynamicTilemapLayer
    open fun createDynamicLayer(layerID: String, tileset: Array<String>, x: Number = definedExternally, y: Number = definedExternally): DynamicTilemapLayer
    open fun createDynamicLayer(layerID: String, tileset: Tileset, x: Number = definedExternally, y: Number = definedExternally): DynamicTilemapLayer
    open fun createDynamicLayer(layerID: String, tileset: Array<Tileset>, x: Number = definedExternally, y: Number = definedExternally): DynamicTilemapLayer
    open fun createFromObjects(name: String, id: integer, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally): Array<Sprite>
    open fun createFromObjects(name: String, id: String, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally): Array<Sprite>
    open fun createFromTiles(indexes: integer, replacements: integer, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally, camera: Camera = definedExternally, layer: dynamic /* String | integer | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */ = definedExternally): Array<Sprite>
    open fun createFromTiles(indexes: integer, replacements: Array<Any>, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally, camera: Camera = definedExternally, layer: dynamic /* String | integer | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */ = definedExternally): Array<Sprite>
    open fun createFromTiles(indexes: Array<Any>, replacements: integer, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally, camera: Camera = definedExternally, layer: dynamic /* String | integer | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */ = definedExternally): Array<Sprite>
    open fun createFromTiles(indexes: Array<Any>, replacements: Array<Any>, spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$6` */, scene: Scene = definedExternally, camera: Camera = definedExternally, layer: dynamic /* String | integer | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */ = definedExternally): Array<Sprite>
    open fun createStaticLayer(layerID: integer, tileset: String, x: Number = definedExternally, y: Number = definedExternally): StaticTilemapLayer
    open fun createStaticLayer(layerID: integer, tileset: Array<String>, x: Number = definedExternally, y: Number = definedExternally): StaticTilemapLayer
    open fun createStaticLayer(layerID: integer, tileset: Tileset, x: Number = definedExternally, y: Number = definedExternally): StaticTilemapLayer
    open fun createStaticLayer(layerID: integer, tileset: Array<Tileset>, x: Number = definedExternally, y: Number = definedExternally): StaticTilemapLayer
    open fun createStaticLayer(layerID: String, tileset: String, x: Number = definedExternally, y: Number = definedExternally): StaticTilemapLayer
    open fun createStaticLayer(layerID: String, tileset: Array<String>, x: Number = definedExternally, y: Number = definedExternally): StaticTilemapLayer
    open fun createStaticLayer(layerID: String, tileset: Tileset, x: Number = definedExternally, y: Number = definedExternally): StaticTilemapLayer
    open fun createStaticLayer(layerID: String, tileset: Array<Tileset>, x: Number = definedExternally, y: Number = definedExternally): StaticTilemapLayer
    open fun destroy()
    open fun fill(index: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, recalculateFaces: Boolean = definedExternally, layer: String = definedExternally): Tilemap
    open fun fill(index: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, recalculateFaces: Boolean = definedExternally, layer: integer = definedExternally): Tilemap
    open fun fill(index: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, recalculateFaces: Boolean = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun fill(index: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, recalculateFaces: Boolean = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun filterObjects(objectLayer: ObjectLayer, callback: TilemapFilterCallback, context: Any? = definedExternally): Array<GameObject>
    open fun filterObjects(objectLayer: String, callback: TilemapFilterCallback, context: Any? = definedExternally): Array<GameObject>
    open fun filterTiles(callback: Function<*>, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: String = definedExternally): Array<Tile>
    open fun filterTiles(callback: Function<*>, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: integer = definedExternally): Array<Tile>
    open fun filterTiles(callback: Function<*>, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: DynamicTilemapLayer = definedExternally): Array<Tile>
    open fun filterTiles(callback: Function<*>, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: StaticTilemapLayer = definedExternally): Array<Tile>
    open fun findByIndex(index: integer, skip: integer = definedExternally, reverse: Boolean = definedExternally, layer: String = definedExternally): Tile
    open fun findByIndex(index: integer, skip: integer = definedExternally, reverse: Boolean = definedExternally, layer: integer = definedExternally): Tile
    open fun findByIndex(index: integer, skip: integer = definedExternally, reverse: Boolean = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tile
    open fun findByIndex(index: integer, skip: integer = definedExternally, reverse: Boolean = definedExternally, layer: StaticTilemapLayer = definedExternally): Tile
    open fun findObject(objectLayer: ObjectLayer, callback: TilemapFindCallback, context: Any? = definedExternally): GameObject
    open fun findObject(objectLayer: String, callback: TilemapFindCallback, context: Any? = definedExternally): GameObject
    open fun findTile(callback: FindTileCallback, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: String = definedExternally): Tile
    open fun findTile(callback: FindTileCallback, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: integer = definedExternally): Tile
    open fun findTile(callback: FindTileCallback, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tile
    open fun findTile(callback: FindTileCallback, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: StaticTilemapLayer = definedExternally): Tile
    open fun forEachTile(callback: EachTileCallback, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: String = definedExternally): Tilemap
    open fun forEachTile(callback: EachTileCallback, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: integer = definedExternally): Tilemap
    open fun forEachTile(callback: EachTileCallback, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun forEachTile(callback: EachTileCallback, context: Any? = definedExternally, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun getImageIndex(name: String): integer
    open fun getImageLayerNames(): Array<String>
    open fun getIndex(location: Array<Any>, name: String): Number
    open fun getLayer(layer: String = definedExternally): LayerData
    open fun getLayer(layer: integer = definedExternally): LayerData
    open fun getLayer(layer: DynamicTilemapLayer = definedExternally): LayerData
    open fun getLayer(layer: StaticTilemapLayer = definedExternally): LayerData
    open fun getObjectLayer(name: String = definedExternally): ObjectLayer
    open fun getObjectLayerNames(): Array<String>
    open fun getLayerIndex(layer: String = definedExternally): integer
    open fun getLayerIndex(layer: integer = definedExternally): integer
    open fun getLayerIndex(layer: DynamicTilemapLayer = definedExternally): integer
    open fun getLayerIndex(layer: StaticTilemapLayer = definedExternally): integer
    open fun getLayerIndexByName(name: String): integer
    open fun getTileAt(tileX: integer, tileY: integer, nonNull: Boolean = definedExternally, layer: String = definedExternally): Tile
    open fun getTileAt(tileX: integer, tileY: integer, nonNull: Boolean = definedExternally, layer: integer = definedExternally): Tile
    open fun getTileAt(tileX: integer, tileY: integer, nonNull: Boolean = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tile
    open fun getTileAt(tileX: integer, tileY: integer, nonNull: Boolean = definedExternally, layer: StaticTilemapLayer = definedExternally): Tile
    open fun getTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean = definedExternally, camera: Camera = definedExternally, layer: String = definedExternally): Tile
    open fun getTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean = definedExternally, camera: Camera = definedExternally, layer: integer = definedExternally): Tile
    open fun getTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean = definedExternally, camera: Camera = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tile
    open fun getTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean = definedExternally, camera: Camera = definedExternally, layer: StaticTilemapLayer = definedExternally): Tile
    open fun getTileLayerNames(): Array<String>
    open fun getTilesWithin(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: String = definedExternally): Array<Tile>
    open fun getTilesWithin(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: integer = definedExternally): Array<Tile>
    open fun getTilesWithin(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: DynamicTilemapLayer = definedExternally): Array<Tile>
    open fun getTilesWithin(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, filteringOptions: FilteringOptions = definedExternally, layer: StaticTilemapLayer = definedExternally): Array<Tile>
    open fun getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally, layer: dynamic /* String | integer | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */ = definedExternally): Array<Tile>
    open fun getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally, layer: dynamic /* String | integer | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */ = definedExternally): Array<Tile>
    open fun getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally, layer: dynamic /* String | integer | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */ = definedExternally): Array<Tile>
    open fun getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally, layer: dynamic /* String | integer | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */ = definedExternally): Array<Tile>
    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally, layer: String = definedExternally): Array<Tile>
    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally, layer: integer = definedExternally): Array<Tile>
    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally, layer: DynamicTilemapLayer = definedExternally): Array<Tile>
    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number, filteringOptions: FilteringOptions = definedExternally, camera: Camera = definedExternally, layer: StaticTilemapLayer = definedExternally): Array<Tile>
    open fun getTileset(name: String): Tileset
    open fun getTilesetIndex(name: String): integer
    open fun hasTileAt(tileX: integer, tileY: integer, layer: String = definedExternally): Boolean
    open fun hasTileAt(tileX: integer, tileY: integer, layer: integer = definedExternally): Boolean
    open fun hasTileAt(tileX: integer, tileY: integer, layer: DynamicTilemapLayer = definedExternally): Boolean
    open fun hasTileAt(tileX: integer, tileY: integer, layer: StaticTilemapLayer = definedExternally): Boolean
    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: Camera = definedExternally, layer: String = definedExternally): Boolean
    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: Camera = definedExternally, layer: integer = definedExternally): Boolean
    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: Camera = definedExternally, layer: DynamicTilemapLayer = definedExternally): Boolean
    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: Camera = definedExternally, layer: StaticTilemapLayer = definedExternally): Boolean
    open var layer: LayerData
    open fun putTileAt(tile: integer, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally, layer: String = definedExternally): Tile
    open fun putTileAt(tile: integer, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally, layer: integer = definedExternally): Tile
    open fun putTileAt(tile: integer, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tile
    open fun putTileAt(tile: integer, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally, layer: StaticTilemapLayer = definedExternally): Tile
    open fun putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally, layer: String = definedExternally): Tile
    open fun putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally, layer: integer = definedExternally): Tile
    open fun putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tile
    open fun putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally, layer: StaticTilemapLayer = definedExternally): Tile
    open fun putTileAtWorldXY(tile: integer, worldX: Number, worldY: Number, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally, layer: String = definedExternally): Tile
    open fun putTileAtWorldXY(tile: integer, worldX: Number, worldY: Number, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally, layer: integer = definedExternally): Tile
    open fun putTileAtWorldXY(tile: integer, worldX: Number, worldY: Number, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tile
    open fun putTileAtWorldXY(tile: integer, worldX: Number, worldY: Number, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally, layer: StaticTilemapLayer = definedExternally): Tile
    open fun putTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally, layer: String = definedExternally): Tile
    open fun putTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally, layer: integer = definedExternally): Tile
    open fun putTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tile
    open fun putTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally, layer: StaticTilemapLayer = definedExternally): Tile
    open fun putTilesAt(tile: Array<integer>, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally, layer: dynamic /* String | integer | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */ = definedExternally): Tilemap
    open fun putTilesAt(tile: Array<Array<integer>>, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally, layer: dynamic /* String | integer | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */ = definedExternally): Tilemap
    open fun putTilesAt(tile: Array<Tile>, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally, layer: dynamic /* String | integer | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */ = definedExternally): Tilemap
    open fun putTilesAt(tile: Array<Array<Tile>>, tileX: integer, tileY: integer, recalculateFaces: Boolean = definedExternally, layer: dynamic /* String | integer | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer */ = definedExternally): Tilemap
    open fun randomize(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, indexes: Array<integer> = definedExternally, layer: String = definedExternally): Tilemap
    open fun randomize(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, indexes: Array<integer> = definedExternally, layer: integer = definedExternally): Tilemap
    open fun randomize(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, indexes: Array<integer> = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun randomize(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, indexes: Array<integer> = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun calculateFacesAt(tileX: integer, tileY: integer, layer: String = definedExternally): Tilemap
    open fun calculateFacesAt(tileX: integer, tileY: integer, layer: integer = definedExternally): Tilemap
    open fun calculateFacesAt(tileX: integer, tileY: integer, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun calculateFacesAt(tileX: integer, tileY: integer, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun calculateFacesWithin(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: String = definedExternally): Tilemap
    open fun calculateFacesWithin(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: integer = definedExternally): Tilemap
    open fun calculateFacesWithin(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun calculateFacesWithin(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun removeLayer(layer: String = definedExternally): Tilemap
    open fun removeLayer(layer: integer = definedExternally): Tilemap
    open fun removeLayer(layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun removeLayer(layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun destroyLayer(layer: String = definedExternally): Tilemap
    open fun destroyLayer(layer: integer = definedExternally): Tilemap
    open fun destroyLayer(layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun destroyLayer(layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun removeAllLayers(): Tilemap
    open fun removeTile(tiles: Tile, replaceIndex: integer = definedExternally, recalculateFaces: Boolean = definedExternally): Array<Tile>
    open fun removeTile(tiles: Array<Tile>, replaceIndex: integer = definedExternally, recalculateFaces: Boolean = definedExternally): Array<Tile>
    open fun removeTileAt(tileX: integer, tileY: integer, replaceWithNull: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: String = definedExternally): Tile
    open fun removeTileAt(tileX: integer, tileY: integer, replaceWithNull: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: integer = definedExternally): Tile
    open fun removeTileAt(tileX: integer, tileY: integer, replaceWithNull: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tile
    open fun removeTileAt(tileX: integer, tileY: integer, replaceWithNull: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: StaticTilemapLayer = definedExternally): Tile
    open fun removeTileAtWorldXY(worldX: Number, worldY: Number, replaceWithNull: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally, layer: String = definedExternally): Tile
    open fun removeTileAtWorldXY(worldX: Number, worldY: Number, replaceWithNull: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally, layer: integer = definedExternally): Tile
    open fun removeTileAtWorldXY(worldX: Number, worldY: Number, replaceWithNull: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tile
    open fun removeTileAtWorldXY(worldX: Number, worldY: Number, replaceWithNull: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, camera: Camera = definedExternally, layer: StaticTilemapLayer = definedExternally): Tile
    open fun renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: String = definedExternally): Tilemap
    open fun renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: integer = definedExternally): Tilemap
    open fun renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun renderDebugFull(graphics: Graphics, styleConfig: StyleConfig): Tilemap
    open fun replaceByIndex(findIndex: integer, newIndex: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: String = definedExternally): Tilemap
    open fun replaceByIndex(findIndex: integer, newIndex: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: integer = definedExternally): Tilemap
    open fun replaceByIndex(findIndex: integer, newIndex: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun replaceByIndex(findIndex: integer, newIndex: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun setCollision(indexes: integer, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: String = definedExternally, updateLayer: Boolean = definedExternally): Tilemap
    open fun setCollision(indexes: integer, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: integer = definedExternally, updateLayer: Boolean = definedExternally): Tilemap
    open fun setCollision(indexes: integer, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: DynamicTilemapLayer = definedExternally, updateLayer: Boolean = definedExternally): Tilemap
    open fun setCollision(indexes: integer, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: StaticTilemapLayer = definedExternally, updateLayer: Boolean = definedExternally): Tilemap
    open fun setCollision(indexes: Array<Any>, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: String = definedExternally, updateLayer: Boolean = definedExternally): Tilemap
    open fun setCollision(indexes: Array<Any>, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: integer = definedExternally, updateLayer: Boolean = definedExternally): Tilemap
    open fun setCollision(indexes: Array<Any>, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: DynamicTilemapLayer = definedExternally, updateLayer: Boolean = definedExternally): Tilemap
    open fun setCollision(indexes: Array<Any>, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: StaticTilemapLayer = definedExternally, updateLayer: Boolean = definedExternally): Tilemap
    open fun setCollisionBetween(start: integer, stop: integer, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: String = definedExternally): Tilemap
    open fun setCollisionBetween(start: integer, stop: integer, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: integer = definedExternally): Tilemap
    open fun setCollisionBetween(start: integer, stop: integer, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun setCollisionBetween(start: integer, stop: integer, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun setCollisionByProperty(properties: Any?, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: String = definedExternally): Tilemap
    open fun setCollisionByProperty(properties: Any?, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: integer = definedExternally): Tilemap
    open fun setCollisionByProperty(properties: Any?, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun setCollisionByProperty(properties: Any?, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun setCollisionByExclusion(indexes: Array<integer>, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: String = definedExternally): Tilemap
    open fun setCollisionByExclusion(indexes: Array<integer>, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: integer = definedExternally): Tilemap
    open fun setCollisionByExclusion(indexes: Array<integer>, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun setCollisionByExclusion(indexes: Array<integer>, collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun setCollisionFromCollisionGroup(collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: String = definedExternally): Tilemap
    open fun setCollisionFromCollisionGroup(collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: integer = definedExternally): Tilemap
    open fun setCollisionFromCollisionGroup(collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun setCollisionFromCollisionGroup(collides: Boolean = definedExternally, recalculateFaces: Boolean = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun setTileIndexCallback(indexes: integer, callback: Function<*>, callbackContext: Any?, layer: String = definedExternally): Tilemap
    open fun setTileIndexCallback(indexes: integer, callback: Function<*>, callbackContext: Any?, layer: integer = definedExternally): Tilemap
    open fun setTileIndexCallback(indexes: integer, callback: Function<*>, callbackContext: Any?, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun setTileIndexCallback(indexes: integer, callback: Function<*>, callbackContext: Any?, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun setTileIndexCallback(indexes: Array<Any>, callback: Function<*>, callbackContext: Any?, layer: String = definedExternally): Tilemap
    open fun setTileIndexCallback(indexes: Array<Any>, callback: Function<*>, callbackContext: Any?, layer: integer = definedExternally): Tilemap
    open fun setTileIndexCallback(indexes: Array<Any>, callback: Function<*>, callbackContext: Any?, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun setTileIndexCallback(indexes: Array<Any>, callback: Function<*>, callbackContext: Any?, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun setTileLocationCallback(tileX: integer, tileY: integer, width: integer, height: integer, callback: Function<*>, callbackContext: Any? = definedExternally, layer: String = definedExternally): Tilemap
    open fun setTileLocationCallback(tileX: integer, tileY: integer, width: integer, height: integer, callback: Function<*>, callbackContext: Any? = definedExternally, layer: integer = definedExternally): Tilemap
    open fun setTileLocationCallback(tileX: integer, tileY: integer, width: integer, height: integer, callback: Function<*>, callbackContext: Any? = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun setTileLocationCallback(tileX: integer, tileY: integer, width: integer, height: integer, callback: Function<*>, callbackContext: Any? = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun setLayer(layer: String = definedExternally): Tilemap
    open fun setLayer(layer: integer = definedExternally): Tilemap
    open fun setLayer(layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun setLayer(layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun setBaseTileSize(tileWidth: integer, tileHeight: integer): Tilemap
    open fun setLayerTileSize(tileWidth: integer, tileHeight: integer, layer: String = definedExternally): Tilemap
    open fun setLayerTileSize(tileWidth: integer, tileHeight: integer, layer: integer = definedExternally): Tilemap
    open fun setLayerTileSize(tileWidth: integer, tileHeight: integer, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun setLayerTileSize(tileWidth: integer, tileHeight: integer, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun shuffle(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: String = definedExternally): Tilemap
    open fun shuffle(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: integer = definedExternally): Tilemap
    open fun shuffle(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun shuffle(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun swapByIndex(tileA: integer, tileB: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: String = definedExternally): Tilemap
    open fun swapByIndex(tileA: integer, tileB: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: integer = definedExternally): Tilemap
    open fun swapByIndex(tileA: integer, tileB: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun swapByIndex(tileA: integer, tileB: integer, tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun tileToWorldX(tileX: integer, camera: Camera = definedExternally, layer: String = definedExternally): Number
    open fun tileToWorldX(tileX: integer, camera: Camera = definedExternally, layer: integer = definedExternally): Number
    open fun tileToWorldX(tileX: integer, camera: Camera = definedExternally, layer: DynamicTilemapLayer = definedExternally): Number
    open fun tileToWorldX(tileX: integer, camera: Camera = definedExternally, layer: StaticTilemapLayer = definedExternally): Number
    open fun tileToWorldY(tileY: integer, camera: Camera = definedExternally, layer: String = definedExternally): Number
    open fun tileToWorldY(tileY: integer, camera: Camera = definedExternally, layer: integer = definedExternally): Number
    open fun tileToWorldY(tileY: integer, camera: Camera = definedExternally, layer: DynamicTilemapLayer = definedExternally): Number
    open fun tileToWorldY(tileY: integer, camera: Camera = definedExternally, layer: StaticTilemapLayer = definedExternally): Number
    open fun tileToWorldXY(tileX: integer, tileY: integer, point: Vector2 = definedExternally, camera: Camera = definedExternally, layer: String = definedExternally): Vector2
    open fun tileToWorldXY(tileX: integer, tileY: integer, point: Vector2 = definedExternally, camera: Camera = definedExternally, layer: integer = definedExternally): Vector2
    open fun tileToWorldXY(tileX: integer, tileY: integer, point: Vector2 = definedExternally, camera: Camera = definedExternally, layer: DynamicTilemapLayer = definedExternally): Vector2
    open fun tileToWorldXY(tileX: integer, tileY: integer, point: Vector2 = definedExternally, camera: Camera = definedExternally, layer: StaticTilemapLayer = definedExternally): Vector2
    open fun weightedRandomize(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, weightedIndexes: Array<Any?> = definedExternally, layer: String = definedExternally): Tilemap
    open fun weightedRandomize(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, weightedIndexes: Array<Any?> = definedExternally, layer: integer = definedExternally): Tilemap
    open fun weightedRandomize(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, weightedIndexes: Array<Any?> = definedExternally, layer: DynamicTilemapLayer = definedExternally): Tilemap
    open fun weightedRandomize(tileX: integer = definedExternally, tileY: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, weightedIndexes: Array<Any?> = definedExternally, layer: StaticTilemapLayer = definedExternally): Tilemap
    open fun worldToTileX(worldX: Number, snapToFloor: Boolean = definedExternally, camera: Camera = definedExternally, layer: String = definedExternally): Number
    open fun worldToTileX(worldX: Number, snapToFloor: Boolean = definedExternally, camera: Camera = definedExternally, layer: integer = definedExternally): Number
    open fun worldToTileX(worldX: Number, snapToFloor: Boolean = definedExternally, camera: Camera = definedExternally, layer: DynamicTilemapLayer = definedExternally): Number
    open fun worldToTileX(worldX: Number, snapToFloor: Boolean = definedExternally, camera: Camera = definedExternally, layer: StaticTilemapLayer = definedExternally): Number
    open fun worldToTileY(worldY: Number, snapToFloor: Boolean = definedExternally, camera: Camera = definedExternally, layer: String = definedExternally): Number
    open fun worldToTileY(worldY: Number, snapToFloor: Boolean = definedExternally, camera: Camera = definedExternally, layer: integer = definedExternally): Number
    open fun worldToTileY(worldY: Number, snapToFloor: Boolean = definedExternally, camera: Camera = definedExternally, layer: DynamicTilemapLayer = definedExternally): Number
    open fun worldToTileY(worldY: Number, snapToFloor: Boolean = definedExternally, camera: Camera = definedExternally, layer: StaticTilemapLayer = definedExternally): Number
    open fun worldToTileXY(worldX: Number, worldY: Number, snapToFloor: Boolean = definedExternally, point: Vector2 = definedExternally, camera: Camera = definedExternally, layer: String = definedExternally): Vector2
    open fun worldToTileXY(worldX: Number, worldY: Number, snapToFloor: Boolean = definedExternally, point: Vector2 = definedExternally, camera: Camera = definedExternally, layer: integer = definedExternally): Vector2
    open fun worldToTileXY(worldX: Number, worldY: Number, snapToFloor: Boolean = definedExternally, point: Vector2 = definedExternally, camera: Camera = definedExternally, layer: DynamicTilemapLayer = definedExternally): Vector2
    open fun worldToTileXY(worldX: Number, worldY: Number, snapToFloor: Boolean = definedExternally, point: Vector2 = definedExternally, camera: Camera = definedExternally, layer: StaticTilemapLayer = definedExternally): Vector2
    open fun convertLayerToStatic(): StaticTilemapLayer
    open fun copy(srcTileX: integer, srcTileY: integer, width: integer, height: integer, destTileX: integer, destTileY: integer): Tilemap
    open fun fill(index: integer): Tilemap
    open fun filterTiles(callback: Function<*>): Array<Tile>
    open fun findByIndex(index: integer): Tile
    open fun findTile(callback: FindTileCallback): Tile
    open fun forEachTile(callback: EachTileCallback): Tilemap
    open fun getLayer(): LayerData
    open fun getLayerIndex(): integer
    open fun getTileAt(tileX: integer, tileY: integer): Tile
    open fun getTileAtWorldXY(worldX: Number, worldY: Number): Tile
    open fun getTilesWithin(): Array<Tile>
    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number): Array<Tile>
    open fun hasTileAt(tileX: integer, tileY: integer): Boolean
    open fun hasTileAtWorldXY(worldX: Number, worldY: Number): Boolean
    open fun putTileAt(tile: integer, tileX: integer, tileY: integer): Tile
    open fun putTileAt(tile: Tile, tileX: integer, tileY: integer): Tile
    open fun putTileAtWorldXY(tile: integer, worldX: Number, worldY: Number): Tile
    open fun putTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number): Tile
    open fun randomize(): Tilemap
    open fun calculateFacesAt(tileX: integer, tileY: integer): Tilemap
    open fun calculateFacesWithin(): Tilemap
    open fun removeLayer(): Tilemap
    open fun destroyLayer(): Tilemap
    open fun removeTileAt(tileX: integer, tileY: integer): Tile
    open fun removeTileAtWorldXY(worldX: Number, worldY: Number): Tile
    open fun renderDebug(graphics: Graphics, styleConfig: StyleConfig): Tilemap
    open fun replaceByIndex(findIndex: integer, newIndex: integer): Tilemap
    open fun setCollision(indexes: integer): Tilemap
    open fun setCollision(indexes: Array<Any>): Tilemap
    open fun setCollisionBetween(start: integer, stop: integer): Tilemap
    open fun setCollisionByProperty(properties: Any?): Tilemap
    open fun setCollisionByExclusion(indexes: Array<integer>): Tilemap
    open fun setCollisionFromCollisionGroup(): Tilemap
    open fun setTileIndexCallback(indexes: integer, callback: Function<*>, callbackContext: Any?): Tilemap
    open fun setTileIndexCallback(indexes: Array<Any>, callback: Function<*>, callbackContext: Any?): Tilemap
    open fun setTileLocationCallback(tileX: integer, tileY: integer, width: integer, height: integer, callback: Function<*>): Tilemap
    open fun setLayer(): Tilemap
    open fun setLayerTileSize(tileWidth: integer, tileHeight: integer): Tilemap
    open fun shuffle(): Tilemap
    open fun swapByIndex(tileA: integer, tileB: integer): Tilemap
    open fun tileToWorldX(tileX: integer): Number
    open fun tileToWorldY(tileY: integer): Number
    open fun tileToWorldXY(tileX: integer, tileY: integer): Vector2
    open fun weightedRandomize(): Tilemap
    open fun worldToTileX(worldX: Number): Number
    open fun worldToTileY(worldY: Number): Number
    open fun worldToTileXY(worldX: Number, worldY: Number): Vector2
}

open external class Tileset(name: String, firstgid: integer, tileWidth: integer = definedExternally, tileHeight: integer = definedExternally, tileMargin: integer = definedExternally, tileSpacing: integer = definedExternally, tileProperties: Any? = definedExternally, tileData: Any? = definedExternally) {
    open var name: String
    open var firstgid: integer
    open var tileWidth: integer
    open var tileHeight: integer
    open var tileMargin: integer
    open var tileSpacing: integer
    open var tileProperties: Any?
    open var tileData: Any?
    open var image: Texture
    open var glTexture: WebGLTexture
    open var rows: integer
    open var columns: integer
    open var total: integer
    open var texCoordinates: Array<Any?>
    open fun getTileProperties(tileIndex: integer): Any?
    open fun getTileData(tileIndex: integer): Any?
    open fun getTileCollisionGroup(tileIndex: integer): Any?
    open fun containsTileIndex(tileIndex: integer): Boolean
    open fun getTileTextureCoordinates(tileIndex: integer): Any?
    open fun setImage(texture: Texture): Tileset
    open fun setTileSize(tileWidth: integer = definedExternally, tileHeight: integer = definedExternally): Tileset
    open fun setSpacing(margin: integer = definedExternally, spacing: integer = definedExternally): Tileset
    open fun updateTileData(imageWidth: integer, imageHeight: integer): Tileset
}