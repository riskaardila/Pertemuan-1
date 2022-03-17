fun main() {
    // ini adalah simpel Kalkulator
    println("Selamat Datang di Kalkulator")
    println("enter the first number: ")

    val a = readLine()!!.toDouble()
    println("Enter the second number: ")

    val b = readLine()!!.toDouble()
    val sum = a + b
    val difference = a - b
    val product = a * b
    val qoutient = a / b
    println("Sum: ${sum}")
    println("Product: ${product}")
    println("Difference: ${difference}")
    println("Quotient: ${qoutient}")
    println("Terima Kasih telah menggunakan kalkulator ini")

}