package com.example.kiosk

import java.lang.NumberFormatException

class Burgers() : Item() {
    val bugerList = arrayListOf<Menu>(
        Menu(1, "ShackBurger", "₩ 6,900"),
        Menu(2, "SmokeShack", "₩8,900"),
        Menu(3, "Shroom Burger", "₩9,400"),
        Menu(4, "Cheeseburger", "₩6,900"),
        Menu(5, "Hamburger", "₩5,400"),
        Menu(0, "뒤로가기", "")
    )
    val cart = Cart()

    override fun displayInfo(): Unit {
        println("[ Burgers MENU ]")
        for (menu in bugerList) {
            println("${menu.num}. ${menu.name} | ${menu.price}")
        }
        while (true) {
            try {
                when (readln().toInt()) {
                    1 -> {
                        println("${bugerList[0].name} | ${bugerList[0].price} 입니다.")
                        cart.addMenu(bugerList[0])
                    }

                    2 -> {
                        println("${bugerList[1].name} | ${bugerList[1].price} 입니다.")
                        cart.addMenu(bugerList[1])
                    }

                    3 -> {
                        println("${bugerList[2].name} | ${bugerList[2].price} 입니다.")
                        cart.addMenu(bugerList[2])
                    }

                    4 -> {
                        println("${bugerList[3].name} | ${bugerList[3].price} 입니다.")
                        cart.addMenu(bugerList[3])
                    }

                    5 -> {
                        println("${bugerList[4].name} | ${bugerList[4].price} 입니다.")
                        cart.addMenu(bugerList[4])
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
//                "[ Burgers MENU ]\n" +
//                        "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
//                        "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
//                        "3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\n" +
//                        "4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
//                        "5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
//                        "0. Back          | 뒤로가기"
//            )
