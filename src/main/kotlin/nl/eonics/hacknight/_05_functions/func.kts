fun greet(msg: String = "hi", name: String) {
    println ("$msg $name")
}

greet("Hello", "Tom")
greet(name = "Tom", msg = "Hello" )
greet(msg = "Hello" ,name = "Tom" )
greet(name = "Jerry")
