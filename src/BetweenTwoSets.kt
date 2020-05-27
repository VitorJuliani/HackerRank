fun getTotalX(a: Array<Int>, b: Array<Int>): Int {

    // eu não me orgulho desse codigo
    //TODO REFACTOR URGENTE

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

    var quantity = 0

    for (value in mergeOfArrays[0]..mergeOfArrays[mergeOfArrays.size - 1]) {
        for ((aIndex, aValue) in a.withIndex()) {
            if (value.rem(aValue) != 0) {
                break
            } else {
                if (value.rem(aValue) == 0 && aIndex == a.size - 1) {
                    for ((bIndex, bValue) in b.withIndex()) {
                        if (bValue.rem(value) != 0) {
                            break
                        }
                        if (bValue.rem(value) == 0 && bIndex == b.size - 1) {
                            quantity++
                        }
                    }
                }
            }
        }
    }

    return quantity
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