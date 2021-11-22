package com.tricoder.unittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest{

    @Test
    fun `if the braces are set correctly returns false`() {
        val result=Homework.checkBraces(
            string = "(2+1))"
        )
        assertThat(result).isFalse()
    }
}