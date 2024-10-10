fun main() {
    readln().toInt()
    val stones = readln()
    println(stones.filterIndexed { index, ch -> ch == stones.getOrNull(index+1) }.length)
}