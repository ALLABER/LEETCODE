package com.allaber.productofarrayexceptself

class Solution238 {
    fun productExceptSelf(nums: IntArray): IntArray {

        val rightArray = IntArray(nums.size) { 1 }
        val leftArray = IntArray(nums.size) { 1 }

        var temp = 1
        for (i in nums.indices) {
            temp *= nums[i]
            rightArray[i] = temp
        }

        temp = 1
        for (i in nums.size - 1 downTo 0) {
            temp *= nums[i]
            leftArray[i] = temp
        }



        for (i in nums.indices) {
            if (i > 0 && i < nums.size - 1) {
                nums[i] = rightArray[i - 1] * leftArray[i + 1]
            }

            if (i == nums.size - 1) {
                nums[i] = rightArray[i - 1]
            }

            if (i == 0) {
                nums[i] = leftArray[i + 1]
            }
        }

        return nums
    }
}