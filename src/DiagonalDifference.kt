import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {

    var rightDiagonal = 0
    var leftDiagonal = 0

    for (index in arr.indices) {
        rightDiagonal += arr[index][index]
        leftDiagonal += arr[index][(arr.size - index) - 1]
    }

    return abs(rightDiagonal - leftDiagonal)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n) { Array<Int>(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}