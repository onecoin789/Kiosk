package com.example.kiosk

import java.lang.NumberFormatException

class Drinks : Item() {
    val drinkList = arrayListOf<Menu>(
        Menu(1, "Lemonade", "₩3,900"),
        Menu(2, "Iced Tea", "₩3,400"),
        Menu(3, "Fifty/Fifty", "₩3,500"),
        Menu(4, "Soda", "₩2,700"),
        Menu(5, "Bottled Water", "₩1,000"),
        Menu(0, "뒤로가기", "")
    )
    val cart = Cart()

    override fun displayInfo(): Unit {
        println("[ Drinks MENU ]")
        for (menu in drinkList) {
            println("${menu.num}. ${menu.name} | ${menu.price}")
        }
        while (true) {
            try {
                when (readln().toInt()) {
                    1 -> {
                        println("${drinkList[0].name} | ${drinkList[0].price} 입니다.")
                        cart.addMenu(drinkList[0])
                    }

                    2 -> {
                        println("${drinkList[1].name} | ${drinkList[1].price} 입니다.")
                        cart.addMenu(drinkList[1])
                    }

                    3 -> {
                        println("${drinkList[2].name} | ${drinkList[2].price} 입니다.")
                        cart.addMenu(drinkList[2])
                    }

                    4 -> {
                        println("${drinkList[3].name} | ${drinkList[3].price} 입니다.")
                        cart.addMenu(drinkList[3])
                    }

                    5 -> {
                        println("${drinkList[4].name} | ${drinkList[4].price} 입니다.")
                        cart.addMenu(drinkList[4])
                    }

                    0 -> {
                        break
                    }

                    else -> println("잘못된 번호입니다 다시 입력해주세요.")
                }
            } catch (e: NumberFormatException) {
                println("숫자로 입력해주세요.")
                println("")
                return continue
            }
        }
    }
}

//            println(
//                "[ Drinks MENU ]\n" +
//                        "1. Lemonade       | W 3.9 | 매장에서 직접만드는 상큼한 레몬에이드\n" +
//                        "2. Iced Tea       | W 3.4 | 직접 유기농 홍차를 우려낸 아이스티\n" +
//                        "3. Fifty/Fifty    | W 3.5 | 레몬에이드와 아이스티의 만남\n" +
//                        "4. Soda           | W 2.7 | 코카콜라, 코카콜라 제로, 스프라이트, 환타\n" +
//                        "5. Bottled Water  | W 1.0 | 지리산 프리미엄 생수\n" +
//                        "0. Back           | 뒤로가기"
//            )