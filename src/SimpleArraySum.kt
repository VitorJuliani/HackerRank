import java.util.*

fun simpleArraySum(ar: Array<Int>): Int {
    var result = 0

    for(value in ar) {
        result += value
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}