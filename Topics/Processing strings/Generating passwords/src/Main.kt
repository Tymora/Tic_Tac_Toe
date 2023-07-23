import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val upperc = scanner.nextInt() // кол-во заглавных букв
    val lowerc = scanner.nextInt() // кол-во прописных  букв
    val dig = scanner.nextInt() // кол-во цифр
    val n = scanner.nextInt() // кол -во символов
    val password = mutableListOf<Char>()
    generate(upperc, lowerc, dig, n, password)
    filling(n, password)
    output(password)
}

fun generate(upperc: Int, lowerc: Int, dig: Int, n: Int, password: MutableList<Char>) {
    var i = 0
    var random: Char
    while (i < n) {
        if (i < upperc) {
            do {
                random = ('A'..'Z').random()
            } while (password.isNotEmpty() && random == password.last())
            password.add(random)
        }
        if (i < lowerc) {
            do {
                random = ('a'..'z').random()
            } while (password.isNotEmpty() && random == password.last())
            password.add(random)
        }
        if (i < dig) {
            do {
                random = ('0'..'9').random()
            } while (password.isNotEmpty() && random == password.last())
            password.add(random)
        }
        i++
    }
}

fun filling(n: Int, password: MutableList<Char>) {
    var temp: Char
    while (password.size != n) {
        temp = (('A'..'Z') + ('0'..'9') + ('a'..'z')).random()
        if (password.isNotEmpty() && temp == password.last()) {
            continue
        } else {
            password.add(temp)
        }
    }
}

fun output(password: MutableList<Char>) {
    val result = password.joinToString("")
    println(result)
}