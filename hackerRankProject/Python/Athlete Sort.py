import math
import os
import random
import re
import sys


n , m= map(int, input().split())
arr = [input() for _ in range(n)]
k = int(input())
for row in sorted(arr, key = lambda row: int(row.split()[k])):
    print(row)
