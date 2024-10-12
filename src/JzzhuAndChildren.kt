fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val originalArr = readln().split(" ").map{it.toInt()}
    val sortedArr = originalArr.sortedWith(compareBy({it/m}, {it%m}))
    println(originalArr.indexOfLast {  it == (sortedArr.last())} + 1)
}