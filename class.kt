class Animal() {
    var name: String = "Kucing"
    var weight: Double = 3.2
    var age: Int = 2
    var isMammal: Boolean = true
   
    fun eat(){
        println("$name makan!")
    }
 
    fun sleep() {
        println("$name tidur!")
    }
}
 
fun main() {
    val Cat = Animal()
    println("Nama: ${Cat.name}, Berat: ${Cat.weight}, Umur: ${Cat.age}, mamalia: ${Cat.isMammal}" )
    Cat.eat()
    Cat.sleep()

    // Mengubah Properti dari class Cat
    Cat.name = "Kucing Oren"
    Cat.weight = 6.0
    Cat.age = 3
    println("Nama: ${Cat.name}, Berat: ${Cat.weight}, Umur: ${Cat.age}, mamalia: ${Cat.isMammal}" )
    Cat.eat()
    Cat.sleep()
}