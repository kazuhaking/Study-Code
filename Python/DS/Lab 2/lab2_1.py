def lImplies(p, q):
    if p:   return q
    return True

def lAnd(p, q):
    if p==q:    return p
    return False

def lOr(p, q):
    if p==q:    return p
    return True

def lXor(p, q):
    if p!=q:    return True
    return False

def lNot(p):
    return not p

def lEquivalent(p, q):
    if p==q:    return True
    return False

# Driver Code