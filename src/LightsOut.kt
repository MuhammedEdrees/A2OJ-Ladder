fun main() {
    val lightMap = MutableList(9) { 0 }
    repeat(3) { rowIndex ->
        val row = readln().split(" ").map { it.toInt() }
        row.forEachIndexed { columnIndex, value ->
            if (value % 2 == 1) {
                toggleLight(lightMap, rowIndex, columnIndex)
                toggleLight(lightMap, rowIndex - 1, columnIndex)
                toggleLight(lightMap, rowIndex + 1, columnIndex)
                toggleLight(lightMap, rowIndex, columnIndex - 1)
                toggleLight(lightMap, rowIndex, columnIndex + 1)
            }
        }
    }
    for (i in 0..<9 step 3) {
        println("${lightState(lightMap[i])}${lightState(lightMap[i + 1])}${lightState(lightMap[i + 2])}")
    }
}

fun toggleLight(lightMap: MutableList<Int>, row: Int, col: Int) {
    if (row in 0..2 && col in 0..2) {
        val index = row * 3 + col
        lightMap[index] = lightMap[index] + 1
    }
}

fun lightState(switchCount: Int) = if (switchCount % 2 == 0) 1 else 0