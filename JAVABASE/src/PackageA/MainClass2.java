package PackageA;

import PackageB.SubClass;

/**
 * Created by Administrator on 2016/3/5.
 */
public class MainClass2 {
    SubClass subClass = new SubClass();

    public MainClass2(SubClass subClass) {
        this.subClass = subClass;
        System.out.println("protected变量number");          //调用从祖先类上继承过来的protected 变量 number，因为当前类与祖先类FatherClass在同个包里面
    }
}
