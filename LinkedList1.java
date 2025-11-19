

     class Node {
         int data;
         Node next;


         Node(int data) {
             this.data = data;
             this.next = null;
         }
     }
    public  class LinkedList1 {

        Node head;


        public void append(int data) {
            Node node = new Node(data);
            if (head == null) {
                head = node;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;


        }

        public void deleteAtIndex(int val) {

            if (head == null) {
                return;
            }
            Node current = head;
            for (int i = 1; i < val - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }


        public void insertAtIndex(int val) {
            Node node = new Node(20);
            if (head == null) {
                head = node;
            }
            Node current = head;
            for (int i = 1; i < val - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }

        public void display() {
            Node current = head;

            while (current != null) {


                System.out.println(current.data);

                current = current.next;


            }
        }

        public void mergeLL(LinkedList1 ll) {
            if (head == null) {
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = ll.head;
        }

        public int CountNodes() {

            if (head == null) {
                return 0;
            }
            int count = 0;
            Node current = head;
            while (current != null) {
                current = current.next;
                count = count + 1;
            }
            return count;
        }

        public void CircularList() {
            if (head == null)
                return;
            Node current = head;
            while (current.next != null) {
                current = current.next;

            }
            current.next = head;

        }

        public void deletecycle() {
            if (head == null || head.next == null) {
                return ;
            }
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    break;
                }
                slow = head;
                while (fast != slow) {


                    slow = slow.next;
                    fast = fast.next;

                }

                Node cycleStrat = slow;
                Node ptr = cycleStrat;
                while (ptr.next != cycleStrat) {
                    ptr = ptr.next;
                }
                ptr.next = null;
            }

        }




            static void main (String[]args){

                LinkedList1 ll = new LinkedList1();
                LinkedList1 ll2 = new LinkedList1();
                ll2.append(10);
                ll2.append(6);
                ll2.append(9);

                ll.append(15);
                ll.append(14);
                ll.append(16);
                ll.append(17);

                //ll.display();
                //ll.deleteAtIndex(3);
                //ll.display();
                //ll.insertAtIndex(2);
                //ll.display();
                //ll.mergeLL(ll2);
                //ll.display();
                //ll.CountNodes();
                //System.out.println(ll.CountNodes())


                ll.CircularList();

                // ll.display();

                ll.deletecycle();
                ll.display();


            }


        }


