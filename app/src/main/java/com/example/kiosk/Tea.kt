package com.example.kiosk

class Tea {
    fun order(pick: String) : String {
        println("")
        println("커피 메뉴를 선택해주셨습니다. 다음 메뉴중에서 번호를 골라주세요^^")
        println("1. 아이스티")
        println("2. 허브티")
        println("3. 밀크티")
        println("4. 그린티")
        println("5. 메인화면으로 돌아가기")
        println("")
        var pick = readln().toInt()
        var detail = TeaDetail()
        var result = ""

        when(pick) {
            1 -> detail.iceTea().toString()
            2 -> detail.herbTea().toString()
            3 -> detail.milkTea().toString()
            4 -> detail.greenTea().toString()
            5 -> result
        }
        return result
    }
}
