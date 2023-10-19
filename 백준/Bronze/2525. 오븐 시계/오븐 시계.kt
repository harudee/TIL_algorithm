fun main(){
    
    val str = readLine()
    val time = readLine()!!.toInt()
    
    val arr = str!!.split(" ").map{it.toInt()}
    
    val h = arr[0]
    val m = arr[1]
    
    var resultH =0
    var resultM =0
    val calTime = m+time
    
    if((calTime%60)==0){
        resultM = 0
        
    } else{
        resultM = calTime%60
        
    }
    
    resultH = h + (calTime/60)
    if(resultH >= 24){
        resultH -= 24
    }
    
    println("$resultH $resultM")
    
}