fun main() {
    // split() dan joinToString()
    // Morse code decoder
    // the string which we want to decode
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")

    // the string with the decoded message
    var message = ""

    // array definitions
    val alphabetChars = "abcdfghijklmnopqrsuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")

    // splitting the string into morse characters
    val characters = s.split(" ")

    // iterating over Morse character
    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)
        //karakter was found
        if (index != -1){
            message += alphabetChars[index]
        }
    }
    println("The Decoded message: $message")
}