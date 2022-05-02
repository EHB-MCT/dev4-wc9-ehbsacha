fun main(args: Array<String>) {
    val reader = FileReader();

    oef1(reader)
    oef2(reader)
    oef3(reader)

    print(reader.getPuzzle3())
    //println(reader.getPuzzle4Numbers())
    //println(reader.getPuzzle4Cards())
}

fun oef1(reader: FileReader){

    println("Oef 1")

    var i = 0
    var counter1 = 0
    var counter2 = 0
    var negativeCounter = 0
    var currentNr = 0
    var group1: List<Int>
    var group2: List<Int>

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
    println()
}
fun oef2(reader: FileReader){
    var xAxis = 0
    var yAxis = 0
    var aim = 0
    reader.getPuzzle2().forEach {
        var itNumber = it[1] as Int
        when (it[0]) {
            "down" -> {
                aim += itNumber
            }
            "up" -> {
                aim -= itNumber
            }
            "forward" -> {
                xAxis += itNumber
                yAxis += itNumber * aim
            }
            else -> {
                print("It is not usable for us!")
            }
        }
    }
    println("De duikboot bevind zich op ${xAxis}, ${yAxis}. Result: ${xAxis*yAxis}")
}

fun oef3(reader: FileReader){

}