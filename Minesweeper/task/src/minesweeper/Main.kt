package minesweeper


fun main() {

    val sizeOfGround = 10
    val minesCount = 10
    var groundCharSet = arrayOf<Array<Char>>()

    for (i in 0 until sizeOfGround) {
        val array = arrayOf<Char>()
        for (j in 0 until sizeOfGround) {
            array.plus('0')
        }
        groundCharSet += array
    }


    placingMines(groundCharSet,sizeOfGround, minesCount)
    println(groundCharSet)



}

fun placingMines(groundCharSet: Array<Array<Char>>, sizeOfGround: Int, minesCount: Int) {
    for (i in 1..minesCount) {
        groundCharSet[(0 until sizeOfGround).random()][(0 until sizeOfGround).random()] = '*'
    }
}
