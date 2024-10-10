import java.util.Stack

fun main() {
    val l1 = listOf(1,2,3,4,5).toTypedArray()
    val l2 = listOf(1,3,2,2,3,1).toIntArray()
    println(rotateLeft(4, l1).joinToString(separator = ", "))
}
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if (v1 - v2 == 0) return "NO"
    val result: Double = ((x2 - x1) / (v1 - v2)).toDouble()
    return if (result > 0 && result % 1.0 == 0.0) "YES" else "NO"

}
fun rotateLeft(d: Int, arr: Array<Int>): Array<Int> {
    val size = arr.size
    val steps = d%size
    if(size < 2 || steps == 0) return arr
    val originalArr = arr.clone()
    repeat(size) { index ->
        arr[index] = originalArr[(index+steps)%size]
    }
    return arr
}