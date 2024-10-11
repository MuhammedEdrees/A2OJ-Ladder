
fun main(){
    val line1 = readln().lowercase()
    val line2 = readln().lowercase()
    for(index in line1.indices){
        if(line1[index] == line2[index]) {
            continue
        } else if (line1[index] > line2[index]) {
            println("1")
            return
        } else {
            println("-1")
            return
        }
    }
    println("0")
}