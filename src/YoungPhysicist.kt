fun isInEquilibrium(vectors: List<List<Int>>): Boolean {
    var cumulativeSum = listOf(0, 0, 0)
    vectors.forEach{ vector ->
        cumulativeSum = cumulativeSum.mapIndexed{ index, num -> num + vector[index]}
    }
    return cumulativeSum[0] == 0 && cumulativeSum[1] == 0 && cumulativeSum[2] == 0
}
fun main() {
    val n = readln().toInt()
    val vectors = mutableListOf<List<Int>>()
    repeat(n){
        val vector = readln().split(" ").map{ it.toInt()}
        vectors.add(vector)
    }
    println(if(isInEquilibrium(vectors)) "YES" else "NO")
}