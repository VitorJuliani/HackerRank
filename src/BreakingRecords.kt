import java.util.*

fun breakingRecords(scores: Array<Int>): Array<Int> {

    var highestScore = scores[0]
    var lowestScore = scores[0]

    val result = Array<Int>(2) {
        0
    }

    for (score in scores) {
        if (score in lowestScore..highestScore) {
            continue
        } else {
            if (score > highestScore) {
                highestScore = score
                result[0]++
            } else {
                lowestScore = score
                result[1]++
            }
        }
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}