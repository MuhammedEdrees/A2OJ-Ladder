fun main() {
    val word = readln()
    println( if(word.count { it.isUpperCase() } > word.count { it.isLowerCase() }) word.uppercase() else word.lowercase())
}