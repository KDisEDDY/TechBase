package innerClass.case3;

import innerClass.DecorationInterface;
import innerClass.case2.package1.Window;

/**
 * 利用内部类实现多重继承
 * Created by EDDY on 2017/10/29.
 */
public class PapercutGlassWindow extends Window{

    private PaperCutFunction mPaperCutFunction;

    public PapercutGlassWindow(int width, int height , String shape) {
        super(width, height);
        mPaperCutFunction = new PaperCutFunction(shape);
    }

    public void getPaperShape(){
        mPaperCutFunction.cutPaper();
    }

    public void describeFunction(){

    }

    private class PaperCutFunction extends PaperCut{

        public PaperCutFunction(String mPaperShape) {
            super(mPaperShape);
        }
    }
}
