package src.LinearList;

/**
 * 线性表接口
 * Created by Eddy on 2016/3/8.
 */
public interface LList<E> {
    boolean isEmpty();
    int size();
    E get(int index);
    E set(int index, E element);
    boolean add(int index , E element);
    boolean add(E element);
    E remove(int index);
    void clear();
}
