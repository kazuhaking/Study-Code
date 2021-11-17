def formalConvert(S):
    if ', ' in S:
        ls = S.split(", ")
    else:
        ls = S.split("in")
    D = ls[0].replace('For all ', '').replace('Exist a ', '').replace('Exist an ', '').replace('There is at least one ', '').replace('Every ', '')
    P = getSen(ls[1])
    F = 'None formal form: For all x in D'
    if 'For all' in S:
        F = 'Formal form: For all x in D'     
    return [D, P, F]

def formalConvertPQ(S):
    S = S.replace('then ', ', ').replace('but ', ', ')
    ls = S.split(', ')
    D = ls[0].replace('For all ', '').replace('Exist a ', '').replace('Exist an ', '').replace('There is at least one ', '').replace('Every ', '').replace('For every ', '')
    P = getSen(ls[1])
    Q = getSen(ls[2])
    F = 'None formal form: For all x in D'
    if 'For all' in S:
        F = 'Formal form: For all x in D'
    return [D, P, Q, F]

def nega(A):
    if 'For' in A or 'Every' in A:
        A = A.replace('For', '').replace(' all ', 'Exist ').replace(' every ', 'Exist ').replace('Every ', 'Exist ')
    else:
        A = A.replace('Exist', '').replace(' a ', 'For all ').replace(' an ', 'For all ').replace('There is at least one ', 'For all ')
    A = getNega(A)
    return A



def getSen(s):
    key = ['need', "don't", 'is', 'are', 'can', 'did', 'study', 'have', 'live']
    for k in key:
        if k in s:
            return k + s.split(k)[1]
    return s

def getNega(s):
    key = [' need ', ' is', ' are', ' can', ' did']
    if ' not ' in s:
        return s.replace(' not ', ' ') 
    for k in key:
        if k in s:
            dem = k + ' not'
            s = s.replace(k, dem)
    return s


#Driver Code

print("Exercise 2 ----------------------------------------------------------------------------------")
S2 = [  "For all students, they need to attend classes and do homework", 
        "Exist a person, who is left handed", 
        "Exist an employee in the company, who is late to work everyday",
        "For all fishes in this pond, they are Koi fish",
        "There is at least one creature in the ocean, it can live on land",
        "Every students in class A did not pass the test"                   
]
for i in S2:
    print(formalConvert(i))

print("Exercise 4 ----------------------------------------------------------------------------------")
S4 = [  "For all people, if they are blond then they are westerners",
        "Exist a person, whose hair is black but is a westerner",
        "For all students, if they study correctly then they have high score",
        "For every mammal, if they live in the sea, they are either dolphins or whales",
        "For every bird, if they don’t have wings and can swim then they are penguins",
        "Exist a bird, who have wing but can’t fly"
]

for j in S4:
    print(formalConvertPQ(j))

print("Exercise 5 ----------------------------------------------------------------------------------")
S5 = S2
for k in S5:
    print(nega(k))

print("Exercise 6 ----------------------------------------------------------------------------------")
S6 = S4
for l in S6:
    print('This sentense : ' + l)
    print('|')

    [D, P, Q, F] = formalConvertPQ(l)

    d = 'For all '
    if 'For all' in l or 'For every' in l:
        d = 'Exist '
    q = Q
    if "'t" in Q:
        q = Q.replace("'t", '')
    else:
        q = 'not ' + Q
    print("Negation      : " + d + D, ',it ' + P, ' but ' + q)

    d = 'Exist '
    if 'For all' in l or 'For every' in l:
        d = 'For all '
    p = P
    if "'t" in P:
        p = P.replace("'t", '')
    else:
        p = 'not ' + P
    print("Contrapositive: " + d + D, ', if they ' + q + ' then they ' + p)

    print("Convert       : " + d + D, ', if they ' + Q + ', they ' + P)

    print("Invert        : " + d + D, ', if they ' + q + ', they ' + p)

    print("\n\n")