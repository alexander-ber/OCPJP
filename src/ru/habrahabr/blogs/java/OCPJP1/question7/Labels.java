package ru.habrahabr.blogs.java.OCPJP1.question7;

/**
 * Данный код:
 * 1. Не скомпилируется из-за строки 1
 * 2. Не скомпилируется из-за строки 2
 * 3. Не скомпилируется из-за строки 3
 * 4. Не скомпилируется из-за строки 4
 * 5. Скомпилируется и запустится без проблем
 */
public class Labels {
    public static void main(String... args) {
        doIt("i = ");
    }

    public static void doIt(String String) { //1
        int i = 10;
        i:
        for (int k = 0; k < 10; k++) { //2
            System.out.println(String + i); //3
            if (k * k > 10) continue i; //4
        }
    }
}

/**
 * Этот код работает ).
 * Вернемся к нашей задаче. String это не ключевое слово, поэтому его можно использовать как идентификатор.
 * Второй момент — джава хранит идентификаторы меток отдельно от всех остальных идентификаторов.
 * Поэтому допускается использование одинаковых идентификаторов.
 */
