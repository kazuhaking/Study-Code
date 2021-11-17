from itertools import product
import lab2_1and2

table = list(product([True, False], repeat=3))

def p_and_q_imp_r(p, q, r):
    return lab2_1and2.lImplies(lab2_1and2.lAnd(p, q), r)

def r_imp_p_and_q(p, q, r):
    return lab2_1and2.lImplies(r, lab2_1and2.lAnd(p, q))

print("p", '\t', "q", '\t', "r", '\t', '\t',  "p^q->r", '\t',  "r->p^q")
for p, q, r in table:
    print(p, '\t', q, '\t', r, '\t','\t', p_and_q_imp_r(p,q,r), '\t', '\t', r_imp_p_and_q(p,q,r))