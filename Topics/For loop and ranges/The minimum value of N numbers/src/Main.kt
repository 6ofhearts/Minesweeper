fun main() {
   val n = readLine()!!.toInt()
    var min = 999
    for (i in 1..n) {
        val number = readLine()!!.toInt()
        if (min > number) {
            min = number
        }
    }
    println(min)
}
