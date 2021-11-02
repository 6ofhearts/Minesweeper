fun main() {
    val n = readLine()!!.toInt()
    var a = 0
    var b = 0
    var temp  = Int.MIN_VALUE

    if (n == 1) {
        print(n)
    } else {
        for(i in 1..n) {
            temp = readLine()!!.toInt()
            if (temp > a) {
                b = a
                a = temp
            }
            else
            if (temp > b) {
                b = temp
            }
        }

    }
    print (a*b)
}

