package com.example.kiosk

class Frappe {
    fun order(pick: String) : String {
        println("")
        println("커피 메뉴를 선택해주셨습니다. 다음 메뉴중에서 번호를 골라주세요^^")
        println("1. 초코 프라페")
        println("2. 민트 프라페")
        println("3. 쿠키 프라페")
        println("4. 딸기 프라페")
        println("5. 메인화면으로 돌아가기")
        println("")
        var pick = readln().toInt()
        var detail = FrappeDetail()
        var result = ""

        when(pick) {
            1 -> detail.choco().toString()
            2 -> detail.cookie().toString()
            3 -> detail.mint().toString()
            4 -> detail.berry().toString()
            5 -> result
        }
        return result
    }
}