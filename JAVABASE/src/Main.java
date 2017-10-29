import duotaiPackage.animal;
import duotaiPackage.dog;
import innerClass.DecorationInterface;
import innerClass.Door;
import innerClass.case2.package2.GlassWindow;
import innerClass.case3.PapercutGlassWindow;

import static innerClass.Door.Function.TYPE_OPEN;

/**
 * Created by Administrator on 2016/3/5.
 */
public class Main {
    public static void main(String args[]){
        animal mAnimal;
        mAnimal = new dog();
        mAnimal.cry();                          //向上转型对象，只能调用子类重写的方法和自己没被重写的方法
        mAnimal.get();

        //测试内部类
        Door door = new Door(60,220);
        Door.Function functionOpt = door.getFunction();
        functionOpt.funciton(TYPE_OPEN);

        //内部类声明为protected无法被引用
//        Window window = new Window();
//        Window.WinFunction function = window.new WinFunction();

        GlassWindow glassWindow = new GlassWindow(100, 220);
        DecorationInterface decorationInterfaceImpl = glassWindow.getGlassWindowFunction();
        decorationInterfaceImpl.function();

        //通过内部类实现了多重继承的功能，并隐藏了内部类的实现细节
        PapercutGlassWindow papercutGlassWindow = new PapercutGlassWindow(100 , 240,"SnowShape");
        papercutGlassWindow.getWindowFunction();
        papercutGlassWindow.getPaperShape();
    }
}
