package com.ArmanBekmuratov.javacore.chapter10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("В теле метода procA().");
            throw new RuntimeException("demonstration");
        } finally {
            System.out.println("Блок оператора finally в методе procA");
        }
    }

    static void procB() {
        try {
            System.out.println("В теле метода procB");
        } finally {
            System.out.println("блок оператора finally в методе procB");
        }
    }

    static void procC() {
        try {
            System.out.println("В теле метода procB");
        } finally {
            System.out.println("блок оператора finally в методе procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено");
        }
        procB();
        procC();
    }
}
