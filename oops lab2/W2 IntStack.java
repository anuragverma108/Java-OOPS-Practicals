/*A. Creat a class to represent stack (for
integer data).*/

import java.util.*;
class IntStack {
    private int[] stackArray;
    private int top;
    public IntStack(int size){
        stackArray=new int[size];
        top=-1;
    }
    public void push(int value){
        if ( top==stackArray.length-1){
            throw new StackOverflowError("Stack is full");
        }
        stackArray[++top]=value;
    }
    public int pop(){
        if ( top==-1){
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }
    public int peek(){
        if ( top==-1){
            throw new EmptyStackException();
        }
        return stackArray[top];
    }
    public boolean isEmpty(){
            return top==-1;
        }
    }