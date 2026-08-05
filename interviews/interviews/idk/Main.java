public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Creating individual nodes
        Node firstNode = new Node(3);
        Node secondNode = new Node(5);
        Node thirdNode = new Node(13);
        Node fourthNode = new Node(2);

        // Linking nodes together
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        // Printing linked list
        Node currentNode = firstNode;
        Node prevNode = firstNode;
        while (currentNode != null) {
            if(currentNode.data == 5)
            {
                prevNode.next = currentNode.next;
                System.out.println("5removed");
            }
            else{
                prevNode = currentNode;
                System.out.println(currentNode.data);
            }
            
            currentNode = currentNode.next;
        }

        Node cNode = firstNode;
        while (cNode != null) {
            
            System.out.println(cNode.data);
            cNode = cNode.next;
        }

        
        System.out.println("null");
    }
}