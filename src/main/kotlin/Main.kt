fun main(args: Array<String>) {
    var i = 0
    val reader = FileReader();
    var counter1 = 0
    var counter2 = 0
    var negativeCounter = 0
    var currentNr = 0
    var group1: List<Int>
    var group2: List<Int>


    // Oef 1.0
    reader.getPuzzle1().forEach {
        if(currentNr == 0){
            currentNr = it
        }

        if(currentNr < it) {
            counter1++
        } else {
            negativeCounter++
        }
        currentNr = it
    }
    println("There were ${counter1} greater than the number in front, there where ${negativeCounter} lower")
    println()

    while (i < (reader.getPuzzle1().size - 3)){
        group1 = reader.getPuzzle1().slice(setOf(i, i+1, i+2))
        var sum1 = group1[0] + group1[1] + group1[2]

        group2 = reader.getPuzzle1().slice(setOf(i+1, i+2, i+3))
        var sum2 = group2[0] + group2[1] + group2[2]

        if(sum1 < sum2){
            counter2++
        }
        i++
    }
    println("There were ${counter2} group numbers greater than the number in front")


//    print(reader.getPuzzle2())
    //println(reader.getPuzzle3())
    //println(reader.getPuzzle4Numbers())
    //println(reader.getPuzzle4Cards())
}

//fun checkValues(array: Array, counter)