<div width="100%" align="center"> <h1> Algorithmic Toolbox </h1> </div>

## Solutions of Coursera's "Algorithmic Toolbox" course, part of the "Data Structures and Algorithms Specialization"; offered by the University of California San Diego and HSE University. ##


### Assignment 1 (Week 1): Programming Challenges ###

<details>
<summary>1. APlusB.java</summary>
   
   + **Description**: Simple problem to go through the pipeline of reading the problem statement, designing an algorithm, implementing it, testing and debugging the program, and submitting it to the grading system.
     
   + **Input Format**: Integers a and b on the same line (separated by a space).
     
   + **Constraints**: 0 $\leq$ a; b $\leq$ 9
     
   + **Output Format**: The sum of a and b.
</details>


<details>
<summary>2. MaximumPairwiseProduct.java</summary>
   
   + **Description**: Given a sequence of non-negative integers a<sub>1</sub>, ..., a<sub>n</sub>, compute
     <div width="100%" align="center"> $\underset{{1 \leq i \neq j \leq n}}{max}$ a<sub>i</sub> $\cdot$ a<sub>j</sub> </div>
  Note that i and j should be different, though it may be the case that a<sub>i</sub> = a<sub>j</sub>.
     
   + **Input Format**: The first line contains an integer n. The next line contains n non-negative integers a<sub>1</sub>, ..., a<sub>n</sub> (separated by spaces).
     
   + **Constraints**: 2 $\leq$ n $\leq$ 2 · 10<sup>5</sup>; 0 $\leq$ a<sub>1</sub>, ..., a<sub>n</sub> $\leq$ 2 · 10<sup>5</sup>.
     
   + **Output Format**: The maximum pairwise product.
</details>

----

### Assignment 2 (Week 2): Algorithmic Warm-up ###

<details>
<summary>1. FibonacciNumber.java</summary>
   
   + **Description**: Recall the definition of Fibonacci sequence: F<sub>0</sub> = 0, F<sub>1</sub> = 1, and F<sub>i</sub> = F<sub>i-1</sub> + F<sub>i-2</sub> for 𝑖 $\geq$ 2. Given an integer 𝑛, find the 𝑛th Fibonacci number F<sub>n</sub>.
     
   + **Input Format**: The input consists of a single integer 𝑛.
     
   + **Constraints**: 0 $\leq$ 𝑛 $\leq$ 45.
     
   + **Output Format**: Output F<sub>n</sub>.
</details>


<details>
<summary>2. GreatestCommonDivisor.java</summary><br />
   
   + **Description**: The greatest common divisor GCD(𝑎, 𝑏) of two non-negative integers 𝑎 and 𝑏 (which are not both equal to 0) is the greatest integer 𝑑 that divides both 𝑎 and 𝑏. Implement the Euclidean algorithm for computing the greatest common divisor.

<div width="100%" align="center"> $GCD(1344, 217) = GCD(217, 42) = GCD(42, 7) = GCD(7, 0) = 7$ </div>
           
   Given two integers 𝑎 and 𝑏, find their greatest common divisor.
     
   + **Input Format**: The two integers 𝑎, 𝑏 are given in the same line separated by space.
     
   + **Constraints**: 1 $\leq$ 𝑎, 𝑏 $\leq$ 2 $\cdot$ 10<sup>9</sup>.
     
   + **Output Format**: Output $GCD(a, b)$.
</details>


<details>
<summary>3. LastDigitOfLargeFibonacciNumber.java</summary>
   
   + **Description**: Find the last digit of 𝑛-th Fibonacci number. As 𝑖 grows the 𝑖<sup>the</sup> iteration of the loop computes the sum of longer and longer numbers. Tip: store in 𝐹[𝑖] not the 𝑖th Fibonacci number itself, but just its last digit (that is, F<sub>i</sub> mod 10). Given an integer 𝑛, find the last digit of the 𝑛<sup>th</sup> Fibonacci number F<sub>n</sub> (that is, F<sub>n</sub> mod 10).
     
   + **Input Format**: The input consists of a single integer 𝑛.
     
   + **Constraints**: 0 $\leq$ 𝑛 $\leq$ 10<sup>7</sup>.
     
   + **Output Format**: Output the last digit of F<sub>n</sub>.
</details>


<details>
<summary>4. LeastCommonMultiple.java</summary>
   
   + **Description**: The least common multiple of two positive integers 𝑎 and 𝑏 is the least positive integer 𝑚 that is divisible by both 𝑎 and 𝑏. Given two integers 𝑎 and 𝑏, find their least common multiple.

<p width="100%" align="center"> <img width="347" alt="Equation" src="https://github.com/AfonsoBernardes/AlgorithmicToolbox/assets/84087794/28e888f6-1c2b-404b-b167-efb0623aea41"> </p>
     
   + **Input Format**: The two integers 𝑎 and 𝑏 are given in the same line separated by space.
     
   + **Constraints**: 1 $\leq$ 𝑎, 𝑏 $\leq$ 2 $\cdot$ 10<sup>9</sup>.
     
   + **Output Format**: Output the least common multiple of 𝑎 and 𝑏.
</details>

----

### Assignment 3 (Week 3): Greedy Algorithms ###

<details>
<summary>1. CarFueling.java</summary>
   
   + **Description**: We are going to travel to another city that is located 𝑑 miles away from your home city. We can travel at most 𝑚 miles on a full tank and you start with a full tank. Along your way, there are gas stations at distances stop<sub>1</sub>, stop<sub>2</sub>, . . . , stop<sub>n</sub> from your home city. What is the minimum number of refills needed?
     
   + **Input Format**: The first line contains an integer 𝑑. The second line contains an integer 𝑚. The third line specifies an integer 𝑛. Finally, the last line contains integers stop<sub>1</sub>, stop<sub>2</sub>, . . . , stop<sub>n</sub>
     
   + **Constraints**: 1 $\leq$ 𝑑 $\leq$ 10<sup>5</sup>; 1 $\leq$ 𝑚 $\leq$ 400; 1 $\leq$ 𝑛 $\leq$ 300; 0 $<$ stop<sub>1</sub> $<$ stop<sub>2</sub> $<$ · · · $<$ stop<sub>n</sub> $<$ 𝑚
     
   + **Output Format**: Assuming that the distance between the cities is 𝑑 miles, a car can travel at most 𝑚 miles on a full tank, and there are gas stations at distances stop<sub>1</sub>, stop<sub>2</sub>, . . . , stop<sub>n</sub> along the way, output the minimum number of refills needed. Assume that the car starts with a full tank. If it is not possible to reach the destination, output −1.
</details>


<details>
<summary>2. MaximumLootValue.java</summary><br />
   
   + **Description**: Implement an algorithm for the fractional knapsack problem to find the most valuable combination of items assuming that any fraction of a loot item can be put into a "bag".
     
   + **Input Format**: The first line of the input contains the number 𝑛 of items and the capacity 𝑊 of a knapsack. The next 𝑛 lines define the values and weights of the items. The 𝑖-th line contains integers v<sub>i</sub> and w<sub>i</sub> — the value and the weight of 𝑖-th item, respectively.
     
   + **Constraints**: 1 $\leq$ 𝑛 $\leq$ 10<sup>3</sup>, 0 $\leq$ 𝑊 $\leq$ 2 $\cdot$ 10<sup>6</sup>; 0 $\leq$ v<sub>i</sub> $\leq$ 2 · 10<sup>6</sup>, 0 $<$ w<sub>i</sub> $\leq$ 2 · 10<sup>6</sup> for all 1 $\leq$ 𝑖 $\leq$ 𝑛. All the numbers are integers.
     
   + **Output Format**: Output the maximal value of fractions of items that fit into the knapsack. The absolute value of the difference between the answer of your program and the optimal value should be at most 10<sup>-3</sup>. To ensure this, output your answer with at least four digits after the decimal point (otherwise your answer, while being computed correctly, can turn out to be wrong because of rounding issues).
</details>


<details>
<summary>3. MoneyChange.java</summary>
   
   + **Description**:  Design and implement an elementary greedy algorithm to find the minimum number of coins needed to change the input value (an integer) into coins with denominations 1, 5, and 10.
     
   + **Input Format**: The input consists of a single integer 𝑚.
     
   + **Constraints**: 1 $\leq$ 𝑚 $\leq$ 10<sup>3</sup>.
     
   + **Output Format**: Output the minimum number of coins with denominations 1, 5, 10 that changes 𝑚.
</details>

----

### Assignment 4 (Week 4): Divide-and-Conquer ###

<details>
<summary>1. BinarySearch.java</summary>
   
   + **Description**: implement the binary search algorithm that allows searching LIST very efficiently, provided that the list is sorted.
     
   + **Input Format**: The first line of the input contains an integer 𝑛 and a sequence a<sub>0</sub> $<$ a<sub>1</sub> $<$ . . . $<$ a<sub>n-1</sub> of 𝑛 pairwise distinct positive integers in increasing order. The next line contains an integer 𝑘 and 𝑘 positive integers b<sub>0</sub>, b<sub>1</sub>, . . . , b<sub>k-1</sub>.
     
   + **Constraints**: 1 $\leq$ 𝑛, 𝑘 $\leq$ 10<sup>4</sup>; 1 $\leq$ a<sub>i</sub> $\leq$ 10<sup>9</sup> for all 0 $\leq$ 𝑖 $<$ 𝑛; 1 $\leq$ b<sub>j</sub> $\leq$ 10<sup>9</sup> for all 0 $\leq$ 𝑗 $<$ 𝑘;
     
   + **Output Format**: For all 𝑖 from 0 to $𝑘−1$, output an index 0 $\leq$ 𝑗 $\leq$ $𝑛−1$ such that a<sub>j</sub> $=$ b<sub>i</sub> or −1 if there is no such index.
</details>


<details>
<summary>2. MajorityElement.java</summary>
   
   + **Description**: Majority rule is a decision rule that selects the alternative which has a majority, that is, more than half the votes. Given a sequence of elements a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>, check whether it contains an element that appears more than 𝑛/2 times. Use the divide-and-conquer technique to design an 𝑂(𝑛 log 𝑛) algorithm.
     
   + **Input Format**: The first line contains an integer 𝑛, and the next one contains a sequence of 𝑛 non-negative integers a<sub>0</sub>, a<sub>1</sub>, . . . $<$ a<sub>n-1</sub>.
     
   + **Constraints**: 1 $\leq$ 𝑛 $\leq$ 10<sup>5</sup>; 0 $\leq$ a<sub>i</sub> $\leq$ 10<sup>9</sup> for all 0 $\leq$ 𝑖 $<$ 𝑛.
     
   + **Output Format**: Output 1 if the sequence contains an element that appears strictly more than 𝑛/2 times, and 0 otherwise.
</details>

----

### Assignment 5 (Week 5): Dynamic Programming I ###

<details>
<summary>1. EditDistance.java</summary>
   
   + **Description**: The edit distance between two strings is the minimum number of operations (insertions, deletions, and substitutions of symbols) to transform one string into another. It is a measure of similarity of two strings. The goal of this problem is to implement the algorithm for computing the edit distance between two strings.
     
   + **Input Format**: Each of the two lines of the input contains a string consisting of lowercase Latin letters.
     
   + **Constraints**: The length of both strings is at least 1 and at most 100.
     
   + **Output Format**: Output the edit distance between the given two strings.
</details>


<details>
<summary>2. MoneyChangeAgain.java</summary><br />
   
   + **Description**: A natural greedy strategy for the change problem does not work correctly for any set of denominations. For example, if the available denominations are 1, 3, and 4, the greedy algorithm will change 6 cents using three coins (4 + 1 + 1) while it can be changed using just two coins (3 + 3). The goal now is to apply dynamic programming for solving the Money Change Problem for denominations 1, 3, and 4.
     
   + **Input Format**: Integer *money*.
     
   + **Constraints**: 1 $\leq$ money $\leq$ 10<sup>3</sup>.
     
   + **Output Format**: The minimum number of coins with denominations 1, 3, and 4 that change *money*.
</details>


<details>
<summary>3. PrimitiveCalculator.java</summary>
   
   + **Description**: Given a primitive calculator that can perform the following three operations with the current number *𝑥*: multiply *𝑥* by 2, multiply *𝑥* by 3, or add 1 to *𝑥*. Given an integer 𝑛, compute the minimum number of operations needed to obtain the number 𝑛 starting from the number 1.
     
   + **Input Format**: The input consists of a single integer 1 $\leq$ 𝑛 $\leq$ 10<sup>6</sup>.
     
   + **Output Format**: In the first line, output the minimum number *𝑘* of operations needed to get *𝑛* from 1. In the second line, output a sequence of intermediate numbers. That is, the second line should contain positive integers a<sub>0</sub>, a<sub>1</sub>, . . . , a<sub>k-1</sub> such that a<sub>0</sub> $=$ 1, a<sub>k-1</sub> = *𝑛* and for all 0 $\leq$ *𝑖* $<$ $𝑘−1$, a<sub>i+1</sub> is equal to either a<sub>i</sub>+1, 2a<sub>i</sub>, or 3a<sub>i</sub>. If there are many such sequences, output any one of them.
</details>
