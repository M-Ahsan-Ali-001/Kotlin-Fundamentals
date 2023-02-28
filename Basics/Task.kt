//import jdk.internal.util.xml.impl.Input
import java.util.*
import java.util.Scanner
import java.util.Random
fun main(args: Array<String>){
// var used variable declaration and is mutable
// val is used as constant is immutable
// cntrl + shift + p (return type)
// implicit type  declaration => var name : String = "aaa"
    //var numb = 1

    // println(1>2)

//switch case:
    /*when(case){
     60->println("clear")
     20->println("no clear")
     else->print("not eligible")
    }*/



// for loop
    /*
     for(i in  .. 5 step 1 )
     for (i in 1 until 5
     for (i in 5 downTo 1) // 5>i>1
      */



    /*
    print("\n\n****Task-1****:\n\n")
     for(i in 1..5) {
         for (j in 1..i) {
             print("# ")
         }
         print("\n")

     }
        print("\n\n***Task-2:***\n\n")



        for(i in 1..6) {

            if(i<6 )
            {
                for(p in 1..(5-i))
                {
                    print(" ")
                }
                for (j in 1..i) {

                    print("# ")


            }}
            else {
                print("   # #")
            }

           print("\n")

     // task -3
        print("Enter a number between 1 - 100:")
        var scan = Scanner(System.`in`)
         print("Enter a number:")
        var numb:Int = scan.nextInt()
        print("number is :$numb")
        }*/

    repeat(6){
            index-> repeat(index){print("* ")}
        print("\n")
    }
    print("\n")
    repeat(6){
            index-> repeat((6-index)){print("* ")}
        print("\n")
    }
    print("\n")

    repeat(6){

            index->  repeat((6-index)){print("  ")}
        repeat(index){print(" *")}
        print("\n")
    }






    print("\n")

    repeat(5){

            index->  repeat((index)){print("  ")}
        repeat(5-index){print(" *")}
        print("\n")
    }
    print("\n")
    println("\n Up-Down Paramid Task: ")
    repeat(7){
            idx-> repeat(7-idx){ print("  ")}
        // println(2*4/2)
        //print((idx*2)%2 )
        repeat(2*idx-1 ){print("& ")}
        print("\n")


    }

    repeat(7){
            idx-> repeat(idx){ print("  ")}
        // println(2*4/2)
        //print((idx*2)%2 )
        repeat(2*(7-idx)-1 ){print("& ")}
        print("\n")


    }






    var scan =  Scanner(System.`in`)

    print("Please Enter your age:")
    var age:Int =  scan.nextInt()

    println("if-else case result:")

    if(age>=1 && age <=10)
    {
        println("Your comes in the category of Kids")
    }
    else if(age>20 && age <=41){
        println("Your comes in the category of elders")

    }
    else if(age>41 && age <=50){

        println("Your comes in the category of Senior citizen")
    }
    println("Switch case result:")
    when(age){
        1,2,3,4,5,6,7,8,9,10-> print("Your comes in the category of Kids")
        20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41-> println("Your comes in the category of elders")
        42,43,44,45,46,47,48,49,50,51-> println("Your comes in the category of Senior citizen")
    }
    println("\n Find Null TASK  : ")
    print("\nenter string:")
    var str = readLine()
    while(str !=null)
    {
        println("Not Null :$str" )
        print("enter string:")
        str = readLine()
        if(str ==""){str=null}
    }

    var arr = IntArray(60){it*2}
    var num:Int = 56
    println("\n Comparesion TASK  : ")
    for (i in 0 .. (arr.size)){

        if(num == arr[i])
        {
            print("Found at index : $i")
            break
        }
    }

    var random = (0..100).random()
    var numb:Int =0
println("\n GAME TASK  random number generator: ")
    while(true)
    {
        print("\nEnter a number:")
        numb = scan.nextInt()

        if(numb == random){
            println("\nCongrats you were correct")
            println("\nyou want to play again(type : yes / no )")
            var  respo= readLine()
            if(respo == "yes")
            {
                continue
            }
            else {break}

        }
        else{
            var hold =0
            if(numb>random)
            {
                hold = numb -random
            }
            else {
                hold = random - numb
            }


            if (hold<=5 && hold>=1 )
            {
                println("\nyou were very close to the answer")
            }
            else{
                println("\nyou were  too far from the answer")
            }
            println("\nyou want to play again(type : yes / no )")

            var  respo= readLine()
            if(respo == "yes")
            {
                continue
            }
            else {break}

            random = (0..100).random()


        }



    }







}