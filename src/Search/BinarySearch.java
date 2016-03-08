package Search;

/**
 * 递归实现折半查找算法
 * Created by Eddy on 2016/3/6.
 */
public class BinarySearch {
    int[] List = new int[]{
        1,2,3,4,5,6,7,8,9,10
    };

    public boolean BeginSearch(int item){
        return search(item,0,List.length -1);
    }

    public boolean search(int item , int first , int last){
        if(first >= 0 && last <= List.length -1){
            int mid = (last + first) /2;
            if(List[mid] > item){
                 return search(item,first,mid);
            }
            else if(List[mid] < item){
                return search(item,mid,last);
            }
            else{
                return true;
            }
        }
        return false;
    }

}
