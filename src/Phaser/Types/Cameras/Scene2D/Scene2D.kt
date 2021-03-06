@file:JsQualifier("Phaser.Types.Cameras.Scene2D")

package Phaser.Types.Cameras.Scene2D

import Phaser.integer

external interface CameraConfig {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var x: integer?
        get() = definedExternally
        set(value) = definedExternally
    var y: integer?
        get() = definedExternally
        set(value) = definedExternally
    var width: integer?
        get() = definedExternally
        set(value) = definedExternally
    var height: integer?
        get() = definedExternally
        set(value) = definedExternally
    var zoom: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var roundPixels: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scrollX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var scrollY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* Boolean | String */
        get() = definedExternally
        set(value) = definedExternally
    var bounds: Any?
        get() = definedExternally
        set(value) = definedExternally
    // todo
    /*var bounds.x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bounds.y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bounds.width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bounds.height: Number?
        get() = definedExternally
        set(value) = definedExternally*/
}

external interface JSONCamera {
    var name: String
    var x: Number
    var y: Number
    var width: Number
    var height: Number
    var zoom: Number
    var rotation: Number
    var roundPixels: Boolean
    var scrollX: Number
    var scrollY: Number
    var backgroundColor: String
    var bounds: JSONCameraBounds?
        get() = definedExternally
        set(value) = definedExternally
}

external interface JSONCameraBounds {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}