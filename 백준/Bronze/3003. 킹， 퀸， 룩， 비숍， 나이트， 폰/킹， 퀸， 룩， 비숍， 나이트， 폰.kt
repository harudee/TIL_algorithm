fun main(){
    val str = readLine()
    val arr = str!!.split(" ").map{it.toInt()}
    val answer = arrayOf(1,1,2,2,2,8)
    
    var sol = ""
    
    for(i in 0.. 5){
        if(arr[i]-answer[i] > 0){
            sol += "${-(arr[i]-answer[i])} "
            
        }else if(arr[i]-answer[i] == 0){
            sol += "0 "
        } else{
            sol += "${-(arr[i]-answer[i])} "
        }
        
    }
    
    println(sol)
}