s = input()

def cal(s):
    if '+' in s:
        lst = s.split('+')
        ans = (int(lst[0])+int(lst[1]))
    if '-' in s:
        lst = s.split('-')
        ans = (int(lst[0])-int(lst[1]))
    if '*' in s:
        lst = s.split('*')
        ans = (int(lst[0])*int(lst[1]))
    if '/' in s:
        lst = s.split('/')
        ans = (int(lst[0])/int(lst[1]))
    if '%' in s:
        lst = s.split('%')
        ans = (int(lst[0])%int(lst[1]))
    print("=", ans); 

cal(s)
