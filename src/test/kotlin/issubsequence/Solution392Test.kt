package issubsequence

import com.allaber.issubsequence.Solution392
import com.allaber.stringcompression.Solution443
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution392Test {

    private val solution = Solution392()

    @Test
    fun test1() {
        val result = solution.isSubsequence("abc", "ahbgdc")
        assertEquals(true, result)
    }

    @Test
    fun test2() {
        val result = solution.isSubsequence("axc", "ahbgdc")
        assertEquals(false, result)
    }

    @Test
    fun test3() {
        val result = solution.isSubsequence("", "ahbgdc")
        assertEquals(false, result)
    }
}