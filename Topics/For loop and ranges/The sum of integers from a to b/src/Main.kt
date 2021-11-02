fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var rez = 0

    for (i in a..b){
        rez += i
    }
    println(rez)
}