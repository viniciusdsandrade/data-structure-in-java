package LinkedList.Tests.Ordered.LinkedListOrdered;

import LinkedList.Ordered.LinkedListOrdered;

public class TestLinkedListOrdered {

    // Método para verificar se a lista é simplesmente encadeada
    public static <X extends Comparable<X>> boolean verificaSimplesmenteEncadeada(LinkedListOrdered<X> lista) {
        // Verifica se a lista está vazia ou contém apenas um elemento
        if (lista.primeiro == null || lista.primeiro.proximo == null) return true;

        // Verifica se há algum nó com mais de uma referência para o próximo nó
        LinkedListOrdered<X>.Node current = lista.primeiro;
        while (current != null) {
            if (countReferencesToNext(current) > 1) return false;
            current = current.proximo;
        }

        return true;
    }

    // Método auxiliar para contar as referências para o próximo nó de um determinado nó
    private static <X extends Comparable<X>> int countReferencesToNext(LinkedListOrdered<X>.Node node) {
        int count = 0;
        LinkedListOrdered<X>.Node current = node;
        while (current != null) {
            if (current.proximo == node) count++;
            current = current.proximo;
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        LinkedListOrdered<Integer> int_list = new LinkedListOrdered<>();
        int_list.add(2);
        int_list.add(1);
        int_list.add(4);
        int_list.add(3);
        int_list.add(5);
        int_list.add(0);
        System.out.println("List: " + int_list);

        // Verificando se a lista é simplesmente encadeada
        boolean isSinglyLinked = verificaSimplesmenteEncadeada(int_list);
        System.out.println("A lista é simplesmente encadeada: " + isSinglyLinked);

        LinkedListOrdered<Character> char_list = new LinkedListOrdered<>();
        char_list.add('b');
        char_list.add('a');
        char_list.add('d');
        char_list.add('c');
        char_list.add('e');
        System.out.println("Char List: " + char_list);

        LinkedListOrdered<String> str_list = new LinkedListOrdered<>();
        str_list.add("Vinícius");
        str_list.add("Ana");
        str_list.add("Carlos");
        str_list.add("Bruna");
        str_list.add("Eduardo");
        System.out.println("String List: " + str_list);

        LinkedListOrdered<Double> double_list = new LinkedListOrdered<>();
        double_list.add(2.0);
        double_list.add(1.0);
        double_list.add(4.0);
        double_list.add(3.0);
        double_list.add(5.0);
        System.out.println("Double List: " + double_list);

        LinkedListOrdered<Float> float_list = new LinkedListOrdered<>();
        float_list.add(2.0f);
        float_list.add(1.0f);
        float_list.add(4.0f);
        float_list.add(3.0f);
        float_list.add(5.0f);
        System.out.println("Float List: " + float_list);

        LinkedListOrdered<Long> long_list = new LinkedListOrdered<>();
        long_list.add(2L);
        long_list.add(1L);
        long_list.add(4L);
        long_list.add(3L);
        long_list.add(5L);
        System.out.println("Long List: " + long_list);

        LinkedListOrdered<Short> short_list = new LinkedListOrdered<>();
        short_list.add((short) 2);
        short_list.add((short) 1);
        short_list.add((short) 4);
        short_list.add((short) 3);
        short_list.add((short) 5);
        System.out.println("Short List: " + short_list);

        LinkedListOrdered<Byte> byte_list = new LinkedListOrdered<>();
        byte_list.add((byte) 2);
        byte_list.add((byte) 1);
        byte_list.add((byte) 4);
        byte_list.add((byte) 3);
        byte_list.add((byte) 5);
        System.out.println("Byte List: " + byte_list);
    }
}
