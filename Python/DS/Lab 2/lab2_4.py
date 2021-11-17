import lab2_1
from itertools import product

def one(p, q):              # pVq -> p^q -> ~pV~q
    return lab2_1.lImplies(lab2_1.lImplies(lab2_1.lOr(p, q), lab2_1.lAnd(p, q)), lab2_1.lOr(not q, not p))

def two(p, q, r):           # ~pV(q^r) -> r
    return lab2_1.lImplies(lab2_1.lOr(not p, lab2_1.lAnd(q, r)), r)

def three(p, q, r):         # (p->q) ^ (q->r)
    return lab2_1.lAnd(lab2_1.lImplies(p, q), lab2_1.lImplies(q, r))

def four(p, q, r):          # (pV(q^r)) <-> ((pVq)^(pVr))
    return lab2_1.lEquivalent((lab2_1.lOr(p, lab2_1.lAnd(q,r))),(lab2_1.lAnd(lab2_1.lOr(p,q),lab2_1.lAnd(p,r))))

def five(p, q, r, t):       # pVq -> ~rVt
    return lab2_1.lImplies(lab2_1.lOr(p, q), lab2_1.lOr(not r, t))

def six(p, q, r, t):        # pVt -> q -> (r->t)
    return lab2_1.lImplies(lab2_1.lImplies(lab2_1.lOr(p,t),q), lab2_1.lImplies(r,t))

def seven(p, q, r, t):      # (pV(q^r) <-> (((pVq)^(pVr))^(tV~t)))
    return lab2_1.lEquivalent(lab2_1.lOr(p, lab2_1.lAnd(q, r)), lab2_1.lAnd(lab2_1.lAnd(lab2_1.lOr(p,q),lab2_1.lOr(p,r)), lab2_1.lOr(t, not t)))


#Driver Code
table2 = list(product([True, False], repeat=2))
table3 = list(product([True, False], repeat=3))
table4 = list(product([True, False], repeat=4))

print("p", '\t', "q", '\t',  "pVq -> p^q -> ~pV~q")
for p, q in table2:
    print(p, '\t', q, '\t', one(p,q))

print("p", '\t', "q", '\t', "r", '\t', "~pV(q^r) -> r")
for p, q, r in table3:
    print(p, '\t', q, '\t', r, '\t', two(p,q,r))

print("p", '\t', "q", '\t', "r", '\t', "(p->q) ^ (q->r)")
for p, q, r in table3:
    print(p, '\t', q, '\t', r, '\t', three(p,q,r))

print("p", '\t', "q", '\t', "r", '\t', "(pV(q^r)) <-> ((pVq)^(pVr))")
for p, q, r in table3:
    print(p, '\t', q, '\t', r, '\t', four(p,q,r))

print("p", '\t', "q", '\t', "r", '\t', "t", "\t", "(p->q) ^ (q->r)")
for p, q, r, t in table4:
    print(p, '\t', q, '\t', r, '\t', t, "\t", five(p,q,r,t))

print("p", '\t', "q", '\t', "r", '\t', "t", "\t", "(p->q) ^ (q->r)")
for p, q, r, t in table4:
    print(p, '\t', q, '\t', r, '\t', t, "\t", six(p,q,r,t))

print("p", '\t', "q", '\t', "r", '\t', "t", "\t", "(p->q) ^ (q->r)")
for p, q, r, t in table4:
    print(p, '\t', q, '\t', r, '\t', t, "\t", seven(p,q,r,t))