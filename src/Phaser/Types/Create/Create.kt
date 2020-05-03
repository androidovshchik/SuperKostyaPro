package Phaser.Types.Create

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

typealias GenerateTextureCallback = (canvas: HTMLCanvasElement, context: CanvasRenderingContext2D) -> Unit

external interface GenerateTextureConfig {
    var data: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var canvas: HTMLCanvasElement?
        get() = definedExternally
        set(value) = definedExternally
    var palette: Palette?
        get() = definedExternally
        set(value) = definedExternally
    var pixelWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pixelHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var resizeCanvas: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var clearCanvas: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var preRender: GenerateTextureCallback?
        get() = definedExternally
        set(value) = definedExternally
    var postRender: GenerateTextureCallback?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Palette {
    operator fun get(key: String): String
    operator fun set(key: String, value: String)
    var A: String
    var B: String
    var C: String
    var D: String
    var E: String
    var F: String
}