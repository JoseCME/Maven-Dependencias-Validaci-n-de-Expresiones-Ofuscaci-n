package umg.edu.gt.data_structure.stack.manual;

public class StackLinked {

    private Node top;    // tope (cabeza) de la pila
    private Node init;   // nodo inicial (fondo de la pila)

    public boolean isEmpty() {
        return top == null;
    }

    public void push(char value) {
        if (isEmpty()) {
            top = new Node(value, null, 0);
            init = top; // el primer nodo es también el fondo
        } else {
            top = new Node(value, top, top.count);
        }
    }

    public char pop() {
        if (isEmpty()) return '0';
        char value = top.value;
        top = top.next;
        if (top == null) init = null; // pila quedó vacía
        return value;
    }

    public char peek() {
        if (isEmpty()) throw new IllegalStateException("Stack underflow");
        return top.value;
    }

    public int size() {
        return isEmpty() ? 0 : top.count;
    }

    // Requerimiento de la tarea: devuelve cantidad de elementos
    public int getCount() {
        return size();
    }

    // Requerimiento de la tarea: devuelve el nodo del fondo (no el tope)
    public Node getNodeInit() {
        return init;
    }
}
