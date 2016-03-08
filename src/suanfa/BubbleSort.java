package suanfa;

/**
 * BubbleSort
 * Created by Eddy on 2016/2/27.
 */
public class BubbleSort {
    int[] List = new int[]{
      5,2,3,7,8
    };

    public String  sort(){
        boolean needSwap = true;
        for(int i = 1 ; i< List.length && needSwap; i++){
            needSwap =false;
            for(int x = 0; x < List.length - i; x++){
                if(List[x + 1] < List[x]){
                    needSwap = true;
                    int temp = List[x];
                    List[x] = List[x+1];
                    List[x+1] = temp;
                }
            }
        }
        StringBuffer buffer = new StringBuffer("");
        for(int i : List){
            buffer.append(i + ",");
        }
        return buffer.toString().trim();
    }
}
