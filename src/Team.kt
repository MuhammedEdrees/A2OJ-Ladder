fun main(){
    val n = readln().toInt()
    var res = 0
    repeat(n){
        if(readln().count { it == '1' } > 1) res++
    }
    println(res)
}