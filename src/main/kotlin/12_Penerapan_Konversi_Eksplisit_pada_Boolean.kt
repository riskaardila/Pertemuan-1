fun main(args: Array<String>) {
    var varBool : Boolean = true
    if (varBool)
        println("varBool bernilai " + varBool)
    // Hasil dari varBool berhasil, "varBool bernilai true"
    var varInt : Int = 1
    if (varInt)
        println("varInt bernilai " + varInt)
    // Hasil running dari varInt tidak berhasil karena Boolean tidak berhasil karena tidak
    // bisa membaca prosesnya, karena boolean bisa baca true dan false saja (tidak ada proses lain
    // selain True dan False)
}