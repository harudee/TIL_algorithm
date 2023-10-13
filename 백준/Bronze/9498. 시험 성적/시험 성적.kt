fun main(){
    val score = readln().toInt()
    val grade = when(score){
        in 90..100 -> "A"
        in 80 until 90 -> "B"
        in 70 until 80 -> "C"
        in 60 until 70 -> "D"
        else -> "F"
    }
    
    println(grade)
}