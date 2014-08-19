//25164150
long firstNumbers = 100
println "firstNumbers = $firstNumbers"

long sum = 0
long sumOfSquares = 0
(1..firstNumbers).each {
    sum += it
    sumOfSquares += it * it
}

long squareOfSum = sum * sum
long diff = squareOfSum - sumOfSquares
println "Solution is $diff"