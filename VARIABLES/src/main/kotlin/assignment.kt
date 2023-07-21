import kotlin.math.sqrt
fun main(){
    //c = square root ( a2 +b2)
    val a = 4
    val b = 6
    val p = a*a + b*b
    val t = p.toFloat()

    val c = sqrt( t)
    print(c.toInt())
}
