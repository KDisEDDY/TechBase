package src.Tree;

/**
 * 二叉树节点
 * Created by Eddy on 2016/3/13.
 */
public class BinaryNode<E> {
      public E element;
      public BinaryNode<E> left, right;

    public BinaryNode(E element, BinaryNode<E> left, BinaryNode<E> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public BinaryNode( E data){
        this(data,null,null);
    }

    public BinaryNode(){
        this(null,null,null);
    }

    public boolean isLeaf(){
        return this.left == null && this.right == null;
    }

    public String toString(){
        return this.element.toString();
    }
}
