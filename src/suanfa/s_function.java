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
            System.out.println("������һ����ĸ�ִ�");
            Scanner sysin=new Scanner(System.in);
            String string= sysin.nextLine();
            System.out.println("ѡ����Ҫ���㷨������");
            System.out.println("1.�ҳ������ĵ����ִ�");
            System.out.println("2.�ҳ������ִ�");
            Scanner getOption= new Scanner(System.in);
            int d=0;
            if(getOption.hasNextInt()) d=getOption.nextInt();
            switch(d)
            {
                case 1:
                {
                    function=new s_function1();
                    function.operation(string);
                    System.out.println("���������ִ�Ϊ��"+function.getValue());
                    break;
                }
                case 2:
                    break;
            }
        }
    }
    
    public String getValue(){         //��ȡȡ�õ������ִ�
    	return subString;
    }
    
    
}
