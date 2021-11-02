fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    var num = 0

   for (i in a..b) {
       if (i % n == 0) {
           num++
       }
   }
    println(num)
}
