
//Write a function to find the maximum element in a list of integers.

//Input numbers in an array
//Input the max and loop through each number to find the largest
//print the output

/*fun main() {
var numbers = arrayOf(4,6,7,2,8)
    var max = numbers.max()
println(max)
}*/

//ReadMe
//input a year
//Checking if a year is a leap year
// it should be divisible by 4, or 400
//Not divisible by 100

/*
//Create a function to check if a given year is a leap year.
fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}


fun main() {
println( isLeapYear(2024))
}*/
//Write how to identify even and odd numbers in an array
fun main() {
    var numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
    sum =0
    numbers.forEach { number ->
        if(number% 2==0) {
            println("$number Even number")
            sum+= number
        }
        }


//        else {
//            println("$number Odd number")
//        }
//    }
}*/

//The given program declares an array of weekday names.
//You need to take a number as input and output the name of the day at that index.
//In case the input is out of the range, output "Invalid day".

fun main() {
    var weekday = arrayOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
}




