class IfElseStatementTheme {
    public static void main(String[] args) {
        // Первая задача.
        // Перепишите псевдокод, приведенный ниже, с помощью Java
        // Используйте переменные, условные операторы, логическое НЕ
        // Придумайте сообщения для отображения их в консоли
        System.out.println("1. Перевод псевдокода на язык Java.");

        int age = 5;
        boolean sexMale = true;
        char firstLetterName;
        float height = 1.73f;

        if(age > 20) {
                System.out.println("You're an adult");
        } else {
                System.out.println("You're a baby");
        }

        if(height < 1.80) {
                System.out.println("You're a small person, you know.");
        } else {
                System.out.println("You're tall person.");
        }

        if(!sexMale) {
                System.out.println("You're not a male");
        } else {
                System.out.println("You definitely a male");
        }

        firstLetterName = "Matthew".charAt(0);
        if(firstLetterName == 'M') {
                System.out.println("Hi Matthew! Enjoy you're meal!");
        } else if(firstLetterName == 'I') {
                System.out.println("Ibrahim! Wake up!! You have to code!");
        } else {
                System.out.println("Unknown user. Shutting down.");
        }

        // Задача Вторая.
        // Создайте две переменные, присвоив им любые числа
        // Найдите максимальное и минимальное число
        // Для себя проверьте, правильно ли работает программа,
        //      если значения переменных поменять местами,
        //      а также при их равенстве
        // Выведите:
        //      числа на консоль, указав какое из них max и min
        //      информацию об их равенстве, если они равны
        System.out.println("\n2. Поиск max и min числа.");

        int num1 = 33;
        int num2 = 20;

        System.out.println("First number is: " + num1);
        System.out.println("Second number is: " + num2);
        if(num1 > num2) {
                System.out.printf("First number: %s is greater, than a second number: %s.", num1, num2);
        } else if (num1 < num2) {
                System.out.printf("First number: %s is lesser, than a second number: %s.", num1, num2);
        } else {
                System.out.println("Numbers are equal.");
        }

        // Задача Третья.
        // Создайте переменную с любым числом
        // Определите, являться ли оно:
        //      нулем
        //      четным (нечетным)
        //      отрицательным (положительным)
        // Если число равно 0, то остальные проверки не должны выполняться
        // Если число не равно 0, то не нужно выводить эту информацию
        // Отобразите полученные результаты, включая исходное число
        System.out.println("\n\n3. Проверка числа.");

        num1 = 2;
        System.out.println("Chosen number: " + num1);
        if(num1 == 0) {
                System.out.println("Number equals 0");
        } else if(num1 % 2 == 0 & num1 > 0) {
                System.out.println("Even number.\nNumber is positive.");
        } else if(num1 % 2 != 0 & num1 > 0) {
                System.out.println("Odd number.\nNumber is positive.");
        } else if(num1 % 2 == 0 & num1 < 0) {
                System.out.println("Even number.\nNumber is negative.");
        } else if(num1 % 2 != 0 & num1 < 0) {
                System.out.println("Odd number.\nNumber is negative.");
        }

        // Задача Четвёртая.
        // Создайте две переменные, присвоив им два трехзначных целых числа
        // Найдите в них все одинаковые цифры, стоящие в одном и том же разряде
        // Отобразите на консоль:
        // -    исходные числа
        // -    одинаковые в них цифры
        // -    номера разрядов
        System.out.println("\n4. Поиск одинаковых цифр в числах.");

        num1 = 123;
        num2 = 223;

        System.out.println("Origin number 1: " + num1);
        System.out.println("Origin number 2: " + num2);
        if(num1 % 10 == num2 % 10) {
                System.out.println("Ones are the same.");
                System.out.println("Similar digit is: " + num1 % 10);
        if(((num1 % 100) / 10) == ((num2 % 100) / 10)) {
                System.out.println("Tens are the same.");
        }
                System.out.println("Similar digit is: " + (num2 % 100) / 10);
        if(num1 / 100 == num2 / 100) {
                System.out.println("Hundreds are the same.");
                System.out.println("Similar digit is: " + num1 / 100);
        }

        // Задача Пятая.
        // Создайте переменную типа char
        // Присвойте ей значение '\u0057'
        // Определите программно — это код буквы, числа или другого символа
        // В if используйте символы, а не их коды
        // Выведите в консоль сам символ и информацию о нем:
        //      - маленькая буква
        //      - большая буква
        //      - число
        //      - не буква и не число
        System.out.println("\n5. Определение символа по его коду.");

        char symbol;
        symbol = '\u0057';

        if(symbol == 'a') { // Check for lower letters
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'b') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'c') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'd') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'e') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'f') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'g') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'h') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'i') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'j') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'k') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'l') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'm') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'n') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'o') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'p') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'q') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'r') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 's') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 't') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'u') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'v') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'w') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'x') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'y') {
                System.out.println("ASCII was a " + symbol + ": lower letter.");
        } else if(symbol == 'z') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'A') { // Check for capital letters
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'B') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'C') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'D') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'E') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'F') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'G') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'H') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'I') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'J') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'K') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'L') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'M') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'N') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'O') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'P') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'Q') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'R') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'S') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'T') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'U') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'V') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'W') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'X') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'Y') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == 'Z') {
                System.out.println("ASCII was a " + symbol + ": capital letter.");
        } else if(symbol == '0') { // Check if it's a number
            System.out.println("ASCII was a " + symbol + ": a number.");
        } else if(symbol == '1') {
            System.out.println("ASCII was a " + symbol + ": a number.");
        } else if(symbol == '2') {
            System.out.println("ASCII was a " + symbol + ": a number.");
        } else if(symbol == '3') {
            System.out.println("ASCII was a " + symbol + ": a number.");
        } else if(symbol == '4') {
            System.out.println("ASCII was a " + symbol + ": a number.");
        } else if(symbol == '5') {
            System.out.println("ASCII was a " + symbol + ": a number.");
        } else if(symbol == '6') {
            System.out.println("ASCII was a " + symbol + ": a number.");
        } else if(symbol == '7') {
            System.out.println("ASCII was a " + symbol + ": a number.");
        } else if(symbol == '8') {
            System.out.println("ASCII was a " + symbol + ": a number.");
        } else if(symbol == '9') {
            System.out.println("ASCII was a " + symbol + ": a number.");
        } else {
            System.out.println("Nor a letters, nor a numbers, nothing.");
        }

        // Задача шестая.
        // Сумма вклада равна 300_000 руб.
        // Если она:
        //      - меньше 100_000, то банк начисляет 5% годовых
        //      - от 100_000 до 300_000, то — 7%
        //      - больше 300_000, то — 10%
        // Отобразите в консоли:
        //      - сумму вклада
        //      - начисленный % (не путайте с процентной ставкой)
        //      - итоговую сумму с %
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");


        }
    }
}