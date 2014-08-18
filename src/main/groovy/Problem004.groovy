//906609
int nbDigits = 3
long largestPalindrome = 0
long min = generateMin(nbDigits)
long max = generateMax(nbDigits)
println "min=$min max=$max"

for(i in min..max){
    for(j in min..max){
        long valueToTest = i * j
        if(!isPalindrome(valueToTest)){
            continue
        }

        if(valueToTest > largestPalindrome){
            largestPalindrome = valueToTest
        }
    }
}

println "Largest palindrome for $nbDigits is $largestPalindrome"

////////////////////////////////////////////////////////////////////

def long generateMin(int nbDigits){
    long value = 1
    for(i in 1..(nbDigits-1)){
        value = value * 10
    }
    return value
}

def long generateMax(int nbDigits){
    long value = 9
    for(i in 1..(nbDigits-1)){
        value = value * 10 +9
    }
    return value
}

def boolean isPalindrome(long number){
    String word = Long.toString(number)
    int i=0
    for(int j=word.length()-1; i<j; i++){
        char atI = word.charAt(i)
        char atJ = word.charAt(j)
        if(atI != atJ){
            return false
        }
        j--
    }
    return true
}
