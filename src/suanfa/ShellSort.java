package suanfa;


/**
 * Created by Eddy on 2016/3/5.
 */
public class ShellSort implements printInterface{

    int[] List = new int[]{
            4,-2,6,4,9,5,2,3,7,8
    };

    public void sort(){
        for(int delta = List.length/2; delta > 0 ; delta = delta /2){
            for(int i = delta; i< List.length; i+= delta){
                int temp = List[i];
                int j = i - delta;
                while(j >= 0 &&temp < List[j]){
                    List[j+delta] = List[j];
                    j-=delta;
                }
                List[j+ delta] = temp;
            }
        }
    }


    @Override
    public void printf() {
        sort();
       StringBuffer buffer = new StringBuffer("");
        for(int i:List){
            buffer.append(i + " ");
        }
        System.out.println("ShellSort number is " + buffer.toString().trim());
    }

}
