package oop_BasiliusJethro_57833.week10

class Box<T>(private var item: T) {
    fun getItem(): T {
        return item
    }

    fun setItem(value: T) {
        item = value
    }
}