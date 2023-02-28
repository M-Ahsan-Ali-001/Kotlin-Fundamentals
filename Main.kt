import java.util.Scanner

class Student(var name:String, var age :Int, var grade:Int){

    fun averageGrade(grade:List<Student>){
        var sum:Int =0
        grade.forEach({sum = sum + it.grade})
        print("average : " + sum/grade.size)

    }
    fun isPrime(numb:Int):Boolean {
        for (i in 2..1000)
            if (numb % 2 == 0) {
                return false
            } else {

                return true
            }
        return false
    }




    fun reverseString(str:String) {
       print ("\nreversed : "+ str.reversed())

    }
}

class Rectangel{
    var length :Float =0.0f
    var width : Float=0.0f
    fun findArea()
    {
        print("\nArea of Rectangle is :" + (this.length * this .width))
    }

}

class test(var str:String)
{
    fun nam(){
        print(this.str)
    }
}
fun main(args: Array<String>) {
val obj1 = Student("std1", 20 , 90 )
val obj2 = Student("std2", 25 , 50 )
val obj3 = Student("std3", 22 , 70 )
val course = Student("test",1,1)
val list:List<Student> = listOf<Student>(obj1,obj2 ,obj3)
course.averageGrade(list)
val scan =  Scanner(System.`in`);
    print("\nEnter a number to check if the number is prime or not :")

var check =   course.isPrime(scan.nextInt())
if (check ==true) {print("\nit is a prime number")} else {print("\nit is not a prime number")}

course.reverseString("kotlin")
val rect= Rectangel()
    rect.length = 5.5f
    rect.width = 6.1f
    rect.findArea()


}