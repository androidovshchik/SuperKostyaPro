@file:JsQualifier("Phaser.Types.Tweens")

package Phaser.Types.Tweens

import Phaser.integer

external interface TweenConfigDefaults {
    var targets: dynamic /* Any? | Array<Any?> */
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ease: String?
        get() = definedExternally
        set(value) = definedExternally
    var easeParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var hold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeat: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeatDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yoyo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flipX: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flipY: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface NumberTweenBuilderConfig {
    var from: Number?
        get() = definedExternally
        set(value) = definedExternally
    var to: Number?
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ease: dynamic /* String | Function<*> */
        get() = definedExternally
        set(value) = definedExternally
    var easeParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var hold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeat: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeatDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yoyo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var offset: dynamic /* String | Number | Function<*> | Any? | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var completeDelay: dynamic /* String | Number | Function<*> | Any? | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var loop: dynamic /* String | Number | Function<*> | Any? | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var loopDelay: dynamic /* String | Number | Function<*> | Any? | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var paused: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useFrames: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var callbackScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onComplete: TweenOnCompleteCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onCompleteParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onCompleteScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onLoop: TweenOnLoopCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onLoopParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onLoopScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onRepeat: TweenOnRepeatCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onRepeatParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onRepeatScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onStart: TweenOnStartCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onStartParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onStartScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdate: TweenOnUpdateCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdateParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdateScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onYoyo: TweenOnYoyoCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onYoyoParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onYoyoScope: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StaggerConfig {
    var start: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ease: dynamic /* String | Function<*> */
        get() = definedExternally
        set(value) = definedExternally
    var from: dynamic /* String | integer */
        get() = definedExternally
        set(value) = definedExternally
    var grid: Array<integer>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TimelineBuilderConfig {
    var tweens: dynamic /* Array<Phaser.Types.Tweens.TweenBuilderConfig> | Array<Any?> | Function<*> */
        get() = definedExternally
        set(value) = definedExternally
    var targets: Any?
        get() = definedExternally
        set(value) = definedExternally
    var totalDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var easeParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var ease: dynamic /* String | Function<*> */
        get() = definedExternally
        set(value) = definedExternally
    var hold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeat: integer?
        get() = definedExternally
        set(value) = definedExternally
    var repeatDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yoyo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flipX: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flipY: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var completeDelay: dynamic /* Number | Function<*> | Any? | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var loop: dynamic /* Number | Function<*> | Any? | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var loopDelay: dynamic /* Number | Function<*> | Any? | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var paused: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useFrames: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var callbackScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onStart: TimelineOnStartCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onStartScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onStartParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdate: TimelineOnUpdateCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdateScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdateParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onLoop: TimelineOnLoopCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onLoopScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onLoopParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onYoyo: TimelineOnYoyoCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onYoyoScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onYoyoParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onComplete: TimelineOnCompleteCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onCompleteScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onCompleteParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$10` {
    @nativeGetter
    operator fun get(key: String): dynamic /* Number | String | Phaser.Types.Tweens.GetEndCallback | Phaser.Types.Tweens.TweenPropConfig */
    @nativeSetter
    operator fun set(key: String, value: Number)
    @nativeSetter
    operator fun set(key: String, value: String)
    @nativeSetter
    operator fun set(key: String, value: GetEndCallback)
    @nativeSetter
    operator fun set(key: String, value: TweenPropConfig)
}

external interface TweenBuilderConfig {
    var targets: Any
    var delay: dynamic /* Number | Function<*> */
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ease: dynamic /* String | Function<*> */
        get() = definedExternally
        set(value) = definedExternally
    var easeParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var hold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeat: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeatDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yoyo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flipX: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flipY: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var offset: dynamic /* String | Number | Function<*> | Any? | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var completeDelay: dynamic /* String | Number | Function<*> | Any? | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var loop: dynamic /* String | Number | Function<*> | Any? | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var loopDelay: dynamic /* String | Number | Function<*> | Any? | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var paused: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var props: `T$10`?
        get() = definedExternally
        set(value) = definedExternally
    var useFrames: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var callbackScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onComplete: TweenOnCompleteCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onCompleteParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onCompleteScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onLoop: TweenOnLoopCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onLoopParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onLoopScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onRepeat: TweenOnRepeatCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onRepeatParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onRepeatScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onStart: TweenOnStartCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onStartParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onStartScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdate: TweenOnUpdateCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdateParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdateScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onYoyo: TweenOnYoyoCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onYoyoParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onYoyoScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onActive: TweenOnActiveCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onActiveParams: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var onActiveScope: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TweenDataConfig {
    var target: Any
    var index: integer
    var key: String
    var getActiveValue: GetActiveCallback
    var getEndValue: GetEndCallback
    var getStartValue: GetStartCallback
    var ease: Function<*>
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var totalDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yoyo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeat: integer?
        get() = definedExternally
        set(value) = definedExternally
    var repeatDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flipX: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flipY: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var progress: Number?
        get() = definedExternally
        set(value) = definedExternally
    var elapsed: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeatCounter: integer?
        get() = definedExternally
        set(value) = definedExternally
    var start: Number?
        get() = definedExternally
        set(value) = definedExternally
    var current: Number?
        get() = definedExternally
        set(value) = definedExternally
    var previous: Number?
        get() = definedExternally
        set(value) = definedExternally
    var end: Number?
        get() = definedExternally
        set(value) = definedExternally
    var t1: Number?
        get() = definedExternally
        set(value) = definedExternally
    var t2: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gen: TweenDataGenConfig?
        get() = definedExternally
        set(value) = definedExternally
    var state: integer?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TweenDataGenConfig {
    var delay: Function<*>
    var duration: Function<*>
    var hold: Function<*>
    var repeat: Function<*>
    var repeatDelay: Function<*>
}

external interface TweenPropConfig {
    var value: dynamic /* Number | String | Phaser.Types.Tweens.GetEndCallback | Phaser.Types.Tweens.TweenPropConfig */
        get() = definedExternally
        set(value) = definedExternally
    var getActive: GetActiveCallback?
        get() = definedExternally
        set(value) = definedExternally
    var getEnd: GetEndCallback?
        get() = definedExternally
        set(value) = definedExternally
    var getStart: GetStartCallback?
        get() = definedExternally
        set(value) = definedExternally
    var ease: dynamic /* String | Function<*> */
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yoyo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeat: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeatDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flipX: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flipY: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}