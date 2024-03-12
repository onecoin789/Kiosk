package com.example.kiosk

class SmoothieDetail {
    fun berrySmoothie() {
        var name = "딸기 스무디"
        var price = 6000
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }

    fun mangoSmoothie() {
        var name = "망고 스무디"
        var price = 6000
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }

    fun yogurtSmoothie() {
        var name = "요거트 스무디"
        var price = 5500
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }

    fun blueberrySmoothie() {
        var name = "블루베리 스무디"
        var price = 6000
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }
}
