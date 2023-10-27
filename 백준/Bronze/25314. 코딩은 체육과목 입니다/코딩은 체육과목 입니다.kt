fun main(){
    val N = readLine()!!.toInt()
    var str : String = ""
    val time = N/4
    
    for(i in 1..time){
        str += "long "
    }
    
    str += "int"
    
    print(str)
    
}