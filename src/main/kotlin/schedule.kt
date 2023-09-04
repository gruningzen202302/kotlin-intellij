fun main(){
    var weekday:String
    //weekday = "Monday"
    //weekday = "Tuesday"
    //weekday = "Wednesday"
    weekday = "Thursday"
    //weekday = "Friday"
    //weekday = "Saturday"
    //weekday = "Sunday"

    // weekday = "Holidays"
    var hour:Int
    hour=20
    var range:IntRange

    print("On $weekday, the opening hours are: ")
    val isOpen = when(weekday){
        "Monday" -> {
            range =8..18
            println("${range.first} AM to ${range.last} PM")
            hour in range
        }
        "Tuesday" -> {
            range= 8..18
            println("${range.first} AM to ${range.last} PM")
            hour in range
        }
        "Wednesday" -> {
            range = 8..18
            println("${range.first} AM to ${range.last} PM")
            hour in range
        }
        "Thursday" -> {
            range= 8..18
            println("${range.first} AM to ${range.last} PM")
            hour in range
        }
        "Friday" -> {
            range = 8..21
            println("${range.first} AM to ${range.last} PM")
            hour in range
        }
        "Saturday" -> {
            range = 9..16
            println("${range.first} AM to ${range.last} PM")
            hour in range
        }
        "Sunday" -> {
            range = 8..16
            println("${range.first} AM to ${range.last} PM")
            hour in range
        }
        else -> {
            println("unspecified")
            false
        }
    }
    println("time: $hour:00")
    println("Little Lemon is ${ if (isOpen) "open" else "closed"} now.")

}