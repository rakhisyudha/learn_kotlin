/*fun main(args: Array<String>) {
    val range = 100 downTo 1 step 2

    println(range.count())
}
fun main(){
    val rangeInt = 1..10
    print(rangeInt.step)
} */
fun main(){
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
}