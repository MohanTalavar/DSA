public class QueueLL {

    private Node head;
    private Node tail;

    public QueueLL() {
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null && tail == null;
    }

    public boolean insert(int data){
        Node newNode = new Node(data);

        // first elem

        if(head == null && tail == null){
            head = newNode;
            tail = head;
        }

        // insert at another position
        tail.setNext(newNode);
        tail = newNode;
        return true;

    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty !!");
            return -1;
        }

        // checking single elem
        if(head == tail){
            tail = null;
        }

        int front = head.getData();
        head = head.getNext();
        return front;
    }

    public int peek(){
        if(isEmpty()){
            return -1;

        }

        return head.getData();
    }
















}
