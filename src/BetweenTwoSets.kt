fun getTotalX(a: Array<Int>, b: Array<Int>): Int {

    val sumOfArrays = a.size + b.size
    val mergeOfArrays = Array<Int>(sumOfArrays) {
        0
    }

    var count = 0

    a.map {
        mergeOfArrays[count] = it
        count++
    }

    b.map {
        mergeOfArrays[count] = it
        count++
    }

    mergeOfArrays.sort()

    return (mergeOfArrays[0]..mergeOfArrays[mergeOfArrays.size - 1]).count { value ->
        a.all {
            value % it == 0
        } &&
        b.all {
            it % value == 0
        }
    }
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}