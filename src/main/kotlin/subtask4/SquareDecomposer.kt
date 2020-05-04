package subtask4

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        if(number < 0) return null

        var answerString = decomposeRecourse(number.toLong(),number*number.toLong(), "")
        if(answerString == "")
            return null

        return answerString.split( " ", "end").filter { it != "" }.map { it.toInt() }.toTypedArray().reversed().toTypedArray()  //just for fun
    }

    private fun decomposeRecourse(n : Long, number : Long, str : String) : String{
        for(k in n-1 downTo 1){
            if(k*k < number){
                val stringAnswer = decomposeRecourse(k, number - k * k, str+"$k ")
                if(stringAnswer.contains("end"))
                    return stringAnswer
            }
            if(number == k*k)
                return "$str$k end"
        }
        return ""
    }
}
