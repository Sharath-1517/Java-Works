package dataStructures;

public class StackLinkedList{
    Node head;

    class Node{
        int value;
        Node next;
    }
    StackLinkedList(){
        head = null;
    }

    public void push(int value){
        Node extraNode = head;
        head = new Node();
        head.value = value;
        head.next = extraNode;
    }
    public void pop(){
        if(head!=null){
            int value = head.value;
            head = head.next;
            System.out.println("The Popped element is..." + value);
        }
        else System.out.println("Stack is empty...");
    }

    public void printAll(){
        if(head==null) System.out.println("There are no elements to print");
        else{
            Node temp = head;
            while(temp!=null){
                int value  = temp.value;
                temp = temp.next;
                System.out.println(value);
            }
        }
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.pop();
        s.printAll();
        s.push(10);
        s.push(20);
        s.push(60);
        s.push(90);
        s.push(55);
        s.push(65);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.push(45);
        s.push(55);
        s.push(95);
        s.printAll();

    }
}