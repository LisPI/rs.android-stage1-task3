package subtask1

class PolynomialConverter {

    fun convertToStringFrom(numbers: Array<Int>): String? {
        if (numbers.isEmpty()) return null

        var outputString = ""
        for((index,coeff) in numbers.withIndex()){
            if(coeff != 0){
                outputString += coeff.toString() + "x^" + (numbers.size - index - 1) + " + "
            }
        }

        outputString = outputString.replace("x^1", "x")
        outputString = outputString.replace("x^0", "")
        outputString = outputString.replace("1x", "x")
        outputString = outputString.replace("+ -", "- ")

        return outputString.substring(0,(outputString.length-3))
    }
}
