import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val first = nextInt()
    val second = nextInt()
    
    println(first * (second%10))
    println(first * ((second%100)/10))
    println(first * ((second%1000)/100))
    println(first * second)
}