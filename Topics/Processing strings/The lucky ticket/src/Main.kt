fun main() {
    val ticket = readln()
    val ticketchar = ticket.toCharArray()
    if (ticketchar[0].digitToInt() + ticketchar[1].digitToInt() + ticket[2].digitToInt() == ticket[3].digitToInt() + ticket[4].digitToInt() + ticket[5].digitToInt()) {
        println("Lucky")
    } else {
        println("Regular")
    }
}