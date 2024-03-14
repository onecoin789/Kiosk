package com.example.kiosk

class Cart {
    val cartMenu: MutableList<Menu> = mutableListOf()
    fun addMenu(menu: Menu) {
        cartMenu.add(menu)
        println("카트에 ${menu.name}을 넣었습니다.")
    }

    fun displayCart() : Unit {
        return if (cartMenu.isEmpty()) {
            println("카트가 비어 있습니다.")
        } else {
            displayCartList()
            println("${cartMenu}")
        }
    }

    private fun displayCartList() {
        val listGroup = cartMenu.groupingBy { it }.eachCount()
        for ((item, count) in listGroup) {
            println("${item.displayInfo()} (${count})")
        }
    }
}
