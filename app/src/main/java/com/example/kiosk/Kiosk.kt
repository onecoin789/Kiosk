package com.example.kiosk

import java.lang.NumberFormatException

fun main() {

    var select: Int = 0

    var coffee = Coffee()
    var frappe = Frappe()
    var smoothie = Smoothie()
    var tea = Tea()

    while(select != 4) {
        try {
            println("")
            println("안녕하세요! 주문하실 메뉴의 번호를 선택해주세요^^")
            println("1. Coffee")
            println("2. Frappe")
            println("3. Smoothie")
            println("4. Tea")
            println("5. 종료")
            select = readln().toInt()
        } catch (e:NumberFormatException) {
            println("")
            println("번호로 입력해주세요 ㅠㅠ")
            continue
        }
        try {
            when (select) {
                1 -> coffee.order(select.toString())
                2 -> frappe.order(select.toString())
                3 -> smoothie.order(select.toString())
                4 -> tea.order(select.toString())
                5 -> break
            }
        } catch (e: NumberFormatException) {
            continue
        }
    }
}