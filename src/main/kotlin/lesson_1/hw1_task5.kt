package org.example.lesson_1

fun main() {
    val numberOfSeconds: Long = 3661
    var remainOfSeconds: Byte
    var remainOfMinutes: Short
    var remainOfHours: Long
    remainOfSeconds = (numberOfSeconds % 60).toByte()
    remainOfMinutes = ((numberOfSeconds - remainOfSeconds)/60 % 60).toShort()
    remainOfHours = (numberOfSeconds - remainOfSeconds - remainOfMinutes *60)/3600
    println("$remainOfHours:$remainOfMinutes:$remainOfSeconds")
}