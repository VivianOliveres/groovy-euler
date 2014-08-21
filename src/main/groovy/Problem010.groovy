//142913828922
long max = 2_000_000
List<Long> primeNumbers = []
long sum = 2+3
for(i in 4..max){
    if(isPrimeNumber(i)){
        primeNumbers << i
        sum += i
    }
}

println "Sum of all prime numbers under $max is $sum"

///////////////////////////////////////////////////////////////

def boolean isPrimeNumber(long number){
    int square = Math.sqrt(number)
    for(i in 2..square){
        if(number % i == 0){
            return false
        }
    }

    println "Find another prime number: $number"
    return true
}