fun main() {
    val likes = 211
    val human = "человеку"
    val people = "людям"

    val humanPeople = if (likes === 1) human else if (likes % 100 === 11) people
    else if (likes % 10 === 1) human else people

    println("Понравилось $likes $humanPeople")
}