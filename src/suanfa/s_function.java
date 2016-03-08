package suanfa;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 */
public  class s_function {
	protected String subString;
    public void operation(String String){
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
    
    public String getValue(){         //锟斤拷取取锟矫碉拷锟斤拷锟斤拷锟街达拷
    	return subString;
    }
    
    
}
