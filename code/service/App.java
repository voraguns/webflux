package service;

class Queue<Type> {
    Object[] data = new Object[5];
    int front, rear;
    void add(Type x) {
        if (rear >= data.length) {
            Object[] temp = new Object[2 * data.length];
            for(int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp; // swap address
        }
        data[rear++] = x;
    }
    Type get() {
        return (Type)data[front++];
    }
}
