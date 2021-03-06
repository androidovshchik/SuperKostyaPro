@file:JsQualifier("Phaser.Input.Keyboard")

package Phaser.Input.Keyboard

import Phaser.Events.EventEmitter
import Phaser.Game
import Phaser.Input.InputManager
import Phaser.Input.InputPlugin
import Phaser.Scene
import Phaser.Types.Input.Keyboard.CursorKeys
import Phaser.Types.Input.Keyboard.KeyComboConfig
import Phaser.Types.Scenes.SettingsObject
import Phaser.integer
import org.w3c.dom.events.KeyboardEvent

open external class KeyCombo {
    constructor(keyboardPlugin: KeyboardPlugin, keys: String, config: KeyComboConfig)
    constructor(keyboardPlugin: KeyboardPlugin, keys: Array<integer>, config: KeyComboConfig)
    constructor(keyboardPlugin: KeyboardPlugin, keys: Array<Any?>, config: KeyComboConfig)
    open var manager: KeyboardPlugin
    open var enabled: Boolean
    open var keyCodes: Array<Any>
    open var current: integer
    open var index: integer
    open var size: Number
    open var timeLastMatched: Number
    open var matched: Boolean
    open var timeMatched: Number
    open var resetOnWrongKey: Boolean
    open var maxKeyDelay: integer
    open var resetOnMatch: Boolean
    open var deleteOnMatch: Boolean
    open var progress: Number
    open fun destroy()
}

open external class KeyboardManager(inputManager: Phaser.Input.InputManager) {
    open var manager: InputManager
    open var preventDefault: Boolean
    open var captures: Array<integer>
    open var enabled: Boolean
    open var target: Any
    open var onKeyDown: Function<*>
    open var onKeyUp: Function<*>
    open fun startListeners()
    open fun stopListeners()
    open fun addCapture(keycode: String)
    open fun addCapture(keycode: integer)
    open fun addCapture(keycode: Array<integer>)
    open fun addCapture(keycode: Array<Any>)
    open fun removeCapture(keycode: String)
    open fun removeCapture(keycode: integer)
    open fun removeCapture(keycode: Array<integer>)
    open fun removeCapture(keycode: Array<Any>)
    open fun clearCaptures()
    open fun destroy()
}

open external class KeyboardPlugin(sceneInputPlugin: Phaser.Input.InputPlugin) : EventEmitter {
    open var game: Game
    open var scene: Scene
    open var settings: SettingsObject
    open var sceneInputPlugin: InputPlugin
    open var manager: InputPlugin
    open var enabled: Boolean
    open var keys: Array<Key>
    open var combos: Array<KeyCombo>
    open fun isActive(): Boolean
    open fun addCapture(keycode: String): KeyboardPlugin /* this */
    open fun addCapture(keycode: integer): KeyboardPlugin /* this */
    open fun addCapture(keycode: Array<integer>): KeyboardPlugin /* this */
    open fun addCapture(keycode: Array<Any>): KeyboardPlugin /* this */
    open fun removeCapture(keycode: String): KeyboardPlugin /* this */
    open fun removeCapture(keycode: integer): KeyboardPlugin /* this */
    open fun removeCapture(keycode: Array<integer>): KeyboardPlugin /* this */
    open fun removeCapture(keycode: Array<Any>): KeyboardPlugin /* this */
    open fun getCaptures(): Array<integer>
    open fun enableGlobalCapture(): KeyboardPlugin /* this */
    open fun disableGlobalCapture(): KeyboardPlugin /* this */
    open fun clearCaptures(): KeyboardPlugin /* this */
    open fun createCursorKeys(): CursorKeys
    open fun addKeys(keys: Any?, enableCapture: Boolean = definedExternally, emitOnRepeat: Boolean = definedExternally): Any?
    open fun addKeys(keys: String, enableCapture: Boolean = definedExternally, emitOnRepeat: Boolean = definedExternally): Any?
    open fun addKey(key: Key, enableCapture: Boolean = definedExternally, emitOnRepeat: Boolean = definedExternally): Key
    open fun addKey(key: String, enableCapture: Boolean = definedExternally, emitOnRepeat: Boolean = definedExternally): Key
    open fun addKey(key: integer, enableCapture: Boolean = definedExternally, emitOnRepeat: Boolean = definedExternally): Key
    open fun removeKey(key: Key, destroy: Boolean = definedExternally): KeyboardPlugin /* this */
    open fun removeKey(key: String, destroy: Boolean = definedExternally): KeyboardPlugin /* this */
    open fun removeKey(key: integer, destroy: Boolean = definedExternally): KeyboardPlugin /* this */
    open fun createCombo(keys: String, config: KeyComboConfig = definedExternally): KeyCombo
    open fun createCombo(keys: Array<integer>, config: KeyComboConfig = definedExternally): KeyCombo
    open fun createCombo(keys: Array<Any?>, config: KeyComboConfig = definedExternally): KeyCombo
    open fun checkDown(key: Key, duration: Number = definedExternally): Boolean
    open fun resetKeys(): KeyboardPlugin /* this */
}

external fun DownDuration(key: Key, duration: integer = definedExternally): Boolean

external fun JustDown(key: Key): Boolean

external fun JustUp(key: Key): Boolean

open external class Key(plugin: Phaser.Input.Keyboard.KeyboardPlugin, keyCode: integer) : EventEmitter {
    open var plugin: KeyboardPlugin
    open var keyCode: integer
    open var originalEvent: KeyboardEvent
    open var enabled: Boolean
    open var isDown: Boolean
    open var isUp: Boolean
    open var altKey: Boolean
    open var ctrlKey: Boolean
    open var shiftKey: Boolean
    open var metaKey: Boolean
    open var location: Number
    open var timeDown: Number
    open var duration: Number
    open var timeUp: Number
    open var emitOnRepeat: Boolean
    open var repeats: Number
    open fun setEmitOnRepeat(value: Boolean): Key /* this */
    open fun onDown(event: KeyboardEvent)
    open fun onUp(event: KeyboardEvent)
    open fun reset(): Key /* this */
    open fun getDuration(): Number
    override fun destroy()
}

external fun UpDuration(key: Key, duration: integer = definedExternally): Boolean