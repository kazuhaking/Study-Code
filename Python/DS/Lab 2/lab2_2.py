import lab2_1

lst = []

def lLImplies(P, Q):
    for p, q in zip(P, Q):
        lst.append(lab2_1.lImplies(p, q))
    return lst

def lLAnd(P, Q):
    for p, q in zip(P, Q):
        lst.append(lab2_1.lAnd(p, q))
    return lst

def lLOr(P, Q):
    for p, q in zip(P, Q):
        lst.append(lab2_1.lOr(p, q))
    return lst

def lLXor(P, Q):
    for p, q in zip(P, Q):
        lst.append(lab2_1.lXor(p, q))
    return lst

def lLNot(P):
    for p in P:
        lst.append(not p)
    return lst

def lLEquivalent(P, Q):
    for p, q in zip(P, Q):
        lst.append(lab2_1.lEquivalent(p, q))
    return lst

# Driver Code