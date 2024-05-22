package productofarrayexceptself

import com.allaber.productofarrayexceptself.Solution238
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class Solution238Test {

    private val solution = Solution238()

    @Test
    fun test1() {
        val result = solution.productExceptSelf(intArrayOf(1, 2, 3, 4))
        assertContentEquals(intArrayOf(24, 12, 8, 6), result)
    }

    @Test
    fun test2() {
        val result = solution.productExceptSelf(intArrayOf(-1, 1, 0, -3, 3))
        assertContentEquals(intArrayOf(0, 0, 9, 0, 0), result)
    }

    @Test
    fun test3() {
        val result = solution.productExceptSelf(intArrayOf(4,3,2,1,2))
        assertContentEquals(intArrayOf(12,16,24,48,24), result)
    }
}