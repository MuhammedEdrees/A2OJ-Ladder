fun main() {
    val word = readln()
    println(word.mapIndexed { index, ch ->
        if ((word.getOrNull(index - 1) ?: ' ') == ' ') ch.uppercase() else ch
    }.joinToString(separator = ""))
}