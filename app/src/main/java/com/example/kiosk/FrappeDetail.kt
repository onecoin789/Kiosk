package com.example.kiosk

class FrappeDetail {
    fun choco() {
        var name = "초코 프라페"
        var price = 5000
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }

    fun cookie() {
        var name = "쿠키 프라페"
        var price = 6000
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }

    fun mint() {
        var name = "민트 프라페"
        var price = 5500
        println("")
        println("${name}")
        println("가격은 ${price}")
        println("수량을 정해주세요.")
        var quantity = readln().toInt()
        println("${name} ${quantity}잔 ${price * quantity}입니다.")
        println("구매해주셔서 감사합니다. 잠시만 기다려주세요^^")
    }

    fun berry(){
        var name = "딸기 프라페"
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




