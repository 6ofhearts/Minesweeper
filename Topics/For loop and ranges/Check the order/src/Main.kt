fun main() {
    var min = Int.MIN_VALUE
    val n = readLine()!!.toInt()

    val temp = Int.MIN_VALUE
    var a = "YES"
    for (i in 1..n) {
        val s = readLine()!!.toInt()
        if (min > s) {
            a = "NO"
            break
        }
        min = s
    }
    print(a)

}