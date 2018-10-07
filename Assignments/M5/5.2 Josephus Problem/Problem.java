class Problem {
    /**
     * Class for node.
     */
    private class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
        }
    }
    int size;
    int count;
    Node head, tail;
    String result = "";
    Problem(int s, int c) {
        size = s;
        count = c;
    }
    /**
     * FInds the solution to Josephs problem.
     */
    public void josephproblem() {
        Node newnode = new Node(0);
        head = newnode;
        tail = newnode;
        for (int i = 1; i < size; i++) {
            Node n = new Node(i);
            tail.next = n;
            tail = n;
        }
        int c;
        Node temp;
        while (size != 1) {
            for (c = 1; c < count; c++) {
                temp = head;
                head = head.next;
                tail.next = temp;
                tail = temp;
            }
            result += head.data + " ";
            head = head.next;
            c = 1;
            size--;
        }
        result += head.data;
        System.out.println(result);
    }
}
