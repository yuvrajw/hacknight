fun printAverage(vararg grades: Int) = println(grades.average())

printAverage(6, 7, 8)

val grades = intArrayOf(4, 5, 6)
printAverage(*grades) // spread *