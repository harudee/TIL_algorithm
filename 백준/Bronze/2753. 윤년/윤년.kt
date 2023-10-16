import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){
    
    val year = nextInt()
    
    if(year%4 ==0){
        
        if((year%100 !=0) || (year%400 == 0)){
            println("1")
        }else{
            println("0")
        }
        
    }else{
        println("0")
    }
    
    
    
}