package duotaiPackage;

/**
 * Created by Administrator on 2016/3/5.
 */
public class dog extends animal{
    @Override
    public void cry() {
        System.out.println("汪汪");
    }

    protected  void smile(){
        System.out.println("smile dog");
    }
}
