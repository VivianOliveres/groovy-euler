def number = 600_851_475_143
//def number = 10
List<Long> availablePrimeNumbers= []
List<Long> currentPrimeFactors = []
long rest = number

long upperBound = Math.round(Math.sqrt(number))
for(long i=2; i<upperBound; i++){
    if(isPrimeNumber(i, availablePrimeNumbers)){
        println "Find prime number: $i"
        availablePrimeNumbers << i
    }else{
        continue
    }

    // println "divideByPrimeNumber: $rest $currentPrimeFactors $i"
    rest = divideByPrimeNumber(rest, currentPrimeFactors, i)
    if(rest == 1){
        break
    }
}

def max = currentPrimeFactors.max()
println "Max of prime numbers: $max"

///////////////////////////////////////////////////////////////////

def boolean isPrimeNumber(long number, List<Long> availabePrimeNumbers){
    for(primeNumber in availabePrimeNumbers){
        if(number % primeNumber == 0){
            return false
        }
    }
    return true
}

def long divideByPrimeNumber(long rest, List<Long> currentPrimeFactors, long primeNumber){
    long subRest = rest
    while(subRest % primeNumber == 0){
        subRest = subRest / primeNumber
        currentPrimeFactors << primeNumber
        println "Add a new factor prime number: $primeNumber"
    }

    return subRest
}
