package subtask5

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if(number.toInt() < 0) return null

        val strBuilder = StringBuilder(number)
        val outputList = mutableListOf<String>()
        for((index, digit) in strBuilder.withIndex()){
            val neighborsArray = getNeighborsForDigit(digit)
            for(i in neighborsArray){
                strBuilder[index] = i
                outputList.add(strBuilder.toString())
                strBuilder[index] = digit
            }
        }
        return outputList.toTypedArray()
    }

    private fun getNeighborsForDigit(digit : Char) : Array<Char>{
        return when(digit){
            '1' -> arrayOf('4','2')
            '2' -> arrayOf('1','3','5')
            '3' -> arrayOf('2','6')
            '4' -> arrayOf('1','5','7')
            '5' -> arrayOf('2','4','6','8')
            '6' -> arrayOf('3','5','9')
            '7' -> arrayOf('4','8')
            '8' -> arrayOf('0','5','7','9')
            '9' -> arrayOf('6','8')
            '0' -> arrayOf('8')
            else -> arrayOf(' ')
        }
    }
}
