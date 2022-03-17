fun main() {
    val valInt: Int = 1
    val valSum: Long = 3L + valInt //ini adalah konversi implisit
    println("Konversi Variabel valInt secara implisit : " + valSum)

    val valLong: Long = valInt.toLong() //ini adalah konversi Eksplisit
    println("Konversi Variabel valInt secara Eksplisit : " + valLong)
}