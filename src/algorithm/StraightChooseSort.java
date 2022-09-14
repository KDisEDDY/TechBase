package algorithm;

/**
 * Created by Eddy on 2016/3/6.
 */
public class StraightChooseSort implements printInterface {

    int[] List = new int[]{
            4,-2,6,4,9,5,2,3,7,8
    };

    private void sort(){
        for (int i = 0; i < List.length; i++) {
             int currentSmallItem = List[i];
            for(int x = i;x < List.length; x++){
                if(List[x] < currentSmallItem){
                    int temp = currentSmallItem;
                    currentSmallItem = List[x];
                    List[x] = temp;
            }
            }
            if(List[i] != currentSmallItem){
                List[i] = currentSmallItem;
            }
        }
    }


    @Override
    public void printf() {
        sort();
        StringBuffer buffer = new StringBuffer("");
        for(int i : List){
            buffer.append(i + " ");
        }
        System.out.println("StriaghtChooseSort is " + buffer.toString().trim());
    }
}
