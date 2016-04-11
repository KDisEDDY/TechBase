package StringMatch;

/**
 * 朴素模式匹配
 * Created by Eddy on 2016/3/8.
 */
public class BruteForce {

     private int count;

    public int getCount() {
        return count;
    }

    public boolean indexOf(String target,String pattern){
         int p_length = pattern.length();
         int i = 0;
         while(i <= target.length() - p_length){
             count ++;
             String substring = target.substring(i,i+p_length);
             if(substring.trim().equals(pattern)){
                 return true;
             }
             else {
                 i++;
             }
         }
         return false;
     }
}

