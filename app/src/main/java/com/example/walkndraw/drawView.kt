package com.example.walkndraw

import android.content.Context
import android.location.Location
import android.view.View
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path


class drawView(context: Context, location: Location, lastLocation: Location?) : View(context) {


    init {
        mLastLocation = lastLocation
        mLocation = location
        currentLong = Math.abs(mLocation?.longitude?.toFloat() ?: 500f)
        currentLat = Math.abs(mLocation?.latitude?.toFloat() ?: 500f)
        lastLong = Math.abs(mLastLocation?.longitude?.toFloat() ?: 500f)
        lastLat = Math.abs(mLastLocation?.latitude?.toFloat() ?: 500f)
    }


     companion object {
         var  mLastLocation: Location? = null
         var mLocation: Location? = null
         var currentLong = Math.abs(mLocation?.longitude?.toFloat() ?: 500f)
         var currentLat = Math.abs(mLocation?.latitude?.toFloat() ?: 500f)
         var lastLong = Math.abs(mLastLocation?.longitude?.toFloat() ?: 500f)
         var lastLat = Math.abs(mLastLocation?.latitude?.toFloat() ?: 500f)
     }

    override fun onDraw(c: Canvas) {
        val paint = Paint()
        val path = Path()
        paint.setStyle(Paint.Style.STROKE)
        paint.setColor(Color.RED)
        paint.strokeWidth = 2f
//        c.drawPaint(paint)
//        for (i in 50..99) {
//            path.moveTo(i, i - 1)
//            path.lineTo(i, i)
//        }
//        if (mLocation == null) {
//            path.moveTo(lastLat, lastLong)
////            path.lineTo(lastLat, lastLong)
//        } else {
//            path.moveTo(currentLat, currentLong)
////            path.lineTo(lastLat - currentLat, lastLong - currentLong)
//        }
//        path.close()
        c.drawLine(lastLat, lastLong, currentLat*1000000%1000, currentLong*1000000%1000, paint)
    }

}
