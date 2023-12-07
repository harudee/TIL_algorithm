import java.lang.StringBuilder
import java.util.*

fun main(){
    
    val conditions = readLine()
    val N = conditions!!.split(" ")[0].toInt()
    val target = conditions!!.split(" ")[1].toInt()
    
    val str = readLine()
    val token = StringTokenizer(str)
    
    var answer =""
    for(i in 0 .. N-1){
        var temp = token.nextToken().toInt()
        if(temp < target){
            answer += temp.toString()
            answer += " "
        }
    }
    
    println(answer)
    
    
}