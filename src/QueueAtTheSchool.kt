fun main(){
    val (n, t) = readln().split(" ").map { it.toInt() }
    val stringBuilder = StringBuilder(readln())
    if(n > 1){
        repeat(t){
            var i = 1
            for(j in 0..<n){
                if(stringBuilder[i] == 'G' && stringBuilder[i-1] == 'B'){
                    stringBuilder.setCharAt(i, 'B')
                    stringBuilder.setCharAt(i-1, 'G')
                    i+=2
                } else {
                    i++
                }
                if(i >= n) break
            }
        }
    }
    println(stringBuilder.toString())
}