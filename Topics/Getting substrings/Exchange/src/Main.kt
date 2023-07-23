fun main() {
    val str = readln()
    val lst = str.last()
    val frst = str.first()
    println(str.replace(str.last(), frst).replaceFirst(str.first(), lst))
}