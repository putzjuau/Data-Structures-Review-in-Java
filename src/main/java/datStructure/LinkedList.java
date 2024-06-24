package datStructure;


public class LinkedList {


    private Node head;

    private Node tail;

    private int length;


    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    public LinkedList(String data) {
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;

    }

    public void getHead() {
        if (this.head == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Head: " + head.data);
        }
    }

    public void getTail() {
        if (this.head == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("tail: " + tail.data);
        }
    }

    public void getLength() {
        System.out.println("Length " + this.length);
    }

    //para esvaziar a lista
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void print() {
        System.out.println("#######################");
        Node temp = this.head; // o temporario navegara apartir da cabeca item a item
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next; // passando ao proximo da fila
        }
        System.out.println("#######################");


    }

    public void append(String data) {
        Node newNode = new Node(data);
        if (length == 0) { //caso a lista esteja vazia sera criado cabeca e cauda
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; //cauda atual antes da insercao
            //passando o novo ponteiro se n
            tail = newNode; //novo nó se tornando a cauda
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node pre = head;
        Node temp = null;

        while (pre.next != tail) { //enquanto n for o penultimo elemento, navegara na lista
            pre = pre.next;
        }
        //antes de movimentar a cauda salvaremos o ultimo valor
        temp = tail;

        //fazendo a remocao, tornando o penultimo como ultimo elemento da listal-
        tail = pre;
        tail.next = null;

        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public void preprend(String data) { //Inserindo no inicio
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) { // por segurança, caso a lista esteja vazia
            head = null;
            tail = null;

        }
        return temp;
    }

    //ler de um determinada posicao
    public Node get(int index) {
        if (index < 0 || index >= length) return null;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //insert em uma posicao , o qual retorna um boolean
    public boolean insert(int index, String data) {
        if (index < 0 || index >= length) return false;

        if (index == 0) {
            preprend(data);
            return true;
        }
        if (index == length) {
            append(data);
            return true;
        }

        Node newNode = new Node(data);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    //mudancas
    public boolean set(int index, String data) {
        Node temp = get(index);
        if (temp != null) {
            temp.data = data;
            return true;
        }
        return false;
    }

    //remover um elemento de tal posicao
    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        //manipulando manipulador
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;


    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList("elemento 1");
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.preprend("elemento 0");


        list.remove(2);
//        list.insert(2, "elemento 2.5");
//
////        System.out.println(list.get(2).data);
////       System.out.println(list.removeFirst().data);
        list.print();
//
//        list.set(1, "Elemento 0.5 ");
//        list.print();
////        list.getHead();
//        list.getTail();
//        list.getLength();
//        list.print();
    }
}
