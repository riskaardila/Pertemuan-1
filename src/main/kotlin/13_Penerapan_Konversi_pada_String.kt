fun main() {
    println("=================================")
    println("(1) Percobaan pertama String")
    val myName: String = "Riska Ardila"
    for (chr in myName)
        println(chr)
    println("=================================")
    println()

    println("=================================")
    println("(2) Percobaan Kedua String")
    val s = "abc" + 1
    println(s + "def")
    println("=================================")
    println()

    println("=================================")
    println("(3) Percobaan Ketiga String")
    var text = """
        for (c in "foo")
            print(c)
    """
    println(text)
    println("=================================")
    println()

    println("=================================")
    println("(4) Percobaan Keempat String")
    var texts = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Riska Ardila)
    """.trimMargin()
    println(texts)
    println("=================================")
}