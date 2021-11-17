import math;

def a():
    print("∃x ∈ Z, 0 ≤ x ≤ 100, x^2 = 15^2 + 16^2")
    for i in range(101):
        if i**2==15**2 + 16**2:
            print ("the given statement is correct when x equal to " + str(i))
            return
    print("the given statement is incorrect for all values x within the given domain.")

def b():
    print("∃x ∈ Z, 0 ≤ x ≤ 100, x^2 = 12^2 + 16^2")
    for i in range(101):
        if i**2==12**2 + 16**2:
            print ("the given statement is correct when x equal to " + str(i))
            return
    print("the given statement is incorrect for all values x within the given domain.")

def c():
    print("∃x ∈ Z, −50 ≤ x ≤ 50, x^2 ≥ 99x")
    for i in range(-50, 51):
        if i**2 >= 99*i:
            print ("the given statement is correct when x equal to " + str(i))
            return
    print("the given statement is incorrect for all values x within the given domain.")

def d():
    print("∃x ∈ Z, 50 ≤ x ≤ 100, x(x + 1)(x + 2)%6 != 0")
    for i in range(50, 101):
        if (i*(i+1)*(i+2))%6 != 0:
            print ("the given statement is correct when x equal to " + str(i))
            return
    print("the given statement is incorrect for all values x within the given domain.")

def e():
    print("∃x, y ∈ Z, 0 ≤ x ≤ 100, √(x + y) =√x + √y")
    for x in range(101):
        for y in range(101):
            if math.sqrt(x + y) == math.sqrt(x) + math.sqrt(y):
                print ("the given statement is correct when x equal to x=" + str(x) + " & y=" + str(y))
                return
    print("the given statement is incorrect for all values x within the given domain.")

e()