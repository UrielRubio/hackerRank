Nstudent, Xsubjects = map(int,input().split())
Subject = []
for i in range(Xsubjects):
    Subject.append(map(float, input().split()))
#print(Subject)

for i in zip(*Subject):
    print( sum(i)/len(i) )





#
# ####################   EXAMPLE      ###########################
# print( zip([1,2,3,4,5,6],'Hacker'))
# #[(1, 'H'), (2, 'a'), (3, 'c'), (4, 'k'), (5, 'e'), (6, 'r')]
#
# print( zip([1,2,3,4,5,6],[0,9,8,7,6,5,4,3,2,1]))
# #[(1, 0), (2, 9), (3, 8), (4, 7), (5, 6), (6, 5)]
#
# A = [1,2,3]
# B = [6,5,4]
# C = [7,8,9]
# X = [A] + [B] + [C]

#print( zip(*X))
#[(1, 6, 7), (2, 5, 8), (3, 4, 9)]