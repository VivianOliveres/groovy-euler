//232792560
long maxDivider = 20
println "Solve with maxDivider: $maxDivider"

long upperLimit = generateUpperLimit(maxDivider)
println "upperLimit is $upperLimit"
for(long number = maxDivider; number < upperLimit; number++){
    if(isDividedByAll(number, maxDivider)){
        println "Smallest divider for $maxDivider is $number"
        System.exit(0)
    }
}

println "No solution..."

///////////////////////////////////////////////////

def long generateUpperLimit(long maxDivider){
    long upperLimit = 1
    (1..maxDivider).each {upperLimit = upperLimit * it}
    return upperLimit
}

def boolean isDividedByAll(long i, long maxDivider) {
    for(long j = 1; j < maxDivider; j++){
        if(i % j == 0){
            continue
        } else {
            return false
        }
    }

    return true
}