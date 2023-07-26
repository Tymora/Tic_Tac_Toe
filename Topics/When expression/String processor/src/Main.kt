fun main() {
    val str1 = readln()
    val oper = readln()
    val str2 = readln()
    println(
        when (oper) {
            "equals" -> str1 == str2
            "plus" -> str1 + str2
            "endsWith" -> str1.endsWith(str2)
            else -> "Unknown operation"
        }
    )
}