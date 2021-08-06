package com.tejas.testing

import android.content.Context

class ResourceComprarer {

    fun isEqual(context: Context, resId:Int,str:String):Boolean {

        return context.getString(resId) ==str
    }

}