package com.tricoder.unittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validRegistrationInput(
            username = "",
            password = "123",
            confirmedPassword = "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and repeated password returns true`(){
        val result=RegistrationUtil.validRegistrationInput(
            username = "Hello",
            password = "123",
            confirmedPassword = "123"
        )

        assertThat(result).isTrue()
    }


    @Test
    fun `username already exists returns false`(){
        val result=RegistrationUtil.validRegistrationInput(
            username = "Bob",
            password = "123",
            confirmedPassword = "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `confirmedPassword does not match with actual password returns false`(){
        val result=RegistrationUtil.validRegistrationInput(
            username = "Oi",
            password = "123",
            confirmedPassword = "212"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password contains at least two digits returns true`(){
        val result=RegistrationUtil.validRegistrationInput(
            username = "Oi",
            password = "123",
            confirmedPassword = "212"
        )

        assertThat(result).isFalse()
    }


    @Test
    fun `password empty returns false`(){
        val result=RegistrationUtil.validRegistrationInput(
            username = "Oi",
            password = "",
            confirmedPassword = ""
        )
        assertThat(result).isFalse()

    }
}