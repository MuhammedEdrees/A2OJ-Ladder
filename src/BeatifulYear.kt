fun main(){
    var year= readln().toInt()
    do {
       year++
    } while (year.toString().toSet().size != 4)
    println(year)
}