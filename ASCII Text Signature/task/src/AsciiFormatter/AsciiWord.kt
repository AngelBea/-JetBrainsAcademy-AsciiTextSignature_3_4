package AsciiFormatter

import signature.letterList

class AsciiWord() {
    var wordLine1: String = ""
    var wordLine2: String = ""
    var wordLine3: String = ""

    fun convertString(word: String): AsciiWord {
        for (ch in word.toUpperCase()) {
            letterList.filter { it.letter.equals(ch) }.first().let {
                wordLine1 += "${it.line1} "
                wordLine2 += "${it.line2} "
                wordLine3 += "${it.line3} "
            }
        }

        return this
    }
}