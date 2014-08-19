//104743
long indexOfPrimeNumber = 10001
List<Long> primeNumbers = []
for(long number=2; number < Long.MAX_VALUE; number++){
    if(isPrimeNumber(number, primeNumbers)) {
        // Add new PrimeNumber to already discovered
        primeNumbers << number

        // Check if this is the one that we are looking for
        if(primeNumbers.size() == indexOfPrimeNumber){
            println "The $indexOfPrimeNumber st prime number is $number"
            System.exit(0)
        }
    }
}

println "Can not find any solution :'("

//////////////////////////////////////////////////////////////////////////

def boolean isPrimeNumber(long number, List<Long> primeNumbers){
    for(primeNumber in primeNumbers){
        //println "number[$number] primeNumber[$primeNumber]"
        if(number % primeNumber == 0){
            return false
        }
    }

    //println "Find another prime number: $number"
    return true
}