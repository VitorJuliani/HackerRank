import java.util.*

fun aVeryBigSum(ar: Array<Long>): Long {
    var result = 0L

    ar.map {
        result += it
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}