import java.lang.Exception

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

    if (a.size != b.size) {
        throw Exception("The size must be equals")
    }

    val result = Array<Int>(2) {
        0
    }
    var alicesPoints = 0
    var bobsPoints = 0

    for (index in a.indices) {
        if (a[index] == b[index]) {
            continue
        } else {
            if (a[index] > b[index]) {
                result[0] = ++alicesPoints
            } else {
                result[1] = ++bobsPoints
            }
        }
    }

    return result
}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}