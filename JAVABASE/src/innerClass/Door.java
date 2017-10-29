package innerClass;

/**
 * Created by EDDY on 2017/10/28.
 */
public class Door {
    private int width = 0;
    private int height = 0;


    public static final int TYPE_OPEN = 1;
    public static final int TYPE_CLOSE = 2;
    //门的状态 2：close ；1：open
    private int state = 2;

    public Door(int width , int height){
        this.width = width;
        this.height = height;
    }

    /**
     * 一般来说都会定义内部类的getter提供给外围的实例
     * @return 内部类
     */
    public Function getFunction(){
        return new Function();
    }



    public class Function{

        public void funciton(int type){
            if(type == TYPE_OPEN){                  //内部类可以调用外围类的成员，包括私有变量
                state = TYPE_OPEN;
                System.out.println("open the door , width:" + width + ",height:" + height);
            } else if(type == TYPE_CLOSE){
                state = TYPE_CLOSE;
                System.out.println("close the door , width:" + width + ",height:" + height);
            }
        }
    }

}
