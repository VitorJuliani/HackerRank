import java.util.*

fun miniMaxSum(arr: Array<Int>) {

    val orderedArray = arr.sortedArray()
    var maxSum = 0L
    var minSum = 0L

    for ((index, value) in orderedArray.withIndex()) {
        if (index != 0)
            maxSum += value
        if (index != orderedArray.size - 1)
            minSum += value
    }

    print("$minSum $maxSum")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}