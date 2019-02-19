// return nullable
fun nickName(name: String): String? {
    if (name == "Thomas")
        return "Tom"
    return null
}

// nullable parameter
fun printSize(nickName: String?) {

//    println(nickName.length) //COMPILER ERROR

    // java style
    // nickName != null ? nickName.length() : 0
    println("Size is ${nickName?.length ?: 0}") // elvis
}

printSize(nickName("Thomas"))
printSize(nickName("Jerry"))
