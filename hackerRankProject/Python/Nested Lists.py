# -*- coding: utf-8 -*-
name = []
score = []
n = int(input())
lowest = 1000
lowest2 = 1000
lowestRes = []
Res = []
for _ in range(n):
        auxName = input()
        auxScore = float(input())
        name.append(auxName)
        score.append(auxScore)
        if(auxScore<lowest):
            lowest2 = lowest
            lowest = auxScore
            #Res.clear()
            Res = lowestRes.copy()
            lowestRes.clear()
            lowestRes.append(auxName)
        elif(auxScore == lowest):
            lowestRes.append(auxName)
        elif(auxScore == lowest2):
            Res.append(auxName)
        elif(auxScore>lowest and auxScore<lowest2):
            lowest2 = auxScore
            Res.clear()
            Res.append(auxName)
Res.sort()
for _ in range(len(Res)):
        print(Res.pop(0))

