fun main() {
    val sizeMutList = readln().toInt()
    val mutableList = mutableListOf<Int>()
    var x = 0 // прохождение цикла
    while (x < sizeMutList) {
        val readMutableList = readln().toInt()
        x += 1
        mutableList.add(readMutableList)
    }
    val stringlist = mutableList.toString().replace(",".toRegex(), "").replace(" ".toRegex(), "")
    val a = readln().replace(" ".toRegex(), "")
    val b = a.reversed()
    if (stringlist.contains(a.toString())) {
        println("NO")
    } else if (stringlist.contains(b)) {
        println("NO")
    } else {
        println("YES")
    }
}