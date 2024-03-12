package com.example.kiosk

class CoffeeDetail {
    fun americano() {
        var name = "아메리카노"
        var price = 3000
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }

    fun cafelatte() {
        var name = "카페라떼"
        var price = 4500
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }

    fun espresso() {
        var name = "에스프레소"
        var price = 4000
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }

    fun cappuccino() {
        var name = "카푸치노"
        var price = 4000
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }
}
