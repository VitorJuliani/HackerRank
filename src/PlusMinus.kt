import java.util.*

fun plusMinus(arr: Array<Int>) {

    var positives = 0
    var negatives = 0
    var neutral = 0

    val sixDecimalFormat = "%.6f"

    arr.forEach {
        when {
            it > 0 -> positives++
            it < 0 -> negatives++
            else -> neutral++
        }
    }

    println(sixDecimalFormat.format(positives.toDouble().div(arr.size)))
    println(sixDecimalFormat.format(negatives.toDouble().div(arr.size)))
    println(sixDecimalFormat.format(neutral.toDouble().div(arr.size)))

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}