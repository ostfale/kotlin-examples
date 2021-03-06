package de.ostfale.kotlin.classes.functions

@OptIn(ExperimentalStdlibApi::class)
fun String.upperFirstAndLast(): String {
    // val upperFirst = this.substring(0, 1).uppercase() + this.substring(1)
    val upperFirst = substring(0, 1).uppercase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(
        upperFirst.length - 1,
        upperFirst.length
    ).uppercase()
}

fun main() {
    println("this is a test".upperFirstAndLast())
}