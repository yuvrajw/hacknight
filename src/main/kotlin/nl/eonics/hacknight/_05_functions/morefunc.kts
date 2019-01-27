fun greet(name: String, msg: String = "Hi ${name.length}") = println("$msg $name")

greet("Tom", "Hello")
//greet(name = "Jerry")

