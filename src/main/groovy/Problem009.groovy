//31875000
for(a in 1..1000){
    for(b in 1..1000){
        for(c in 1..1000){
            if(a+b+c != 1000){
                continue
            }

            long squareA = a*a
            long squareB = b*b
            long squareC = c*c
            if(squareA + squareB == squareC){
                println "Solution is a=$a b=$b c=$c"
                println "a x b x c = ${a*b*c}"
                System.exit(0)
            }
        }
    }
}

println "No solution :'("