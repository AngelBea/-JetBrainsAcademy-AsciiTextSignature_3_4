package AsciiFormatter

class AsciiVisitorCard(val name: AsciiWord, val surname: AsciiWord, val status: String) {
    fun print() {
        val separationBetweenWords = "     "
        var line1 = "*  ${name.wordLine1}$separationBetweenWords${surname.wordLine1} *"
        var line2 = "*  ${name.wordLine2}$separationBetweenWords${surname.wordLine2} *"
        var line3 = "*  ${name.wordLine3}$separationBetweenWords${surname.wordLine3} *"
        var cardStatus = "*  $status  *"

        val maxLength = listOf(cardStatus, line1, line2, line3).maxBy { it.length }!!.length
        val border = "*".repeat(maxLength)
        println("$status ${status.length}")
        if (cardStatus.length < maxLength) {
            cardStatus = buildString {
                formatLine(this, maxLength, status, true)
            }
        }else{
            val oneSideSpacesNumber = maxLength/2/2-2
            val spaces = " ".repeat(oneSideSpacesNumber)
            line1 = buildString {
                formatLine(this, maxLength, "${name.wordLine1}$separationBetweenWords${surname.wordLine1}", stringToCompare = status)
            }
            line2 = buildString {
                formatLine(this, maxLength, "${name.wordLine2}$separationBetweenWords${surname.wordLine2}", stringToCompare = status)
            }
            line3 = buildString {
                formatLine(this, maxLength, "${name.wordLine3}$separationBetweenWords${surname.wordLine3}", stringToCompare = status)
            }
        }

        println(border)
        println(line1)
        println(line2)
        println(line3)
        println(cardStatus)
        println(border)
    }

    private fun formatLine(builder : StringBuilder, maxLength : Int, string : String, isStatus : Boolean = false, stringToCompare : String = ""){
        builder.append(" ".repeat(maxLength))
        builder[0] = '*'
        builder[builder.lastIndex] = '*'

        val stringLength = string.length
        val compareStringLength = stringToCompare.length
        val middle = maxLength/2
        val statusMiddle = stringLength / 2
        val startingPoint = middle - statusMiddle
        val endpoint = middle + (stringLength - statusMiddle)
        val isPrimeNumber = stringLength % 2 != 0 && stringLength % 3 != 0 && stringLength % 5 != 0
        val isCompareStringPrimeNumber = compareStringLength % 2 != 0 && compareStringLength % 3 != 0 && compareStringLength % 5 != 0
        val isCompareStringUneven = compareStringLength % 3 == 0 || compareStringLength % 5 == 0

        if (isPrimeNumber && isStatus){
            builder.replace(startingPoint-1, endpoint-1, "$string")
        }else if( isCompareStringUneven && !isStatus){
            builder.replace(startingPoint+1, endpoint+1, string)
        }else if(isCompareStringPrimeNumber){
            builder.replace(startingPoint+1, endpoint+1, string)
        }else{
            builder.replace(startingPoint, endpoint, string)
        }
    }
}