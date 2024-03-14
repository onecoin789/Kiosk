package com.example.kiosk

import java.lang.NumberFormatException

class FrozenCustard : Item() {
    val frozenList = arrayListOf<Menu>(
        Menu(1, "Shaker", "₩5,900"),
        Menu(2, "Cup & Cone", "₩4,000"),
        Menu(3, "Concrete ", "₩5,900"),
        Menu(0, "뒤로가기", "")
    )
    val cart = Cart()

    override fun displayInfo(): Unit {
        println("[ Frozen Custard MENU ]")
        for (menu in frozenList) {
            println("${menu.num}. ${menu.name} | ${menu.price}")
        }
        while (true) {
            try {
                when (readln().toInt()) {
                    1 -> {
                        println("${frozenList[0].name} | ${frozenList[0].price} 입니다.")
                        cart.addMenu(frozenList[0])
                    }

                    2 -> {
                        println("${frozenList[1].name} | ${frozenList[1].price} 입니다.")
                        cart.addMenu(frozenList[1])
                    }

                    3 -> {
                        println("${frozenList[2].name} | ${frozenList[2].price} 입니다.")
                        cart.addMenu(frozenList[2])
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
//                "[ Frozen Custard MENU ]\n" +
//                        "1. Shaker      | W 5.9 | 바닐라, 초콜렛, 솔티드 카라멜, 피넛버터\n" +
//                        "2. Cup & Cone  | W 4.9 | 바닐라, 초콜렛\n" +
//                        "3. Concrete    | W 5.9 | 쉐이크웻의 쫀득한 커스터드와 다양한 믹스-인의 조합\n" +
//                        "0. Back        | 뒤로가기"
//            )
