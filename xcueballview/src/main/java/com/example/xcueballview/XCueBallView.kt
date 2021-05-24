package com.example.xcueballview

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Canvas

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#311B92",
    "#00C853",
    "#00C853",
    "#C51162"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 3
val strokeFactor : Float = 90f
val rFactor : Float = 6.9f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
