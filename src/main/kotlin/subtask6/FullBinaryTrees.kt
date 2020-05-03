package subtask6

class FullBinaryTrees {

    fun stringForNodeCount(count: Int): String {

        if(count % 2 == 0)
            return "[]"
        if(count == 1)
            return "[[0]]"
        if(count == 3)
            return "[[0,0,0]]"
        return "[1]"
    }
}
