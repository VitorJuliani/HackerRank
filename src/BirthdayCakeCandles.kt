import java.util.*

fun birthdayCakeCandles(ar: Array<Int>): Int {

    var tallestCandle = 0
    var numberOfCandles = 0

    ar.map { value ->

        if (tallestCandle == value) {
            numberOfCandles++
        }

        if (tallestCandle < value) {
            tallestCandle = value
            numberOfCandles = 0
            numberOfCandles++
        }
    }

    return numberOfCandles
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}