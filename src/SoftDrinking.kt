fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val n = input.getOrNull(0)?:0
    val k = input.getOrNull(1)?:0
    val l = input.getOrNull(2)?:0
    val c = input.getOrNull(3)?:0
    val d = input.getOrNull(4)?:0
    val p = input.getOrNull(5)?:0
    val nl = input.getOrNull(6)?:0
    val np = input.getOrNull(7)?:0
    println(minOf((k*l)/nl, c*d,p/np) / n)
}