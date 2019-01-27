

//public static String shout (final String input) {
//    return input != null ? input.toUpperCase(): input;
//}

fun String.shout() = toUpperCase()

// shout("hello") // turning it around
println("hello".shout())


// generic concatenation
fun <T> T.concatAsString(b: T): String = toString() + b.toString()


println(5.concatAsString(10)) // no primitive types
println("extensions ".concatAsString("rock"))
println("mixing ".concatAsString(8))

// see _06_varargs for example of standard library extension functions