import math
Nmax = int(input("Insert maximum number of iterations allowed: "))
a = float(input("Enter left interval value: "))
b = float(input("Enter right interval value: "))
convergence_tolerance = float(input("Enter convergence tolerance: "))

fa = float(math.tan(math.pi * a) - a - 6)   #Gives value when "a" is plugged in
fb = float(math.tan(math.pi * b) - b - 6)   #Gives value when "b" is plugged in
polder = b
pold = b

for x in range(1, Nmax):           #for loop start
    p = float(b - fb * ((b - a) / (fb - fa)))
    print("p value is", f'{p:.10f}')
    
    if (x > 2):                    #for loop calculating error
        landa = float((p - pold) / (pold - polder))
        error = float(abs(landa * (p - pold) / (landa - 1)))
        print("Error value is", f'{error:.10f}')
        
        if error < convergence_tolerance:    #stopping condition if statement
            print("Final P value is", f'{p:.10f}')
            break
        
    fp = float(math.tan(math.pi * p) - p - 6)
    if (fa * fp) < 0:            #if statement assigning new values
        b = p
        fb = fp
    else:
        a = p
        fa = fp
        
        polder = pold
        pold = p
    print()

if x > Nmax:
    print("Maximum number of iterations exceeded")