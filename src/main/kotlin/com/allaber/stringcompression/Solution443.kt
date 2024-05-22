package com.allaber.stringcompression

class Solution443 {

    fun compress(chars: CharArray): Int {
        var solution = ""

        var tempChar = chars[0]
        var count = 1

        for (i in 1..<chars.size) {
            if (tempChar == chars[i]) {
                count++
            } else {
                solution += if (count == 1) {
                    tempChar
                } else {
                    "$tempChar$count"
                }
                count = 1
                tempChar = chars[i]
            }
        }

        solution += if (count == 1) {
            tempChar
        } else {
            "$tempChar$count"
        }

        for(i in solution.indices) {
            chars[i] = solution[i]
        }

        return solution.length
    }


}