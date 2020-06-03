from itertools import combinations

def iterCombinations(string, k):
    string = list(string)
    string.sort()
    result = []
    while k > 0:
        result = result + list(combinations(string,k))
        k -=1
    result.sort()
    for i in sorted(result, key=len):
        print(''.join(i))


string, k = input().split() 
iterCombinations(string.upper(), int(k))

# sorted(result, key=len)