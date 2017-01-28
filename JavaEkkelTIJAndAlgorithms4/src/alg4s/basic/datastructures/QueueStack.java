package alg4s.basic.datastructures;

/**
 * Created by halfmediator on 25.01.2017.
 */
public class QueueStack<T> {
    private Queue<T> queue = new Queue<T>();

    public void push(T x){
        queue.enqueue(x);
        int sz = queue.size();
        while (sz > 1){
            queue.enqueue(queue.dequeue());
            sz--;
        }
    }
    public void pop(){
        queue.dequeue();
    }
}
