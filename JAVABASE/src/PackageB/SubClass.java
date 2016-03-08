package PackageB;

import PackageA.FatherClass;
import PackageA.SubClassA;

/**
 * Created by Administrator on 2016/3/5.
 */
public class SubClass extends SubClassA {

    protected void subprint(){
        System.out.println("the subclass's number is " + number);
    }

}
