package signature

import AsciiFormatter.AsciiVisitorCard
import AsciiFormatter.AsciiWord
import java.util.*

fun main() {
    val salutationCardData = with(Scanner(System.`in`)) {
        print("Enter name and surname: ")
        val fullName = nextLine()
        print("Enter person's status: ")
        val status = nextLine()
        return@with mapOf<String, String>("Name" to fullName, "Status" to status)
    }

    val name = AsciiWord().convertString((salutationCardData["Name"] ?: error("No Name")).split(" ")[0])
    val surName = AsciiWord().convertString((salutationCardData["Name"] ?: error("No Name")).split(" ")[1])

    AsciiVisitorCard(name, surName, salutationCardData["Status"]
            ?: error("No Status")).print()
}






