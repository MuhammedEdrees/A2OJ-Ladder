fun main() {
    val borzeCode = readln()
    val ternaryNum = borzeCode.replace("--", "2").replace("-.", "1").replace(".", "0")
    println(ternaryNum)
}