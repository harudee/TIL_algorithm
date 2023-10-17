import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){
    val x = nextInt()
    val y = nextInt()
    
    if(x>0){
        if(y>0){
            println("1")
        }else {
            //y<0
            println("4")
        }
    } else{
        //x<0
        if(y>0){
            println("2")
        } else{
            //y<0
            println("3")
        }
    }
}