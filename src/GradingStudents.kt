fun gradingStudents(grades: Array<Int>): Array<Int> {

    val studentGrades = Array<Int>(grades.size) {
        0
    }

    for ((index, value) in grades.withIndex()) {

        if (value < 38) {
            studentGrades[index] = value
        } else {
            var nextMultipleNumberOfFive = value

            while (nextMultipleNumberOfFive.rem(5) != 0) {
                nextMultipleNumberOfFive++
            }

            if (nextMultipleNumberOfFive - value < 3) {
                studentGrades[index] = nextMultipleNumberOfFive
            } else {
                studentGrades[index] = value
            }
        }
    }

    return studentGrades
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}