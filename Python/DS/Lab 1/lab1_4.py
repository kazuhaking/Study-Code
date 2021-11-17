s = input()
lst = s.split()

def delSpace(lst):
    ans = ""
    for i in lst:
        ans = ans + i
    print(ans)

def repSpace(lst):
    ans =  ""
    for i in lst:
        if i==(lst[len(lst)-1]):
            ans = ans + i
        else:
            ans = ans + i + "_"
    print(ans)

delSpace(lst)
repSpace(lst)