input()
englishSet = set(map(int, input().split()))
input()
frenchSet = set(map(int, input().split()))
print(len(set(englishSet).symmetric_difference(set(frenchSet))))

