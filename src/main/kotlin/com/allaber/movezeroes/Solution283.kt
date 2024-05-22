package com.allaber.movezeroes

class Solution283 {
    fun moveZeroes(nums: IntArray): IntArray {
        var temp = 0
        for(i in nums.indices) {
            if(nums[i] != 0) {
                nums[temp] = nums[i]
                temp++
            }
        }

        for(i in temp..<nums.size) {
            nums[i] = 0
        }

        return nums
    }
}