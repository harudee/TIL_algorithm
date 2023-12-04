fun main(){
    var str :String?
    var arr : List<Int>
    
    while(true){
        str = readLine()
        arr = str!!.split(" ").map{it.toInt()}
        
        var a = arr[0]
        var b = arr[1]
        
        if(a == 0 && b ==0){
            break;
        }else{
            println(a+b)
        }
    }
    
}