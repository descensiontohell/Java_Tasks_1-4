import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Номер задания");
        int task = in.nextInt();
        int a, b, c;
        switch (task) {
            case 1:
                System.out.println("Задание 1");
                a = in.nextInt();
                b = in.nextInt();
                System.out.println("Остаток равен: " + Tasks.remainder(a, b));
                break;
            case 2:
                System.out.println("Задание 2");
                a = in.nextInt();
                b = in.nextInt();
                System.out.println("Площадь равна: " + Tasks.triArea(a, b));
                break;
            case 3:
                System.out.println("Задание 3");
                a = in.nextInt();
                b = in.nextInt();
                c = in.nextInt();
                System.out.println("Количество ног: " + Tasks.animals(a, b, c));
                break;
            case 4:
                System.out.println("Задание 4");
                float f = in.nextFloat();
                b = in.nextInt();
                c = in.nextInt();
                System.out.println("Выгода: " + Tasks.profitableGamble(f, b, c));
                break;
            case 5:
                System.out.println("Задание 5");
                a = in.nextInt();
                b = in.nextInt();
                c = in.nextInt();
                Tasks.operation(a, b, c);
                break;
            case 6:
                System.out.println("Задание 6");
                char s = in.next().charAt(0);
                System.out.println(Tasks.ctoa(s));
                break;
            case 7:
                System.out.println("Задание 7");
                a = in.nextInt();
                System.out.println("Сумма: " + Tasks.addUpTo(a));
                break;
            case 8:
                System.out.println("Задание 8");
                a = in.nextInt();
                b = in.nextInt();
                System.out.println("Максимальная длина третьего ребра: " + Tasks.nextEdge(a, b));
                break;
            case 9:
                System.out.println("Задание 9");
                System.out.println("Введите размер массива: ");
                int size = in.nextInt();
                System.out.println("Введите массив: ");
                int array[] = new int[size];
                for (int i = 0; i < size; i++) {
                    array[i] = in.nextInt();
                }
                System.out.println("Сумма квадратов: " + Tasks.sumOfCubes(array, size));
                break;
            case 10:
                System.out.println("Задание 10");
                System.out.println("Введите числа: ");
                a = in.nextInt();
                b = in.nextInt();
                c = in.nextInt();
                System.out.println("Делимость на число: " + Tasks.abcmath(a, b, c));
                break;
            case 11:
                System.out.println("Задание 11");
                System.out.println("Введите строку: ");
                String str = in.next();
                System.out.println("Введите множитель: ");
                a = in.nextInt();
                System.out.println(Tasks2.repeat(str, a));
                break;
            case 12:
                System.out.println("Задание 12");
                System.out.println("Введите размер массива: ");
                size = in.nextInt();
                System.out.println("Введите массив: ");
                int array12[] = new int[size];
                for (int i = 0; i < size; i++) {
                    array12[i] = in.nextInt();
                }
                System.out.println("Разница между максимальным и минимальным: " + Tasks2.differenceMaxMin(array12, size));
                break;
            case 13:
                System.out.println("Задание 13");
                System.out.println("Введите размер массива: ");
                size = in.nextInt();
                System.out.println("Введите массив: ");
                int array13[] = new int[size];
                for (int i = 0; i < size; i++) {
                    array13[i] = in.nextInt();
                }
                System.out.println("Является ли среднее значение целым числом: " + Tasks2.isAvgWhole(array13, size));
                break;
            case 14:
                System.out.println("Задание 14");
                System.out.println("Введите размер массива: ");
                size = in.nextInt();
                System.out.println("Введите массив: ");
                int array14[] = new int[size];
                for (int i = 0; i < size; i++) {
                    array14[i] = in.nextInt();
                }
                Tasks2.cumulativeSum(array14, size);
                break;
            case 15:
                System.out.println("Задание 15");
                System.out.println("Введите десятичное число: ");
                String a15 = in.next();
                System.out.println("Количество знаков после запятой: "+Tasks2.getDecimalPlaces(a15));
                break;
            case 16:
                System.out.println("Задание 16");
                System.out.println("Введите позицию числа Фибоначчи: ");
                a = in.nextInt();
                System.out.println(Tasks2.Fibonacci(a));
                break;
            case 17:
                System.out.println("Задание 17");
                System.out.println("Введите почтовый индекс: ");
                String a17 = in.next();
                System.out.println("Верный ли индекс: "+Tasks2.isValid(a17));
                break;
            case 18:
                System.out.println("Задание 18");
                System.out.println("Введите первую строку: ");
                String a18 = in.next();
                System.out.println("Введите вторую строку: ");
                String a181 = in.next();
                System.out.println("Является ли странной парой: "+Tasks2.isStrangePair(a18, a181));
                break;
            case 19:
                System.out.println("Задание 19");
                System.out.println("Введите первую строку: ");
                String a19 = in.next();
                System.out.println("Введите вторую строку: ");
                String a191 = in.next();
                System.out.println("Является ли суффиксом или префиксом: "+Tasks2.isFix(a19, a191));
                break;
            case 20:
                System.out.println("Задание 20");
                System.out.println("Введите шаг");
                a = in.nextInt();
                System.out.println("Количество полей: "+Tasks2.boxSeq(a));
                break;
            case 21:
                System.out.println("Задание 21");
                System.out.println("Введите аргументы уравнения: ");
                a = in.nextInt();
                b = in.nextInt();
                c = in.nextInt();
                System.out.println("Количество корней квадратного уравнения: "+Tasks3.solutions(a, b, c));
                break;
            case 22:
                System.out.println("Задание 22");
                System.out.println("Введите строку для поиска: ");
                in.nextLine();
                String a22 = in.nextLine();
                System.out.println(Tasks3.findZip(a22));
                break;
            case 23:
                System.out.println("Задание 23");
                System.out.println("Введите число: ");
                a = in.nextInt();
                System.out.println("Это число идеально: "+Tasks3.checkPerfect(a));
                break;
            case 24:
                System.out.println("Задание 24");
                System.out.println("Введите строку");
                String a24 = in.next();
                Tasks3.flipEndChars(a24);
                break;
            case 25:
                System.out.println("Задание 25");
                System.out.println("Введите HEX код:");
                String a25 = in.next();
                System.out.println("Верный ли код: "+Tasks3.isValidHexCode(a25));
                break;
            case 26:
                System.out.println("Задание 26");
                System.out.println("Введите размер первого массива: ");
                int size1 = in.nextInt();
                System.out.println("Введите первый массив: ");
                int array26[] = new int[size1];
                for (int i = 0; i < size1; i++) {
                    array26[i] = in.nextInt();
                }
                System.out.println("Введите размер второго массива: ");
                int size2 = in.nextInt();
                System.out.println("Введите второй массив: ");
                int array261[] = new int[size2];
                for (int i = 0; i < size2; i++) {
                    array261[i] = in.nextInt();
                }
                System.out.println("Совпадает ли количество уникальных символов: "+Tasks3.same(array26, size1, array261, size2));
                break;
            case 27:
                System.out.println("Задание 27");
                System.out.println("Введите число: ");
                long a27 = in.nextInt();
                System.out.println("Является ли числом Капрекара: "+Tasks3.isKaprekar(a27));
            case 28:
                System.out.println("Задание 28");
                System.out.println("Введите строку: ");
                String a28 = in.next();
                System.out.println("Наибольшее количество нулей подряд: "+Tasks3.longestZero(a28));
            case 29:
                System.out.println("Задание 29");
                System.out.println("Введите число: ");
                a = in.nextInt();
                System.out.println("Следующее простое число: "+Tasks3.nextPrime(a));
            case 30:
                System.out.println("Задание 30");
                System.out.println("Введите стороны треугольника: ");
                    a = in.nextInt();
                    b = in.nextInt();
                    c = in.nextInt();
                System.out.println("Является ли прямоугольным: "+Tasks3.rightTriangle(a, b, c));
            case 31:
                System.out.println("Задание 31");
                in.nextLine();
                String task31 = in.nextLine();
                String[] task311 = task31.split(" ");
                System.out.println("Введите число символов в строке: ");
                int k = in.nextInt();
                Tasks4.processor(task311, k);
            case 32:
                System.out.println("Задание 32");
                System.out.println("Введите кластер скобок: ");
                in.nextLine();
                String task32 = in.nextLine();
                System.out.println(Arrays.toString(Tasks4.split(task32)));
            case 33:
                System.out.println("Задание 33");
                in.nextLine();
                String task33 = in.nextLine();
                System.out.println("Snake or Camel?");
                String choice = in.nextLine();
                if (choice == "Snake"){
                    System.out.println(Tasks4.toCamelCase(task33));
                }
                else{
                    System.out.println(Tasks4.toSnakeCase(task33));
                }
            case 34:
                System.out.println("Задание 34");
                in.nextLine();
                System.out.println("Введите начало рабочего дня, конец, ставку и множитель сверхурочных:");
                float start = in.nextFloat();
                float end = in.nextFloat();
                float pay = in.nextFloat();
                float multiplier = in.nextFloat();
                System.out.println(Tasks4.overTime(start, end, pay, multiplier));
            case 35:
                System.out.println("Задание 35");
                in.nextLine();
                System.out.println("Введите вес с единицей измерения:");
                String weight = in.nextLine();
                System.out.println("Введите рост с единицей измерения:");
                String height = in.nextLine();
                System.out.println(Tasks4.BMI(weight, height));
            case 36:
                System.out.println("Задание 36");
                in.nextLine();
                int task36 = in.nextInt();
                System.out.println(Tasks4.bugger(task36));
            case 37:
                System.out.println("Задание 37");
                in.nextLine();
                String task37 = in.nextLine();
                System.out.println(Tasks4.toStarShorthand(task37));
            case 38:
                System.out.println("Задание 38");
                in.nextLine();
                System.out.println("Введите первую строку: ");
                String task381 = in.nextLine();
                System.out.println("Введите вторую строку: ");
                String task382 = in.nextLine();
                System.out.println("Рифмуются ли строки: " + Tasks4.doesRhyme(task381, task382));
            case 39:
                System.out.println("Задание 39");
                in.nextLine();
                System.out.println("Введите первое число: ");
                long task391 = in.nextLong();
                System.out.println("Введите второе число: ");
                long task392 = in.nextLong();
                System.out.println("Выполняется ли условие: " + Tasks4.trouble(task391, task392));
            case 40:
                System.out.println("Задание 40");
                in.nextLine();
                System.out.println("Введите строку: ");
                String task40 = in.nextLine();
                System.out.println("Введите символ для поиска:");
                char task40char = in.next().charAt(0);
                System.out.println("Количество уникальных книг: " + Tasks4.countUniqueBooks(task40, task40char));
            case 41:

        }
    }
}
