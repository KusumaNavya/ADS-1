class Node {
    String data;
    Node next;
    Node(String val) {
        this.data = val;
    }
}
class LinkedList {
    Node first;
    int size;
    LinkedList() {
        first = null;
        size = 0;
    }
    void insertAt(int index, String val) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception();
        }
        Node element = new Node(val);
        first = insertAt(index, first, element, 0);
    }
    Node insertAt(int index, Node first, Node element, int count) {
        if (count == index) {
            element.next = first;
            size++;
            return element;
        }
        first.next = insertAt(index, first.next, element, count+1);
        return first;
    }
    void reverse() throws Exception {
        if (first == null) {
            throw new Exception();
        }
        reverse (null, first);
    }
    void reverse(Node prev, Node current) {
        if(current != null) {
            reverse(current, current.next);
            current.next = prev;
        } else {
            first = prev;
        }

        
    }
    void display() {
        Node temp = first;
        String str = "";
        while(temp != null) {
            str += temp.data + ", ";
            temp = temp.next;
        }
        System.out.println(str.substring(0, str.length()-2));
    }
}
