package com.tejas.testing

object RegistrationUtil {

    private val existingUsers = listOf("peter","Carl")


    /**
     * the input is not valid if
     * ....username or password is empty
     * ....Username is already taken
     * ....ConfirmPassword is not equal to password
     * ....the password contains less than two digits
     */

    fun validateRegistration(
        username:String,
        password:String,
        confirmPassword:String
    ):Boolean {
        if(username.isEmpty() || password.isEmpty()){
            return false
        }
        if (username in existingUsers){
            return false
        }
        if(password!=confirmPassword){
            return false
        }
        if(password.count { it.isDigit() } <2){
            return false
        }
        return true
    }

}