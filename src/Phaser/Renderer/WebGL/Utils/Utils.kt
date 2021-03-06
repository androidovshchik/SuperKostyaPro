@file:JsQualifier("Phaser.Renderer.WebGL.Utils")

package Phaser.Renderer.WebGL.Utils

import org.khronos.webgl.WebGLRenderingContext

external fun getTintFromFloats(r: Number, g: Number, b: Number, a: Number): Number

external fun getTintAppendFloatAlpha(rgb: Number, a: Number): Number

external fun getTintAppendFloatAlphaAndSwap(rgb: Number, a: Number): Number

external fun getFloatsFromUintRGB(rgb: Number): Array<Any>

external fun getComponentCount(attributes: Array<Any>, glContext: WebGLRenderingContext): Number