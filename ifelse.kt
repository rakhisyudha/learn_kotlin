/* fun main(){
    val jamBuka = 7
    val jamSekarang = 8
    if (jamSekarang >= jamBuka){
        println("Waktunya buka")
    } else{
        println("Belum Waktunya buka")
    }
} 
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
} */
fun main(){
    val officeOpen = 8
    val now = 9
    val office = if(now > officeOpen) "Office is open" else "Office is still close"
    print(office)
}