fun main(){
    for(outer in 1..5){for(inner in 1..outer)print('*');println()}

    for(outer in 1..5){val limit=6-outer;for(inner in 1..limit)print('*');println()}

    val tot=5;for(outer in 1..tot){val spaces=outer-1;for(space in 1..spaces)print(' ');val stars=tot+1-outer;for(star in 1..stars)print('*');println()}

}