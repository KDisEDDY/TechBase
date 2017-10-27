import duotaiPackage.animal;
import duotaiPackage.dog;
import innerClass.Door;

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

    }
}
