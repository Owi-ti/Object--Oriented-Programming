fun main(){
    var I=Human("Esther",20,55.5)
    I.eat(2)
    println(I.weight)

    I.speak("I want to become a champion in Kotlin")
    I.birthday(1)

    var Mine =Champions("Esther","Owiti","owittiesther@gmail.com",114618145,444)
    println(Mine.email)
    println(Mine.phoneNumber)

}


class Human(var name:String,var age:Int,var weight:Double) {

    fun eat(foodWeight: Int){
        println("I am eating $foodWeight Kgs of food")
        weight += foodWeight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(Add:Int){
        age+=1
        println(age)
    }
}
data class Champions(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:Int){

}
