package ru.habrahabr.blogs.java.OCPJP1.question9;

/**
 * В результате выполнения данного кода:
 * 1. Он даже не скомпилируется
 * 2. Результат зависит от реализации JVM
 * 3. Будет выведено «QBANK»
 * 4. Будет выведено «In Sub» и «QBANK»
 * 5. Все ответы неверны
 */
class Super {
    static String ID = "QBANK";
}

class Sub extends Super {
    static {
        System.out.print("In Sub");
    }
}

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println(Sub.ID);
    }
}

/**
 * Статик-блоки запускаются во время инициализации класса. Весь вопрос в том, когда класс инициализируется, а это происходит в следующих случаях:
 *  1. Когда вызывается метод, непосредственно находящийся в данном классе (а не наследующийся от суперкласса)
 *  2. Когда вызывается конструктор данного класса, либо когда создается массив объектов данного класса
 *  3. Когда читается либо присваивается поле, которое не является константой
 * В данном случае, ни одно из этих трех условий не выполнялось, таким образом, класс Sub не инициализировался.
 */