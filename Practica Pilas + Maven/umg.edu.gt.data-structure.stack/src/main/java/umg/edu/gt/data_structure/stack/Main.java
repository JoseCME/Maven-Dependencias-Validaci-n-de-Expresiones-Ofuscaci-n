package umg.edu.gt.data_structure.stack;

import umg.edu.gt.data_structure.stack.impl.SymbolValidator;
import umg.edu.gt.data_structure.stack.manual.StackLinked;

public class Main {
    public static void main(String[] args) {
        StackLinked stack = new StackLinked();

        stack.push('A');
        stack.push('B');
        stack.push('C');

        System.out.println("Tamanio? " + stack.size());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Vacia? " + stack.isEmpty());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Vacia? " + stack.isEmpty());
        System.out.println("Pop: " + stack.pop());	

        SymbolValidator symbolValidator = new SymbolValidator();
        System.out.println(symbolValidator.isBalanced("(a+b) * [c-d]"));
        System.out.println(symbolValidator.isBalanced("([)]"));
    }
}