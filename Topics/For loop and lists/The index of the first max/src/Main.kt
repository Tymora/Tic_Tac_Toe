fun main() {
    val listIndex = mutableListOf<Int>()
    val num = readln().toInt()
    var loops = 0
    while (loops < num) {
        listIndex.add(readln().toInt())
        loops += 1
    }
    val max = listIndex.maxOrNull()
    println(listIndex.indexOf(max))
}