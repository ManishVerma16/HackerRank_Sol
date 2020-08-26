def hashFunction(t):
    print(abs(hash(t)))

n = int(input())
t = tuple(map(int, input().split()))
hashFunction(t)
