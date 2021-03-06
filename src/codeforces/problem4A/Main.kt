package codeforces.problem4A

fun canDivideWatermelon(weight: Int) =
    (weight - 2) % 2 == 0 && weight > 2

fun main() {
    val input = readLine()!!.toInt()

    println(if (canDivideWatermelon(input)) "YES" else "NO")
}
