fun main(){
    val X = readLine()!!.toInt()
    val N = readLine()!!.toInt()
    
    var str : String?
    var arr : List<Int>? 
    var a : Int = 0
    var b : Int = 0
    
    var sum : Int = 0
    
    for(i in 1..N){
        str = readLine()
        arr = str!!.split(" ").map{it.toInt()}
        
        a = arr[0]
        b = arr[1]
        
        sum += (a*b)
    }
    
    if(X==sum) println("Yes")
    else println("No")
    
}