// From AgileDeveloper.com

// for (int i = 1; i<= 10; i++)
for(x in 1..10) {
    println(x)
}

println("------")

// for (int i = 1; i< 10; i++)
for(x in 1 until 10) {
    println(x)
}
println("------")

// for (int i=1; i<=10; i+=2)
// increment by 2
for(x in 1..10 step 2) {
    println(x)
}
println("------")

//for (int i=10;i>0;i--)
for(x in 10 downTo 1) {
    println(x)
}
println("------")

//for (int i=10;i>0;i-=2)
// decrement by 2
for(x in 10 downTo 1 step 2) {
    println(x)
}
println("------")


val names = listOf("Jack", "Jill", "Tom", "Kate")

for(name in names) {
    println(name)
}
println("------")

for(index in names.indices) {
    println("$index -- ${names[index]}")
}