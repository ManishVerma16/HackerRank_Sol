from itertools import permutations

def iterPermutation(string, k):
    result = list(permutations(string, k))
    result.sort()
    for i in result:
        print(''.join(i)) 
        

string, k = input().split()
iterPermutation(string, int(k))