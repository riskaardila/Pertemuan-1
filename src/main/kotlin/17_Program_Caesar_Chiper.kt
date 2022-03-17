fun main() {
    // Ceaser Cipher
    // Inisialisasi Variabel
    val s = "Rekayasa Perangkat Lunak"
    println("Original message: $s")
    var message = ""
    var shift = 1

    // Loop berulang di atas karakter
    for (c in s){
        var i = c.toInt()
        i += shift
        if (i > 'z'.toInt()) {
            i -= 26
        }
        val char = i.toChar()
        message += char
    }

    // cetak
    println("Encrypted message: $message")
}