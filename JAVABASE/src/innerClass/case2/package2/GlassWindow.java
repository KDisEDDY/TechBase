package innerClass.case2.package2;

import innerClass.DecorationInterface;
import innerClass.case2.package1.Window;

/**
 * Created by EDDY on 2017/10/29.
 */
public class GlassWindow extends Window {
    public GlassWindow(int width, int height) {
        super(width, height);
    }

    public DecorationInterface getGlassWindowFunction(){
        return this.getWindowFunction();
    }



}
