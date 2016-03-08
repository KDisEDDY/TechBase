package suanfa;

public class s_function1 extends s_function {
     public void operation(String string)
     {
    	 subString=null;
    	 StringBuffer temp=new StringBuffer();
    	 int c_index=1;
    	 
    	 temp.append(string.charAt(0));
    	 while(c_index<string.length())
    {
          
    	 for(int i=c_index;i<string.length();++i)
    	 {
    		char tempc=string.charAt(i);
    	    if(tempc>temp.charAt(temp.length()-1))
    	    {                                                          
    	    	temp.append(tempc);
    	    	if(c_index==string.length()-1&&subString.length()<temp.length())
    	    		subString_change(temp);
        	    c_index++;
    	    }
    	    else 
    	    {   
    	    	if(subString==null)
    	    	{
    	    		subString_change(temp);
    	    	}
    	    	else if(subString.length()<temp.length())
    	    	{
    	    		subString=temp.toString();
    	    	}
    	    	temp=temp.delete(0, temp.length());       
    	    	temp.append(tempc);
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
