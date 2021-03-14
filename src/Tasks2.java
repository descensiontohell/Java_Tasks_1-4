public class Tasks2 {

    public static String repeat(String a, int b) { // в строке a повторяет каждый символ b раз
        String m = "";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b; j++) {
                m = m + a.charAt(i);
            }
        }
        return m;
    }

    public static int differenceMaxMin(int array[], int n){ // принимает массив, возвращает разницу между минимальным и максимальным в массиве
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < n; i++){
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        return (max-min);
    }

    public static boolean isAvgWhole(int array[], float n){ // является ли среднее арифметическое массива целым
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + array[i];
        }
        float sred = sum / n;
        if ((sred % 1) == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void cumulativeSum(int array[], int n){ // превращает массив в такой, где каждое число равно сумме предыдущих и себя
        int sum = 0;
        int array14[] = new int[n];
        for (int i = 0; i < n; i++){
            sum = sum + array[i];
            array14[i] = sum;
            System.out.print(array14[i]+" ");
        }
    }

    public static int getDecimalPlaces(String number){ // определяет количество знаков после запятой
        String[] cut = number.split("\\.");
        int otv = cut[1].length();
        return otv;
    }

    public static int Fibonacci(int a){ // принимает позицию числа фибоначчи, возвращает само число
        int number = 0;
        int high = 1;
        int low = 0;
        for (int i = 1; i <= a; i++){
            number = low + high;
            low = high;
            high = number;
        }
        return number;
    }

    public static boolean isValid(String index){ // определяет правильность введения почтового индекса (5 знаков, только цифры)
        if (index.length() == 5 && index.matches("^\\d+$")){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isStrangePair(String string1, String string2){ // возвращает true, если первая буква 1 строки равна последней 2 строки и наоборот
        char first1 = string1.charAt(0);
        char last1 = string1.charAt(string1.length()-1);
        char first2 = string2.charAt(0);
        char last2 = string2.charAt(string2.length()-1);
        if (first1 == last2 && last1 == first2){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isFix(String string1, String string2){ // определяет, имеется ли вторая строка в начале либо конце первой
        int k = 0;
        int g = 0;
        for (int i = 0; i < string2.length(); i++){
            if (string1.charAt(i) != string2.charAt(i)){
                k = k + 1;
            }
            if (string1.charAt(string1.length()-1-i) != string2.charAt(string2.length()-1-i)){
                g = g + 1;
            }
        }
        if (k == 0 || g == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static int boxSeq(int a){ // в зависимости от шага возвращает количество клеток
        if (a % 2 == 0){
            return a;
        }
        else{
            a = a + 2;
            return a;
        }
    }
}
