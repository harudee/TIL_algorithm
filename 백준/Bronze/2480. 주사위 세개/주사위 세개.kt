fun main(){
    val str = readLine()
    val arr = str!!.split(" ").map{it.toInt()}
    
    val a = arr[0]
    val b = arr[1]
    val c = arr[2]
    
    var key = 0
    var max = 0
    
    if((a==b)&&(b==c)){
        key = a
        println("${10000 + (key*1000)}")
    }else if((a==b)||(b==c)||(a==c)){
        if(b==c){
            key = b
        }else{
            key = a
        }
        
        println("${1000 + (key*100)}")
        
    } else{
        max = a
        if(max<b){
            max = b
        }
        
        if(max<c){
            max = c
        }
        
        println("${max*100}")
    }
    
}