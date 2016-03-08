package suanfa_string1;


import Search.BinarySearch;
import src.LinearList.LinkList;
import suanfa.*;


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

         LinkList<Integer> linkedList = new LinkList<Integer>();
         for(int i = 0; i< 6;i++){
             linkedList.add(i,i);
         }
         System.out.println(linkedList.toString());
         linkedList.remove(2);
         System.out.println(linkedList.toString());
         linkedList.changed();
         System.out.println(linkedList.set(3, 1));
         System.out.println(linkedList.toString());
         System.out.println(linkedList.size());
         linkedList.clear();
         System.out.println(linkedList.toString());
     }
}
