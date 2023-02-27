public class Stack<dataType> {
    private class Node {
        dataType data;
        Node next;

        public Node(dataType data) {
            this.data = data;
        }
    }

    Node top;

    public void push(dataType data) {
        Node node = new Node(data);
        if (top != null) {
            node.next = top;
        }
        top = node;
    }

    public dataType pop() {
        if (top != null) {
            dataType data = top.data;
            top = top.next;
            return data;
        }
        return null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        StringBuilder stack = new StringBuilder("[");
        Node current = top;
        while (current.next != null) {
            stack.append(current.data);
            stack.append(", ");
            current = current.next;
        }
        stack.append(current.data);
        stack.append("]");
        return stack.toString();
    }
}
