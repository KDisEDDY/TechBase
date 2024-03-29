package suanfa_string1;


import Search.BinarySearch;
import StringMatch.BruteForce;
import src.LinearList.LinkList;
import algorithm.*;

import java.util.Arrays;


public class Main {
     public static void main(String[] args){
		 System.out.println(new BubbleSort().sort());
         new QuickSort().sort();
         new StriaghtSort().sort();
         new mianshi1().printf();
         new ShellSort().printf();
         new StraightChooseSort().printf();
         if(new BinarySearch().BeginSearch(4)){
             System.out.println("find the item");
         }
         else{
             System.out.println("not found the item");
         }

         LinkList<Integer> linkList = new LinkList<Integer>();
         for(int i = 0; i< 6;i++){
             linkList.add(i, i);
         }
         System.out.println(linkList.toString());
         linkList.remove(2);
         System.out.println(linkList.toString());
         linkList.changed();
         System.out.println(linkList.set(2, 1));
         System.out.println(linkList.toString());
         System.out.println(linkList.size());
         if(new BruteForce().indexOf("rretererwoetewitg","itg")){
             System.out.println("find the pattern");
         }

         char[] cs = {'5','3','5','7','2','1','2','5','2'};
         new mianshi2().findout(cs);


         RemoveDuplicates removeDuplicatesFunction = new RemoveDuplicates();
         int[] nums = new int[7];
         nums[0] = 1;
         nums[1] = 1;
         nums[2] = 1;
         nums[3] = 1;
         nums[4] = 2;
         nums[5] = 2;
         nums[6] = 3;
         System.out.println("the new array size is " + removeDuplicatesFunction.removeDuplicates(nums));
     }
}
