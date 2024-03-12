package com.example.kiosk

class TeaDetail {
    fun iceTea() {
        var name = "아이스티"
        var price = 3000
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }

    fun herbTea() {
        var name = "허브티"
        var price = 4000
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }

    fun milkTea() {
        var name = "밀크티"
        var price = 4000
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }

    fun greenTea() {
        var name = "그린티"
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
