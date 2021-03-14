public class Tasks3 {

    public static int solutions(int a, int b, int c){ // получает коэф. квадратного уравнения, возвращает количество корней
        float D = b * b - 4 * a * c;
        if (D > 0){
            return 2;
        }
        else if (D == 0){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static int findZip(String string1){ // получает строку, возвращает номер знака второй последовательности zip
        int a = -1;
        for (int i = 0; i < string1.length() - 2; i++){
            if (string1.charAt(i) == 'z' && string1.charAt(i + 1) == 'i' && string1.charAt(i + 2) == 'p' && a == 1){
                a = i;
            }
            if (string1.charAt(i) == 'z' && string1.charAt(i + 1) == 'i' && string1.charAt(i + 2) == 'p' && a == -1){
                a = 1;
            }
        }
        if (a == 1){
            a = -1;
        }
        return a;
    }

    public static boolean checkPerfect(int a){ // проверяет число на совершенность (если его можно записать как сумму множителей)
        int sum = 0;
        for (int i = 1; i < a; i++){
            if (a % i == 0){
                sum = sum + i;
            }
        }
        return a == sum;
    }

    public static void flipEndChars(String string1){ // принимает строку, возвращает измененные местами первый и последний символы
        if (string1.charAt(0) != string1.charAt(string1.length() - 1)) {
            String string2 = "";
            string2 = string2 + string1.charAt(string1.length() - 1);
            for (int i = 1; i < string1.length() - 1; i++) {
                string2 = string2 + string1.charAt(i);
            }
            string2 = string2 + string1.charAt(0);
            System.out.println(string2);
        }
        else{
            System.out.println("Первый и последний символы совпадают");
        }
    }

    public static boolean isValidHexCode(String string1){ // является ли правильным шестнадцатеричным кодом
        if (string1.length() != 7){
            return false;
        }
        else if (string1.matches("#[a-fA-F0-9]+")){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean same(int array1[], int size1, int array2[], int size2){ // получает два массива, возвращает true при одинаковом кол-ве уникальных эл.
        int simCount1 = 0;
        int simCount2 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int first = 0; first < size1; first++){ // считает уникальные элементы первого массива
            for (int i = 0; i < first; i++){
                if (array1[first] == array1[i]) {
                    simCount1++;
                }
            }
            if (simCount1 == 0){
                count1++;
            }
            simCount1 = 0;
        }
        for (int second = 0; second < size2; second++){
            for (int i = 0; i < second; i++){
                if (array2[second] == array2[i]) {
                    simCount2++;
                }
            }
            if (simCount2 == 0){
                count2++;
            }
            simCount2 = 0;
        }
        System.out.println("Уникальных символов в первом: "+count1);
        System.out.println("Уникальных символов во втором: "+count2);
        return count1 == count2;
    }

    public static boolean isKaprekar(long number){ // проверяет полученное на принадлежность к числам Капрекара
        long squaredNumber = number * number;
        String stringNumber = String.valueOf(squaredNumber);
        if (stringNumber.length() == 1){
            return number == squaredNumber;
        }
        else{
            return Integer.parseInt(stringNumber.substring(0, stringNumber.length() / 2)) + Integer.parseInt(stringNumber.substring(stringNumber.length() / 2)) == number;
        }
    }

    public static String longestZero(String input){ // возвращает самую длинную последовательность нулей в строке
        String currentSum = "";
        String maxSum = "";
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == '0'){
                currentSum += "0";
            }
            else{
                if (maxSum.length() < currentSum.length()){
                    maxSum = currentSum;
                }
                currentSum = "";
            }
        }
        if (maxSum.length() < currentSum.length()){
            maxSum = currentSum;
        }
        return maxSum;
    }

    private static boolean isPrime(int n) { // получает число, возвращает принадлежность к простым
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int number) { // получает число, возвращает следующее простое
        while (true) {
            if (isPrime(number)) {
                break;
            }
            else {
                number++;
            }
        }
        return number;
    }

    public static boolean rightTriangle(int x, int y, int z){ // получает стороны треугольника, возвращает принадлежность к прямоугольным
        if (x*x + y*y == z*z || y*y + z*z == x*x || x*x + z*z == y*y){
            return true;
        }
        return false;
    }

}
