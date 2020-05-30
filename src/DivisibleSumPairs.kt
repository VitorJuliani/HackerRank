import java.util.*

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {

    var quantity = 0

    for ((index, value) in ar.withIndex()) {
        for ((secondIndex, secondValue) in ar.withIndex()) {
            if ((value + secondValue).rem(k) == 0 && index < secondIndex) {
                quantity++
            }
        }
    }

    return quantity

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}