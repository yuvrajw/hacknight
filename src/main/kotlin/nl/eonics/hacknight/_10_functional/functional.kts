
//IntUnaryOperator doubleIt = x -> x * 2;
val double = { e: Int -> e * 2 } //

//System.out.println(doubleIt.applyAsInt(2));
println(double(2))

println("----")


//Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    .filter(it -> it % 2 == 0)
//    .map(doubleIt::applyAsInt)
//    .forEach(System.out::println);

listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    .filter { it % 2 == 0}
    .map(double)
    .forEach { println(it) }


val oldList = listOf("alpha", "beta", "gamma")

//List<String> newList = oldList.stream()
//    .filter( s -> s.startsWith("a") )
//.collect(Collectors.toList());

val newList = oldList.filter { it.startsWith("a") }
println(newList)

