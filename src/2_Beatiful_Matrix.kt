import kotlin.math.abs

fun main(){
    var x: Int = -1
    var y: Int = -1
    repeat(5){ xPos ->
        val rowItems = readln().split(" ").map{ it.toInt() }
        rowItems.forEachIndexed { yPos, n ->
            if(n == 1){
                x = xPos + 1
                y = yPos + 1
            }
        }
    }
    println(abs(x - 3) + abs(y - 3))
}