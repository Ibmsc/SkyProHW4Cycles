public class Main {
    public static void main(String[] args) {

        /*Подсказка по работе с выводом символов в строку. Для вывода чисел в строку рекомендуется использовать метод
        System.out.print(n + " ");
        где n -- необходимая к выводу переменная.
        Для перехода на новую строку следует использовать
        System.out.println(); или System.out.print("\n");
        где '\n' -- символ новой строки.
        Его печать заставляет переключиться на следующую строку.
         */

        System.out.println("Задача №1 ");
        /* Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        Не забудьте выполнить переход на новую строку между двумя циклами.
        */
        int x = 0;
        while (x <10){
            x++;
            System.out.print(x + " ");}

            System.out.print("\n");

        for (int y = 10; y > 0;y--){

            System.out.print(y + " ");
        }
        }
    }
