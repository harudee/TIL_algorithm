fun main() {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    
    println(
        when {
            x > 0 && y > 0 -> '1'
            x > 0 && y < 0 -> '4'
            x < 0 && y > 0 -> '2'
            else -> '3'
        }
    ) 
}