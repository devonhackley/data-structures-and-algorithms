#Lecture Notes: Quick Sort

Merge sort is a sorting algorithm that sorts sets of values in *"divide and conquer"* manner. It selects a pivot point and splits out the array around the pivot point.

###Learning Objectives: 
- Learn about quick sort

###Lecture Flow
  - Describe Quick sort
    - talk about Big O
    - show video
  - Do basic implementation of quick sort
    - talk about algorithm
    - write tests
        - refer to [QuickSort](../src/main/java/challenges/QuickSort.java)  and [QuickSortTest](../src/test/java/challenges/QuickSortTest.java)
 
###Diagram
![alt quick sort](https://www.geeksforgeeks.org/wp-content/uploads/gq/2014/01/QuickSort2.png)


###Algorithm
- Create pivot point
- Use pivot point to divide array into smaller collections
    - elements smaller than pivot point to the left of the pivot and elements larger go to the right of it. 

###Psuedocode
```
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
```
###Readings and References
#####Watch
- [![alt merge sort video](http://img.youtube.com/vi/kUon6854joI/0.jpg)](https://www.youtube.com/watch?v=kUon6854joI)

#####Read
- [GeeksforGeeks: Quick Sort](https://www.geeksforgeeks.org/quick-sort/)
- [Quick Sort - Java](https://www.tutorialspoint.com/data_structures_algorithms/quick_sort_algorithm.htm)

#####Bookmark
- [QuickSort.java](https://algs4.cs.princeton.edu/23quicksort/)
