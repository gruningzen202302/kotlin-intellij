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



}