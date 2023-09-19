// EXAMPLE : Implementation
//Budget
//Price range Economy-FirstClass
// Cities
// Example from Atlanta airport
// Atlanta flyes to  Boston Chicado and Denver
fun main(){

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
}