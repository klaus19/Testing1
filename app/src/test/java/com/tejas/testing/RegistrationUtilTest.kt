package com.tejas.testing


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){

         val result = RegistrationUtil.validateRegistration(
             "",
         "123",
             "123"
         )
        assertThat(result).isFalse()
    }

    @Test
    fun `validate username and correctly repeated password returns true`(){

        val result = RegistrationUtil.validateRegistration(
            "Dominika",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){

        val result = RegistrationUtil.validateRegistration(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password is empty returns false`(){

        val result = RegistrationUtil.validateRegistration(
            "Carl",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password was repeated incorrectly returns false `(){

        val result = RegistrationUtil.validateRegistration(
            "Carl",
            "123",
            "12"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password is less than two digits`(){

        val result = RegistrationUtil.validateRegistration(
            "Carl",
            "1",
            "1"
        )
        assertThat(result).isFalse()
    }
}