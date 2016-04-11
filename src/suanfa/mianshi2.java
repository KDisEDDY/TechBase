package suanfa;

import java.util.*;

/**
 * 从一个数组中找出出现次数最多且值最大的数
 * Created by Eddy on 2016/4/11.
 */
public class mianshi2 {


    public void  findout(char[] cs){
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        //把每个数字出现的次数记录下来，并找出最大的次数
        for(char c : cs){
            if(map.containsKey(c)){
                Integer integer = map.get(c) + 1;
                map.put(c, integer);
                if(max < integer){
                    max = integer;
                }
            }
            else {
                map.put(c, 1);
            }
        }

        Character c = cs[0];
        for(int i = 0 ;i< cs.length ; i++){
            if((map.get(cs[i])== max)){
                if(c.compareTo(cs[i]) < 0)
                    c = cs[i];
            }
        }

        System.out.println("the number is " + c);
    }

}
