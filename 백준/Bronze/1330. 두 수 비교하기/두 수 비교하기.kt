fun main(){
    val str = readLine()
    val arr = str!!.split(" ").map{it.toInt()}
    
    val a = arr[0]
    val b = arr[1]
    
    if(a>b){
        println(">")
    }else if(a<b){
        println("<")
    }else if (a==b){
        println("==")
    }
    
}