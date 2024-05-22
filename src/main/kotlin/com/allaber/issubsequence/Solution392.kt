package com.allaber.issubsequence

class Solution392 {
    fun isSubsequence(s: String, t: String): Boolean {

        if (s.isEmpty()) {
            return true
        }

        if (t.isEmpty()) {
            return false
        }

        var temp = 0

        for (i in t.indices) {
            if (s[temp] == t[i]) {
                temp++
                if (temp == s.length) {
                    return true
                }
            }
        }

        return false
    }
}