//remember the class from the presentation?

data class Person(val first: String, val last: String, val venom : Boolean = false)


val spiderMan = Person("Peter", "Parker")

println(spiderMan)
println(spiderMan.first)
println(spiderMan.component3())

val spiderMan3 =  spiderMan.copy(venom = true)

println("Are they equal? ${spiderMan3 == spiderMan}")
println(spiderMan3.component3())
