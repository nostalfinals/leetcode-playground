// 28. 找出字符串中第一个匹配项的下标

private class Solution28 {
    fun strStr(haystack: String, needle: String): Int {
        val offset = needle.length
        var i = 0
        while (i <= haystack.length - 1) {
            val end = i + offset
            if (haystack.length < end) return -1
            val sub = haystack.substring(i, i + offset)
            if (sub == needle) return i
            i += 1
        }
        return -1
    }
}