public class custom_LinkedList {
    Node head ;


    public void insert(int data) {
        Node new_Node = new Node(data);
        if (head == null) {
            head = new_Node;
        }
        else{
            Node current = head;
            while (current.next != null){
                current=current.next;
            }
            current.next =new_Node;
        }
    }

    public void display(){
        Node current = head ;
        while (current!=null){
            System.out.println(current.data);
            current = current.next ;
        }
    }
    public static void main(String[] args){
        custom_LinkedList ll = new custom_LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.display();
    }







}
