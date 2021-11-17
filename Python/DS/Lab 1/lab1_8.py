A = [[12,73,13],
     [41,52,56],
     [72,81,29]]

B = [[50,81,11],
     [60,71,13],
     [40,51,19]]

C = [[0,0,0],
     [0,0,0],
     [0,0,0]]

def mulMatrix(X, Y):
    if len(X[0])!=len(Y[0]) or len(X)!=len(Y):
        print("Matrix dimension error")
    else:
        result = [[X[i][j] * Y[i][j]  for j in range(len(X[0]))] for i in range(len(X))]
        for r in result:
            print(r)

mulMatrix(A, B)
