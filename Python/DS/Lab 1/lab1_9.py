p = input()
q = input()

def ithCombine(p, q):
    print("if", p,", then", q); 

def panqCombine(p, q):
    print(p, ", and", convert(q))

def npoqCombine(p, q):
    print(convert(p), "or", q)

def convert(n):
    lst = n.split(" ")
    ans = ""
    i = 0; 
    while i!=len(lst):
        if i==1:
            ans = ans + " not " + lst[i]
        else:
            ans = ans + lst[i] + " "
        i += 1
    return ans; 
        
ithCombine(p, q)
panqCombine(p, q)
npoqCombine(p, q)