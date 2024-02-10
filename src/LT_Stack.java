public class LT_Stack implements IsStackAndQueue{


    private int[] array;
    private int SIZE;
    private int topIndex;

    LT_Stack(int size){
        this.SIZE = size;
        array = new int[SIZE];
        topIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            topIndex++;
            array[topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() throws Exception {
        if (!isEmpty()){
            int value = array[topIndex--];
            return value;
        }else {
            throw new Exception("Not element in stack");
        }
    }

    @Override
    public boolean isFull() {
        return topIndex == SIZE-1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }
}
