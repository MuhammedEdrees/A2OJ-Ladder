fun main(){
    val n = readln().toInt()
    var result = 0
    repeat(n){
        val line = readln()
        if(line.contains("++")) result++
        else if(line.contains("--")) result--
    }
    println(result)
}