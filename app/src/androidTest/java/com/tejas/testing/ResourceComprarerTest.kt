package com.tejas.testing

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ResourceComprarerTest{

   private lateinit var resourceComprarer: ResourceComprarer

   @Before
   fun setup(){
       resourceComprarer=ResourceComprarer()
   }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {

        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComprarer.isEqual(context,R.string.app_name,"Testing")

        assertThat(result).isTrue()

    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse() {

        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComprarer.isEqual(context,R.string.app_name,"Dominika")

        assertThat(result).isTrue()

    }
}