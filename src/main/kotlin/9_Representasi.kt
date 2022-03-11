fun main() {
    // Variabel ini tidak akan terpengaruh pada identitas suatu variabel
    val a: Int = 10000
    println("a Apakah identik dengan a atau a === a : " + (a === a))

    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    // cetak dari kode program
    println("boxedA apakah identik dengan anotherBoxedA atau boxedA === anotherBoxedA : " + (boxedA === anotherBoxedA))
    println("boxedA apakah memiliki nilai yang sama dengan anotherBoxedA atau boxedA == anotherBoxedA : " + (boxedA == anotherBoxedA))

}