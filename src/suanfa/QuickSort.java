package suanfa;

/**
 * Created by Eddy on 2016/3/2.
 */
public class QuickSort {
    int[] List = new int[]{
            4,-2,6,4,9,5,2,3,7,8
    };

    public void sort(){
         quickSort(List,0,List.length-1);
         StringBuffer buffer = new StringBuffer("");
        for (int x : List){
            buffer.append(x + " ");
        }
        System.out.println(buffer.toString().trim());
    }

    private void quickSort(int[] list , int first ,int last){
        if(last > first){
            int pivotIndex = check(list,first,last);
            quickSort(list,first,pivotIndex -1);
            quickSort(list, pivotIndex +1, last);
        }
    }

    private int check(int[] list, int first,int last){
        int pivot = list[first];
        int high = last;
        int low = first + 1;

        while(high > low){
            while(low <= high && list[low] <= pivot){
                low++;
            }
            while(low <= high && list[high] > pivot){
                high--;
            }
            if(high > low){
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while(high > first && list[high] >= pivot){
            high--;
        }

        if(pivot > list[high]){
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else{
            return first;
        }
    }
}
