def a():
    print("∀x ∈ {0, 10}; ∀y ∈ {0, 10}, (x + y)^2 > (x + 2y)^2")
    for x in range(11):
        for y in range(11):
            if (x + y)**2  <= (x + 2*y)**2:
                print("FALSE")
                return
    print("TRUE")

def b():
    FACTORIAL20 = 2432902008176640000
    print("∀x ∈ {0, 10}; x! > 20!")
    for i in range(11):
        fac = 1
        for x in range(1, i+1):
            fac*=i
        if fac < FACTORIAL20:
            print ("False")
            return
    print ("True")

def c():
    print("∀x ∈ {0, 10}; 3x^2 >= 10^3")
    for x in range(11):
        if 3*x**2 < 1000:
            print("False")
            return
    print("True")


def d():
    print("∀x ∈ {5, 10}; 4x^3 + 6x^2 + 2x  >  10^4 + 2 * 10^3 + 10^2 - 5^4 - 2*5^3 - 5^2")
    for x in range(5, 11):
        if 4*x**3 + 6*x**2 + 2*x <= 10000 + 1000 + 100 - 5**4 - 2*5**3 - 25:
            print("False")
            return
    print("True")
