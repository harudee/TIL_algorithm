fun main(){
    var str : String?
    var arr : List<Int>
    
    while(true){
        str = readLine()
        if(str != null){
             arr = str!!.split(" ").map{it.toInt()}
        
            var a = arr[0]
            var b = arr[1]
            println(a+b)
            
        } else{
            break
        }
       
    }
    
}