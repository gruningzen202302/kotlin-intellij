fun main(){
    println("Hello from IntelliJ")
    var weekday:String
    // weekday = "Monday"
    // weekday = "Tuesday"
     weekday = "Wednesday"
    // weekday = "Thursday"
    // weekday = "Friday"
    // weekday = "Saturday"
    // weekday = "Sunday"

    // weekday = "Holidays"

    print("On $weekday, the opening hours are: ")
    when(weekday){
        "Monday" -> println("8 AM to 12 PM")
        "Tuesday" -> println("8 AM to 18 PM")
        "Wednesday" -> println("8 AM to 18 PM")
        "Thursday" -> println("8 AM to 18 PM")
        "Friday" -> println("8 AM to 21 PM")
        "Saturday" -> println("9 AM to 16 PM")
        "Sunday" -> println("8 AM to 16 PM")
        else -> println("unspecified")
    }

    var hour:Int
    hour=20
    println("time: $hour:00")
    val isOpen = when (weekday) {
        "Monday" -> hour in 8..12
        "Tuesday" -> hour in 8..18
        "Wednesday" -> hour in 8..18
        "Thursday" -> hour in 8..18
        "Friday" -> hour in 8..21
        "Saturday" -> hour in 9..16
        "Sunday" -> hour in 8..16
        else -> false
    }

    print("Little Lemon is ")
    if (isOpen) print("open") else print("closed")
    println(" now.")

}