fun main() {
    val str = readln()
    if (str.length % 2 == 0) {
        print(str.substring(range = 0 until str.length / 2 - 1))
        println(str.substring(range = str.length / 2 + 1 until str.length))
    } else {
        print(str.substring(range = 0 until str.length / 2))
        println(str.substring(range = str.length / 2 + 1 until str.length))
    }
}