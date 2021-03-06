@file:JsQualifier("Phaser.Cameras.Scene2D")

package Phaser.Cameras.Scene2D

import Phaser.CameraRotateCallback
import Phaser.Cameras.Scene2D.Effects.*
import Phaser.Display.Masks.BitmapMask
import Phaser.Display.Masks.GeometryMask
import Phaser.Events.EventEmitter
import Phaser.GameObjects.Components.Alpha
import Phaser.GameObjects.Components.Flip
import Phaser.GameObjects.Components.Tint
import Phaser.GameObjects.Components.Visible
import Phaser.GameObjects.GameObject
import Phaser.GameObjects.Group
import Phaser.Geom.Rectangle
import Phaser.Input.Pointer
import Phaser.Math.Vector2
import Phaser.Renderer.Canvas.CanvasRenderer
import Phaser.Renderer.WebGL.WebGLPipeline
import Phaser.Renderer.WebGL.WebGLRenderer
import Phaser.Scale.ScaleManager
import Phaser.Scene
import Phaser.Scenes.SceneManager
import Phaser.Scenes.Systems
import Phaser.Structs.Size
import Phaser.Types.Cameras.Scene2D.CameraConfig
import Phaser.Types.Cameras.Scene2D.CameraPanCallback
import Phaser.Types.Cameras.Scene2D.JSONCamera
import Phaser.Types.Display.InputColorObject
import Phaser.integer
import org.khronos.webgl.WebGLFramebuffer
import org.khronos.webgl.WebGLTexture
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement

open external class BaseCamera(x: Number, y: Number, width: Number, height: Number) : EventEmitter, Alpha, Visible {
    open var scene: Scene
    open var sceneManager: SceneManager
    open var scaleManager: ScaleManager
    open var cameraManager: CameraManager
    open var id: integer
    open var name: String
    open var resolution: Number
    open var roundPixels: Boolean
    override var visible: Boolean
    open var useBounds: Boolean
    open var worldView: Rectangle
    open var dirty: Boolean
    open var transparent: Boolean
    open var backgroundColor: Any
    override var alpha: Number
    open var disableCull: Boolean
    open var midPoint: Vector2
    open var originX: Number
    open var originY: Number
    open var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    open fun setAlpha(value: Number = definedExternally): BaseCamera /* this */
    open fun setOrigin(x: Number = definedExternally, y: Number = definedExternally): BaseCamera /* this */
    open fun getScroll(x: Number, y: Number, out: Vector2 = definedExternally): Vector2
    open fun centerOnX(x: Number): BaseCamera /* this */
    open fun centerOnY(y: Number): BaseCamera /* this */
    open fun centerOn(x: Number, y: Number): BaseCamera /* this */
    open fun centerToBounds(): BaseCamera /* this */
    open fun centerToSize(): BaseCamera /* this */
    open fun <G : Array<GameObject>> cull(renderableObjects: G): G
    open fun <O : Vector2> getWorldPoint(x: Number, y: Number, output: O = definedExternally): O
    open fun ignore(entries: GameObject): BaseCamera /* this */
    open fun ignore(entries: Array<GameObject>): BaseCamera /* this */
    open fun ignore(entries: Group): BaseCamera /* this */
    open fun preRender(resolution: Number)
    open fun clampX(x: Number): Number
    open fun clampY(y: Number): Number
    open fun removeBounds(): BaseCamera /* this */
    open fun setAngle(value: Number = definedExternally): BaseCamera /* this */
    open fun setBackgroundColor(color: String = definedExternally): BaseCamera /* this */
    open fun setBackgroundColor(color: Number = definedExternally): BaseCamera /* this */
    open fun setBackgroundColor(color: InputColorObject = definedExternally): BaseCamera /* this */
    open fun setBounds(x: integer, y: integer, width: integer, height: integer, centerOn: Boolean = definedExternally): BaseCamera /* this */
    open fun getBounds(out: Rectangle = definedExternally): Rectangle
    open fun setName(value: String = definedExternally): BaseCamera /* this */
    open fun setPosition(x: Number, y: Number = definedExternally): BaseCamera /* this */
    open fun setRotation(value: Number = definedExternally): BaseCamera /* this */
    open fun setRoundPixels(value: Boolean): BaseCamera /* this */
    open fun setScene(scene: Scene): BaseCamera /* this */
    open fun setScroll(x: Number, y: Number = definedExternally): BaseCamera /* this */
    open fun setSize(width: integer, height: integer = definedExternally): BaseCamera /* this */
    open fun setViewport(x: Number, y: Number, width: integer, height: integer = definedExternally): BaseCamera /* this */
    open fun setZoom(value: Number = definedExternally): BaseCamera /* this */
    open fun setMask(mask: BitmapMask, fixedPosition: Boolean = definedExternally): BaseCamera /* this */
    open fun setMask(mask: GeometryMask, fixedPosition: Boolean = definedExternally): BaseCamera /* this */
    open fun clearMask(destroyMask: Boolean = definedExternally): BaseCamera /* this */
    override fun setVisible(value: Boolean): BaseCamera /* this */
    open fun toJSON(): JSONCamera
    open fun update(time: integer, delta: Number)
    override fun destroy()
    open var x: Float
    open var y: Float
    open var width: Float
    open var height: Float
    open var scrollX: Float
    open var scrollY: Float
    open var zoom: Float
    open var centerX: Float
    open var centerY: Float
    open var displayWidth: Float
    open var displayHeight: Float
    override fun clearAlpha(): BaseCamera /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Alpha /* this */
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    open fun setBackgroundColor(): BaseCamera /* this */
}

open external class Camera(x: Number, y: Number, width: Number, height: Number) : BaseCamera, Flip, Tint {
    open var inputEnabled: Boolean
    open var fadeEffect: Fade
    open var flashEffect: Flash
    open var shakeEffect: Shake
    open var panEffect: Pan
    open var rotateToEffect: RotateTo
    open var zoomEffect: Zoom
    open var lerp: Vector2
    open var followOffset: Vector2
    open var deadzone: Rectangle
    open var renderToTexture: Boolean
    open var renderToGame: Boolean
    open var canvas: HTMLCanvasElement
    open var context: CanvasRenderingContext2D
    open var glTexture: WebGLTexture
    open var framebuffer: WebGLFramebuffer
    open var pipeline: Any
    open fun setRenderToTexture(pipeline: String = definedExternally, renderToGame: Boolean = definedExternally): Camera /* this */
    open fun setRenderToTexture(pipeline: WebGLPipeline = definedExternally, renderToGame: Boolean = definedExternally): Camera /* this */
    open fun setPipeline(pipeline: String = definedExternally): Camera /* this */
    open fun setPipeline(pipeline: WebGLPipeline = definedExternally): Camera /* this */
    open fun clearRenderToTexture(): Camera /* this */
    open fun setDeadzone(width: Number = definedExternally, height: Number = definedExternally): Camera /* this */
    open fun fadeIn(duration: integer = definedExternally, red: integer = definedExternally, green: integer = definedExternally, blue: integer = definedExternally, callback: Function<*> = definedExternally, context: Any = definedExternally): Camera /* this */
    open fun fadeOut(duration: integer = definedExternally, red: integer = definedExternally, green: integer = definedExternally, blue: integer = definedExternally, callback: Function<*> = definedExternally, context: Any = definedExternally): Camera /* this */
    open fun fadeFrom(duration: integer = definedExternally, red: integer = definedExternally, green: integer = definedExternally, blue: integer = definedExternally, force: Boolean = definedExternally, callback: Function<*> = definedExternally, context: Any = definedExternally): Camera /* this */
    open fun fade(duration: integer = definedExternally, red: integer = definedExternally, green: integer = definedExternally, blue: integer = definedExternally, force: Boolean = definedExternally, callback: Function<*> = definedExternally, context: Any = definedExternally): Camera /* this */
    open fun flash(duration: integer = definedExternally, red: integer = definedExternally, green: integer = definedExternally, blue: integer = definedExternally, force: Boolean = definedExternally, callback: Function<*> = definedExternally, context: Any = definedExternally): Camera /* this */
    open fun shake(duration: integer = definedExternally, intensity: Number = definedExternally, force: Boolean = definedExternally, callback: Function<*> = definedExternally, context: Any = definedExternally): Camera /* this */
    open fun shake(duration: integer = definedExternally, intensity: Vector2 = definedExternally, force: Boolean = definedExternally, callback: Function<*> = definedExternally, context: Any = definedExternally): Camera /* this */
    open fun pan(x: Number, y: Number, duration: integer = definedExternally, ease: String = definedExternally, force: Boolean = definedExternally, callback: CameraPanCallback = definedExternally, context: Any = definedExternally): Camera /* this */
    open fun pan(x: Number, y: Number, duration: integer = definedExternally, ease: Function<*> = definedExternally, force: Boolean = definedExternally, callback: CameraPanCallback = definedExternally, context: Any = definedExternally): Camera /* this */
    open fun rotateTo(radians: Number, shortestPath: Boolean = definedExternally, duration: integer = definedExternally, ease: String = definedExternally, force: Boolean = definedExternally, callback: CameraRotateCallback = definedExternally, context: Any = definedExternally): Camera
    open fun rotateTo(radians: Number, shortestPath: Boolean = definedExternally, duration: integer = definedExternally, ease: Function<*> = definedExternally, force: Boolean = definedExternally, callback: CameraRotateCallback = definedExternally, context: Any = definedExternally): Camera
    open fun zoomTo(zoom: Number, duration: integer = definedExternally, ease: String = definedExternally, force: Boolean = definedExternally, callback: CameraPanCallback = definedExternally, context: Any = definedExternally): Camera /* this */
    open fun zoomTo(zoom: Number, duration: integer = definedExternally, ease: Function<*> = definedExternally, force: Boolean = definedExternally, callback: CameraPanCallback = definedExternally, context: Any = definedExternally): Camera /* this */
    override fun preRender(resolution: Number)
    open fun setLerp(x: Number = definedExternally, y: Number = definedExternally): Camera /* this */
    open fun setFollowOffset(x: Number = definedExternally, y: Number = definedExternally): Camera /* this */
    open fun startFollow(target: GameObject, roundPixels: Boolean = definedExternally, lerpX: Number = definedExternally, lerpY: Number = definedExternally, offsetX: Number = definedExternally, offsetY: Number = definedExternally): Camera /* this */
    open fun startFollow(target: Any?, roundPixels: Boolean = definedExternally, lerpX: Number = definedExternally, lerpY: Number = definedExternally, offsetX: Number = definedExternally, offsetY: Number = definedExternally): Camera /* this */
    open fun stopFollow(): Camera /* this */
    open fun resetFX(): Camera /* this */
    override fun update(time: integer, delta: Number)
    override fun destroy()
    override fun clearAlpha(): Camera /* this */
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Camera /* this */
    override fun toggleFlipY(): Camera /* this */
    override fun setFlipX(value: Boolean): Camera /* this */
    override fun setFlipY(value: Boolean): Camera /* this */
    override fun setFlip(x: Boolean, y: Boolean): Camera /* this */
    override fun resetFlip(): Camera /* this */
    override var tintFill: Boolean
    override fun clearTint(): Camera /* this */
    override fun setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Camera /* this */
    override fun setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Camera /* this */
    override var tintTopLeft: integer
    override var tintTopRight: integer
    override var tintBottomLeft: integer
    override var tintBottomRight: integer
    override var tint: integer
    override var isTinted: Boolean
    open fun setRenderToTexture(): Camera /* this */
    open fun setPipeline(): Camera /* this */
    open fun shake(): Camera /* this */
    open fun pan(x: Number, y: Number): Camera /* this */
    open fun rotateTo(radians: Number): Camera
    open fun zoomTo(zoom: Number): Camera /* this */
}

open external class CameraManager(scene: Phaser.Scene) {
    open var scene: Scene
    open var systems: Systems
    open var roundPixels: Boolean
    open var cameras: Array<Camera>
    open var main: Camera
    open var default: Camera
    open fun add(x: integer = definedExternally, y: integer = definedExternally, width: integer = definedExternally, height: integer = definedExternally, makeMain: Boolean = definedExternally, name: String = definedExternally): Camera
    open fun addExisting(camera: Camera, makeMain: Boolean = definedExternally): Camera
    open fun getTotal(isVisible: Boolean = definedExternally): integer
    open fun fromJSON(config: CameraConfig): CameraManager /* this */
    open fun fromJSON(config: Array<CameraConfig>): CameraManager /* this */
    open fun getCamera(name: String): Camera
    open fun getCamerasBelowPointer(pointer: Pointer): Array<Camera>
    open fun remove(camera: Camera, runDestroy: Boolean = definedExternally): integer
    open fun remove(camera: Array<Camera>, runDestroy: Boolean = definedExternally): integer
    open fun render(renderer: CanvasRenderer, children: Array<GameObject>, interpolation: Number)
    open fun render(renderer: WebGLRenderer, children: Array<GameObject>, interpolation: Number)
    open fun resetAll(): Camera
    open fun update(time: integer, delta: Number)
    open fun onResize(gameSize: Size, baseSize: Size)
    open fun resize(width: Number, height: Number)
}