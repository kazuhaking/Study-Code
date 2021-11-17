def thieves(x):
    if x==1:
        return 1
    return x + thieves(x-1)

def richest(x):
    if x==1:
        return x
    return x + richest(x-1)

def waytochoose(n, k):
    if n==1:
        return 1
    return waytochoose(n-1, k) + waytochoose(n-1, k-1)

def countCharacterOfStory(n):
    if n==1:
        return 1
    return 2**(n-1) + countCharacterOfStory(n-1)

def F(n):
    if n<2:
        return 1
    return F(n-1) + F(n-2)

print(thieves(3))
print(richest(3))
print(waytochoose(3, 4))
print(countCharacterOfStory(4))
print(F(3))