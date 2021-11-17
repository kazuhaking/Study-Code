n = int(input())

def sumN(n):
    sum = 0
    if n==0:
        print(sum)
    elif n>0:
        n+=1
        for i in range (0, n):
            sum += i; 
        print(sum)
    else:
        for i in range (n, 1):
            sum += i; 
        print(sum)

sumN(n)