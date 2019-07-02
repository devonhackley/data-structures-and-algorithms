#Lecture Notes: Merge Sort

Merge sort is a sorting algorithm that sorts sets of values in a *"divide and conquer"* manner. This meaning the algorithm divides the array in halves and sorts each individual half. Once all the sub arrays are sorted, the algorithm then *"conquers"* them by combining values all into one array

###Learning Objectives: 
- Learn about merge sort

###Lecture Flow
  - Describe Merge sort
    - talk about Big O
    - show video
  - Do basic implementation of merge sort
    - talk about algorithm
    - write tests
        - refer to [MergeSort](../src/main/java/challenges/MergeSort.java)  and [MergeSortTest](../src/test/java/challenges/MergeSortTest.java)
 
###Diagram
![alt merge sort](https://www.baeldung.com/wp-content/uploads/2018/09/mergesort1.png)


###Algorithm
- Create a mid point from array. 
- Divide array using midpoint into two halves.
- Recursively break down left side
- Recursively break down right side
- Merge left and right
- Time Complexity: O(nlogn)

###Psuedocode
```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if arr.length > 1
      DECLARE mid <-- n/2
      DECLARE b <-- arr[0...mid]
      DECLARE c <-- arr[mid...n]
      // break down the left side
      Mergesort(b)
      // break down the right side
      Mergesort(c)
      // merge the left and the right side together
      Merge(b, c, arr)

ALGORITHM Merge(b, c, a)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < b && j < c
        if b[i] <= c[j]
            a[k] <-- b[i]
            i <-- i + 1
        else
            a[k] = c[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = b.length
       add remaining items in array c to array a
    else
       add remaining items in array b to array a
       
    return a

```
###Readings and References
#####Watch
- [![alt merge sort video](http://img.youtube.com/vi/JSceec-wEyw/0.jpg)](https://www.youtube.com/watch?v=JSceec-wEyw)

#####Read
- [GeeksforGeeks: Merge Sort](https://www.baeldung.com/java-merge-sort)
- [Merge Sort - Java](https://www.java67.com/2018/03/mergesort-in-java-algorithm-example-and.html)

#####Bookmark
- [MergeSort.java](https://algs4.cs.princeton.edu/22mergesort/)
