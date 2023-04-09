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
            System.out.println("Similar digits is: " + num1 % 10);
        if(((num1 % 100) / 10) == ((num2 % 100) / 10)) {
            System.out.println("Tens are the same.");
            System.out.println("Similar digits is: " + (num2 % 100) / 10);
        if(num1 / 100 == num2 / 100) {
            System.out.println("Hundreds are the same.");
            System.out.println("Similar digits is: " + num1 / 100);
            }
        }
        }
    }
}