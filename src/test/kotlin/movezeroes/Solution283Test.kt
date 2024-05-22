package movezeroes

import com.allaber.movezeroes.Solution283
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class Solution283Test {

    private val solution = Solution283()

    @Test
    fun test1() {
        val result = solution.moveZeroes(intArrayOf(0, 1, 0, 3, 12))
        assertContentEquals(intArrayOf(1, 3, 12, 0, 0), result)
    }

    @Test
    fun test2() {
        val result = solution.moveZeroes(intArrayOf(0))
        assertContentEquals(intArrayOf(0), result)
    }
}