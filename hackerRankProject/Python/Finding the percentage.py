n = int(input())
dictionary = {}
for _ in range(n):
    name, scoreMaths, scorePhysics, scoreChemistry = input().split()
    dictionary[name] = [float(scoreMaths), float(scorePhysics), float(scoreChemistry)]
pStudent = input()
average = sum(dictionary[pStudent]) / len(dictionary[name])
print("{0:.2f}".format(average))