@file:JsQualifier("Phaser.Types.Input.Keyboard")

package Phaser.Types.Input.Keyboard

import Phaser.Input.Keyboard.Key

external interface CursorKeys {
    var up: Key?
        get() = definedExternally
        set(value) = definedExternally
    var down: Key?
        get() = definedExternally
        set(value) = definedExternally
    var left: Key?
        get() = definedExternally
        set(value) = definedExternally
    var right: Key?
        get() = definedExternally
        set(value) = definedExternally
    var space: Key?
        get() = definedExternally
        set(value) = definedExternally
    var shift: Key?
        get() = definedExternally
        set(value) = definedExternally
}

external interface KeyComboConfig {
    var resetOnWrongKey: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxKeyDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var resetOnMatch: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var deleteOnMatch: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}