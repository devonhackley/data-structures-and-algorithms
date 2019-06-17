# Tree
This read me contains information various tree implementations.

## Challenge
Implement a Binary Tree and BinarySearch Tree:

## Approach & Efficiency
BinaryTree:
 * preOrder: 
     * Time: O(n) Space: O(1)
 * postOrder: 
     * Time: O(n) Space: O(1)
 * inOrder: 
     * Time: O(n) Space: O(1)
    
 BinarySearch Tree: 
 * add: 
     * Time: O(lg(n)) Space: O(1)
 * contains: 
     * Time: O(lg(n)) Space: O(1) 

## API
  ### Methods:
  BinaryTree:
 * preOrder: 
     * traverses thru tree starting from root, then left side, then right side. Method returns an array of values.
 * postOrder: 
     * traverses thru tree starting from left side of root, then right side, then finally to root. Method returns an array of values.
 * inOrder: 
      * traverses thru tree starting from left side of root, then root itself, then finally to right side of root. Method returns an array of values.

BinarySearch Tree: 
 * add: 
     * adds values to the tree, to either left or right depending on if the value is less than or greater than the root.
 * contains: 
     * traverses thru tree to determine if value is contained in list


[Link to BinaryTree Code](../src/main/java/challenges/tree/BinaryTree.java)
[Link to BinaryTree Test](../src/test/java/challenges/tree/BinaryTreeTest.java)

[Link to BinarySearchTree Code](../src/main/java/challenges/tree/BinarySearchTree.java)
[Link to BinarySearchTreeTest](../src/test/java/challenges/tree/BinarySearchTreeTest.java)


