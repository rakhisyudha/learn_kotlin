/* fun main(){
    val value = 7
    val stringOfValue = when (value) {
        6 -> "Value is 6"
        7 -> "Value is 7"
        8 -> "Value is 8"
        else -> "Output cannot be loaded"
    }
    println(stringOfValue)
} */
fun main(){
    val value = 51
    val ranges = 10..50

    when (value){
        in ranges -> println("Value is in range")
        !in ranges -> println("Value is not in range")
    }
}