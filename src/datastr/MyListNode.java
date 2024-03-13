package datastr;

public class MyListNode<T> {

    //TODO
    //1. variables - element, next un previous
    //2 get and set
    //3 contructors
    //4 to string

    //1. variables - element, next un previous
    private T element;
    private MyListNode<T> next = null;

    private MyListNode<T> previous = null;


    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        if(element != null)
            this.element = element;
        else
            this.element = (T) new Object();
    }

    public MyListNode<T> getNext() {
        return next;
    }

    public void setNext(MyListNode<T> next) {
        this.next = next;
    }

    public MyListNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(MyListNode<T> previous) {
        this.previous = previous;
    }

    public MyListNode(T element){
        setElement(element);
    }

    public String toString() {
        return ""+ element;
    }
}
