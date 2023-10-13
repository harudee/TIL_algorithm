fun main(){
    val A = readLine()
    val arr = A!!.split(" ").map{it.toLong()}
    
    println("${arr[0]+arr[1]+arr[2]}")
}