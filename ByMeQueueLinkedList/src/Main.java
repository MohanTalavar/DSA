public class Main {
    public static void main(String[] args) {

        QueueLL q = new QueueLL();
        q.insert(10);
        q.insert(20);
        q.insert(30);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println(q);

    }
}