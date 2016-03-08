package suanfa;

/**
 * Created by Eddy on 2016/3/2.
 */
public class StriaghtSort {
    int[] List = new int[]{
            4,-2,6,4,9,5,2,3,7,8
    };

    public void sort(){
        for(int i = 1 ;i <List.length ; i++){
            int temp = List[i],x;
            for(x = i -1;x > -1 && temp < List[x]; x--) {
                    List[x+1] = List[x];
            }
            List[x +1] = temp;
        }

        StringBuffer buffer = new StringBuffer("");
        for (int i = 0; i < List.length; i++) {
            buffer.append(List[i] + " ");
        }
        System.out.println("StriaghtSort : " + buffer.toString().trim());
    }

}
