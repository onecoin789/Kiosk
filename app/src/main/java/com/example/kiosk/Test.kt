package com.example.kiosk

fun main() {
    while (true) {
        val firstNum: Int = readln().toInt()
        val operate: Int = readln().toInt()
        val secondNum: Int = readln().toInt()
        val calculator = Calculator()
//        val calResult: Int = calculator.operate(firstNum, operate, secondNum);
//        println("${calResult}")
        var result = 0

        when(operate) {
            1 -> {
                val add = AddOperation()
                result = add.operate(firstNum, secondNum)
            }
            2 -> {
                val sub = SubtractOperation()
                result = sub.operate(firstNum, secondNum)
            }
            3 -> {
                val mul = MultiplyOperation()
                result = mul.operate(firstNum, secondNum)
            }
            4 -> {
                val div = DivideOperation()
                result = div.operate(firstNum, secondNum)
            }
            5 -> {}
        }

        val exitNum:Int = readln().toInt()
        if (exitNum == -1) {
            break
        }
    }
}

open class Calculator {
    open fun operate(operation: AbstractOperation, firstNum: Int, secondNum: Int): Int {
        return operation.operate(firstNum, secondNum)
    }
}

abstract class AbstractOperation {
    abstract  fun operate(firstNum: Int, secondNum: Int): Int
}


class AddOperation: AbstractOperation() {
    override fun operate(firstNum: Int, secondNum: Int): Int {
        return firstNum + secondNum

    }
}
class SubtractOperation: AbstractOperation() {
    override fun operate(firstNum: Int, secondNum: Int): Int {
        return  firstNum - secondNum
    }
}

class MultiplyOperation: AbstractOperation() {
    override fun operate(firstNum: Int, secondNum: Int): Int {
        return  firstNum * secondNum
    }
}
class DivideOperation: AbstractOperation() {
    override fun operate(firstNum: Int, secondNum: Int): Int {
        return firstNum / secondNum
    }
}