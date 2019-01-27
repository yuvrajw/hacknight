// Example taken from AgileDeveloper.com

class Car {
    var yearOfRegistration = 2010
        set(value) {
            if (value > 2019)
                throw IllegalArgumentException("can't register in the future")
            field = value // notice the keyword field
        }

    val yearsSinceRegistration
        get() = 2017 - yearOfRegistration
}

val car = Car()
println(car.yearOfRegistration)
car.yearOfRegistration = 2014

println(car.yearOfRegistration)
println(car.yearsSinceRegistration)

car.yearOfRegistration = 2020