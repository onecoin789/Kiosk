package com.example.kiosk

class Coffee() {
    fun order(pick: String): String {
        println("")
        println("커피 메뉴를 선택해주셨습니다. 다음 메뉴중에서 번호를 골라주세요^^")
        println("1. 아메리카노")
        println("2. 카페라떼")
        println("3. 에스프레소")
        println("4. 카푸치노")
        println("5. 메인화면으로 돌아가기")
        println("")
        var pick = readln().toInt()
        var detail = CoffeeDetail()
        var result = ""
        when (pick) {
            1 -> detail.americano().toString()
            2 -> detail.cafelatte().toString()
            3 -> detail.espresso().toString()
            4 -> detail.cappuccino().toString()
            5 -> result
        }
        return result
    }
}




