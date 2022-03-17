fun main() {
   val s = "RiskaArdila"
   println(s.startsWith("Ris"))
    println(s.endsWith("dila"))
    println(s.contains("kaAr"))
    println(s.contains("lol"))

    // replace()
    var strJava = "Java yang terbaik"
    strJava = strJava.replace("Java","Kotlin")
    println(s)
    println("$strJava adalah ${strJava.length} Karakter Long")

    // Substring()
    println("Saya tidak akan membuang semua internet ini.".substring(2, 7))

    // compareTo()
    println("alpha".compareTo("bravo."))
    }