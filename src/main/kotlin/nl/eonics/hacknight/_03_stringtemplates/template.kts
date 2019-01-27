val name = "Tom"
println("Hello $name !")


// multi-line
val msg = """
  |This message was created by $name and
  |is being presented
  |at the hacknight at Eonics
"""

println(msg)

//println(msg.trimMargin())
//println(msg.trimMargin("|")) // | is the default.
