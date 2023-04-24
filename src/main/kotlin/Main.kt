fun main() {
    var bankAccount = BankAccount(100000,864596)

    var person = Person("Drake",19,"Male")
    println( person.speak("Hello"))
    var employee1 = Employee("Ryan",30,"Male",360678)
    println( employee1.speak("Hi"))
    println( getAvarage(listOf(2,3,4,5,6,7)))

    showEmployee("Jonathan",10000)
    var car = Car("nissan","note","red",7)
    car.carry(9)
    car.carry(3)
    car.identity()
    println(car.calculateParkingFees(50))



}
//Create a class BankAccount with properties balance and accountNumber. Add methods deposit
// (amount: Double) and withdraw(amount: Double) that modify the balance property.
// The withdraw() method should throw an exception if the amount is greater than the current balance.

class BankAccount(var balance:Int,var accountNumber:Int) {
    class BankAccount(var balance: Int, var accountNumber: Int) {
        fun deposit(amount: Double) {
        }

        fun withdraw(amount: Double) {
            throw Exception("your $amount is greater than the $balance")
        }

    }
}


//Create a class Person with properties name, age, and gender. Add a method speak()
// that prints out a greeting. Create a subclass Employee that adds a property id and
// overrides the speak() method to print out a greeting that includes the employee's name and ID.

open class Person(var name:String,var age:Int,var gender:String){
    open fun speak(greeting:String):String{
        return greeting
    }
}
class Employee(name:String,age: Int,gender: String,var id:Int):Person(name, age, gender){
    override fun speak(greeting: String): String {
        return ("Hello $name your id number is $id")
    }
}

//[2:34 PM] 3.   Write a function getAverage(numbers: List<Int>): Double that takes a list
// of integers as an argument and returns the average of the     numbers in the list.
// If the list is empty, the function should return 0 (edited)
//7:17

fun getAvarage(numbers:List<Int>):Double {
    if (numbers.isEmpty())
        return 0.0
    else
        return(numbers.sum().toDouble())
}

//Write a program to create a function show_employee() using the following conditions.
//a. It should accept the employee’s name and salary and display both.
//b.If the salary is missing in the function call then assign default value 9000 to salary (edited)

fun showEmployee(name: String,salary: Int){
    var salaryPresent = salary
    if(salaryPresent === salary){
        println(salary)
    }
    else{
        println(9000)
    }
}
open class Truck(var make: String,var model: String,var color: String,var capacity: Int){
    fun carry(people: Int){

        var x=people-capacity
        if (people <= (capacity)){
            println("Carrying $people passengers")}
        else{
            println("Over capacity by $x people")}
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours: Int): Int{
        var calculation= hours*20
        return calculation
    }
}
class Car( make: String,model: String,color: String,capacity:Int):Truck(make, model, color, capacity){
}