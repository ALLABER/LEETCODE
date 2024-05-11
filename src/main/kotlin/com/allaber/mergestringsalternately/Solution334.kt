package com.allaber.mergestringsalternately

class Solution334 {
    fun increasingTriplet(nums: IntArray): Boolean {

        if(nums.distinct().size <= 2){
            return false
        }

        for (i in nums.indices) {
            val array2 = nums.sliceArray(i until nums.size).filter { nums[i] < it }

            if(array2.size >= 2) {
                for(j in 0..array2.size -2) {
                    if(array2[j] < array2[j + 1]) {
                        return true
                    }
                }
            }
        }
        return false
    }
}
