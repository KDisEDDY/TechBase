package innerClass.case3;

/**
 * Created by EDDY on 2017/10/29.
 */
public class PaperCut {

    private String mPaperShape;

    public PaperCut(String mPaperShape) {
        this.mPaperShape = mPaperShape;
    }

    protected void cutPaper(){
        System.out.println("the shape of paper is " + mPaperShape);
    }
}
