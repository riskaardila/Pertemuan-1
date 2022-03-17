fun main() {
    val a = 7
    val b = 8
    val c = a + b
    val s = "Bila kita menambahkan $a dan $b, kita dapat $c"
    println(s)
    println("Bila kita menambahkan $a dan $b, kita akan mendapat ${a + b}")

    val price = """
        ${'$'}9.99
    """
    println(price)
}