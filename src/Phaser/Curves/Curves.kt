@file:JsQualifier("Phaser.Curves")

package Phaser.Curves

import Phaser.GameObjects.Graphics
import Phaser.Geom.Point
import Phaser.Geom.Rectangle
import Phaser.Math.Vector2
import Phaser.Types.Curves.EllipseCurveConfig
import Phaser.Types.Curves.JSONCurve
import Phaser.Types.Curves.JSONEllipseCurve
import Phaser.Types.Curves.JSONPath
import Phaser.integer

open external class CubicBezier : Curve {
    constructor(p0: Vector2, p1: Vector2, p2: Vector2, p3: Vector2)
    constructor(p0: Array<Vector2>, p1: Vector2, p2: Vector2, p3: Vector2)

    open var p0: Vector2
    open var p1: Vector2
    open var p2: Vector2
    open var p3: Vector2
    override fun <O : Vector2> getStartPoint(out: O): O
    open fun getResolution(divisions: Number): Number
    open fun <O : Vector2> getPoint(t: Number, out: O = definedExternally): O
    override fun <G : Graphics> draw(graphics: G, pointsTotal: integer): G
    open fun toJSON(): JSONCurve

    companion object {
        fun fromJSON(data: JSONCurve): CubicBezier
    }
}

open external class Curve(type: String) {
    open var type: String
    open var defaultDivisions: integer
    open var arcLengthDivisions: integer
    open var cacheArcLengths: Array<Number>
    open var needsUpdate: Boolean
    open var active: Boolean
    open fun <G : Graphics> draw(graphics: G, pointsTotal: integer = definedExternally): G
    open fun getBounds(out: Rectangle = definedExternally, accuracy: integer = definedExternally): Rectangle
    open fun getDistancePoints(distance: integer): Array<Point>
    open fun getEndPoint(out: Vector2 = definedExternally): Vector2
    open fun getLength(): Number
    open fun getLengths(divisions: integer = definedExternally): Array<Number>
    open fun <O : Vector2> getPointAt(u: Number, out: O = definedExternally): O
    open fun <O : Array<Vector2>> getPoints(divisions: integer = definedExternally, stepRate: Number = definedExternally, out: O = definedExternally): O
    open fun <O : Vector2> getRandomPoint(out: O = definedExternally): O
    open fun getSpacedPoints(divisions: integer = definedExternally, stepRate: Number = definedExternally, out: Array<Any> = definedExternally): Array<Vector2>
    open fun getSpacedPoints(divisions: integer = definedExternally, stepRate: Number = definedExternally, out: Array<Vector2> = definedExternally): Array<Vector2>
    open fun <O : Vector2> getStartPoint(out: O = definedExternally): O
    open fun <O : Vector2> getTangent(t: Number, out: O = definedExternally): O
    open fun <O : Vector2> getTangentAt(u: Number, out: O = definedExternally): O
    open fun getTFromDistance(distance: integer, divisions: integer = definedExternally): Number
    open fun getUtoTmapping(u: Number, distance: integer, divisions: integer = definedExternally): Number
    open fun updateArcLengths()
    open fun getSpacedPoints(): Array<Vector2>
}

open external class Ellipse : Curve {
    constructor(x: Number, y: Number, xRadius: Number, yRadius: Number, startAngle: integer, endAngle: integer, clockwise: Boolean, rotation: integer)
    constructor(x: EllipseCurveConfig, y: Number, xRadius: Number, yRadius: Number, startAngle: integer, endAngle: integer, clockwise: Boolean, rotation: integer)

    open var p0: Vector2
    override fun <O : Vector2> getStartPoint(out: O): O
    open fun getResolution(divisions: Number): Number
    open fun <O : Vector2> getPoint(t: Number, out: O = definedExternally): O
    open fun setXRadius(value: Number): Ellipse /* this */
    open fun setYRadius(value: Number): Ellipse /* this */
    open fun setWidth(value: Number): Ellipse /* this */
    open fun setHeight(value: Number): Ellipse /* this */
    open fun setStartAngle(value: Number): Ellipse /* this */
    open fun setEndAngle(value: Number): Ellipse /* this */
    open fun setClockwise(value: Boolean): Ellipse /* this */
    open fun setRotation(value: Number): Ellipse /* this */
    open var x: Number
    open var y: Number
    open var xRadius: Number
    open var yRadius: Number
    open var startAngle: Number
    open var endAngle: Number
    open var clockwise: Boolean
    open var angle: Number
    open var rotation: Number
    open fun toJSON(): JSONEllipseCurve

    companion object {
        fun fromJSON(data: JSONEllipseCurve): Ellipse
    }
}

open external class Line : Curve {
    constructor(p0: Vector2, p1: Vector2)
    constructor(p0: Array<Number>, p1: Vector2)

    open var p0: Vector2
    open var p1: Vector2
    override var arcLengthDivisions: integer
    open fun <O : Rectangle> getBounds(out: O = definedExternally): O
    override fun <O : Vector2> getStartPoint(out: O): O
    open fun getResolution(divisions: Number = definedExternally): Number
    open fun <O : Vector2> getPoint(t: Number, out: O = definedExternally): O
    override fun <O : Vector2> getPointAt(u: Number, out: O): O
    open fun <O : Vector2> getTangent(): O
    override fun getUtoTmapping(u: Number, distance: integer, divisions: integer): Number
    open fun <G : Graphics> draw(graphics: G): G
    open fun toJSON(): JSONCurve

    companion object {
        fun fromJSON(data: JSONCurve): Line
    }
}

open external class MoveTo(x: Number = definedExternally, y: Number = definedExternally) {
    open var active: Boolean
    open var p0: Vector2
    open fun <O : Vector2> getPoint(t: Number, out: O = definedExternally): O
    open fun <O : Vector2> getPointAt(u: Number, out: O = definedExternally): O
    open fun getResolution(): Number
    open fun getLength(): Number
    open fun toJSON(): JSONCurve
}

open external class Path(x: Number = definedExternally, y: Number = definedExternally) {
    open var name: String
    open var curves: Array<Curve>
    open var cacheLengths: Array<Number>
    open var autoClose: Boolean
    open var startPoint: Vector2
    open fun add(curve: Curve): Path /* this */
    open fun circleTo(radius: Number, clockwise: Boolean = definedExternally, rotation: Number = definedExternally): Path /* this */
    open fun closePath(): Path /* this */
    open fun cubicBezierTo(x: Number, y: Number, control1X: Number, control1Y: Number = definedExternally, control2X: Number = definedExternally, control2Y: Number = definedExternally): Path /* this */
    open fun cubicBezierTo(x: Number, y: Number, control1X: Vector2, control1Y: Number = definedExternally, control2X: Number = definedExternally, control2Y: Number = definedExternally): Path /* this */
    open fun cubicBezierTo(x: Number, y: Vector2, control1X: Number, control1Y: Number = definedExternally, control2X: Number = definedExternally, control2Y: Number = definedExternally): Path /* this */
    open fun cubicBezierTo(x: Number, y: Vector2, control1X: Vector2, control1Y: Number = definedExternally, control2X: Number = definedExternally, control2Y: Number = definedExternally): Path /* this */
    open fun cubicBezierTo(x: Vector2, y: Number, control1X: Number, control1Y: Number = definedExternally, control2X: Number = definedExternally, control2Y: Number = definedExternally): Path /* this */
    open fun cubicBezierTo(x: Vector2, y: Number, control1X: Vector2, control1Y: Number = definedExternally, control2X: Number = definedExternally, control2Y: Number = definedExternally): Path /* this */
    open fun cubicBezierTo(x: Vector2, y: Vector2, control1X: Number, control1Y: Number = definedExternally, control2X: Number = definedExternally, control2Y: Number = definedExternally): Path /* this */
    open fun cubicBezierTo(x: Vector2, y: Vector2, control1X: Vector2, control1Y: Number = definedExternally, control2X: Number = definedExternally, control2Y: Number = definedExternally): Path /* this */
    open fun quadraticBezierTo(x: Number, y: Number = definedExternally, controlX: Number = definedExternally, controlY: Number = definedExternally): Path /* this */
    open fun quadraticBezierTo(x: Array<Vector2>, y: Number = definedExternally, controlX: Number = definedExternally, controlY: Number = definedExternally): Path /* this */
    open fun <G : Graphics> draw(graphics: Graphics, pointsTotal: integer = definedExternally): G
    open fun ellipseTo(xRadius: Number = definedExternally, yRadius: Number = definedExternally, startAngle: integer = definedExternally, endAngle: integer = definedExternally, clockwise: Boolean = definedExternally, rotation: Number = definedExternally): Path /* this */
    open fun fromJSON(data: JSONPath): Path /* this */
    open fun <O : Vector2> getBounds(out: O = definedExternally, accuracy: integer = definedExternally): O
    open fun getCurveLengths(): Array<Number>
    open fun <O : Vector2> getEndPoint(out: O = definedExternally): O
    open fun getLength(): Number
    open fun <O : Vector2> getPoint(t: Number, out: O = definedExternally): O
    open fun getPoints(divisions: integer = definedExternally): Array<Vector2>
    open fun <O : Vector2> getRandomPoint(out: O = definedExternally): O
    open fun getSpacedPoints(divisions: integer = definedExternally): Array<Vector2>
    open fun <O : Vector2> getStartPoint(out: O = definedExternally): O
    open fun <O : Vector2> getTangent(t: Number, out: O = definedExternally): O
    open fun lineTo(x: Number, y: Number = definedExternally): Path /* this */
    open fun lineTo(x: Vector2, y: Number = definedExternally): Path /* this */
    open fun splineTo(points: Array<Vector2>): Path /* this */
    open fun moveTo(x: Number, y: Number): Path /* this */
    open fun moveTo(x: Vector2, y: Number): Path /* this */
    open fun toJSON(): JSONPath
    open fun updateArcLengths()
    open fun destroy()
}

open external class QuadraticBezier : Curve {
    constructor(p0: Vector2, p1: Vector2, p2: Vector2)
    constructor(p0: Array<Number>, p1: Vector2, p2: Vector2)

    open var p0: Vector2
    open var p1: Vector2
    open var p2: Vector2
    override fun <O : Vector2> getStartPoint(out: O): O
    open fun getResolution(divisions: Number): Number
    open fun <O : Vector2> getPoint(t: Number, out: O = definedExternally): O
    override fun <G : Graphics> draw(graphics: G, pointsTotal: integer): G
    open fun toJSON(): JSONCurve

    companion object {
        fun fromJSON(data: JSONCurve): QuadraticBezier
    }
}

open external class Spline : Curve {
    constructor(points: Array<Vector2>)
    constructor(points: Array<Number>)
    constructor(points: Array<Array<Number>>)

    open var points: Array<Vector2>
    open fun addPoints(points: Array<Vector2>): Spline /* this */
    open fun addPoints(points: Array<Number>): Spline /* this */
    open fun addPoints(points: Array<Array<Number>>): Spline /* this */
    open fun addPoint(x: Number, y: Number): Vector2
    override fun <O : Vector2> getStartPoint(out: O): O
    open fun getResolution(divisions: Number): Number
    open fun <O : Vector2> getPoint(t: Number, out: O = definedExternally): O
    open fun toJSON(): JSONCurve

    companion object {
        fun fromJSON(data: JSONCurve): Spline
    }
}