fun main() {
    val beyondTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val backToTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    // do not touch the lines above
    // write your code here
    if (beyondTheWall.size != backToTheWall.size) {
        println("false")
    } else {
        var boolean = false
        for (i in beyondTheWall) {
            for (a in backToTheWall) {
                if (i == a) {
                    boolean = true
                    true
                }
            }
        }
        println(boolean)
    }
}