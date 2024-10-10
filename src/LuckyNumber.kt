fun main() {
    val input = readln()
    var fourCount = 0
    var sevenCount = 0
    input.forEach {
        if(it == '4') fourCount++
        else if(it == '7') sevenCount++
    }
    println(if(fourCount+sevenCount in listOf(4, 7)) "YES" else "NO")
}