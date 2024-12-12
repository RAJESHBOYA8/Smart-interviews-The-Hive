import statistics
from collections import Counter
a=int(input())
b=list(map(int,input().split()))
c=statistics.mean(b)
d=statistics.median(b)
cs=Counter(b)
e=cs.most_common(1)[0][0]
print(f"{c:.2f} {d:.2f} {e}")
