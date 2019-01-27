// From AgileDeveloper.com

fun process(input: Any) { // input is any
    when (input) {
        1 -> println("That's one")
        7, 8 -> println("7 or 8")
        in 13..19 -> println("teen")
        is String -> println("got a String of length ${input.length}") // smart casting
        else -> println("no clue")
    }
}

process(1)
process(7)
process(8)
process(16)
process("hello")  // smart casting
process(StringBuilder())
