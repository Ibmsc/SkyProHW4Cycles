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
        System.out.print("\n");

        System.out.println("Задача №2 ");
        /*
        Нам нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница,
        и выводит сообщение с напоминанием о том, что нужно подготовить еженедельный отчет.
        Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
         */
        int r = 3;
        for(; r < 31;r=r+7) {

            System.out.println("Сегодня пятница, " + r + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("Задача №3 ");
        /*В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
        Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет
        до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
        В результате решения задачи в консоль должен вывестись следующий результат:
        1896
        1975
        2054 */

        int currentYear = 2022;
        int period = 79;
        for (int i = 0; i < currentYear + period; i += period) {
            if (i > currentYear - 200) {
                System.out.println(i);
            }
        }
        }
    }
