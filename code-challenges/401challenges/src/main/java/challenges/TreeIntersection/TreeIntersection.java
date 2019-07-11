package challenges.TreeIntersection;

import challenges.tree.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class TreeIntersection {
    public static HashSet treeIntersection(BinaryTree tree1, BinaryTree tree2){
        HashSet common = new HashSet <>();
        if(tree1.getRoot() != null && tree2.getRoot() != null){
            //pre order of first tree
            Object[] arr1 = tree1.preOrder(tree1.getRoot(), new ArrayList());
            Integer[] vals1 = Arrays.asList(arr1).toArray(new Integer[arr1.length]);

            //pre order of second tree
            Object[] arr2 = tree2.preOrder(tree2.getRoot(), new ArrayList());
            Integer[] vals2 = Arrays.asList(arr2).toArray(new Integer[arr2.length]);

            // find common values of both lists
            for(Integer num : vals1){
                if(Arrays.asList(vals2).contains(num)){
                    common.add(num);
                }
            }
        }

        return common;
    }
}
