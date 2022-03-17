fun main() {
    //ASCII value
    var c: Char //ini adalah karakternya
    var i: Int // ini nilai ordinal (ASCII) dari karakter
    // Konversi dari teks ke nilai ASCII

    c = 'a'
    i = c.toInt()
    println("Ini Karakter $c diubah menjadi nilai ASCIInya sebesar $i")

    // Konversi dari teks ke nilai ASCII
    i = 98
    c = i.toChar()
    println("Nilai ASCII $i dikonversi ke nilai tekstualnya $c")
}