import java.util.*

fun timeConversion(s: String): String {

    val isPm = s.substring(s.length - 2, s.length) == "PM"

    val stringAsArray = s.removeRange(s.length - 2, s.length).split(":")
    var hour = stringAsArray[0]
    val minute = stringAsArray[1]
    val second = stringAsArray[2]

    hour = if (isPm) {
        if (hour.toInt() < 12) {
            (hour.toInt() + 12).toString()
        } else {
            hour
        }
    } else {
        if (hour.toInt() == 12) {
            "00"
        } else {
            hour
        }
    }

    return "$hour:$minute:$second"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}