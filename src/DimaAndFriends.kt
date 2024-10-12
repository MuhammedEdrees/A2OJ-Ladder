fun main() {
    val friendCount = readln().toInt()
    val fingerCount = readln().split(" ").map{ it.toInt() }.sum()
    var result = 0
    for(i in 1..5){
        if((fingerCount+i)%(friendCount+1) != 1){
            result++
        }
    }
    println(result)
}