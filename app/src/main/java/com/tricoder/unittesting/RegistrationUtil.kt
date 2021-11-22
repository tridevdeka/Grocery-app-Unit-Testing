package com.tricoder.unittesting

object RegistrationUtil {

    private val existingUsers = listOf("Tridev", "Bob")

    /**
     * the input is not valid if...
     * ...the username/password is empty
     * ...confirmedPassword is not same as password
     * ...password does not contain more than two characters
     * ...username is already taken
     */

    fun validRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {

        if(password.isEmpty() || username.isEmpty()){
            return false
        }

        if (username in existingUsers){
            return false
        }

        if (password!=confirmedPassword){
            return false
        }

        if (password.count { it.isDigit() }<2){
            return false
        }

        return true
    }


}