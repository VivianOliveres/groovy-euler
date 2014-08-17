
def sum = 2
def n1 = 1
def n = 2
while (true){
    def n2 = n1
    n1 = n
    n = n1 + n2
    if(n > 4_000_000){
        println "result is $sum"
        System.exit(0)
    }

    if(n % 2 == 0){
        println "add $n"
        sum += n
    }
}
