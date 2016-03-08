package suanfa;

import java.util.ArrayList;

/**
 * Created by Eddy on 2016/3/5.
 */
public class mianshi1 implements printInterface{
    int[] List = new int[]{1,2,2,3,4,4,6};

    public Object[] removeRepeatItem(){
        ArrayList<Integer> items = new ArrayList<Integer>();
        for(int item : List){
            if(items.size() > 0){
                 if(!items.contains(item)){
                     items.add(item);
                 }
            }
            else{
                items.add(item);
            }
        }
        return items.toArray();
    }

    @Override
    public void printf() {
        StringBuffer buffer = new StringBuffer("");
        Object[] items = removeRepeatItem();
        for(Object item : items){
            buffer.append(item + " ");
        }
        System.out.println(buffer.toString().trim());
    }
}
