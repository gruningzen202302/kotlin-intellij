fun main(){
    for(outer in 1..5){for(inner in 1..outer)print('*');println()}
    for(outer in 1..5){val limit=6-outer;for(inner in 1..limit)print('*');println()}

}