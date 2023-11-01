fun main(){
    val time = readLine()!!.toInt()
    var arr : List<Int>?
    
    for(i in 1..time){
        arr = readLine()!!.split(" ").map{it.toInt()}
        println("Case #${i}: ${arr[0]} + ${arr[1]} = ${arr[0] + arr[1]}")
    }
}