def a():
    print("∀x ∈ Z, 0 ≤ x ≤ 100, x^3 >= x") #  0 ≤ x ≤ 100 => x^3 < x
    for x in range(101):
        if x**3 < x:
            print("FALSE") 
            return; 
    print("TRUE")

def b():
    print("∀x ∈ Z, 0 ≤ x ≤ 100, and x is even, x ∗ 3 + 1 is a prime number") #  0 ≤ x ≤ 100 and x%2==0 => x ∗ 3 + 1 is NOT prime
    def checkPrime(x):
        if x <= 1:
            return True
        for i in (2, x/2):
            if x%i==0:
                return True
        return False

    for i in range(0, 101, 2):
        if checkPrime(i*3+1):
            print("FALSE") 
            return; 
    print("TRUE")

def c():
    print("∀x ∈ Z, 1 ≤ x, y ≤ 100, and x is even, x ∗ 5 + 3 is a prime number") # 1 ≤ x ≤ 100 and x is even => x ∗ 5 + 3 is NOT prime
    def checkPrime(x): 
        if x <= 1:
            return True
        for i in (2, x/2):
            if x%i==0:
                return True
        return False

    for i in range(2, 101, 2):
        if checkPrime(i*5+3):
            print("FALSE") 
            return; 
    print("TRUE")

def d():
    print("∀c ∈ Z, 0 < c ≤ 100, c%4 = 0, ∃a, b ∈ Z+, c^2 = a^2 + b^2")  # 0 < c ≤ 100 and c%4 = 0 => Va, b ∈ Z+; c^2 != a^2 + b^2
    for c in range(4, 101, 4):
        for a in range(1, 101):
            for b in range(1, 101):
                if c**2 == a**2 + b**2:
                    print ("False")
                    return
    print("TRUE") 

def e():
    print("∀c ∈ Z, 0 < c ≤ 100, c%5 = 0, ∃a, b ∈ Z+, c^2 = a^2 + b^2")  # 0 < c ≤ 100 and c%5 = 0 => Va, b ∈ Z+; c^2 != a^2 + b^2  
    for c in range(5, 101, 5):
        for a in range(1, 101):
            for b in range(1, 101):
                if c**2 == a**2 + b**2:
                    print ("False")
                    return
    print("True") 

def f():
    print("∃c ∈ Z, 0 < c ≤ 100, c^2 ≤ c") # ∃c ∈ Z, 0 < c ≤ 100 => c^2 > c
    for i in range(1, 101):
        if c**2 > c:
            print ("True")
            return
    print("False")