package tictactoe

fun main() {
    var countCR = 0
    var countCI = 0
    val inputList = mutableListOf<Char>()
    for (i in 1..9) {
        inputList.add(' ')
    }
    displaySquare(inputList)
    do {
        when (stat(inputList)) {
            1, 2, 10, 20 -> break
        }
        when {
            countCR == 0 || countCR == countCI -> {
                crossRound(inputList)
                countCR++

            }
            countCR > countCI -> {
                circleRound(inputList)
                countCI++
            }
        }
    } while (inputList.contains(' '))

    when (stat(inputList)) {
        in 1..2 -> println("X wins")
        10, 20 -> println("O wins")
        11 -> println("Impossible")
//        100 -> println("Game not finished")
        200 -> println("Draw")
    }
}

fun stat(inputList: MutableList<Char>): Int {
    val cross = 'X'
    val circle = 'O'
    var status = 0

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

    if (status == 0 && (inputList.contains(' ')) || (inputList.contains('_'))) {
        status += 100
    } else if (status == 0) {
        status += 200
    }

    return status
}

fun crossRound(inputList: MutableList<Char>) {
    while (true) {
        val (coord1, coord2) = readln().split(" ")
        if (coord1.toIntOrNull() == null && coord2.toIntOrNull() == null) {
            println("You should enter numbers!")

        } else if (coord1.toInt() in 1..3 && coord2.toInt() in 1..3) {
            when (coord1.toInt()) {
                1 -> when (coord2.toInt()) {
                    1 -> if (inputList[0] == ' ') {
                        inputList[0] = 'X'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                    2 -> if (inputList[1] == ' ') {
                        inputList[1] = 'X'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                    3 -> if (inputList[2] == ' ') {
                        inputList[2] = 'X'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                }
                2 -> when (coord2.toInt()) {
                    1 -> if (inputList[3] == ' ') {
                        inputList[3] = 'X'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                    2 -> if (inputList[4] == ' ') {
                        inputList[4] = 'X'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                    3 -> if (inputList[5] == ' ') {
                        inputList[5] = 'X'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                }
                3 -> when (coord2.toInt()) {
                    1 -> if (inputList[6] == ' ') {
                        inputList[6] = 'X'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                    2 -> if (inputList[7] == ' ') {
                        inputList[7] = 'X'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                    3 -> if (inputList[8] == ' ') {
                        inputList[8] = 'X'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                }
            }
        } else {
            println("Coordinates should be from 1 to 3!")

        }
    }
}

fun circleRound(inputList: MutableList<Char>) {
    while (true) {
        val (coord1, coord2) = readln().split(" ")
        if (coord1.toIntOrNull() == null && coord2.toIntOrNull() == null) {
            println("You should enter numbers!")

        } else if (coord1.toInt() in 1..3 && coord2.toInt() in 1..3) {
            when (coord1.toInt()) {
                1 -> when (coord2.toInt()) {
                    1 -> if (inputList[0] == ' ') {
                        inputList[0] = 'O'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                    2 -> if (inputList[1] == ' ') {
                        inputList[1] = 'O'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                    3 -> if (inputList[2] == ' ') {
                        inputList[2] = 'O'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                }
                2 -> when (coord2.toInt()) {
                    1 -> if (inputList[3] == ' ') {
                        inputList[3] = 'O'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                    2 -> if (inputList[4] == ' ') {
                        inputList[4] = 'O'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                    3 -> if (inputList[5] == ' ') {
                        inputList[5] = 'O'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }

                }
                3 -> when (coord2.toInt()) {
                    1 -> if (inputList[6] == ' ') {
                        inputList[6] = 'O'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                    2 -> if (inputList[7] == ' ') {
                        inputList[7] = 'O'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }
                    3 -> if (inputList[8] == ' ') {
                        inputList[8] = 'O'
                        displaySquare(inputList)
                        break
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }

                }
            }

        } else {
            println("Coordinates should be from 1 to 3!")

        }
    }
}


fun displaySquare(inputList: MutableList<Char>) {

    println(
        """
---------
| ${inputList[0]} ${inputList[1]} ${inputList[2]} |
| ${inputList[3]} ${inputList[4]} ${inputList[5]} |
| ${inputList[6]} ${inputList[7]} ${inputList[8]} |
---------"""
    )
}
