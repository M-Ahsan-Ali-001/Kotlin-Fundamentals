fun main()
{
    println("SUm :" + Sum(1,2))
    println(reverseStr("player"))
    var arr = IntArray(20){it*1}
    arr.forEach { print(it) }
    println("\n"+"Average : "+ Arr(arr))
    println("\n"+ finder("palyera",'a'))
    println(finderInt(44,45))
    print(evenFinder(arr))
    println("\nword: "+ numbStr("mr.fox got it"))
    println("\nSmallest : " + smallestArray(arr))
}
fun Sum(value1:Int , value2:Int):Int
{
    (value1 + value2)
    return   (value1 + value2)

}

fun reverseStr(st:String):String{
    var str : String=""
    for (i in (st.length-1)downTo 0){
       //print(st[i])
        str = str+st[i]
  }
    return str
}

fun Arr (ar:IntArray):Int
{
    var sum:Int =0
    print(ar.size)
    for (i in 0..(ar.size-1)){
        sum = sum+ar[i]
        }
    return sum / ar.size

}
fun finder(str:String, chr: Char)
{
    var time:Int =0
    for (i in 1 ..(str.length-1))
    {
        if(chr == str[i])
        {
            time++
            println("Found at idex: ${i} , times:${time}")
        }
    }
}
fun finderInt(val1:Int , val2:Int):String{
    if(val1 > val2)
    {
        return("${val1} is greater")
    }
    else {
        return("${val2} is greater")
    }
}
fun evenFinder(ar:IntArray):List<Int> {
 var arr = mutableListOf<Int>()

    ar.forEach {

        if(it %2 ==0)
        {
           arr.add(it)
        }

    }
   // arr.forEach( {print(it)})
    return arr

}

fun numbStr(st:String):Int
{
    var str = st.split(" ")
    var size:Int =0

    str.forEach { if(it !=" "){size++} }

   return size
}
fun smallestArray(ar:IntArray):Int{
 var hold : Int =ar[0]
    for (i in 1 .. (ar.size-1)){
        if(hold > ar[i])
        {
            hold =ar[i]
        }
    }
    return hold
}