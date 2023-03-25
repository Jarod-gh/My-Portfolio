import math
Nmax = int(input("Insert maximum number of iterations allowed: "))
a = float(input("Enter left interval value: "))
b = float(input("Enter right interval value: "))
convergence_tolerance = float(input("Enter convergence tolerance: "))

fa = float(math.tan(math.pi * a) - a - 6)   #Gives value when "a" is plugged in
fb = float(math.tan(math.pi * b) - b - 6)   #Gives value when "b" is plugged in
for x in range(1, Nmax):           #for loop start
    p = (a + b) / 2
    print("p value is", f'{p:.10f}')
    
    error = float((b - a) / 2)
    print("Error for iteration", f'{error:.10f}')
    
    if error < convergence_tolerance:    #if statement comparing error to ct
        print ("Answer is", f'{p:.10f}')
        break
    else:
        
        fp = float(math.tan(math.pi * p) - p - 6)
        if (fa * fp) < 0:                    #if statement to determine which interval side to replace
            b = p
        else:
            a = p
            fa = fp
    print()
    
if x > Nmax:
    print("Maximum number of iterations exceeded!")