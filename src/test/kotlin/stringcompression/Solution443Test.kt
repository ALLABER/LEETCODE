package stringcompression

import com.allaber.stringcompression.Solution443
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution443Test {

    private val solution = Solution443()

    @Test
    fun test1() {
        val result = solution.compress(charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c'))
        assertEquals(6, result)
    }

    @Test
    fun test2() {
        val result = solution.compress(charArrayOf('a'))
        assertEquals(1, result)
    }

    @Test
    fun test3() {
        val result = solution.compress(charArrayOf('a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'))
        assertEquals(4, result)
    }


    @Test
    fun test4() {
        val result = solution.compress(charArrayOf('a', 'a', 'a', 'b', 'b', 'a', 'a'))
        assertEquals(6, result)
    }
}