fun main(){
     myString()
    aboutMe("Alex",45)
    var result=strLength()
    println(result)
    boolean("Frank")
    boolean("Lilian")


}
fun myString(){
    var myString= "AkiraChix"
    var a=println(myString[1])
    var b=println(myString[3])
    var c=println(myString[4])
    println("a " + "b " + "c")

}
fun aboutMe(name: String, age: Int) {
    println("Hi, my name is $name and I am $age years old.")
}
fun strLength() : Int{
    var text="Adorable"
    var length =text.length
    return length
}
fun boolean(name: String){
     if (name=="Lilian")
    println("That's me!")
    else
        println("I don't know who that is")
    }



