package suanfa;

public class s_function1 extends s_function {
     public void operation(String string)
     {
    	 subString=null;             //得到的最大字串
    	 StringBuffer temp=new StringBuffer();           //暂存的字串 
    	 int c_index=1;                           //保存当前的记录读取到的字符的位置
    	 
    	 temp.append(string.charAt(0));
    	 while(c_index<string.length())
    {
          
    	 for(int i=c_index;i<string.length();++i)
    	 {
    		char tempc=string.charAt(i);
    	    if(tempc>temp.charAt(temp.length()-1))                     //该判断是用用来检测下个字符是否大于当前字串的最后一个字符  （l1）
    	    {                                                          
    	    	temp.append(tempc);
    	    	if(c_index==string.length()-1&&subString.length()<temp.length())  //当读取到最后一个字符时，直接判断subString和temp的长度
    	    		subString_change(temp);
        	    c_index++;
    	    }
    	    else 
    	    {   
    	    	if(subString==null)                  //该语句用于判断subString是否还未赋值
    	    	{
    	    		subString_change(temp);
    	    	}
    	    	else if(subString.length()<temp.length())
    	    	{
    	    		subString=temp.toString();
    	    	}
    	    	temp=temp.delete(0, temp.length());       
    	    	temp.append(tempc);                        //把temp清空，输入最近读取的字符最为首字符，这是为了防止（l1）处发现异常
        	    c_index++;
    	    	break;
    	    }

    	 }
    }
     }
	
	private void subString_change(StringBuffer temp)
	{
		subString=temp.toString();
	}
     
}
