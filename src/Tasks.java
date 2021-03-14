public class Tasks {

    public static int remainder(int a, int b){ // возвращает остаток от деления
        int c = a % b;
        return c;
    }

    public static float triArea(int a, int b){ // возвращает площадь треугольника S = 1/2 * a * h
        float c = a * b / 2;
        return c;
    }

    public static int animals(int a, int b, int c){ // возвращает кол-во ног
        a = a * 2;
        b = b * 4;
        c = c * 4;
        int x = a + b + c;
        return x;
    }

    public static boolean profitableGamble(float prob, float prize, float pay){ // возвращает выгодность лотереи
        if ((prob * prize) > pay){
            return true;
        }
        else{
            return false;
        }
    }

    public static void operation(int n, int a, int b){ // объявляет действия для получения числа
        if ((a - b) == n){
            System.out.println("Числа необходимо вычесть");
        }
        else if ((a + b) == n){
            System.out.println("Числа необходимо сложить");
        }
        else if ((a * b) == n){
            System.out.println("Числа необходимо перемножить");
        }
        else if ((a / b) == n){
            System.out.println("Числа необходимо разделить");
        }
        else{
            System.out.println("Не удалось подобрать операцию");
        }
    }

    public static int ctoa(char a){ // возвращает asc2 код
        int asc = a;
        return asc;
    }

    public static int addUpTo(int a){ // возвращает сумму чисел до а (включительно)
        int sum = 0;
        for (int i = 1; i <= a; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static int nextEdge(int a, int b){ // возвращает максимальное третье ребро треугольника
        int c = a + b - 1;
        return c;
    }

    public static int sumOfCubes(int array[], int n){ // возвращает сумму кубов элементов массива
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + (array[i])*(array[i])*(array[i]);
        }
        return sum;
    }

    public static boolean abcmath(int a, int b, int c){ // добавить А само к себе B раз, возвращает возможность делимости на С
        for (int i = 0; i < b; i++){
            a = a * 2;
        }
        if ((a % c) == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
