fun main() {
    // Kemunculan Karakter dalam analisis kalimat
    // String yang ingin kita analisis
    var s = "Seorang programmer terjebak di kamar mandi karena instruksi pada sampo adalah: Lather, Wash, dan Repeat."
    println(s)
    s = s.toLowerCase()

    // Counters initialization
    var vowelCount = 0
    var consonantCount = 0

    // Definisi kelompok karakter
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

    // main loop
    for (c in s){
        if (vowels.contains(c)){
            vowelCount++
        } else if (consonants.contains(c)){
            consonantCount++
        }
    }
    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other Character: ${s.length - (vowelCount + consonantCount)}")
}