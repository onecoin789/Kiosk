package com.example.kiosk

import java.lang.NumberFormatException

class Beer : Item() {
    val beerList = arrayListOf<Menu>(
        Menu(1, "ShackMeister Ale", "₩9,800"),
        Menu(2, "Magpie Brewing Co.", "₩6,800"),
        Menu(3, "The Hand and Malt", "₩6,800"),
        Menu(0, "뒤로가기", "")
    )
    val cart = Cart()

    override fun displayInfo(): Unit {
        println("[ Beer MENU ]")
        for (menu in beerList) {
            println("${menu.num}. ${menu.name} | ${menu.price}")
        }
        while (true) {
            try {
                when (readln().toInt()) {
                    1 -> {
                        println("${beerList[0].name} | ${beerList[0].price}")
                        cart.addMenu(beerList[0])
                    }

                    1 -> {
                        println("${beerList[1].name} | ${beerList[1].price}")
                        cart.addMenu(beerList[0])
                    }

                    1 -> {
                        println("${beerList[2].name} | ${beerList[2].price}")
                        cart.addMenu(beerList[0])
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
//                "[ Beer MENU ]\n" +
//                        "1. ShackMeister Ale   | W 9.8 | 쉐이크쉑 버거를 위해 특별히 양조한 에일 맥주\n" +
//                        "2. Magpie Brewing Co. | W 6.8 | Pale Ale, Porter, Wheat\n" +
//                        "3. The Hand and Malt  | W 6.8 | IPA, Mocha Stout\n" +
//                        "0. Back               | 뒤로가기"
//            )


