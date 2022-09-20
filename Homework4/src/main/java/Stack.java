public class Stack<T> {
    private T[] array;
    private int index;

    public Stack(int length){
        this.index = 0;
        this.array = (T[])( new Object[length]);
    }

    public int size(){
        return this.index;
    }

    public boolean empty(){
        return this.size() == 0;
    }
    public void push(T value){
        if (index < array.length)
            this.array[index++] = value;
    }

    public  T peek(){
        if (index > 0)
            return this.array[--index];
        return null;
    }

    public T pop(){
        if (index > 0)
            return this.array[--index];
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
