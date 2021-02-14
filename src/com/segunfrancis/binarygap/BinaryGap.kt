package com.segunfrancis.binarygap

class BinaryGap {

    fun solution(decimal: Int): Int {
        val binaryString = Integer.toBinaryString(decimal)
        var count = 0
        var tempCount = 0
        for (i in binaryString.indices) {
            if (binaryString[i] == '0') {
                if (i > 0 && binaryString[i - 1] == '1') {
                    tempCount++
                } else {
                    if (tempCount > 0)
                        tempCount++
                }
            } else if (binaryString[i] == '1') {
                if (tempCount > 0 && tempCount > count) {
                    count = tempCount
                }
                tempCount = 0
            }
        }
        return count
    }
}

fun main() {
    val bin = BinaryGap()
    print(bin.solution(529))
}