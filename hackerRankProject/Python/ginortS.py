import string
order = string.ascii_letters + '1357902468'
print( *sorted(input(), key = order.index), sep=' ')