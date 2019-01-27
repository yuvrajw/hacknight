// Example taken from: AgileDeveloper.com

// inheritance - final by default

open class Person(private val first: String, private val last: String) {
    open fun work() {
        println("working...")
    }

    override fun toString() = "$first $last"
}

class CoolPerson(first: String, last: String) : Person(first, last) { //override with :
    var coolnessIndex = 5

    constructor(first: String, last: String, index: Int) : this(first, last) {
        coolnessIndex = index
    }

    override fun work() {
        println("meaningful work")
        super.work()
    }

    override fun toString() = "${super.toString()} $coolnessIndex"
}

val coolPerson = CoolPerson("Alan", "Turing", 10)
println(coolPerson)
coolPerson.work()