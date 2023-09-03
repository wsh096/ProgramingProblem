class Solution {
    fun solution(x: Int, n: Int) = LongArray(n){x.toLong() * (it + 1)}
}