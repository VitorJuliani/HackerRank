import java.util.*

fun staircase(n: Int) {

    for (i in 1..n) {
        val spaces = " ".repeat(n - i)
        val hashtag = "#".repeat(i)

        println(spaces + hashtag)
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}