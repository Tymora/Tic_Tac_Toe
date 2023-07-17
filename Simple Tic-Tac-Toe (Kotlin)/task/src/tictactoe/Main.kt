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
    val cross = 'X'
    val circle = 'O'
    var countcross = 0
    var countcircle = 0
    var status = 0
    for (i in inputList) {
        if (i == cross) {
            countcross++
        } else if (i == circle) {
            countcircle++
        }
    }
    if (countcircle == countcross || (countcircle + 1 == countcross) || (countcircle -1 == countcross) ) {


        if (inputList.slice(0..2).all { it == cross }) {
            status++
        } else if (inputList.slice(0..2).all { it == circle }) {
            status += 10
        }

        if (inputList.slice(3..5).all { it == cross }) {
            status++
        } else if (inputList.slice(3..5).all { it == circle }) {
            status += 10
        }

        if (inputList.slice(6..8).all { it == cross }) {
            status++
        } else if (inputList.slice(6..8).all { it == circle }) {
            status += 10
        }

        if (inputList.slice(setOf(0, 4, 8)).all { it == cross }) {
            status++
        } else if (inputList.slice(setOf(0, 4, 8)).all { it == circle }) {
            status += 10
        }

        if (inputList.slice(setOf(6, 4, 2)).all { it == cross }) {
            status++
        } else if (inputList.slice(setOf(6, 4, 2)).all { it == circle }) {
            status += 10
        }
        if (inputList.slice(setOf(0, 3, 6)).all { it == cross }) {
            status++
        } else if (inputList.slice(setOf(0, 3, 6)).all { it == circle }) {
            status += 10
        }
        if (inputList.slice(setOf(1, 4, 7)).all { it == cross }) {
            status++
        } else if (inputList.slice(setOf(1, 4, 7)).all { it == circle }) {
            status += 10
        }
        if (inputList.slice(setOf(2, 5, 8)).all { it == cross }) {
            status++
        } else if (inputList.slice(setOf(2, 5, 8)).all { it == circle }) {
            status += 10
        }


        if (status == 0 && ((inputList.contains(' ')) || (inputList.contains('_')))){
            status += 100
        } else if (status == 0){
            status +=200
        }


        }else println("Impossible")



    when(status){
        in 1..2 -> println("X wins")
        10, 20 -> println("O wins")
        11 -> println("Impossible")
        100 -> println("Game not finished")
        200 -> println("Draw")
    }

}




