package src.Tree;

/**
 * Created by Administrator on 2016/3/13.
 */
public class BinaryTree<E> {
    protected BinaryNode<E> root;

    public BinaryTree(){
        this.root = null;
    }

    public BinaryTree(BinaryNode<E> root) {
        this.root = root;
    }

    public BinaryTree(E[] items){
        this.root = create(items,0);
    }

    private BinaryNode<E> create(E[] items , int i){
        BinaryNode<E> p = null;
        if(i < items.length){
            p = new BinaryNode<E>(items[i]);
            p.left = create(items,2*i+ 1);
            p.right = create(items,2*i +2);
        }
        return p ;
    }


    public boolean isEmpty(){
        return this.root == null;
    }

    public BinaryNode<E> getRoot(){
        return this.root;
    }



    /**
     * 先根遍历
     */
    public void preOrder(){
        System.out.println("先根序列：");
        preOrder(root);
    }

    private void preOrder(BinaryNode<E> node){
        if(node != null){
            System.out.println(node.element + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    /**
     * 中根遍历
     */
    public void inOrder(){
        System.out.println("先根序列：");
        inOrder(root);
    }

    private void inOrder(BinaryNode<E> node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.element + " ");
            inOrder(node.right);
        }
    }

    /**
     * 后根遍历
     */
    public void postOrder(){
        System.out.println("先根序列：");
        postOrder(root);
    }

    private void postOrder(BinaryNode<E> node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.element + " ");
        }
    }

    public int count(){
        return count(root);
    }

    private int count(BinaryNode<E> node){
        if(node != null){
            return 1+ count(node.left) + count(node.right);
        }
        else {
            return 0;
        }
    }

    public int height(){
        return height(root);
    }

    private int height(BinaryNode<E> node){
        if(node != null){
            int rh = height(node.right);
            int lh = height(node.left);
            return (rh >= lh) ? rh : lh;
        }
        else {
            return 0;
        }
    }
}
