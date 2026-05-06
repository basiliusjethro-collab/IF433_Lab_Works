package oop_BasiliusJethro_57833.week11

fun String.hello(): String {
    return "Hello, $this"
}
fun String?.safeLength(): Int {
    return this?.length ?: 0
}