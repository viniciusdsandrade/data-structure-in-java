package LinkedList.Disordered;

public class LinkedListCircularDisordered<X> implements Cloneable {

    public class Node implements Cloneable {
        public X elemento;
        public Node proximo;

        public Node() {
        }

        public Node(X elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }

        public Node(X elemento, Node proximo) {
            this.elemento = elemento;
            this.proximo = proximo;
        }

        @Override
        public Object clone() {
            return null;
        }
    }

    public Node primeiro;
    public Node ultimo;

    public LinkedListCircularDisordered() {
        primeiro = null;
        ultimo = null;
    }

    public Node getPrimeiro() {
        return primeiro;
    }

    public Node getUltimo() {
        return ultimo;
    }

    public void add(X elemento) {
        Node novo = new Node(elemento);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
            novo.proximo = primeiro;
            return;
        }

        ultimo.proximo = novo;
        ultimo = novo;
        ultimo.proximo = primeiro;
    }

    @Override
    public String toString() {
        if (primeiro == null) {
            return "[]";
        }

        StringBuilder result = new StringBuilder("[");
        Node temp = primeiro;
        boolean primeiroElemento = true;

        do {
            if (!primeiroElemento) {
                result.append(" -> ");
            } else {
                primeiroElemento = false;
            }
            result.append(temp.elemento);
            temp = temp.proximo;
        } while (temp != primeiro);

        result.append("]");
        return result.toString();
    }




    @Override
    public Object clone() {
        return null;
    }
}