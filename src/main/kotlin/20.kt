import java.util.Stack

// 20. 有效的括号

class Solution20 {
    fun isValid(s: String): Boolean {
        fun Char.isOpen(): Boolean {
            return this == '(' || this == '{' || this == '['
        }

        fun Char.pair(): Char {
            return when (this) {
                '}' -> '{'
                ']' -> '['
                ')' -> '('
                else -> error("Unsupported bracket")
            }
        }

        val chars = Stack<Char>()

        for (i in s.indices) {
            val curr = s[i]
            if (curr.isOpen()) {
                chars.push(curr)
                continue
            }
            if (chars.isEmpty()) return false
            val last = chars.pop()
            if (last != curr.pair()) return false
        }

        return chars.isEmpty()
    }
}