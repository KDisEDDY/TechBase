package suanfa_string1;

import java.util.Scanner;

import suanfa.s_function;
import suanfa.s_function1;

public class Main {
     public static void main(String[] args){
    	 while(true)
    	 {
         s_function function;
    	 System.out.println("请输入一串字母字串");
    	 Scanner sysin=new Scanner(System.in);
    	 String string= sysin.nextLine();
    	 System.out.println("选择你要的算法操作：");
    	 System.out.println("1.找出连续的递增字串");
    	 System.out.println("2.找出递增字串");
         Scanner getOption= new Scanner(System.in);
         int d=0;
         if(getOption.hasNextInt()) d=getOption.nextInt();
         switch(d)
         {
         case 1:
         {
        	 function=new s_function1();
        	 function.operation(string);
        	 System.out.println("连续递增字串为："+function.getValue());
        	 break;
         }
         case 2:
        	 break;
         }
    	 }
     }
}
