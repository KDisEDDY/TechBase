package src.LinearList;

/**
 * 单链表类
 * Created by Eddy on 2016/3/8.
 */
public class LinkList<E> implements LList<E> {
    Node<E> head;
    int number = 0;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return number;
    }

    @Override
    public E get(int index) {

        if(this.head != null && index > 0){
            int j = 0;
            Node<E> p = head;
            while(p != null && j < index){
               j++ ;
               p = p.next;
            }
            if(p!= null){
                return (E) p.element;
            }
        }
        return null;
    }

    @Override
    public E set(int index, E element) {
        if(head != null && index >= 0 && element != null){
            int j= 0;
            Node<E> p = head;
            while(p != null && j<index){
                j++;
                p = p.next;
            }
            if(p != null){
                E old = (E)p.element;
                p.element = element;
                return old;
            }
        }
        return null;
    }

    @Override
    public boolean add(int index, E element) {
        if(element == null)
            return false;
        if(this.head == null || index <= 0){
            Node<E> p = new Node<E>(element);
            p.next = head;
            head = p;
            // this.head = new Node(element,this.head);
            number ++ ;
            return true;
        }
        else{
            int j = 0;
            Node<E> p = this.head;
            while(p.next != null && j< index -1){
                j++;
                p = p.next;
            }
            Node<E> q = new Node<E>(element);
            q.next = p.next;
            p.next = q;
            // p.next = new Node(element,p.next);
            number ++ ;
            return true;
        }
    }

    //在链表末尾插入对象
    @Override
    public boolean add(E element) {
        int size = number;
        return add(size+ 1,element);
    }

    @Override
    public E remove(int index) {
        if(head != null &&index <= number&& index >= 0){
            if(index == 0){
               E element = head.element;
                head = head.next;
            }
            else{
                Node<E> p = this.head;
                int j = 1;
                while(p.next !=null && j< index -1){
                    j++;
                    p = p.next;
                }
                if(p.next != null){
                    E element = p.element;
                    p.next = (p.next).next;
                    number --;
                    return element;
                }
            }

        }
        return null;
    }

    @Override
    public void clear() {
         this.head = null;
    }

    public boolean changed(){
        Node<E> p = head,front = null, q = null;
        while(p != null){
            q = p.next;
            p.next = front;
            front = p;
             p = q;
        }
        this.head = front;
        return true;
    }

    public String toString(){
        String str = "(";
        Node<E> p = this.head;
        while(p!= null){
            str += p.element.toString();
            p= p.next;
            if(p != null){
                str += ".";
            }
        }
        return str += ")";
    }
}
