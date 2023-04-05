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

        System.out.println("First (max)number is: " + num1);
        System.out.println("Second (min)number is: " + num2);
        if(num1 > num2) {
            System.out.println("First number greater than second number.");
        } else if (num1 < num2) {
            System.out.println("First number lesser than second number.");
        } else {
            System.out.println("Numbers are equal.");
        }
    }
}