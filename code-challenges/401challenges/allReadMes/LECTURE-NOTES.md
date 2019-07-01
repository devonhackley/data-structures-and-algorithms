#Lecture Notes: Insertion Sort

Insertion sort is a sorting algorithm that sorts sets of values incrementally based on the correct order the values should be in. 

i.e it compares each unsorted value to the rest of the sorted values, and inserts it accordingly.

*Note: This algorithm is most efficient with smaller sets of values.*

###Learning Objectives: 
- Learn about insertion sort

###Lecture Flow
  - Describe Insertion sort
    - talk about Big O
    - show video
  - Do basic implementation of insertion sort
    - talk about algorithm
    - write tests
        - refer to [InsertionSort](../src/main/java/challenges/InsertionSort.java)  and [InsertionSortTest](../src/test/java/challenges/InsertionSortTest.java)
 
###Diagram
![alt insertion sort](https://static.javatpoint.com/corebasic/programs/images/insertion-sort.png)


###Algorithm
- Traverse thru array starting at index 1 thru the length of the array.
- Assign current value variable to the end of the array, and a temp variable to start of array
- Continue iterating thru while current is greater than 0 and temp variable is less than the current index
  - shift values greater than the current value to the right  and index current + 1 to the temp value
- Time Complexity: O(n<sup>2</sup>)

###Psuedocode
```
InsertionSort(int[] arr)
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
```
###Readings and References
#####Watch
- [![alt insertion sort video](http://img.youtube.com/vi/OGzPmgsI-pQ/0.jpg)](https://youtu.be/OGzPmgsI-pQ)

#####Read
- [GeeksforGeeks: Insertion Sort](https://www.geeksforgeeks.org/insertion-sort/)
- [Insertion Sort - Java](https://algorithms.tutorialhorizon.com/insertion-sort-java-implementation/)

#####Bookmark
- [Insertion.java](https://algs4.cs.princeton.edu/21elementary/Insertion.java.html)
- [![alt insertion sort video](http://img.youtube.com/vi/lCzQvQr8Utw/0.jpg)](https://www.youtube.com/watch?v=lCzQvQr8Utw)
