package src.Tree;

/**
 * Created by Administrator on 2016/3/13.
 */
public interface BinaryTTree<E> {
    boolean isEmpty();
    E getRoot();
    E getParent(E child);
    int getChildCount(E parent);
    E getFirstChild(E parent);
    E getnexSibling(E parent);
    void traverse();
    void insert(E parent,E eleement);
    void remove(E parent);
    void clear();
}
