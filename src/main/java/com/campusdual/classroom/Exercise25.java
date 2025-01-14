package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");
        return stack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        System.out.println("Elemento en la cima de la pila: " + stack.peek());
        System.out.println("Recorriendo y vaciando la pila:");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // Imprime y elimina el elemento de la cima
        }
    }

    public static void main(String[] args) {
        // Crear y poblar la pila
        Stack<String> stack = createStack();

        // Recorrer y vaciar la pila
        printAndEmptyStack(stack);

        // Comprobación para garantizar que la pila está vacía
        if (stack.isEmpty()) {
            System.out.println("La pila está vacía.");
        }
    }



}
