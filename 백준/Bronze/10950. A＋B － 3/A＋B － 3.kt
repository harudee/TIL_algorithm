fun main(){
    val a = readLine()!!.toInt()
    var str : String?
    var arr : List<Int>
    
    for(i in 1..a){
        str = readLine()
        arr = str!!.split(" ").map{it.toInt()}
        
        println("${arr[0]+arr[1]}")
    }
    
}