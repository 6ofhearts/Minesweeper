fun main() {
    val firstAnswer = readLine().toBoolean() // read other values in the same way
    val secondAnswer = readLine().toBoolean()
    val confession = readLine().toBoolean()

    if ((firstAnswer && !secondAnswer || !firstAnswer && secondAnswer) xor !confession) println(true)
    else println(false)
    // write your code here

}
