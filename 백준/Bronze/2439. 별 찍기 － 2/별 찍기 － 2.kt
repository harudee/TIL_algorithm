fun main(){
    val num = readLine()!!.toInt()
    var stars = ""
    var blank = ""
    var result = ""
    
    for(i in 1.. num){
        stars += "*"
        for(j in num-i downTo 1){
            blank += " "
        }
        result = blank
        blank = ""
        
        println(result + stars)
    }
}