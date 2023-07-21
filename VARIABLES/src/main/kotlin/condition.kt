fun main(){
//    val rain = false
//    if(rain){
//        print("Ground get wet")
//    } else{
//        print("Go to the beach")
//    }

//    println("enter date of birth")
//    val year = readln()
//    if(year == "2000"){
//        print("good")
//    } else{
//        print("middle")
//    }

//    println("enter date of birth")
//    val year = readln().toInt()
//    if(year>=0 && year <= 1900){
//        println("baby boomer")
//    } else if(year <= 1973){
//        println("middle")
//    } else if(year <= 1999){
//        println(" best")
//    } else {
//        println(" future rist")
//    }
//
//    val weather = readln()
//    when(weather){
//        "rainy" -> print("Go to the house")
//        "Sunny" -> print("go to the beach")
//        else -> print("lets jazz")
//    }

    println("Enter year")
    val year = readln().toInt()
    when(year){
        in 0..1959 ->println("Gen Z")
        in 1945..1959->println(" Milleanial")
        in 1959..2000 ->println("Gen x")
        else-> println("Boby Boomer")
    }



}