# -*- coding: utf-8 -*-
n = int(input())
A = input().split()
bestRunner = -101
runnerUp = -101
for i in range(n):
    if(int(A[i]) > bestRunner):
        runnerUp = bestRunner
        bestRunner = int(A[i])
    elif(int(A[i]) < bestRunner and int(A[i]) > runnerUp):
        runnerUp = int(A[i])
print(runnerUp)
# 
# =============================================================================
# 5
# 2 3 6 6 5

#    4

#    57 57 -57 57
# =============================================================================
