package com.java.collections.basic.ds;

interface iStack {
    void push(int data);

    int pop() throws Exception;

    int length();

    boolean isFull();

    boolean isEmpty();

    void display();
}


public class StackDS implements iStack {
    //Placeholder to have elements in it
    private int arr[];
    //represents the top of the stack
    private int top = -1;
    //represents the size of the stack
    private int capacity = 5;

    public StackDS() {
        this.arr = new int[capacity];
    }

    public static void main(String[] args) throws Exception {

        StackDS stackDS = new StackDS();
        stackDS.push(12);
        stackDS.push(34);
        stackDS.push(15);
        stackDS.push(45);
        stackDS.display();
        stackDS.pop();
        stackDS.pop();
        stackDS.display();
    }

    @Override
    public void push(int data) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        //arr[++top] = data;
        ++top;
        arr[top] = data;
        System.out.println("Inserting the element : " + data);
    }

    @Override
    public int pop() throws Exception {

        if (isEmpty()) {
            throw new Exception("Stack Underflow error");
        }

        int dataRemoved = arr[top];
        System.out.println("\nRemoving the element : " + dataRemoved);
        top--;
        return dataRemoved;
    }

    @Override
    public int length() {
        return top + 1;
    }

    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void display() {
        System.out.println("\n*********Elements in the stack are... ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
