# MY DSA PROGRESS

A comprehensive Data Structures and Algorithms learning repository with organized solutions, implementations, and practice problems across multiple DSA topics.

---

## 📚 Table of Contents

1. [Loops](#1-loops)
2. [Patterns](#2-patterns)
3. [Functions](#3-functions)
4. [Arrays](#4-arrays)
5. [2D Arrays](#5-2d_array)
6. [Strings](#6-string)
7. [Sorting](#7-sorting)
8. [Bit Manipulation](#8-bit-manipulation)
9. [ArrayList](#9-arraylist)
10. [OOPs](#10-oops)
11. [Recursion](#11-recursion)
12. [Divide and Conquer](#12-divide-and-conquer)
13. [Backtracking](#13-backtracking)
14. [Linked Lists](#14-linked-lists)
15. [Stacks](#15-stacks)
16. [Queues](#16-queues)
17. [Greedy Approach](#17-greedy-approach)
18. [Binary Trees](#18-binary-trees)
19. [Heaps](#19-heaps)
20. [Hashing](#20-hashing)
21. [Maths for DSA](#21-maths-for-dsa)
22. [Binary Search Trees](#22-binary-search-trees)
23. [Tries](#23-tries)
24. [Graphs](#24-graphs)
25. [Dynamic Programming](#25-dynamic-programming)
26. [Segment Trees](#26-segment-trees)
27. [Codeforces Problems](#27-codeforces-problems)
28. [Practice Questions](#28-practice-questions)

---

## 1. LOOPS

| # | Problem | File | Description |
|---|---------|------|-------------|
| 1 | Loop Fundamentals | `1.LOOPS` | Basic loop constructs and iterations |

**Notes:**
- Foundation for all iterative algorithms
- Essential for understanding time complexity

---

## 2. PATTERNS

### Patterns 1 & Patterns 2

| # | Topic | Description |
|---|-------|-------------|
| 1 | Number Patterns | Pyramid and triangle patterns |
| 2 | Star Patterns | Various star arrangements |
| 3 | Hollow Patterns | Box and hollow rectangle patterns |
| 4 | Diamond Patterns | Diamond shaped outputs |

**Key Concepts:**
- Nested loops for 2D pattern generation
- Understanding row and column relationships
- Print statement optimization

---

## 3. FUNCTIONS

| # | Concept | Description |
|---|---------|-------------|
| 1 | Function Declaration | Basic function syntax |
| 2 | Parameters & Return | Passing arguments and returning values |
| 3 | Method Overloading | Multiple functions with same name |
| 4 | Scope & Variables | Local and global scope |

---

## 4. ARRAYS

| # | Problem | Approach | Time | Space |
|---|---------|----------|------|-------|
| 1 | Array Basics | Direct access using indices | O(1) | O(1) |
| 2 | Linear Search | Traverse and find | O(n) | O(1) |
| 3 | Binary Search | Divide and conquer on sorted array | O(log n) | O(1) |
| 4 | Prefix Sum | Array preprocessing | O(n) | O(n) |
| 5 | Subarray Problems | Range queries optimization | O(n) | O(n) |

**Key Algorithms:**
- Array traversal patterns
- Two-pointer technique
- Sliding window approach

---

## 5. 2D_ARRAY

| # | Problem | Key Technique | Difficulty |
|---|---------|----------------|------------|
| 1 | Matrix Search | 2D traversal | Easy |
| 2 | Matrix Rotation | In-place rotation | Medium |
| 3 | Diagonal Sum | Pattern recognition | Easy |
| 4 | Row-wise & Column-wise Search | Optimization | Medium |

**Approaches:**
- Nested loops for 2D traversal
- Starting from corners for optimized search
- Spiral matrix traversal patterns

---

## 6. STRING

| # | Problem | Algorithm | Complexity |
|---|---------|-----------|-----------|
| 1 | String Basics | Character array operations | O(n) |
| 2 | Palindrome Check | Two pointer | O(n) |
| 3 | Anagram | Sorting/Hashing | O(n log n) / O(n) |
| 4 | String Compression | Character frequency | O(n) |
| 5 | Pattern Matching | KMP/Naive | O(n+m) |

**Key Concepts:**
- Immutability of strings
- Character frequency counting
- String manipulation techniques

---

## 7. SORTING

| Algorithm | File | Time Complexity | Space | Stable |
|-----------|------|-----------------|-------|--------|
| Bubble Sort | `7.Sorting/` | O(n²) | O(1) | Yes |
| Selection Sort | `7.Sorting/` | O(n²) | O(1) | No |
| Insertion Sort | `7.Sorting/` | O(n²) | O(1) | Yes |
| Merge Sort | `7.Sorting/` | O(n log n) | O(n) | Yes |
| Quick Sort | `7.Sorting/` | O(n log n) avg | O(log n) | No |
| Counting Sort | `7.Sorting/` | O(n+k) | O(k) | Yes |
| Radix Sort | `7.Sorting/` | O(nk) | O(n+k) | Yes |

**Important Notes:**
- Merge sort guaranteed O(n log n), stable
- Quick sort fastest average case, in-place
- For small arrays, insertion sort often fastest in practice
- Counting sort for limited range of integers

---

## 8. BIT MANIPULATION

| # | Problem | Technique | Use Case |
|---|---------|-----------|----------|
| 1 | Check Bit | `(n >> i) & 1` | Verify if bit set |
| 2 | Set Bit | `n \| (1 << i)` | Set i-th bit to 1 |
| 3 | Unset Bit | `n & ~(1 << i)` | Set i-th bit to 0 |
| 4 | Toggle Bit | `n ^ (1 << i)` | Flip i-th bit |
| 5 | Count Bits | Brian Kernighan's Algorithm | Count set bits |
| 6 | Power of 2 | `(n & (n-1)) == 0` | Check if power of 2 |
| 7 | XOR Properties | `a ^ a = 0, a ^ 0 = a` | Swap without temp |

**Key Insights:**
- XOR used for finding single element in pairs
- Bit masking for efficient storage
- Bitwise operations faster than arithmetic

---

## 9. ARRAYLIST

### `16.arraylist/pairsum2.java`

**Problem: Pair Sum in Rotated Sorted Array**

```
Input: [11, 15, 6, 8, 9, 10], target = 16
Output: Find pair that sums to target
```

| Aspect | Details |
|--------|---------|
| **Algorithm** | Two Pointer on Rotated Array |
| **Approach** | Find pivot point → Use circular two pointers |
| **Time Complexity** | O(n) |
| **Space Complexity** | O(1) |
| **Key Insight** | In rotated sorted array, find breaking point then apply two pointer |

**Code Explanation:**
- Find index `j` where `arr[j] > arr[j+1]` (breaking point)
- Right Pointer (RP) = j, Left Pointer (LP) = j+1
- Use modulo arithmetic to wrap around
- Move LP forward if sum too small, RP backward if sum too large

**Key Formula:**
```
LP = (LP + 1) % n  // Move forward with wrapping
RP = (n + RP - 1) % n  // Move backward with wrapping
```

---

## 10. OOPS

### `10.OOPs/abstraction.java`

| Concept | Implementation | Purpose |
|---------|----------------|---------|
| **Encapsulation** | Private fields, Public getters/setters | Hide internal details |
| **Inheritance** | `extends` keyword | Code reusability |
| **Polymorphism** | Method overriding | Runtime behavior change |
| **Abstraction** | Abstract classes & interfaces | Define contracts |

**Key Topics:**
- Classes and Objects
- Access Modifiers (public, private, protected)
- Constructors and Destructors
- Static vs Instance members
- Abstract methods and classes
- Interfaces and implementations

---

## 11. RECURSION

### `12.Reccursion-1`

**Basic Recursion Concepts:**

| Problem | Pattern | Approach |
|---------|---------|----------|
| Factorial | Mathematical | Base case: n==0, return 1 |
| Fibonacci | Overlapping subproblems | Memoization for optimization |
| Power | Divide & Conquer | f(n) = f(n/2) * f(n/2) |
| Sum of Array | Linear Recursion | Sum = first + sum(rest) |

### `13.Reccursion-2`

#### `13.Reccursion-2/tilingProblem.java`

**Problem: Tiling a 2×n Board with 1×2 Tiles**

```
For n=4:
Possible tilings = 5

Recurrence: f(n) = f(n-1) + f(n-2)
```

| Aspect | Details |
|--------|---------|
| **Problem** | How many ways to tile 2×n board with 1×2 tiles? |
| **Recurrence** | f(n) = f(n-1) + f(n-2) |
| **Base Cases** | f(0)=1, f(1)=1 |
| **Time Complexity** | O(2^n) - Exponential |
| **Optimization** | Use DP - O(n) |
| **Space Complexity** | O(n) with DP |

**Intuition:**
- At position n, we can place either:
  - One vertical tile (1×2) → remaining n-1
  - Two horizontal tiles (1×1 each rotated) → remaining n-2
- Total = f(n-1) + f(n-2)

**Example:**
```
n=1: 1 way (one vertical)
n=2: 2 ways (two vertical OR two horizontal)
n=3: 3 ways
n=4: 5 ways
```

---

## 12. DIVIDE AND CONQUER

| Algorithm | Problem | Complexity | Strategy |
|-----------|---------|-----------|----------|
| Merge Sort | Sorting | O(n log n) | Split + Merge |
| Quick Sort | Sorting | O(n log n) avg | Partition + Recurse |
| Binary Search | Search Sorted | O(log n) | Split space in half |
| Strassen | Matrix Mult | O(n^2.81) | Smart multiplication |

---

## 13. BACKTRACKING

| Problem | Approach | Time | Space |
|---------|----------|------|-------|
| N-Queens | Place queens safely | O(N!) | O(N) |
| Sudoku | Fill valid digits | Exponential | O(1) |
| Permutations | Generate all | O(N!) | O(N) |
| Combinations | Generate subsets | O(2^N) | O(N) |
| Maze | Find path | Exponential | O(N²) |

**Key Pattern:**
1. Choose → Explore → Unchoose (Backtrack)
2. Maintain constraints/visited state
3. Early termination on invalid state

---

## 14. LINKED LISTS

### `17.LinkedList-1/LinkedList.java`

**Basic Linked List Operations:**

| Operation | Code | Time | Space |
|-----------|------|------|-------|
| **Add First** | Insert at head | O(1) | O(1) |
| **Add Last** | Insert at tail | O(1) | O(1) |
| **Print LL** | Traverse all nodes | O(n) | O(1) |
| **Remove First** | Delete from head | O(1) | O(1) |
| **Search** | Linear search | O(n) | O(1) |
| **Reverse** | Reverse pointers | O(n) | O(1) |

### `18.LinkedList-2/LinkedList.java`

**Advanced Operations:**

| Operation | Complexity | Notes |
|-----------|-----------|-------|
| `addAtIndex(int idx)` | O(n) | Insert at specific position |
| `removeStart()` | O(1) | Delete from beginning |
| `removeEnd()` | O(n) | Delete from end |
| `removeAtIndex(int idx)` | O(n) | Delete at specific index |

#### `18.LinkedList-2/mergeSortInLL.java`

**Problem: Merge Sort on Linked List**

```
Input: 3 -> 2 -> 5 -> 1 -> null
Output: 1 -> 2 -> 3 -> 5 -> null
```

| Aspect | Details |
|--------|---------|
| **Algorithm** | Merge Sort using slow & fast pointers |
| **Get Middle** | Slow pointer moves 1 step, fast moves 2 steps |
| **Divide** | Split list into two halves recursively |
| **Merge** | Merge two sorted lists |
| **Time Complexity** | O(n log n) |
| **Space Complexity** | O(log n) - Recursion stack |

**Key Steps:**
1. Find middle using slow/fast pointers
2. Recursively sort left and right halves
3. Merge two sorted halves in-order

**Advantages over Array Merge Sort:**
- No extra O(n) space for merging (in-place merge)
- Works efficiently for linked structures

---

## 15. STACKS

### `19.Stack-1/stackBasic.java`

**Stack Using ArrayList:**

```java
Stack Operations:
- isEmpty(): O(1)
- peek(): O(1)
- push(data): O(1) amortized
- pop(): O(1) amortized
```

| Method | Implementation | Purpose |
|--------|----------------|---------|
| `isEmpty()` | `list.size() == 0` | Check if empty |
| `peek()` | `list.get(size-1)` | View top element |
| `push()` | `list.add()` | Add to top |
| `pop()` | `list.remove(size-1)` | Remove from top |

### `19.Stack-1/stackLL.java`

**Stack Using Linked List:**

| Advantage | Benefit |
|-----------|---------|
| No pre-allocation | Dynamic sizing |
| Better for sparse | No wasted space |
| Intrinsic | Operations are O(1) |

**Implementation Details:**
- Head acts as top of stack
- Push: Insert at head O(1)
- Pop: Remove from head O(1)
- Peek: Access head data O(1)

### Stack Applications

| Application | Use Case | Example |
|------------|----------|---------|
| **Expression Evaluation** | Infix to Postfix | Calculator |
| **Backtracking** | Undo/Redo | Text Editor |
| **Function Calls** | Call Stack | Program Execution |
| **DFS** | Graph Traversal | Topological Sort |
| **Balanced Parentheses** | Validation | Compiler |

---

## 16. QUEUES

| Operation | Complexity | Implementation |
|-----------|-----------|-----------------|
| Enqueue | O(1) | Add to rear |
| Dequeue | O(1) | Remove from front |
| Peek | O(1) | View front |
| isEmpty | O(1) | Check size |

**Types of Queues:**

| Type | Properties | Use Case |
|------|-----------|----------|
| **Simple Queue** | FIFO | Standard queue operations |
| **Circular Queue** | Efficient space | Fixed buffer |
| **Deque** | FIFO from both ends | Sliding window |
| **Priority Queue** | Min/Max heap | Task scheduling |

**Applications:**
- BFS graph traversal
- Job scheduling
- Print queue management
- Round-robin CPU scheduling

---

## 17. GREEDY APPROACH

### `22.Greedy Approch/lexographicallySmallest.java`

**Problem: Lexicographically Smallest String of Length n with Sum k**

| Aspect | Details |
|--------|---------|
| **Problem** | Generate smallest string of length n where char sum = k |
| **Approach** | Greedy: Fill from end with largest chars possible |
| **Algorithm** | Start with 'a's, from right add (z's) as needed |
| **Time Complexity** | O(n) |
| **Space Complexity** | O(n) for result array |

**Key Insight:**
- To get lexicographically smallest: prefer 'a' at front
- Fill from end with larger characters
- Each position i needs character such that: `char_value + remaining_sum ≥ k`

**Algorithm:**
```
1. Initialize all characters as 'a'
2. Start from right (index n-1)
3. For each position, calculate available sum
4. Insert largest character that fits
5. Update remaining sum
```

**Example:**
```
n=5, k=15
Start: aaaaa
From right, need sum=15:
- pos 4: can use 'z'(26)? No, adjust
- Fill strategically to get smallest string
Result: aabbb (1+1+2+2+2=8) or similar
```

**Greedy Strategy Applications:**
- Activity Selection
- Huffman Coding
- Fractional Knapsack
- Coin Change
- Job Sequencing

---

## 18. BINARY TREES

### `23.Binary Trees/BinaryTreeB.java`

**Tree Traversals:**

| Traversal | Pattern | Use Case | Order |
|-----------|---------|----------|-------|
| **Preorder** | Root-Left-Right | Copy tree, Prefix expression | Node before children |
| **Inorder** | Left-Root-Right | BST sorting, Infix expression | Node between children |
| **Postorder** | Left-Right-Root | Delete tree, Postfix expression | Children before node |
| **Level Order** | BFS | Level-wise processing | Layer by layer |

**Time Complexity:** O(n) for all traversals
**Space Complexity:** O(h) where h = height (recursion stack)

### `23.Binary Trees/CheckUnivaluated.java`

**Problem: Check if Tree Contains Duplicate Values**

```
Input: Tree with nodes: 1, 2, 3, 4, 5, 6, 8
Output: false (all unique)
```

| Aspect | Details |
|--------|---------|
| **Algorithm** | DFS with ArrayList tracking |
| **Approach** | Visit each node, check if value seen before |
| **Time Complexity** | O(n) |
| **Space Complexity** | O(n) for ArrayList + O(h) for recursion |
| **Returns** | true if duplicate found, false if all unique |

**Logic:**
```
1. If node exists in list → duplicate found (return true)
2. Else → add to list
3. Check left subtree recursively
4. Check right subtree recursively
5. If either subtree has duplicate → return true
```

### `23.Binary Trees/LowestCommonAncestor.java`

**Problem: Find Lowest Common Ancestor (LCA)**

```
Input: Tree, n1=4, n2=5
       1
      / \
     2   3
    / \
   4   5
   
Output: 2 (LCA of 4 and 5)
```

| Aspect | Details |
|--------|---------|
| **Algorithm** | Find paths to both nodes, compare |
| **getPath()** | DFS to find path from root to node |
| **LCA Finding** | Compare paths, last common node = LCA |
| **Time Complexity** | O(n) for path finding + O(h) for comparison |
| **Space Complexity** | O(h) for paths and recursion |

**Approach:**
1. Find path from root to n1
2. Find path from root to n2
3. Compare paths until divergence
4. Last common node before divergence = LCA

### `23.Binary Trees/MinDistanceBetweenTwoNodes.java`

**Problem: Minimum Distance Between Two Nodes**

```
Distance = distance(n1 to LCA) + distance(LCA to n2)
```

| Aspect | Details |
|--------|---------|
| **Algorithm** | Find LCA + calculate distances |
| **LCA2()** | Optimized LCA finding |
| **dist()** | Calculate distance from node to target |
| **Time Complexity** | O(n) |
| **Space Complexity** | O(h) recursion depth |
| **Key Formula** | Total Distance = dist(LCA to n1) + dist(LCA to n2) |

**Optimized LCA (LCA2):**
- If node is null or matches n1 or n2 → return node
- Check left and right subtrees
- If both subtrees have values → current is LCA
- If only one → return that one

### `23.Binary Trees/transformingToSumTree.java`

**Problem: Transform Binary Tree to Sum Tree**

```
Original:      1              Transform:        15
              / \                              /  \
             2   3                           5    5
              \                               \
               4                              9
                \                              \
                 5                             5

Each node = sum of all elements in its subtree
```

| Aspect | Details |
|--------|---------|
| **Algorithm** | Post-order traversal with accumulation |
| **Approach** | Visit children first, then update node |
| **Time Complexity** | O(n) - visit each node once |
| **Space Complexity** | O(h) - recursion stack |
| **Key Insight** | Store old value before updating |

**Algorithm:**
```
1. Recursively transform left subtree
2. Recursively transform right subtree
3. Store old node value
4. Update node = leftSum + rightSum
5. Return old value + updated node value
```

**Return Value Logic:**
- Returns total sum including current node's original value
- Used by parent node in recursion

---

## 19. HEAPS

| Heap Type | Property | Use Case | Extraction |
|-----------|----------|----------|-----------|
| **Min Heap** | Parent ≤ Children | Find minimum | Smallest first |
| **Max Heap** | Parent ≥ Children | Find maximum | Largest first |
| **Priority Queue** | Custom priority | Task scheduling | Highest priority |

**Operations:**

| Operation | Time Complexity | Space |
|-----------|-----------------|-------|
| Insert | O(log n) | O(1) |
| Delete Min/Max | O(log n) | O(1) |
| Heapify | O(n) | O(1) |
| Get Min/Max | O(1) | O(1) |

**Applications:**
- Dijkstra's Algorithm
- Huffman Coding
- Heap Sort
- K-th Largest Element
- Median in Stream

---

## 20. HASHING

| Structure | Average | Worst | Use |
|-----------|---------|-------|-----|
| **Hash Table** | O(1) | O(n) | General lookup |
| **HashMap** | O(1) | O(n) | Key-value pairs |
| **HashSet** | O(1) | O(n) | Unique elements |
| **LinkedHashMap** | O(1) | O(n) | Insertion order |

**Collision Handling:**

| Technique | Method | Pros | Cons |
|-----------|--------|------|------|
| **Chaining** | Linked list at each bucket | Simple | Extra space |
| **Open Addressing** | Linear/Quadratic probing | Space efficient | Clustering |
| **Double Hashing** | Two hash functions | Better distribution | Complex |

**Applications:**
- Duplicate detection
- Frequency counting
- Two-sum problems
- Anagram grouping
- Cache implementation

---

## 21. MATHS FOR DSA

| Topic | Application | Complexity |
|-------|-------------|-----------|
| **GCD/LCM** | Fraction simplification | O(log min(a,b)) |
| **Prime Numbers** | Sieve of Eratosthenes | O(n log log n) |
| **Modular Arithmetic** | Large number handling | O(1) per operation |
| **Combinatorics** | Permutation/Combination | O(n) to O(2^n) |
| **Number Theory** | Divisors, Factors | O(√n) |

**Key Formulas:**
```
nCr = n! / (r! × (n-r)!)
nPr = n! / (n-r)!
Euler's Theorem: a^φ(n) ≡ 1 (mod n)
Fermat's Little Theorem: a^(p-1) ≡ 1 (mod p) for prime p
```

---

## 22. BINARY SEARCH TREES

### `27.binary Search Trees/BSTBasics.java`

**BST Property:** Left < Root < Right

| Operation | Algorithm | Time | Space |
|-----------|-----------|------|-------|
| **Search** | Divide search space in half | O(log n) avg, O(n) worst | O(log n) |
| **Insert** | Find position, add node | O(log n) avg, O(n) worst | O(log n) |
| **Delete** | Handle 3 cases | O(log n) avg, O(n) worst | O(log n) |

**Delete Cases:**

```
Case 1: Leaf node
   → Simply remove

Case 2: One child
   → Replace with child

Case 3: Two children
   → Replace with inorder successor (leftmost in right subtree)
   → Delete inorder successor
```

**printInRange(int k1, int k2):**
- Prints all values in range [k1, k2]
- Time: O(m) where m = nodes in range
- Space: O(h) recursion depth
- Strategy: Skip left if value > k2, skip right if value < k1

### `27.binary Search Trees/MergeBST.java`

**Problem: Merge Two BSTs**

```
BST1:    2        BST2:     1
        / \                / \
       1   3              0   5

Merged (sorted): 0, 1, 1, 2, 3, 5
```

| Step | Operation | Complexity |
|------|-----------|-----------|
| **Inorder Traversal** | Get sorted array from each BST | O(m) + O(n) |
| **Merge Arrays** | Merge two sorted arrays | O(m + n) |
| **Build BST** | Create balanced BST from sorted | O(m + n) |

**Time Complexity:** O(m + n)
**Space Complexity:** O(m + n) for arrays

### `27.binary Search Trees/ConvertToBST.java`

**Problem: Convert Binary Tree to Balanced BST**

| Phase | Operation | Purpose |
|-------|-----------|---------|
| **Get Sorted** | Inorder traversal to ArrayList | Extract elements in order |
| **Build Balanced** | Recursive middle selection | Create balanced structure |
| **Connect Nodes** | Recursively build left/right | O(n) total connections |

**balanceBST Recursion:**
```
For array [0,1,2,3,4]:
- mid = 2, root = 2
- left = build(0,1)
- right = build(3,4)
- Balanced tree created
```

**Advantages:**
- O(log n) search guaranteed
- Prevents degenerate trees
- Optimal height = O(log n)

---

## 23. TRIES

| Operation | Complexity | Use Case |
|-----------|-----------|----------|
| Insert | O(m) - length of word | Add word to dictionary |
| Search | O(m) | Find exact word |
| StartsWith | O(m) | Prefix matching |
| Delete | O(m) | Remove word |

**Structure:**
- Root node (empty)
- 26 children per node (for lowercase letters)
- isEndOfWord flag

**Applications:**
- Autocomplete
- Spell checker
- IP routing
- Phone directory
- Search engines

---

## 24. GRAPHS

### `29. Graph/a_GraphBasics.java`

**Graph Representation:**

| Method | Space | Edge Lookup | Use When |
|--------|-------|------------|----------|
| **Adjacency Matrix** | O(V²) | O(1) | Dense graphs |
| **Adjacency List** | O(V+E) | O(degree) | Sparse graphs |
| **Edge List** | O(E) | O(E) | Iteration heavy |

**Edge Structure:**
```java
class Edge {
    int src;      // Source vertex
    int dest;     // Destination vertex
    int wt;       // Weight
}
```

### `29. Graph/c_connected_component.java`

**Problem: Find Connected Components**

```
Graph with 2 components:
Component 1: {0, 1, 2, 3}
Component 2: {4}
```

| Aspect | Details |
|--------|---------|
| **Algorithm** | DFS/BFS from each unvisited node |
| **Time Complexity** | O(V + E) |
| **Space Complexity** | O(V) for visited array + O(E) for graph |
| **Purpose** | Identify disconnected subgraphs |

**Applications:**
- Network analysis
- Social networks (friends groups)
- Image processing (blob detection)

**Graph Algorithms:**

| Algorithm | Time | Space | Purpose |
|-----------|------|-------|---------|
| **BFS** | O(V+E) | O(V) | Shortest path (unweighted) |
| **DFS** | O(V+E) | O(V) | Connectivity, cycles |
| **Dijkstra** | O((V+E)logV) | O(V) | Shortest path (weighted, positive) |
| **Bellman-Ford** | O(VE) | O(V) | Shortest path (negative edges) |
| **Floyd-Warshall** | O(V³) | O(V²) | All-pairs shortest path |
| **Kruskal** | O(E log E) | O(V) | Minimum spanning tree |
| **Prim** | O(V²) or O((V+E)logV) | O(V) | Minimum spanning tree |
| **Topological Sort** | O(V+E) | O(V) | Directed acyclic graphs |

---

## 25. DYNAMIC PROGRAMMING

**DP Strategy:** Optimal Substructure + Overlapping Subproblems

| Approach | Method | When to Use |
|----------|--------|------------|
| **Top-Down** | Recursion + Memoization | Natural recursive structure |
| **Bottom-Up** | Iteration + Tabulation | Want to avoid recursion |

**Classic Problems:**

| Problem | Subproblems | Time | Space |
|---------|------------|------|-------|
| **Fibonacci** | f(n) = f(n-1) + f(n-2) | O(n) | O(n) |
| **0/1 Knapsack** | Include/exclude items | O(nW) | O(nW) |
| **LCS** | Match characters | O(mn) | O(mn) |
| **Edit Distance** | Insert/delete/replace | O(mn) | O(mn) |
| **Coin Change** | Min coins to make amount | O(nA) | O(n) |
| **Longest Increasing Subsequence** | Include/skip elements | O(n²) or O(n log n) | O(n) |

**Memoization Techniques:**
- HashMap for irregular states
- Array for indexed states
- 2D arrays for two-parameter problems

---

## 26. SEGMENT TREES

### `31.Segment Trees/a_basics.java`

**Problem: Range Sum Query with Updates**

| Operation | Complexity | Implementation |
|-----------|-----------|-----------------|
| Build Tree | O(n) | Initialize segment tree |
| Query | O(log n) | Get sum in range |
| Update | O(log n) | Update single element |

**Segment Tree Structure:**
```
Array: [1, 2, 3, 4]
Tree (array indices): Position 0 = root, 2i+1 = left, 2i+2 = right

    10 (sum of all)
    /  \
   3    7
  / \  / \
 1  2  3  4
```

**buildST() - Build Tree:**
```
- Recursive division of range
- Base case: si == sj (single element)
- Combine left and right sums
- Time: O(n)
```

**getSumUtil() - Query:**
```
- If range outside query → return 0
- If range inside query → return tree[i]
- Else partial overlap → split and combine
- Time: O(log n)
```

**updateSTUtil() - Update:**
```
- Update affected tree nodes on path to root
- Difference propagation
- Time: O(log n)
```

### `31.Segment Trees/b_MinMaxST.java`

**Problem: Range Min/Max Query**

| Operation | Modification |
|-----------|---------------|
| **Min Query** | Use `Math.min()` instead of sum |
| **Max Query** | Use `Math.max()` instead of sum |
| **Combine** | min(left, right) or max(left, right) |

**Applications:**
- Sparse table preprocessing
- 2D range queries
- Finding kth element in range

---

## 27. CODEFORCES PROBLEMS

| Problem | Type | Difficulty | Algorithm |
|---------|------|-----------|-----------|
| TBD | - | - | - |

*Note: Add your Codeforces solutions with problem codes and links*

---

## 28. PRACTICE QUESTIONS

| Source | Level | Topics Covered |
|--------|-------|-----------------|
| LeetCode | Mixed | All DSA topics |
| InterviewBit | Mixed | DSA + Interview prep |
| HackerRank | Beginner-Advanced | All topics |
| GeeksforGeeks | All | Theory + Practice |

---

## 📊 Quick Reference Matrix

### Complexity Cheat Sheet

| Operation | Best | Average | Worst | Space |
|-----------|------|---------|-------|-------|
| **Array Access** | O(1) | O(1) | O(1) | O(n) |
| **Array Search (unsorted)** | O(1) | O(n) | O(n) | O(1) |
| **Binary Search** | O(1) | O(log n) | O(log n) | O(1) |
| **Linear Search** | O(1) | O(n) | O(n) | O(1) |
| **Bubble Sort** | O(n) | O(n²) | O(n²) | O(1) |
| **Merge Sort** | O(n log n) | O(n log n) | O(n log n) | O(n) |
| **Quick Sort** | O(n log n) | O(n log n) | O(n²) | O(log n) |
| **Hash Insert** | O(1) | O(1) | O(n) | O(n) |
| **BST Insert** | O(log n) | O(log n) | O(n) | O(log n) |
| **Linked List Insert** | O(1) | O(n) | O(n) | O(1) |
| **Stack Push/Pop** | O(1) | O(1) | O(1) | O(n) |
| **Queue Enqueue/Dequeue** | O(1) | O(1) | O(1) | O(n) |

---

## 🎯 Learning Path Recommendations

### Beginner Level
1. Loops, Patterns, Functions
2. Arrays, 2D Arrays
3. Strings, Basic Sorting
4. ArrayList Basics

### Intermediate Level
5. Bit Manipulation
6. Sorting (All algorithms)
7. Linked Lists
8. Stacks & Queues
9. OOPs Concepts

### Advanced Level
10. Recursion (Parts 1 & 2)
11. Divide and Conquer
12. Backtracking
13. Binary Trees
14. Heaps & Hashing
15. Greedy Approach
16. Binary Search Trees
17. Tries
18. Graphs

### Expert Level
19. Dynamic Programming
20. Segment Trees
21. Advanced Graph Algorithms
22. Interview Problems

---

## 🚀 Performance Optimization Tips

**Time Complexity Optimization:**
- Use hashing for O(n) lookup instead of O(n²)
- Apply two-pointer technique on sorted arrays
- Use segment trees for repeated range queries
- Cache intermediate results (memoization)

**Space Complexity Optimization:**
- In-place algorithms (reverse, sort)
- Iterator patterns instead of loading all
- Rolling hash for string problems
- Stream processing for large data

---

## 📝 Common Patterns to Remember

| Pattern | When to Use | Example |
|---------|------------|---------|
| **Two Pointers** | Sorted array, target sum | Pair Sum |
| **Sliding Window** | Substring/subarray problems | Max window sum |
| **Fast/Slow Pointers** | Cycle detection, middle finding | Linked list middle |
| **Recursion + Memoization** | Overlapping subproblems | DP problems |
| **BFS** | Level-order, shortest path | Graph traversal |
| **DFS** | All combinations, paths | Backtracking |
| **Prefix Sum** | Range sum queries | Array queries |
| **Divide & Conquer** | Sorting, power | Merge sort, fast exponentiation |

---

## 🔗 File Structure Summary

```
DATA STRUCTURES AND ALGORITHMS/
├── 1.LOOPS/                    → Basic iterations
├── 2.Patterns1/ & 4.Patterns2/ → Pattern printing
├── 3.functions/                → Function basics
├── 5.Array/                    → Array operations
├── 7.SORTING/                  → All sorting algorithms
├── 8.string/                   → String algorithms
├── 9.BitManipulation/          → Bit operations
├── 10.OOPs/                    → Object-oriented concepts
├── 12.Reccursion-1/            → Basic recursion
├── 13.Reccursion-2/            → Advanced recursion (Tiling, etc)
├── 16.arraylist/               → ArrayList operations (Pair Sum II)
├── 17.LinkedList-1/            → Basic LL (Add, Remove, Print)
├── 18.LinkedList-2/            → Advanced LL (Merge Sort)
├── 19.Stack-1/                 → Stack implementation
├── 20.Stack-2/                 → Stack applications
├── 21.Queue/                   → Queue operations
├── 22.Greedy Approch/          → Greedy algorithms
├── 23.Binary Trees/            → Tree problems (LCA, Sum Tree, etc)
├── 24.Heaps/                   → Heap data structure
├── 25.Hashing/                 → Hash tables & sets
├── 27.binary Search Trees/     → BST operations
├── 28. Tries/                  → Trie data structure
├── 29. Graph/                  → Graph algorithms
├── 30. DP/                     → Dynamic programming
├── 31.Segment Trees/           → Segment tree queries
└── Codeforces/ & Practice/     → Competitive problems
```

---

## 💡 Key Takeaways

1. **Master Time & Space Tradeoffs** - Choose the right algorithm for constraints
2. **Understand Fundamentals** - Strong basics make advanced topics easier
3. **Practice Implementation** - Coding problems repeatedly builds muscle memory
4. **Analyze Complexity** - Always calculate O(n) and O(space) before coding
5. **Learn Patterns** - Recognize problem patterns to apply known solutions
6. **Debug Efficiently** - Use test cases to validate logic
7. **Optimize Gradually** - Get working solution first, then optimize

---

**Last Updated:** December 2024

**Happy Learning! Keep solving, keep improving! 🎓**