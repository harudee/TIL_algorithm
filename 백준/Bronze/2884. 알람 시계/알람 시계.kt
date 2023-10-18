fun main(){
    val str = readLine()
    val arr = str!!.split(" ").map{it.toInt()}
    
    val h = arr[0]
    val m = arr[1]
    
    if(m>=45){
        println("${h} ${m-45}")
    }else{
        if(h==0){
            println("23 ${60-(45-m)}")
        } else{
            println("${h-1} ${60-(45-m)}")    
        }
        
    }
}