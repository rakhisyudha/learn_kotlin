/* fun main(){
    val jamBuka = 7
    val jamSekarang = 8
    if (jamSekarang >= jamBuka){
        println("Waktunya buka")
    } else{
        println("Belum Waktunya buka")
    }
} */
fun main(){
    val jamBuka = 7
    val jamTutup = 18
    val jamSekarang = 6

    val is_open = if (jamSekarang >= jamBuka && jamSekarang <= jamTutup){
        true
    } else{
        false
    }

    print("Tokonya Sudah Buka: $is_open")
}