package tictactoe

fun main() {
    val inp = readln()
    val inputList = mutableListOf<Char>()
    for (i in inp) {
        inputList.add(i)
    }
    println(
        """
---------
| ${inputList[0]} ${inputList[1]} ${inputList[2]} |
| ${inputList[3]} ${inputList[4]} ${inputList[5]} |
| ${inputList[6]} ${inputList[7]} ${inputList[8]} |
---------"""

    )
}