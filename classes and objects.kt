open class shape{
   private var name:String = ""
    var numberOfSides:Int = 7
   open protected var typeOfShape:String = ""   // protected can oly be inherited
    // to the second class
    var  dimensionOfShape:Int = 8

    open  fun ss(){
        println("The $numberOfSides is that")
    }

}

open class circle(x:String):shape(){
    override var typeOfShape: String = x
   override fun ss(){
       super.ss()
       println("have got it")
   }
}
class sphere:circle("rest"){

}



// super allows you to get the functions in the first class
// to overrride allows you to get the things in the primary class and also add yours

fun main(){
    val shapes = shape()
    println("function is good")
    shapes.ss()

    val circle1 = circle("r")
    println("function is circle")
    circle1.ss()

    val s = sphere()
    s.ss()
    s.numberOfSides
    s.dimensionOfShape





}