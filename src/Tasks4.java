public class Tasks4 {

    public static void processor(String[] text, int k) {
        int counter = 0;
        int spaceMarker = 0;
        int flag = 0;
        for (int i = 0; i < text.length; i++) {
            for (int j = counter; j < text.length; j++) {
                if (text[j].length() + spaceMarker <= k) { // проверяет, что длина слова + напечатанной строки меньше заданной
                    System.out.print(text[j] + " ");
                    spaceMarker += text[j].length();
                } else {
                    System.out.println(); // переходит на следующую строку и обнуляет счетчик
                    spaceMarker = 0;
                    if (counter == j) { // чтобы последнее слово не выводилось дважды
                        flag = 1;
                    }
                    else {
                        counter = j;
                    }
                    break;
                }
            }
            if (flag == 1) {
                break;
            }
        }
    }

    public static String[] split(String input){
        String[] string1 = new String[(input.length() / 2)];
        String mainString = "";
        int left = 0;
        int right = 0;
        int j = 0;
        for (int i = 0; i <= input.length() - 1; i++){
            if (input.charAt(i)=='('){
                mainString += input.charAt(i);
                left++;
            }
            else if (input.charAt(i) == ')'){
                mainString += input.charAt(i);
                right++;
                if (left == right){ // когда кластер оказывается сбалансирован, он записывается и создается следующий
                    string1[j] = mainString;
                    j++;
                    left = right = 0;
                    mainString = "";
                }
            }
        }
        String[] cutString = new String[j];
        System.arraycopy(string1, 0, cutString, 0, j); // избавляемся от пустых элементов массива
        return cutString;
    }

    public static String toCamelCase(String input){
        String[] string1 = input.split("_"); // создает массив из элементов, разделенных подчеркиванием
        String mainString = "";
        for (int i = 0; i < string1.length; i++){
            mainString += Character.toUpperCase(string1[i].charAt(0)) + string1[i].substring(1, string1[i].length()); // для каждого элемента меняет первую букву на заглавную
        }
        return mainString;
    }

    public static String toSnakeCase(String input){
        String mainString = "";
        for (int i = 0; i < input.length(); i++){
            if (Character.isUpperCase(input.charAt(i))){ // если буква заглавная, ставит перед ней подчеркивание и делает ее строчной
                mainString += "_" + Character.toLowerCase(input.charAt(i));
            }
            else{
                mainString += input.charAt(i);
            }
        }
        return mainString;
    }

    public static String overTime(float start, float end, float pay, float multiplier){
        if (end <= 17){
            return "$" + ((end - start) * pay);
        }
        else{
            return "$" + ((17 - start) * pay + (end - 17) * multiplier * pay);
        }
    }

    public static String BMI(String weight, String height){
        double weight_num = 0;
        if (weight.indexOf("pounds") != -1){
            weight_num = Double.parseDouble(weight.substring(0, weight.indexOf("pounds"))) * 0.4536; // переводит строку в число (вес)
        }
        else{
            weight_num = Double.parseDouble(weight.substring(0, weight.indexOf("kilos")));
        }
        double height_num = 0;
        if (height.indexOf("inches") != -1){
            height_num = Double.parseDouble(height.substring(0, height.indexOf("inches"))) * 0.0254; // переводит строку в число (рост)
        }
        else{
            height_num = Double.parseDouble(height.substring(0, height.indexOf("meters")));
        }
        double index = (weight_num / height_num / height_num);
        if (index < 18.5){
            return (String.format("%.1f", index) + " Underweight");
        }
        else if (index >= 18.5 && index <= 24.9){
            return (String.format("%.1f", index) + " Normal weight");
        }
        else{
            return (String.format("%.1f", index) + " Overweight");

        }
    }

    public static int bugger(int input){
        int number = input;
        int sum = input;
        int counter = 0;
        while (sum / 10 != 0){ // пока число не однозначное
            sum = number % 10;
            while (number / 10 != 0){ // перемножает цифры в числе
                number /= 10;
                sum *= number % 10;
            }
            number = sum; // заменяет число на произведение цифр
            counter++;
        }
        return counter;
    }

    public static String toStarShorthand(String input){
        if (input.length() == 1){
            return input;
        }
        int counter = 1;
        String newString = "";
        char sameChar = input.charAt(0);
        for (int i = 1; i < input.length(); i++){
            if (input.charAt(i) == sameChar){ // считает количество одинаковых подряд
                counter++;
            }
            else{
                if (counter > 1){
                    newString += sameChar + "*" + counter; // если следующий символ не совпадает, записывает в новую строку прошлый и их кол-во
                }
                else{
                    newString += sameChar;
                }
                counter = 1;
                sameChar = input.charAt(i);
            }
        }
        if (counter > 1){
            newString += sameChar + "*" + counter;
        }
        else{
            newString += sameChar;
        }
        return newString;
    }

    public static boolean doesRhyme(String string1, String string2){
        String [] firstString = string1.split(" ");
        String firstStringLastWord = firstString[firstString.length - 1];
        String [] secondString = string2.split(" ");
        String secondStringLastWord = secondString[secondString.length - 1];
        String firstStringVowel = "";
        String secondStringVowel = "";
        for (int i = 0; i < firstStringLastWord.length(); i++){ // создает строку с гласными из последнего слова первой строки
            if ((Character.toLowerCase(firstStringLastWord.charAt(i)) == 'a') ||
                (Character.toLowerCase(firstStringLastWord.charAt(i)) == 'e') ||
                (Character.toLowerCase(firstStringLastWord.charAt(i)) == 'i') ||
                (Character.toLowerCase(firstStringLastWord.charAt(i)) == 'o') ||
                (Character.toLowerCase(firstStringLastWord.charAt(i)) == 'u')){
                firstStringVowel += Character.toLowerCase(firstStringLastWord.charAt(i));
            }
        }
        for (int j = 0; j < secondStringLastWord.length(); j++){ // создает строку с гласными из последнего слова второй строки
            if ((Character.toLowerCase(secondStringLastWord.charAt(j)) == 'a') ||
                (Character.toLowerCase(secondStringLastWord.charAt(j)) == 'e') ||
                (Character.toLowerCase(secondStringLastWord.charAt(j)) == 'i') ||
                (Character.toLowerCase(secondStringLastWord.charAt(j)) == 'o') ||
                (Character.toLowerCase(secondStringLastWord.charAt(j)) == 'u')){
                secondStringVowel += Character.toLowerCase(secondStringLastWord.charAt(j));
            }
        }
        return firstStringVowel.equals(secondStringVowel);
    }

    public static boolean trouble(long firstNumber, long secondNumber){
        int firstCounter = 0;
        String firstString = String.valueOf(firstNumber);
        char sameChar = firstString.charAt(0);
        char repeat = firstString.charAt(0);
        int secondCounter = 0;
        String secondString = String.valueOf(secondNumber);
        for (int i = 1; i < firstString.length(); i++){ // ищет в первой строке цифру, повторяющееся трижды
            if (firstString.charAt(i) == sameChar){
                firstCounter++;
            }
            else{
                sameChar = firstString.charAt(i);
                firstCounter = 1;
            }
            if (firstCounter == 3){ // если цифра повторяется три раза
                repeat = firstString.charAt(i);
                break;
            }
        }
        for (int i = 0; i < secondString.length(); i++){ // проверяет, если цифра повторяется дважды во второй строке
            if (secondString.charAt(i) == repeat){
                secondCounter++;
            }
            else{
                secondCounter = 0;
            }
            if (secondCounter == 2){
                return true;
            }
        }
        return false;
    }

    public static int countUniqueBooks(String input, char symbol){
        int sum = 0;
        int symbolCounter = 0;
        int uniqueCounter = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == symbol){
                symbolCounter++;
                sum += uniqueCounter;
                uniqueCounter = 0;
            }
            else if ((input.charAt(i) != input.charAt(i - 1)) && (symbolCounter % 2 != 0)){ // считает количество уникальных знаков между каждым нечетным и четным символами
                uniqueCounter++;
            }
        }
        return sum;
    }
}




