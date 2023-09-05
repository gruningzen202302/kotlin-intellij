fun main(){
    val days = arrayOf("Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday","Sunday")
    val hours = 0..23

//    val cities = arrayOf("Atlanta", "Boston", "Chicago", "Denver")
//
//    fun permute(data: Array<String>, start: Int, end: Int) {
//        if (start == end) {
//            println(data.joinToString())
//        } else {
//            for (i in start..end) {
//                data[start] = data[i].also { data[i] = data[start] }
//                permute(data, start + 1, end)
//                data[start] = data[i].also { data[i] = data[start] }
//            }
//        }
//    }
//
//    permute(cities, 0, cities.size - 1)

    fun permute(data: MutableList<String>, i: Int, length: Int) {
        if (i == length) {
            println(data)
        } else {
            for (j in i until length) {
                println("Swapping elements at indices $i and $j: ${data[i]} and ${data[j]}")
                data[i] = data[j].also { data[j] = data[i] }
                permute(data, i + 1, length)
                data[i] = data[j].also { data[j] = data[i] }
                println("Restoring elements at indices $i and $j: ${data[i]} and ${data[j]}")
            }
        }
    }

    val cities = mutableListOf("Atlanta", "Boston", "Chicago", "Denver")
    val n = cities.size
    permute(cities, 0, n)

    val weekday:String
    //weekday = "Monday"
    //weekday = "Tuesday"
    //weekday = "Wednesday"
    //weekday = "Thursday"
    //weekday = "Friday"
    //weekday = "Saturday"
    weekday = "Sunday"
    //weekday = "Holidays"

    val hour:Int
    hour = 16
    //hour = 7
    //hour = 8
    //hour = 9
    //hour = 17
    val range:IntRange

    print("On $weekday, the opening hours are: ")
    val isOpen = when(weekday){
        days.first() -> {
            range= hours.elementAt(8)..hours.elementAt(12)
            println("${range.first} AM to ${range.last} PM")
            hour in range
        }
        days[1] -> {
            range= hours.elementAt(8)..hours.elementAt(18)
            println("${range.first} AM to ${range.last} PM")
            hour in range
        }
        days[2] -> {
            range= hours.elementAt(8)..hours.elementAt(18)
            println("${range.first} AM to ${range.last} PM")
            hour in range
        }
        days[3] -> {
            range= hours.elementAt(8)..hours.elementAt(18)
            println("${range.first} AM to ${range.last} PM")
            hour in range
        }
        days[4] -> {
            range = hours.elementAt(8)..hours.elementAt(21)
            println("${range.first} AM to ${range.last} PM")
            hour in range
        }
        days[5] -> {
            range = hours.elementAt(9)..hours.elementAt(16)
            println("${range.first} AM to ${range.last} PM")
            hour in range
        }
        days.last() -> {
            range = hours.elementAt(8)..hours.elementAt(16)
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