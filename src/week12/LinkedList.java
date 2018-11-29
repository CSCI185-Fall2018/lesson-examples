package week12;

class LinkedList<T>
{

    private Node<T> head = null;
    private Node<T> tail = null;

    private int size = 0;

    public void add(T data)
    {
        // create the new node
        Node<T> node = new Node<>(data);

        // check for empty list
        if (head == null)
        {
            head = node;
            tail = node;
        }

        // list is not empty
        else
        {
            tail.next = node;
            tail = node;
        }

        // increment size
        size++;
    }

    // TODO: add delete method; delete method should return data of deleted node

    // TODO: modify add / delete methods to operate at head or tail
    // addHead, addTail, delHead, delTail

    public int getSize()
    {
        return size;
    }

    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        Node<T> curr = head;
        builder.append("[");
        while(curr != null)
        {
            builder.append(curr.toString());
            builder.append(", ");
            curr = curr.next;
        }
        builder.deleteCharAt(builder.length()-1);
        builder.deleteCharAt(builder.length()-1);
        builder.append("]");
        return builder.toString();
    }

    public static void main(String[] args)
    {
        LinkedList<Character> mylist = new LinkedList<>();
        mylist.add('A');
        mylist.add('B');
        mylist.add('C');
        mylist.add('D');
        mylist.add('E');

//        Node.traverse(mylist.head);

        System.out.println(mylist.getSize());
        System.out.println(mylist);

        // [A, B, C]
    }
}