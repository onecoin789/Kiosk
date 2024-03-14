package com.example.kiosk

import java.lang.NumberFormatException

fun main() {

    while (true) {
        try {
            println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요")
            println("")
            println(
                "[ SHAKESHACK MENU ]\n" +
                        "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                        "2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                        "3. Drinks          | 매장에서 직접 만드는 음료\n" +
                        "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n" +
                        "0. Exit            | 프로그램 종료" +
                        "\n" +
                        "\n" +
                        "[ ORDER MENU ]\n" +
                        "5. Order           | 장바구니를 확인 후 주문합니다.\n" +
                        "6. Cancel          | 진행중인 주문을 취소합니다."
            )
            var pick = readln().toInt()
            val cartMenu = Cart()

            when (pick) {
                1 -> Burgers().displayInfo()
                2 -> FrozenCustard().displayInfo()
                3 -> Drinks().displayInfo()
                4 -> Beer().displayInfo()
                5 -> cartMenu.displayCart()
                6 -> cartMenu.cartMenu.clear()
                0 -> {
                    println("프로그램을 종료합니다.")
                    break
                } else -> println("잘못된 번호입니다 다시 입력해주세요.")
            }
        } catch (e: NumberFormatException) {
            println("숫자로 입력해주세요.")
            println("")
            return continue
        }
    }
}