package PackageB;

/**
 * Created by Administrator on 2016/3/5.
 */
public class MainClass {
    public MainClass() {
        SubClass subClass = new SubClass();
        subClass.subprint();                     //无法调用从祖先类上继承过来的protected 变量 number，因为当前类与祖先类FatherClass不是在同个包里面
    }
}
