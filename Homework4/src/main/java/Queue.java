
public class Queue<T> {
    private T[] array;
    private int index;

    public Queue(int length){
        this.index = 0;
        this.array = (T[])( new Object[length]);
    }

    public int size(){
        return this.index;
    }

    public boolean empty(){
        return this.size() == 0;
    }
    public void offer(T value){
        if (index < array.length)
            this.array[index++] = value;
    }

    public  T peek(){
        if (index > 0)
            return this.array[0];
        return null;
    }

    public T poll(){
        if (index > 0) {
            for (int i = 0; i < this.size() - 1; i++)
                this.array[i] = this.array[i + 1];
            return this.array[0];
        }
        return null;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(100);
        System.out.println(stack.size());
        for (int i = 0; i < 110; i++)
            stack.push("string" + i);
        System.out.println(stack.size());
        System.out.println(stack.pop());
    }
}
