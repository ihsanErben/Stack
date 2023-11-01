
public class Stack {

    int size;
    int cnt = 0;
    Node top;

    public Stack(int size) {
        this.size = size;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isFull()) {
            System.out.println("--- FULLL ---");
        } else {
            if (cnt == 0) {
                top = newNode;
                System.out.println("first data was added.");
            } else {
                newNode.next = top;
                top = newNode;
                System.out.println("data was added: " + data);
            }
            cnt++;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("--- EMPTY ---");
        } else {
            System.out.println("top: " + top.data + " -->-->-->");
            top = top.next;
            cnt--;
        }
    }

    public void top() {
        if (isEmpty()) {
            System.out.println("--- EMPTY ---");
        } else {
            System.out.println("Top: " + top.data);
        }
    }

    public void print() {
        if (cnt == 0) {
            System.out.println("--- EMPTY ---");
        } else {
            Node tmp = top;
            while (tmp != null) {
                System.out.println(tmp.data);
                System.out.println("|");
                tmp = tmp.next;
            }
        }
    }

    public boolean isFull() {

        return (cnt == size);
    }

    public boolean isEmpty() {

        return (cnt == 0);
    }
}
