import lab2_1
from itertools import product

def one():                                          # p EQUALS ~(~p)
    lst = [True, False]
    for i in lst:
        if not(not i)!=i:
            print("Không tương đương")
            return; 
    print("Tương đương")

def two():                                          # ~(~q^p)^(q^p) EQUALS q
    table = list(product([True, False], repeat=2))
    for p, q in table:
        if lab2_1.lAnd(not(lab2_1.lAnd(not q, p)), lab2_1.lOr(q, p))!=q:
            print("Không tương đương")
            return; 
    print("Tương đương")

def three():                                        # ~(pVq) EQUALS (~p V ~q)
    table = list(product([True, False], repeat=2))
    for p, q in table:
        if not(lab2_1.lOr(p, q))!=lab2_1.lOr(not p, not q):
            print("Không tương đương")
            return; 
    print("Tương đương")

def four():                                         # (pVq)->r EQUALS (p->r)^(q->r)
    table = list(product([True, False], repeat=3))
    for p, q, r in table:
        if lab2_1.lImplies(lab2_1.lOr(p, q), r)!=lab2_1.lAnd(lab2_1.lImplies(p,r), lab2_1.lImplies(q,r)):
            print("Không tương đương") 
            return; 
    print("Tương đương")

def five():                                         # ~(p^q) EQUALS (~p^~q)
    table = list(product([True, False], repeat=2))
    for p, q in table:
        if not(lab2_1.lOr(p, q))!=lab2_1.lOr(not p, not q):
            print("Không tương đương")
            return; 
    print("Tương đương")

def six():                                          # (pV~q)->~q EQUALS (pV~q)->~p
    table = list(product([True, False], repeat=2))
    for p, q in table:
        if lab2_1.lImplies(lab2_1.lOr(p, not q), not p)!=lab2_1.lImplies(lab2_1.lOr(p, not q), not p):
            print("Không tương đương")
            return; 
    print("Không tương đương")

def seven():                                        # ~(pVq) EQUALS ~p^~q
    table = list(product([True, False], repeat=2))
    for p, q in table:
        if not lab2_1.lOr(p, q) != lab2_1.lAnd(not p, not q):
            print("Không tương đương")
            return; 
    print("Tương đương")