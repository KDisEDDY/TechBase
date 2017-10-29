package innerClass.case2.package1;

import innerClass.DecorationInterface;

/**
 * Created by EDDY on 2017/10/29.
 */
public class Window {
    private int width = 0;
    private int height = 0;

    public Window(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public WinFunction getWindowFunction(){
        return new WinFunction("window size width:" + width + ",height:" + height);
    }

    /**
     * 通过修饰符private可以为实现的功能做隐藏
     */
    protected class WinFunction implements DecorationInterface {
        private String info;

        WinFunction(String info) {
            this.info = info;
        }

        @Override
        public void function() {
            System.out.println(info);
        }


    }

}
