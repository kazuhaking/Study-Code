import lab2_1
from itertools import product

def partA():
    table = list(product([True, False], repeat=4))
    for p, q, r, s in table:
        if lab2_1.lAnd(lab2_1.lAnd((lab2_1.lImplies(p, r)), (lab2_1.lImplies(p, not q))), lab2_1.lImplies(q, s)) != lab2_1.lImplies(not r, s):
            print("INVALID");   return
    return "VALID"

def partB():
    table = list(product([True, False], repeat=5))
    for p, q, r, s, t in table:
        if lab2_1.lAnd(lab2_1.lAnd(lab2_1.lAnd(lab2_1.lImplies(p, lab2_1.lImplies(q, r)), lab2_1.lOr(p, s)), lab2_1.lImplies(t, q)), not s) != (lab2_1.lImplies(not r, not t)):
            print("INVALID");   return
    return "VALID"

def partC():
    table = list(product([True, False], repeat=4))
    for p, q, r, s in table:
        if lab2_1.lAnd(lab2_1.lAnd(lab2_1.lImplies(p, q), lab2_1.lOr(not r, s)), lab2_1.lOr(p, r)) != (lab2_1.lImplies(not q, s)):
            print("INVALID");   return
    return "VALID"

def partD():
    table = list(product([True, False], repeat=4))
    for p, q, r, s in table:
        if lab2_1.lAnd(lab2_1.lAnd(lab2_1.lAnd(p, lab2_1.lImplies(p, r)), lab2_1.lImplies(p, lab2_1.lOr(q, not r))), lab2_1.lOr(not q, not s)) != s:
            print("INVALID");   return
    return "VALID"

partA();    partB();    partC();    partD()