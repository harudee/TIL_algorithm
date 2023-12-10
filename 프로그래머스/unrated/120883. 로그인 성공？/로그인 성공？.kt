class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = "fail"
        
        val id = id_pw[0]
        val pw = id_pw[1]
        
        for((i,row) in db.withIndex()){
            for((j,column) in row.withIndex()){
                if(db[i][j] == id_pw[0]){
                    if(db[i][j+1] == id_pw[1]){
                        answer = "login"
                        break
                    }else{
                        answer = "wrong pw"
                        break
                    }

                }

            }
        }
        
        return answer
    }
}