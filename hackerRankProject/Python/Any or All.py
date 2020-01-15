N, numbers = int(input()), input().split()
print(all(int(num)>-1 for num in numbers) and any(j==j[::-1] for j in numbers))