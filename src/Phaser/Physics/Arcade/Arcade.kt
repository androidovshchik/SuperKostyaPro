@file:JsQualifier("Phaser.Physics.Arcade")

package Phaser.Physics.Arcade

import Phaser.ArcadePhysicsCallback
import Phaser.BlendModes
import Phaser.Display.Masks.BitmapMask
import Phaser.Display.Masks.GeometryMask
import Phaser.Events.EventEmitter
import Phaser.GameObjects.Components.*
import Phaser.GameObjects.GameObject
import Phaser.GameObjects.Graphics
import Phaser.Geom.Rectangle
import Phaser.Math.Vector2
import Phaser.Physics.Arcade.Components.*
import Phaser.Physics.Arcade.Components.Size
import Phaser.Renderer.WebGL.WebGLPipeline
import Phaser.Scene
import Phaser.Scenes.Systems
import Phaser.Structs.ProcessQueue
import Phaser.Structs.RTree
import Phaser.Structs.Set
import Phaser.Textures.Frame
import Phaser.Tilemaps.DynamicTilemapLayer
import Phaser.Tilemaps.StaticTilemapLayer
import Phaser.Tilemaps.Tile
import Phaser.Types.GameObjects.Group.GroupConfig
import Phaser.Types.GameObjects.Group.GroupCreateConfig
import Phaser.Types.Physics.Arcade.*
import Phaser.integer

open external class Image : Phaser.GameObjects.Image, Acceleration, Angular, Bounce, Debug, Drag, Enable, Friction, Gravity, Immovable, Mass, Size, Velocity, Alpha, BlendMode, Depth, Flip, GetBounds, Origin, Pipeline, ScrollFactor, Phaser.GameObjects.Components.Size, Texture, Tint, Transform, Visible {
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: integer)
    override var body: dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody */
    override fun clearAlpha(): Image /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Image /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Image /* this */
    override fun setBlendMode(value: BlendModes): Image /* this */
    override var depth: Number
    override fun setDepth(value: integer): Image /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Image /* this */
    override fun toggleFlipY(): Image /* this */
    override fun setFlipX(value: Boolean): Image /* this */
    override fun setFlipY(value: Boolean): Image /* this */
    override fun setFlip(x: Boolean, y: Boolean): Image /* this */
    override fun resetFlip(): Image /* this */
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Image /* this */
    override fun setMask(mask: GeometryMask): Image /* this */
    override fun clearMask(destroyMask: Boolean): Image /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Image /* this */
    override fun setOriginFromFrame(): Image /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Image /* this */
    override fun updateDisplayOrigin(): Image /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Image /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Image /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Image /* this */
    override fun setSize(width: Number, height: Number): Image /* this */
    override fun setDisplaySize(width: Number, height: Number): Image /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): Image /* this */
    override fun setCrop(x: Rectangle, y: Number, width: Number, height: Number): Image /* this */
    override fun setTexture(key: String, frame: String): Image /* this */
    override fun setTexture(key: String, frame: integer): Image /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): Image /* this */
    override fun setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): Image /* this */
    override var tintFill: Boolean
    override fun clearTint(): Image /* this */
    override fun setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Image /* this */
    override fun setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Image /* this */
    override var tintTopLeft: integer
    override var tintTopRight: integer
    override var tintBottomLeft: integer
    override var tintBottomRight: integer
    override var tint: integer
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Image /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Image /* this */
    override fun setRotation(radians: Number): Image /* this */
    override fun setAngle(degrees: Number): Image /* this */
    override fun setScale(x: Number, y: Number): Image /* this */
    override fun setX(value: Number): Image /* this */
    override fun setY(value: Number): Image /* this */
    override fun setZ(value: Number): Image /* this */
    override fun setW(value: Number): Image /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Image /* this */
    override fun setAcceleration(x: Number, y: Number): Image /* this */
    override fun setAccelerationX(value: Number): Image /* this */
    override fun setAccelerationY(value: Number): Image /* this */
    override fun setAngularVelocity(value: Number): Image /* this */
    override fun setAngularAcceleration(value: Number): Image /* this */
    override fun setAngularDrag(value: Number): Image /* this */
    override fun setBounce(x: Number, y: Number): Image /* this */
    override fun setBounceX(value: Number): Image /* this */
    override fun setBounceY(value: Number): Image /* this */
    override fun setCollideWorldBounds(value: Boolean, bounceX: Number, bounceY: Number): Image /* this */
    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Image /* this */
    override fun setDebugBodyColor(value: Number): Image /* this */
    override var debugShowBody: Boolean
    override var debugShowVelocity: Boolean
    override var debugBodyColor: Number
    override fun setDrag(x: Number, y: Number): Image /* this */
    override fun setDragX(value: Number): Image /* this */
    override fun setDragY(value: Number): Image /* this */
    override fun setDamping(value: Boolean): Image /* this */
    override fun enableBody(reset: Boolean, x: Number, y: Number, enableGameObject: Boolean, showGameObject: Boolean): Image /* this */
    override fun disableBody(disableGameObject: Boolean, hideGameObject: Boolean): Image /* this */
    override fun refreshBody(): Image /* this */
    override fun setFriction(x: Number, y: Number): Image /* this */
    override fun setFrictionX(x: Number): Image /* this */
    override fun setFrictionY(y: Number): Image /* this */
    override fun setGravity(x: Number, y: Number): Image /* this */
    override fun setGravityX(x: Number): Image /* this */
    override fun setGravityY(y: Number): Image /* this */
    override fun setImmovable(value: Boolean): Image /* this */
    override fun setMass(value: Number): Image /* this */
    override fun setOffset(x: Number, y: Number): Image /* this */
    override fun setSize(width: Number, height: Number, center: Boolean): Size /* this */
    override fun setCircle(radius: Number, offsetX: Number, offsetY: Number): Image /* this */
    override fun setVelocity(x: Number, y: Number): Image /* this */
    override fun setVelocityX(x: Number): Image /* this */
    override fun setVelocityY(y: Number): Image /* this */
    override fun setMaxVelocity(x: Number, y: Number): Image /* this */
    override fun setCrop(): Image /* this */
    override fun setTexture(key: String): Image /* this */
    override fun setTexture(key: Phaser.Textures.Texture, frame: String): Texture /* this */
    override fun setTexture(key: Phaser.Textures.Texture, frame: integer): Texture /* this */
    override fun setTexture(key: Phaser.Textures.Texture): Texture /* this */
}

open external class ArcadePhysics(scene: Phaser.Scene) {
    open var scene: Scene
    open var systems: Systems
    open var config: Any?
    open var world: World
    open var add: Factory
    open fun getConfig(): Any?
    open fun overlap(object1: GameObject, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Phaser.GameObjects.Group, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Sprite, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Image, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: StaticGroup, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Group, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: DynamicTilemapLayer, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: StaticTilemapLayer, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<GameObject>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<Sprite>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<Image>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<StaticGroup>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<Group>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<DynamicTilemapLayer>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<StaticTilemapLayer>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: GameObject, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Phaser.GameObjects.Group, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Sprite, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Image, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: StaticGroup, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Group, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: DynamicTilemapLayer, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: StaticTilemapLayer, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<GameObject>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<Sprite>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<Image>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<StaticGroup>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<Group>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<DynamicTilemapLayer>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<StaticTilemapLayer>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collideTiles(sprite: GameObject, tiles: Array<Tile>, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlapTiles(sprite: GameObject, tiles: Array<Tile>, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun pause(): World
    open fun resume(): World
    open fun accelerateTo(gameObject: GameObject, x: Number, y: Number, speed: Number = definedExternally, xSpeedMax: Number = definedExternally, ySpeedMax: Number = definedExternally): Number
    open fun accelerateToObject(gameObject: GameObject, destination: GameObject, speed: Number = definedExternally, xSpeedMax: Number = definedExternally, ySpeedMax: Number = definedExternally): Number
    open fun closest(source: Any, targets: Array<Body> = definedExternally): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */
    open fun closest(source: Any, targets: Array<StaticBody> = definedExternally): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */
    open fun closest(source: Any, targets: Array<GameObject> = definedExternally): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */
    open fun furthest(source: Any, targets: Array<Body> = definedExternally): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */
    open fun furthest(source: Any, targets: Array<StaticBody> = definedExternally): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */
    open fun furthest(source: Any, targets: Array<GameObject> = definedExternally): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */
    open fun moveTo(gameObject: GameObject, x: Number, y: Number, speed: Number = definedExternally, maxTime: Number = definedExternally): Number
    open fun moveToObject(gameObject: GameObject, destination: Any?, speed: Number = definedExternally, maxTime: Number = definedExternally): Number
    open fun velocityFromAngle(angle: Number, speed: Number = definedExternally, vec2: Vector2 = definedExternally): Vector2
    open fun velocityFromRotation(rotation: Number, speed: Number = definedExternally, vec2: Vector2 = definedExternally): Vector2
    open fun overlapRect(x: Number, y: Number, width: Number, height: Number, includeDynamic: Boolean = definedExternally, includeStatic: Boolean = definedExternally): dynamic /* Array<Phaser.Physics.Arcade.Body> | Array<Phaser.Physics.Arcade.StaticBody> */
    open fun overlapCirc(x: Number, y: Number, radius: Number, includeDynamic: Boolean = definedExternally, includeStatic: Boolean = definedExternally): dynamic /* Array<Phaser.Physics.Arcade.Body> | Array<Phaser.Physics.Arcade.StaticBody> */
    open fun shutdown()
    open fun destroy()
    open fun closest(source: Any): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */
    open fun furthest(source: Any): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */
}

open external class Sprite(scene: Scene, x: Number, y: Number, texture: String, frame: dynamic/* String | integer*/) : Phaser.GameObjects.Sprite, Acceleration, Angular, Bounce, Debug, Drag, Enable, Friction, Gravity, Immovable, Mass, Size, Velocity, Alpha, BlendMode, Depth, Flip, GetBounds, Origin, Pipeline, ScrollFactor, Phaser.GameObjects.Components.Size, Texture, Tint, Transform, Visible {
    override var body: dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody */
    override fun clearAlpha(): Sprite /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Sprite /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Sprite /* this */
    override fun setBlendMode(value: BlendModes): Sprite /* this */
    override var depth: Number
    override fun setDepth(value: integer): Sprite /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Sprite /* this */
    override fun toggleFlipY(): Sprite /* this */
    override fun setFlipX(value: Boolean): Sprite /* this */
    override fun setFlipY(value: Boolean): Sprite /* this */
    override fun setFlip(x: Boolean, y: Boolean): Sprite /* this */
    override fun resetFlip(): Sprite /* this */
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Sprite /* this */
    override fun setMask(mask: GeometryMask): Sprite /* this */
    override fun clearMask(destroyMask: Boolean): Sprite /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Sprite /* this */
    override fun setOriginFromFrame(): Sprite /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Sprite /* this */
    override fun updateDisplayOrigin(): Sprite /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override fun initPipeline(pipelineName: String): Boolean
    override fun setPipeline(pipelineName: String): Sprite /* this */
    override fun resetPipeline(): Boolean
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Sprite /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Sprite /* this */
    override fun setSize(width: Number, height: Number): Sprite /* this */
    override fun setDisplaySize(width: Number, height: Number): Sprite /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): Sprite /* this */
    override fun setCrop(x: Rectangle, y: Number, width: Number, height: Number): Sprite /* this */
    override fun setTexture(key: String, frame: String): Sprite /* this */
    override fun setTexture(key: String, frame: integer): Sprite /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): Sprite /* this */
    override fun setFrame(frame: integer, updateSize: Boolean, updateOrigin: Boolean): Sprite /* this */
    override var tintFill: Boolean
    override fun clearTint(): Sprite /* this */
    override fun setTint(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Sprite /* this */
    override fun setTintFill(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Sprite /* this */
    override var tintTopLeft: integer
    override var tintTopRight: integer
    override var tintBottomLeft: integer
    override var tintBottomRight: integer
    override var tint: integer
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: integer
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Sprite /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Sprite /* this */
    override fun setRotation(radians: Number): Sprite /* this */
    override fun setAngle(degrees: Number): Sprite /* this */
    override fun setScale(x: Number, y: Number): Sprite /* this */
    override fun setX(value: Number): Sprite /* this */
    override fun setY(value: Number): Sprite /* this */
    override fun setZ(value: Number): Sprite /* this */
    override fun setW(value: Number): Sprite /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Sprite /* this */
    override fun setAcceleration(x: Number, y: Number): Sprite /* this */
    override fun setAccelerationX(value: Number): Sprite /* this */
    override fun setAccelerationY(value: Number): Sprite /* this */
    override fun setAngularVelocity(value: Number): Sprite /* this */
    override fun setAngularAcceleration(value: Number): Sprite /* this */
    override fun setAngularDrag(value: Number): Sprite /* this */
    override fun setBounce(x: Number, y: Number): Sprite /* this */
    override fun setBounceX(value: Number): Sprite /* this */
    override fun setBounceY(value: Number): Sprite /* this */
    override fun setCollideWorldBounds(value: Boolean, bounceX: Number, bounceY: Number): Sprite /* this */
    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Sprite /* this */
    override fun setDebugBodyColor(value: Number): Sprite /* this */
    override var debugShowBody: Boolean
    override var debugShowVelocity: Boolean
    override var debugBodyColor: Number
    override fun setDrag(x: Number, y: Number): Sprite /* this */
    override fun setDragX(value: Number): Sprite /* this */
    override fun setDragY(value: Number): Sprite /* this */
    override fun setDamping(value: Boolean): Sprite /* this */
    override fun enableBody(reset: Boolean, x: Number, y: Number, enableGameObject: Boolean, showGameObject: Boolean): Sprite /* this */
    override fun disableBody(disableGameObject: Boolean, hideGameObject: Boolean): Sprite /* this */
    override fun refreshBody(): Sprite /* this */
    override fun setFriction(x: Number, y: Number): Sprite /* this */
    override fun setFrictionX(x: Number): Sprite /* this */
    override fun setFrictionY(y: Number): Sprite /* this */
    override fun setGravity(x: Number, y: Number): Sprite /* this */
    override fun setGravityX(x: Number): Sprite /* this */
    override fun setGravityY(y: Number): Sprite /* this */
    override fun setImmovable(value: Boolean): Sprite /* this */
    override fun setMass(value: Number): Sprite /* this */
    override fun setOffset(x: Number, y: Number): Sprite /* this */
    override fun setSize(width: Number, height: Number, center: Boolean): Size /* this */
    override fun setCircle(radius: Number, offsetX: Number, offsetY: Number): Sprite /* this */
    override fun setVelocity(x: Number, y: Number): Sprite /* this */
    override fun setVelocityX(x: Number): Sprite /* this */
    override fun setVelocityY(y: Number): Sprite /* this */
    override fun setMaxVelocity(x: Number, y: Number): Sprite /* this */
    override fun setCrop(): Sprite /* this */
    override fun setTexture(key: String): Sprite /* this */
    override fun setTexture(key: Phaser.Textures.Texture, frame: String): Texture /* this */
    override fun setTexture(key: Phaser.Textures.Texture, frame: integer): Texture /* this */
    override fun setTexture(key: Phaser.Textures.Texture): Texture /* this */
}

open external class Body(world: Phaser.Physics.Arcade.World, gameObject: Phaser.GameObjects.GameObject) {
    open var world: World
    open var gameObject: GameObject
    open var transform: Any?
    open var debugShowBody: Boolean
    open var debugShowVelocity: Boolean
    open var debugBodyColor: integer
    open var enable: Boolean
    open var isCircle: Boolean
    open var radius: Number
    open var offset: Vector2
    open var position: Vector2
    open var prev: Vector2
    open var prevFrame: Vector2
    open var allowRotation: Boolean
    open var rotation: Number
    open var preRotation: Number
    open var width: Number
    open var height: Number
    open var sourceWidth: Number
    open var sourceHeight: Number
    open var halfWidth: Number
    open var halfHeight: Number
    open var center: Vector2
    open var velocity: Vector2
    open var newVelocity: Vector2
    open var deltaMax: Vector2
    open var acceleration: Vector2
    open var allowDrag: Boolean
    open var drag: dynamic /* Phaser.Math.Vector2 | Number */
    open var allowGravity: Boolean
    open var gravity: Vector2
    open var bounce: Vector2
    open var worldBounce: Vector2
    open var customBoundsRectangle: Rectangle
    open var onWorldBounds: Boolean
    open var onCollide: Boolean
    open var onOverlap: Boolean
    open var maxVelocity: Vector2
    open var maxSpeed: Number
    open var friction: Vector2
    open var useDamping: Boolean
    open var angularVelocity: Number
    open var angularAcceleration: Number
    open var angularDrag: Number
    open var maxAngular: Number
    open var mass: Number
    open var angle: Number
    open var speed: Number
    open var facing: integer
    open var immovable: Boolean
    open var moves: Boolean
    open var customSeparateX: Boolean
    open var customSeparateY: Boolean
    open var overlapX: Number
    open var overlapY: Number
    open var overlapR: Number
    open var embedded: Boolean
    open var collideWorldBounds: Boolean
    open var checkCollision: ArcadeBodyCollision
    open var touching: ArcadeBodyCollision
    open var wasTouching: ArcadeBodyCollision
    open var blocked: ArcadeBodyCollision
    open var syncBounds: Boolean
    open var physicsType: integer
    open fun updateBounds()
    open fun updateCenter()
    open fun resetFlags()
    open fun preUpdate(willStep: Boolean, delta: Number)
    open fun update(delta: Number)
    open fun postUpdate()
    open fun setBoundsRectangle(bounds: Rectangle = definedExternally): Body /* this */
    open fun checkWorldBounds(): Boolean
    open fun setOffset(x: Number, y: Number = definedExternally): Body
    open fun setSize(width: integer = definedExternally, height: integer = definedExternally, center: Boolean = definedExternally): Body
    open fun setCircle(radius: Number, offsetX: Number = definedExternally, offsetY: Number = definedExternally): Body
    open fun reset(x: Number, y: Number)
    open fun stop(): Body
    open fun getBounds(obj: ArcadeBodyBounds): ArcadeBodyBounds
    open fun hitTest(x: Number, y: Number): Boolean
    open fun onFloor(): Boolean
    open fun onCeiling(): Boolean
    open fun onWall(): Boolean
    open fun deltaAbsX(): Number
    open fun deltaAbsY(): Number
    open fun deltaX(): Number
    open fun deltaY(): Number
    open fun deltaXFinal(): Number
    open fun deltaYFinal(): Number
    open fun deltaZ(): Number
    open fun destroy()
    open fun drawDebug(graphic: Graphics)
    open fun willDrawDebug(): Boolean
    open fun setCollideWorldBounds(value: Boolean = definedExternally, bounceX: Number = definedExternally, bounceY: Number = definedExternally): Body
    open fun setVelocity(x: Number, y: Number = definedExternally): Body
    open fun setVelocityX(value: Number): Body
    open fun setVelocityY(value: Number): Body
    open fun setMaxVelocity(x: Number, y: Number = definedExternally): Body
    open fun setMaxSpeed(value: Number): Body
    open fun setBounce(x: Number, y: Number): Body
    open fun setBounceX(value: Number): Body
    open fun setBounceY(value: Number): Body
    open fun setAcceleration(x: Number, y: Number): Body
    open fun setAccelerationX(value: Number): Body
    open fun setAccelerationY(value: Number): Body
    open fun setAllowDrag(value: Boolean = definedExternally): Body
    open fun setAllowGravity(value: Boolean = definedExternally): Body
    open fun setAllowRotation(value: Boolean = definedExternally): Body
    open fun setDrag(x: Number, y: Number): Body
    open fun setDragX(value: Number): Body
    open fun setDragY(value: Number): Body
    open fun setGravity(x: Number, y: Number): Body
    open fun setGravityX(value: Number): Body
    open fun setGravityY(value: Number): Body
    open fun setFriction(x: Number, y: Number): Body
    open fun setFrictionX(value: Number): Body
    open fun setFrictionY(value: Number): Body
    open fun setAngularVelocity(value: Number): Body
    open fun setAngularAcceleration(value: Number): Body
    open fun setAngularDrag(value: Number): Body
    open fun setMass(value: Number): Body
    open fun setImmovable(value: Boolean = definedExternally): Body
    open fun setEnable(value: Boolean = definedExternally): Body
    open var x: Number
    open var y: Number
    open var left: Number
    open var right: Number
    open var top: Number
    open var bottom: Number
}

open external class Collider {
    constructor(world: World, overlapOnly: Boolean, object1: GameObject, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: Phaser.GameObjects.Group, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: Sprite, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: Image, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: StaticGroup, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: Group, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: DynamicTilemapLayer, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: StaticTilemapLayer, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: Array<GameObject>, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: Array<Sprite>, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: Array<Image>, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: Array<StaticGroup>, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: Array<Group>, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: Array<DynamicTilemapLayer>, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    constructor(world: World, overlapOnly: Boolean, object1: Array<StaticTilemapLayer>, object2: dynamic, collideCallback: ArcadePhysicsCallback, processCallback: ArcadePhysicsCallback, callbackContext: Any)
    open var world: World
    open var name: String
    open var active: Boolean
    open var overlapOnly: Boolean
    open var object1: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */
    open var object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */
    open var collideCallback: ArcadePhysicsCallback
    open var processCallback: ArcadePhysicsCallback
    open var callbackContext: Any?
    open fun setName(name: String): Collider
    open fun update()
    open fun destroy()
}

external var DYNAMIC_BODY: Number

external var STATIC_BODY: Number

external var GROUP: Number

external var TILEMAPLAYER: Number

external var FACING_NONE: Number

external var FACING_UP: Number

external var FACING_DOWN: Number

external var FACING_LEFT: Number

external var FACING_RIGHT: Number

open external class Factory(world: Phaser.Physics.Arcade.World) {
    open var world: World
    open var scene: Scene
    open var sys: Systems
    open fun collider(object1: GameObject, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun collider(object1: Array<GameObject>, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun collider(object1: Phaser.GameObjects.Group, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun collider(object1: Array<Phaser.GameObjects.Group>, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun overlap(object1: GameObject, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun overlap(object1: Array<GameObject>, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun overlap(object1: Phaser.GameObjects.Group, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun overlap(object1: Array<Phaser.GameObjects.Group>, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun existing(gameObject: GameObject, isStatic: Boolean = definedExternally): GameObject
    open fun staticImage(x: Number, y: Number, texture: String, frame: String = definedExternally): Image
    open fun staticImage(x: Number, y: Number, texture: String, frame: integer = definedExternally): Image
    open fun image(x: Number, y: Number, texture: String, frame: String = definedExternally): Image
    open fun image(x: Number, y: Number, texture: String, frame: integer = definedExternally): Image
    open fun staticSprite(x: Number, y: Number, texture: String, frame: String = definedExternally): Sprite
    open fun staticSprite(x: Number, y: Number, texture: String, frame: integer = definedExternally): Sprite
    open fun sprite(x: Number, y: Number, key: String, frame: String = definedExternally): Sprite
    open fun sprite(x: Number, y: Number, key: String, frame: integer = definedExternally): Sprite
    open fun staticGroup(children: Array<GameObject> = definedExternally, config: GroupConfig = definedExternally): StaticGroup
    open fun staticGroup(children: Array<GameObject> = definedExternally, config: GroupCreateConfig = definedExternally): StaticGroup
    open fun staticGroup(children: GroupConfig = definedExternally, config: GroupConfig = definedExternally): StaticGroup
    open fun staticGroup(children: GroupConfig = definedExternally, config: GroupCreateConfig = definedExternally): StaticGroup
    open fun staticGroup(children: GroupCreateConfig = definedExternally, config: GroupConfig = definedExternally): StaticGroup
    open fun staticGroup(children: GroupCreateConfig = definedExternally, config: GroupCreateConfig = definedExternally): StaticGroup
    open fun group(children: Array<GameObject> = definedExternally, config: GroupConfig /* Phaser.Types.GameObjects.Group.GroupConfig & `T$8` */ = definedExternally): Group
    open fun group(children: Array<GameObject> = definedExternally, config: GroupCreateConfig = definedExternally): Group
    open fun group(children: GroupConfig /* Phaser.Types.GameObjects.Group.GroupConfig & `T$8` */ = definedExternally, config: GroupConfig /* Phaser.Types.GameObjects.Group.GroupConfig & `T$8` */ = definedExternally): Group
    open fun group(children: GroupConfig /* Phaser.Types.GameObjects.Group.GroupConfig & `T$8` */ = definedExternally, config: GroupCreateConfig = definedExternally): Group
    open fun group(children: GroupCreateConfig = definedExternally, config: GroupConfig /* Phaser.Types.GameObjects.Group.GroupConfig & `T$8` */ = definedExternally): Group
    open fun group(children: GroupCreateConfig = definedExternally, config: GroupCreateConfig = definedExternally): Group
    open fun destroy()
    open fun staticImage(x: Number, y: Number, texture: String): Image
    open fun image(x: Number, y: Number, texture: String): Image
    open fun staticSprite(x: Number, y: Number, texture: String): Sprite
    open fun sprite(x: Number, y: Number, key: String): Sprite
    open fun staticGroup(): StaticGroup
    open fun group(): Group
}

external fun GetOverlapX(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Number

external fun GetOverlapY(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Number

open external class Group : Phaser.GameObjects.Group {
    constructor(world: World, scene: Scene, children: Array<GameObject>, config: GroupConfig)
    constructor(world: World, scene: Scene, children: Array<GameObject>, config: GroupCreateConfig)
    constructor(world: World, scene: Scene, children: GroupConfig, config: GroupConfig)
    constructor(world: World, scene: Scene, children: GroupConfig, config: GroupCreateConfig)
    constructor(world: World, scene: Scene, children: GroupCreateConfig, config: GroupConfig)
    constructor(world: World, scene: Scene, children: GroupCreateConfig, config: GroupCreateConfig)
    open var world: World
    override var classType: Function<*>
    open var physicsType: integer
    open var defaults: PhysicsGroupDefaults
    override var type: String
    open fun createCallbackHandler(child: GameObject)
    open fun removeCallbackHandler(child: GameObject)
    open fun setVelocity(x: Number, y: Number, step: Number = definedExternally): Group
    open fun setVelocityX(value: Number, step: Number = definedExternally): Group
    open fun setVelocityY(value: Number, step: Number = definedExternally): Group
}

external fun SeparateX(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Boolean

external fun SeparateY(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Boolean

open external class StaticBody(world: Phaser.Physics.Arcade.World, gameObject: Phaser.GameObjects.GameObject) {
    open var world: World
    open var gameObject: GameObject
    open var debugShowBody: Boolean
    open var debugBodyColor: integer
    open var enable: Boolean
    open var isCircle: Boolean
    open var radius: Number
    open var offset: Vector2
    open var position: Vector2
    open var width: Number
    open var height: Number
    open var halfWidth: Number
    open var halfHeight: Number
    open var center: Vector2
    open var velocity: Vector2
    open var allowGravity: Boolean
    open var gravity: Vector2
    open var bounce: Vector2
    open var onWorldBounds: Boolean
    open var onCollide: Boolean
    open var onOverlap: Boolean
    open var mass: Number
    open var immovable: Boolean
    open var customSeparateX: Boolean
    open var customSeparateY: Boolean
    open var overlapX: Number
    open var overlapY: Number
    open var overlapR: Number
    open var embedded: Boolean
    open var collideWorldBounds: Boolean
    open var checkCollision: ArcadeBodyCollision
    open var touching: ArcadeBodyCollision
    open var wasTouching: ArcadeBodyCollision
    open var blocked: ArcadeBodyCollision
    open var physicsType: integer
    open fun setGameObject(gameObject: GameObject, update: Boolean = definedExternally): StaticBody
    open fun updateFromGameObject(): StaticBody
    open fun setOffset(x: Number, y: Number): StaticBody
    open fun setSize(width: integer = definedExternally, height: integer = definedExternally, center: Boolean = definedExternally): StaticBody
    open fun setCircle(radius: Number, offsetX: Number = definedExternally, offsetY: Number = definedExternally): StaticBody
    open fun updateCenter()
    open fun reset(x: Number = definedExternally, y: Number = definedExternally)
    open fun stop(): StaticBody
    open fun getBounds(obj: ArcadeBodyBounds): ArcadeBodyBounds
    open fun hitTest(x: Number, y: Number): Boolean
    open fun postUpdate()
    open fun deltaAbsX(): Number
    open fun deltaAbsY(): Number
    open fun deltaX(): Number
    open fun deltaY(): Number
    open fun deltaZ(): Number
    open fun destroy()
    open fun drawDebug(graphic: Graphics)
    open fun willDrawDebug(): Boolean
    open fun setMass(value: Number): StaticBody
    open var x: Number
    open var y: Number
    open var left: Number
    open var right: Number
    open var top: Number
    open var bottom: Number
}

open external class StaticGroup : Phaser.GameObjects.Group {
    constructor(world: World, scene: Scene, children: Array<GameObject>, config: GroupConfig)
    constructor(world: World, scene: Scene, children: Array<GameObject>, config: GroupCreateConfig)
    constructor(world: World, scene: Scene, children: GroupConfig, config: GroupConfig)
    constructor(world: World, scene: Scene, children: GroupConfig, config: GroupCreateConfig)
    constructor(world: World, scene: Scene, children: GroupCreateConfig, config: GroupConfig)
    constructor(world: World, scene: Scene, children: GroupCreateConfig, config: GroupCreateConfig)
    open var world: World
    open var physicsType: integer
    override var type: String
    open fun createCallbackHandler(child: GameObject)
    open fun removeCallbackHandler(child: GameObject)
    open fun createMultipleCallbackHandler(entries: Array<GameObject>)
    open fun refresh(): StaticGroup
}

open external class World(scene: Phaser.Scene, config: Phaser.Types.Physics.Arcade.ArcadeWorldConfig) : EventEmitter {
    open var scene: Scene
    open var bodies: Set<Body>
    open var staticBodies: Set<StaticBody>
    open var pendingDestroy: Set<dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody */>
    open var colliders: ProcessQueue<Collider>
    open var gravity: Vector2
    open var bounds: Rectangle
    open var checkCollision: CheckCollisionObject
    open var fps: Number
    open var fixedStep: Boolean
    open var stepsLastFrame: Number
    open var timeScale: Number
    open var OVERLAP_BIAS: Number
    open var TILE_BIAS: Number
    open var forceX: Boolean
    open var isPaused: Boolean
    open var drawDebug: Boolean
    open var debugGraphic: Graphics
    open var defaults: ArcadeWorldDefaults
    open var maxEntries: integer
    open var useTree: Boolean
    open var tree: RTree
    open var staticTree: RTree
    open var treeMinMax: ArcadeWorldTreeMinMax
    open fun enable(obj: GameObject, bodyType: integer = definedExternally)
    open fun enable(obj: Array<GameObject>, bodyType: integer = definedExternally)
    open fun enable(obj: Phaser.GameObjects.Group, bodyType: integer = definedExternally)
    open fun enable(obj: Array<Phaser.GameObjects.Group>, bodyType: integer = definedExternally)
    open fun enableBody(obj: GameObject, bodyType: integer = definedExternally): GameObject
    open fun add(body: Body): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody */
    open fun add(body: StaticBody): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody */
    open fun disable(obj: GameObject)
    open fun disable(obj: Array<GameObject>)
    open fun disable(obj: Phaser.GameObjects.Group)
    open fun disable(obj: Array<Phaser.GameObjects.Group>)
    open fun disableBody(body: Body)
    open fun disableBody(body: StaticBody)
    open fun remove(body: Body)
    open fun remove(body: StaticBody)
    open fun createDebugGraphic(): Graphics
    open fun setBounds(x: Number, y: Number, width: Number, height: Number, checkLeft: Boolean = definedExternally, checkRight: Boolean = definedExternally, checkUp: Boolean = definedExternally, checkDown: Boolean = definedExternally): World
    open fun setBoundsCollision(left: Boolean = definedExternally, right: Boolean = definedExternally, up: Boolean = definedExternally, down: Boolean = definedExternally): World
    open fun pause(): World
    open fun resume(): World
    open fun addCollider(object1: GameObject, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: Phaser.GameObjects.Group, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: Sprite, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: Image, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: StaticGroup, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: Group, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: DynamicTilemapLayer, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: StaticTilemapLayer, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: Array<GameObject>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: Array<Sprite>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: Array<Image>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: Array<StaticGroup>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: Array<Group>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: Array<DynamicTilemapLayer>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addCollider(object1: Array<StaticTilemapLayer>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: GameObject, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: Phaser.GameObjects.Group, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: Sprite, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: Image, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: StaticGroup, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: Group, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: DynamicTilemapLayer, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: StaticTilemapLayer, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: Array<GameObject>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: Array<Sprite>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: Array<Image>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: Array<StaticGroup>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: Array<Group>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: Array<DynamicTilemapLayer>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun addOverlap(object1: Array<StaticTilemapLayer>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Collider
    open fun removeCollider(collider: Collider): World
    open fun setFPS(framerate: integer): World /* this */
    open fun update(time: Number, delta: Number)
    open fun step(delta: Number)
    open fun postUpdate()
    open fun updateMotion(body: Body, delta: Number)
    open fun computeAngularVelocity(body: Body, delta: Number)
    open fun computeVelocity(body: Body, delta: Number)
    open fun separate(body1: Body, body2: Body, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally, overlapOnly: Boolean = definedExternally): Boolean
    open fun separateCircle(body1: Body, body2: Body, overlapOnly: Boolean = definedExternally, bias: Number = definedExternally): Boolean
    open fun intersects(body1: Body, body2: Body): Boolean
    open fun circleBodyIntersects(circle: Body, body: Body): Boolean
    open fun overlap(object1: GameObject, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Phaser.GameObjects.Group, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Sprite, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Image, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: StaticGroup, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Group, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: DynamicTilemapLayer, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: StaticTilemapLayer, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<GameObject>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<Sprite>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<Image>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<StaticGroup>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<Group>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<DynamicTilemapLayer>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlap(object1: Array<StaticTilemapLayer>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, overlapCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: GameObject, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Phaser.GameObjects.Group, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Sprite, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Image, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: StaticGroup, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Group, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: DynamicTilemapLayer, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: StaticTilemapLayer, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<GameObject>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<Sprite>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<Image>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<StaticGroup>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<Group>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<DynamicTilemapLayer>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collide(object1: Array<StaticTilemapLayer>, object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.DynamicTilemapLayer | Phaser.Tilemaps.StaticTilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.DynamicTilemapLayer> | Array<Phaser.Tilemaps.StaticTilemapLayer> */ = definedExternally, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collideTiles(sprite: GameObject, tiles: Array<Tile>, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun overlapTiles(sprite: GameObject, tiles: Array<Tile>, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally): Boolean
    open fun collideSpriteVsTilemapLayer(sprite: GameObject, tilemapLayer: DynamicTilemapLayer, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally, overlapOnly: Boolean = definedExternally): Boolean
    open fun collideSpriteVsTilemapLayer(sprite: GameObject, tilemapLayer: StaticTilemapLayer, collideCallback: ArcadePhysicsCallback = definedExternally, processCallback: ArcadePhysicsCallback = definedExternally, callbackContext: Any = definedExternally, overlapOnly: Boolean = definedExternally): Boolean
    open fun wrap(obj: Any, padding: Number = definedExternally)
    open fun wrapArray(objects: Array<Any>, padding: Number = definedExternally)
    open fun wrapObject(obj: Any, padding: Number = definedExternally)
    override fun shutdown()
    override fun destroy()
}