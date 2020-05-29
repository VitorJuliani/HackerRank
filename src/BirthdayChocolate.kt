fun birthday(s: Array<Int>, d: Int, m: Int): Int {

    var quantity = 0

    for (index in s.indices) {
        if (index + m <= s.size) {
            val valuesToSum = s.copyOfRange(index, index + m)

            if (valuesToSum.sum() == d) {
                quantity++
            }
        }
    }

    return quantity
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}