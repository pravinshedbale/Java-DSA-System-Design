# Assignment3 (Complexity Analysis and Array)

### **1. Analyze the time complexity of the following Java code and suggest way to improve it?**

```
int sum = 0;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        sum++;
    }
}
```

#### between 1 and n (inclusive) and j is between 1 and i (inclusive).

#### For each pair (i, j), the code increments the variable sum by 1.

#### At the end of the loop, the variable sum will contain the sum of all integers from 1 to n.

#### The time complexity of this algorithm is O(n^2) because it has two nested loops that each iterate n times.

#### optimization that can be made is to use a formula for the sum of integers from 1 to n, which is n(n+1)/2. By using this formula, we can avoid the nested loop and calculate the sum directly in O(1) time complexity. Here's the updated code:

```
int sum = n * (n + 1) / 2;
```

<br/>

### **2. Find the value of T(2) for the recurrence relation T(n) = 3T(n-1) + 12n, given that T(0) = 5**

```
To find the value of T(2) for the given recurrence relation, we need to work our way up from the initial condition T(0) = 5 using the recurrence relation.

T(0) = 5 (given)
T(1) = 3T(0) + 12(1) = 3(5) + 12(1) = 15 + 12 = 27
T(2) = 3T(1) + 12(2) = 3(27) + 12(2) = 81 + 24 = 105

Therefore, the value of T(2) is 105.
```

<br/>

### **3. Given a recurrence relation, solve it using substitution method. Relation : T(n) = T(n-1) + c**

```
T(n) = T(n-1) + c
= T(n-2) + c + c
= T(n-3) + c + c + c
= ...
= T(n-k) + kc

We can choose k = n-1 to obtain:

T(n) = T(1) + (n-1)c

Since T(1) is a constant, we can say that the time complexity of T(n) is O(n).
```

<br/>

### **4. Given recurrence relation : T(n) = 16T(n/4) + n2logn, find the complexity ot this using the master theorem**

```
From the given recurrence relation we can obtain the value of different parameters such as a, b, p and k

The relation is : T(n) = 16T(n/4) + n2logn

Here a = 16,
b = 4,
k = 2,
p = 1
bk = 42 = 16
here a = bk
Also p > -1
Hence T(n) = θ(nlogab*logp+1n)
Therefore T(n) = θ(nlog164*log1+1n) = θ(n1/2log2n)
```

<br/>

### **5. Solve the following recurrence relation using recursion tree method T(n) = 2T(n/2) + n?**

1. Draw a recursion tree based on the given recurrence relation, The given recurrence relation shows

- A problem of size n will get divided into 2 sub-problems of size n/2.
- Then, each sub-problem of size n/2 will get divided into 2 sub-problems of size n/4 and so on.
- At the bottom most layer, the size of sub-problems will reduce to 1.

#### This is illustrated through following recursion tree

```
                T(n)
              /     \
             /       \
            /         \
        T(n/2)        T(n/2)
         / \           /  \
        /   \         /    \
       /     \       /      \
   T(n/4)   T(n/4)  T(n/4)  T(n/4)
                .
                .
                .
```

#### The given recurrence relationn shows

- The cost of dividing a problem of size n into its 2 sub-problems and then combining its solution is n.
- The cost of dividing a problem of size n/2 into its 2 sub-problems and then combining its solution is n/2 and so on.

#### This is illustrated through following recursion tree where each node represents the cost of the corresponding sub-problem-

<br/>

```
                 n
              /     \
             /       \
            /         \
          n/2          n/2
         / \           /  \
        /   \         /    \
       /     \       /      \
      n/4   n/4      n/4  n/4
                .
                .
                .
```

2. Determine cost of each level

- Cost of level-0 = n
- Cost of level-1 = n/2 + n/2 = n
- Cost of level-2 = n/4 + n/4 + n/4 + n/4 = n and so on.

3. Determine total number of levels in the recursion tree-

- Size of sub-problem at level-0 = n/20
- Size of sub-problem at level-1 = n/21
- Size of sub-problem at level-2 = n/22

```
Continuing in similar manner, we have-

Size of sub-problem at level-i = n/2i

Suppose at level-x (last level), size of sub-problem becomes 1. Then-

n / 2x = 1

2x = n

Taking log on both sides, we get-

xlog2 = logn

x = log2n

∴ Total number of levels in the recursion tree = log2n + 1
```

4. Determine number of nodes in the last level-

- Level-0 has 20 nodes i.e. 1 node
- Level-1 has 21 nodes i.e. 2 nodes
- Level-2 has 22 nodes i.e. 4 nodes

Continuing in similar manner, we have-

```
Level-log2n has 2log2n nodes i.e. n nodes
```

5. Determine cost of last level-

```
Cost of last level = n x T(1) = θ(n)

```

6. Add costs of all the levels of the recursion tree and simplify the expression so obtained in terms of asymptotic notation-Add costs of all the levels of the recursion tree and simplify the expression so obtained in terms of asymptotic notation-

```
T(n) = {n + n + n +....} + θ(n)
= n x log2n + θ (n)
= nlog2n + θ (n)
= θ (nlog2n)
```

### **6. T(n) = 2T(n/2) + K, solve using recurrence tree method**

1. Draw a recursive tree

```
                T(n)
              /     \
             /       \
            /         \
        T(n/2)        T(n/2)
         / \           /  \
        /   \         /    \
       /     \       /      \
   T(n/4)   T(n/4)  T(n/4)  T(n/4)
                .
                .
                .
```

2.  Calculate the work done or cost at each level and count total no of levels in recursion tree

```

                 n                  K = 2^0K
              /     \
             /       \
            /         \
          n/2          n/2          K+K = 2^1K
         / \           /  \
        /   \         /    \
       /     \       /      \
      n/4   n/4      n/4  n/4       K+K+K+K = 2^2K
                .
                .
                .

```

- Count the total number of levels
- Choose the longest path from root node to leaf node

```
 n/2^0 → n/2^1 → n/2^2 → ……… → n/2k

```

- Size of problem at last level = n/2k
- At last level size of problem becomes 1

```
n/2^k = 1
2^k = n
k = log2(n)
```

- Total no of levels in recursive tree = k +1 = log2(n) + 1

3. Count total number of nodes in the last level and calculate cost of last level

```
No. of nodes at level 0 = 2^0 = 1

No. of nodes at level 1 = 2^1 = 2

………………………………………………………

No. of nodes at level log2(n) = 2^(log2(n)) = n^(log2(2)) = n

Cost of sub problems at level log2(n) (last level) = nxT(1) = nx1 = n
```

4. Sum up the cost all the levels in recursive tree

```
T(n) = K + 2K + 4K + —- + (no. of levels-1) times + last level cost

= K + 2K + 4K + —- + log2(n) times + Θ(n)

= K(1 + 2 + 4 + —- + log2(n) times) + Θ(n)

1 + 2 + 4 + —– + log2(n) times –> 2^0 + 2^1 + 2^2 + —– + log2(n) times –> Geometric Progression(G.P.)

= c(n) + Θ(n)
```

#### Hence, T(n) = Θ(n)
