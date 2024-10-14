class Animal{
    var name: String = "Dicoding Miaw"
}
 
fun main(){
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}
 
/*
    output:
    Nama: Dicoding Miaw
    Nama: Goose
*/