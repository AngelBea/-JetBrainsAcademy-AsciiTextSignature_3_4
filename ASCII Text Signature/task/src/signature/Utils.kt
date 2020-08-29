package signature

fun constructLetterList(): List<AsciiLetter> {
    val asciiLetters = mutableListOf<AsciiLetter>()
    for (ch in 'A'..'Z') {
        when (ch) {
            'A' -> asciiLetters.add(AsciiLetter(ch, "____", "|__|", "|  |"))//
            'B' -> asciiLetters.add(AsciiLetter(ch, "___ ", "|__]", "|__]"))//
            'C' -> asciiLetters.add(AsciiLetter(ch, "____", "|   ", "|___"))//
            'D' -> asciiLetters.add(AsciiLetter(ch, "___ ", "|  \\", "|__/"))//
            'E' -> asciiLetters.add(AsciiLetter(ch, "____", "|___", "|___"))//
            'F' -> asciiLetters.add(AsciiLetter(ch, "____", "|___", "|   "))//
            'G' -> asciiLetters.add(AsciiLetter(ch, "____", "| __", "|__]"))//
            'H' -> asciiLetters.add(AsciiLetter(ch, "_  _", "|__|", "|  |"))
            'I' -> asciiLetters.add(AsciiLetter(ch, "_", "|", "|"))//
            'J' -> asciiLetters.add(AsciiLetter(ch, " _", " |", "_|"))//
            'K' -> asciiLetters.add(AsciiLetter(ch, "_  _", "|_/ ", "| \\_"))//
            'L' -> asciiLetters.add(AsciiLetter(ch, "_   ", "|   ", "|___"))
            'M' -> asciiLetters.add(AsciiLetter(ch, "_  _", "|\\/|", "|  |"))
            'N' -> asciiLetters.add(AsciiLetter(ch, "_  _", "|\\ |", "| \\|"))
            'O' -> asciiLetters.add(AsciiLetter(ch, "____", "|  |", "|__|"))
            'P' -> asciiLetters.add(AsciiLetter(ch, "___ ", "|__]", "|   "))
            'Q' -> asciiLetters.add(AsciiLetter(ch, "____", "|  |", "|_\\|"))
            'R' -> asciiLetters.add(AsciiLetter(ch, "____", "|__/", "|  \\"))
            'S' -> asciiLetters.add(AsciiLetter(ch, "____", "[__ ", "___]"))
            'T' -> asciiLetters.add(AsciiLetter(ch, "___", " | ", " | "))
            'U' -> asciiLetters.add(AsciiLetter(ch, "_  _", "|  |", "|__|"))
            'V' -> asciiLetters.add(AsciiLetter(ch, "_  _", "|  |", " \\/ "))
            'W' -> asciiLetters.add(AsciiLetter(ch, "_ _ _", "| | |", "|_|_|"))
            'X' -> asciiLetters.add(AsciiLetter(ch, "_  _", " \\/ ", "_/\\_"))
            'Y' -> asciiLetters.add(AsciiLetter(ch, "_   _", " \\_/ ", "  |  "))
            'Z' -> asciiLetters.add(AsciiLetter(ch, "___ ", "  / ", " /__"))
        }
    }

    return asciiLetters
}