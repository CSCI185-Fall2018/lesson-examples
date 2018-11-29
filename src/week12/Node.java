package week12;

class Node<T>
{
    private T data;
    protected Node<T> next;

    // TODO: add another attribute for previous direction

    public Node(T data)
    {
        this.data = data;
    }

    public String toString()
    {
        return "<" + data + ">";
    }

    public boolean hasNext()
    {
        return next != null;
    }

    static void traverse(Node start)
    {
        if (start != null)
        {
            System.out.print(start);
            System.out.print(", ");
            traverse(start.next);
        }
    }

    public static void main(String[] args)
    {
        Node<Integer> a = new Node<>(5), b = new Node<>(8);
        Node<Integer> c = new Node<>(6);

        a.next = b;
        b.next = c;

//        System.out.println(a);
//        System.out.println(b);

        traverse(a);
        // <5>, <22>, <8>,
    }
}