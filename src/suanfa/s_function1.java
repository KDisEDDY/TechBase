package suanfa;

public class s_function1 extends s_function {
     public void operation(String string)
     {
    	 subString=null;             //�õ�������ִ�
    	 StringBuffer temp=new StringBuffer();           //�ݴ���ִ� 
    	 int c_index=1;                           //���浱ǰ�ļ�¼��ȡ�����ַ���λ��
    	 
    	 temp.append(string.charAt(0));
    	 while(c_index<string.length())
    {
          
    	 for(int i=c_index;i<string.length();++i)
    	 {
    		char tempc=string.charAt(i);
    	    if(tempc>temp.charAt(temp.length()-1))                     //���ж�������������¸��ַ��Ƿ���ڵ�ǰ�ִ������һ���ַ�  ��l1��
    	    {                                                          
    	    	temp.append(tempc);
    	    	if(c_index==string.length()-1&&subString.length()<temp.length())  //����ȡ�����һ���ַ�ʱ��ֱ���ж�subString��temp�ĳ���
    	    		subString_change(temp);
        	    c_index++;
    	    }
    	    else 
    	    {   
    	    	if(subString==null)                  //����������ж�subString�Ƿ�δ��ֵ
    	    	{
    	    		subString_change(temp);
    	    	}
    	    	else if(subString.length()<temp.length())
    	    	{
    	    		subString=temp.toString();
    	    	}
    	    	temp=temp.delete(0, temp.length());       
    	    	temp.append(tempc);                        //��temp��գ����������ȡ���ַ���Ϊ���ַ�������Ϊ�˷�ֹ��l1���������쳣
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
