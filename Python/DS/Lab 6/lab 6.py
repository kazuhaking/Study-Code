import math;

def nextPrime(n):
    flag = True
    i = n+1
    while(flag):
        for k in range(i):
            if i%k==0:
                flag = True
                i = i + 1
                break
        flag = False
    return i
   

def primeFactors(n): 
    while n % 2 == 0:
        print(2),
        n = n / 2
    for i in range(3,int(math.sqrt(n))+1,2):
        while n % i== 0:
            print(i),
            n = n / i
    if n > 2:
        print(n)

def checkPrime(n):
    for i in range(2, n+1):
        if n%i==0:
            return False
    return True

def printPrime(n):
    flag = False
    if n<2:
        return
    for i in range(2, n+1):
        if checkPrime(i)==True:
            print(i)
        
def gcd(a, b):
    while a!=b:
        if(a>b):
            a = a - b
        else:
            b = b - a
    return a

def lcm(a, b):
    return a*b / gcd(a, b)

def dec2bin(n):
    if n >= 1:
        dec2bin(n // 2)
    print(n % 2, end = '')

def dec2hex(n):
    return hex(n)

def convertbase(a,base1,base2):
    ans1 = ans2 = -1
    if base1==10:
        ans1= int(ans1, 2)
    if base1==16:
        ans1 = oct(ans1)
    else:  
        ans1 = ans1
    if base2==10:
        ans2= int(ans2, 2)
    if base2==16:
        ans2 = oct(ans2)
    else:  
        ans2 = ans2
    return ans1, ans2