package subtask2

class Combinator {

    private fun factorial(n : Int) : Int {
        if((n == 0) or (n == 1)) return 1
        var fact = 1
        for(k in 1..n){
            fact*=k
        }
        return fact
    }

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val cnk = array[0]
        val n = array[1]

        for(k in 0..(n/2)){
            if(cnk*factorial(k)*factorial(n-k) == factorial(n))
                return k
        }

        return null
    }
}
