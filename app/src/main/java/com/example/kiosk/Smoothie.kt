package com.example.kiosk

class Smoothie {
    fun order(pick: String): String {
        println("")
        println("커피 메뉴를 선택해주셨습니다. 다음 메뉴중에서 번호를 골라주세요^^")
        println("1. 딸기 스무디 ")
        println("2. 망고 스무디")
        println("3. 요거트 스무디")
        println("4. 블루베리 스무디")
        println("5. 메인화면으로 돌아가기")
        println("")
        var pick = readln().toInt()
        var detail = SmoothieDetail()
        var result = ""
        when(pick) {
            1 -> detail.berrySmoothie().toString()
            2 -> detail.mangoSmoothie().toString()
            3 -> detail.yogurtSmoothie().toString()
            4 -> detail.blueberrySmoothie().toString()
            5 -> result
        }
        return result
    }
}
