package de.ostfale.kotlin.functional.basicfunctions

import org.slf4j.LoggerFactory

class FunctionWithVarargs {

    private val log = LoggerFactory.getLogger(javaClass)

    private val myArray = arrayOf(4, 5, 6, 7, 8)

    private fun <T> valuesToList(vararg values: T): MutableList<T> {
        val list: MutableList<T> = mutableListOf()
        for (i in values) {
            list.add(i)
        }
        return list
    }

    fun listExample() {
        val mList = valuesToList(1, 2, 3, 4, 5, 6)
        log.info("Show list members: $mList")
    }

    fun arraySpreadExample() {
        val mList = valuesToList(0, *myArray, 2)
        log.info("Show spread array example: $mList")
    }
}

fun main() {
    val obj = FunctionWithVarargs()
    obj.listExample()
    obj.arraySpreadExample()
}