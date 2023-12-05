import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()
    var nums = ArrayList<Int>()
    
    for (i in 1..num) {
        nums.add(nextInt())
    }
    
    val search = nextInt()
    var result = 0
    
    for (i in nums) {
        if (i == search) {
            result += 1
        }
    }
    
    print(result)
}