s = input(); 

def cal(s):
    for i in s:
        if i=='+':
            d = '+'
        if i=='-':
            d = '-'
        if i=='*':
            d = '*'
        if i=='/':
            d = '/'
        if i=='%':
            d = '%'
    lst = s.split(d)
    num1 = int(lst[0])
    num2 = int(lst[1])
    def sum(a, b):
        return a+b
    def sub(a, b):
        return a-b
    def mul(a, b):
        return a*b
    def div(a, b):
        return a/b
    def dir(a, b):
        return a%b

    dic = {"+": sum, "-": sub, "*": mul, "/": div, "%": dir}
    
    print("=", dic[d](num1, num2))

cal(s)