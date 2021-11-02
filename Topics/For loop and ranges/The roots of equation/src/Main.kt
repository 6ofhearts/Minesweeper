fun main() {
    val (a, b, c, d) = Array(4) { readLine()!!.toInt() }
    for (x in 1..1000) {
        if (a * x * x * x + b * x * x + c * x + d == 0) {
            println(x)
        }
    }
}