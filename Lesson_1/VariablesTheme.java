class VariablesTheme {
    public static void main(String[] args) {
        // Задача первая.
        // Используя характеристики компьютера и примитивов в Java:
        //  - Вывести значение переменных
        //  - Описание к ним
        System.out.println("1. Вывод характеристик компьютера:");

        byte totalCores = 4;
        float freqCpu = 798.1f;
        double cpuVid = 0.7692d;
        short cpuMhz = 3000;
        int ramAmount = 16284;
        long mboardThroughput = 25600;
        char pcRepair = 'n';
        boolean isGoodPc = true;

        System.out.println("Общее количество ядер процессора: " + totalCores);
        System.out.println("Исходная частота процессора: " + cpuMhz + " МГц");
        System.out.println("Частота ЦП: " + freqCpu);
        System.out.println("CPU VID: " + cpuVid + " Вольт");
        System.out.println("Общее количество оперативной памяти: " + ramAmount + " Mb");
        System.out.println("Пропускная способность материнской платы: " +
                mboardThroughput + " МБ/с");
        System.out.println("Нужен ремонт пк (y/n) ?: " + pcRepair);
        System.out.println("Тру компьютер ?: " + isGoodPc);

        // Задача вторая.
        // Рассчитать стоимость товара со скидкой и вывести в консоль:
        //  - общую стоимость товаров без скидки
        //  - сумму скидки
        //  - общую стоимость товаров со скидкой
        System.out.println("\n2. Расчёт стоимости товара со скидкой:");

        int penCost = 100;
        int bookCost = 200;
        int sumTotal = penCost + bookCost;
        int discountSum = (sumTotal * 11) / 100;

        System.out.println("Стоимость ручки: " + penCost);
        System.out.println("Стоимость книги: " + bookCost);
        System.out.println("Общая стоимость товаров: " + sumTotal);
        System.out.println("Сумма скидки: " + discountSum);
        System.out.println("Общая стоимость товаров со скидкой: " + (sumTotal + discountSum));

        // Задача третья.
        // Вывод слова JAVA без использования переменных.
        System.out.println("\n3. Вывод слова JAVA:");

        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  v v  aaaaa   ");
        System.out.println(" JJ  a     a  v  a     a  ");

        // Задача четвёртая.
        // - создайте переменные всех целых числовых типов
        // - присвойте им самые большие числа, которые они могут хранить
        // - выводите данные на консоль для каждой переменной в следующей последовательности:
        //    - первоначальное значение
        //    - значение после инкремента на единицу
        //    - значение после декремента на единицу
        // - не смешивайте вывод разных типов

        System.out.println("\n4. Вывод min и max значений целых числовых типов:");

        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807l;

        System.out.println("Значение byte: " + numByte);
        System.out.println("Значение short: " + numShort);
        System.out.println("Значение int: " + numInt);
        System.out.println("Значение long: " + numLong);

        System.out.println("\nЗначение byte с [инкрементом]: " + ++numByte);
        System.out.println("Значение short с [инкрементом]: " + ++numShort);
        System.out.println("Значение int с [инкрементом]: " + ++numInt);
        System.out.println("Значение long с [инкрементом]: " + ++numLong);

        System.out.println("\nЗначение byte с (декрементом): " + --numByte);
        System.out.println("Значение short с (декрементом): " + --numShort);
        System.out.println("Значение int с (декрементом): " + --numInt);
        System.out.println("Значение long с (декрементом): " + --numLong);

        // Задача пятая. 
        // Создайте две переменные типа int, присвоив им 2 и 5
        // Поменяйте значения переменных местами разными способами:
        //  - с помощью третьей переменной
        //  - с помощью арифметических операций
        //  - с помощью побитовой операции ^
        // Перед началом очередных перестановок присваивать переменным исходные значения не нужно
        // Решение должно быть универсальным, а не привязано к конкретным значениям
        // Выведите на консоль:
        //  - название способа перестановки значений
        //  - исходные значения переменных
        //  - новые значения переменных
        System.out.println("\n5. Перестановка значений переменных:");

        int digit1 = 2;
        int digit2 = 5;
        int digit3 = digit1; // = 2

        System.out.println(" - использование третьей переменной:");
        System.out.println("Исходная цифра 1: " + digit1);
        System.out.println("Исходная цифра 2: " + digit2);
        System.out.println("Третья переменная будет равна первой: " + digit3);

        digit1 = digit2; // = 5
        digit2 = digit3; // = 2

        System.out.println("Цифра 1: " + digit1);
        System.out.println("Цифра 2: " + digit2);
        System.out.println(" - использование арифметических операций:");
        System.out.println("Исходная цифра 1: " + digit1);
        System.out.println("Исходная цифра 2: " + digit2);
        System.out.println("Складываем значения в первую переменную.");
        System.out.println("После вычитаем из суммы и приравниваем к переменным.");

        digit1 += digit2;          // digit1 = 2 + 5 = 7
        digit2 = digit1 - digit2;  // digit2 = 7 - 5 = 2
        digit1 -= digit2;          // digit1 = 7 - 2 = 5

        System.out.println("Цифра 1: " + digit1);
        System.out.println("Цифра 2: " + digit2);
        System.out.println(" - побитовая операция:");
        System.out.println("Исходная цифра 1: " + digit1);
        System.out.println("Исходная цифра 2: " + digit2);

        digit1 ^= digit2;
        digit2 ^= digit1;
        digit1 ^= digit2;

        System.out.println("Цифра 1: " + digit1);
        System.out.println("Цифра 2: " + digit2);

        // Задача шестая. 
        // - проинициализируйте переменные типа char символами, которым 
        //      соответствуют коды: 35, 38, 64, 94, 95.
        // - в решении нигде не должны использоваться явно коды символов,
        //      только сами символы или переменные.
        // - выведите на консоль в столбец попарно:
        //      код символа;
        //      соответствующий коду символ из ASCII-таблицы;
        // - код символа берите из переменной, а не пишите его руками.
        System.out.println("\n6. Вывод символов и их кодов:");

        char numberSign = '#';
        char ampersand = '&';
        char atSign = '@';
        char caret = '^';
        char underscore = '_';

        System.out.println(35 + " = " + numberSign);
        System.out.println(38 + " = " + ampersand);
        System.out.println(64 + " = " + atSign);
        System.out.println(94 + " = " + caret);
        System.out.println(95 + " = " + underscore);

        // Задача седьмая.
        // выведите в консоль Java-талисман:
        //  - каждый уникальный символ (а не его код) 
        //      - храните в отдельной переменной (кроме пробелов)
        //  - выведите результат в консоль, используя значения переменных
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка:");

        char slash = '/';
        char backslash = '\\';
        char rightParenthesis = '(';
        char leftParenthesis = ')';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + rightParenthesis + " " +
                leftParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore +
                slash + backslash + underscore + underscore + backslash);

        // Задача восьмая.
        //  - из числа 123 выделите сотни, десятки и единицы
        //  - выделяйте каждую цифру числа программно, а не написав их самим
        //  - используйте для этого только операции / и %
        //  - не используйте цикл
        //  - найдите произведение и сумму цифр
        //  - выведите результат в формате:
        //      - Число N содержит:
        //         - X сотен
        //         - Y десятков
        //         - Z единиц
        //      - Сумма его цифр = столько-то
        //      - Произведение = столько-то
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа:");

        int num = 123;
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;

        System.out.println("Число 123 содержит: ");
        System.out.println("    " + hundreds + " - сотню.");
        System.out.println("    " + tens + " - десятки.");
        System.out.println("    " + ones + " - единицы.");

        System.out.println("Сумма цифр числа = " + (hundreds + tens + ones));
        System.out.println("Произведение цифр числа = " + (hundreds * tens * ones));

        // Задача девятая.
        // Имеется 86399 секунд
        // Переведите число в часы, минуты и секунды
        // Используйте для этого только операции / и %
        // Выведите в консоль значения в формате ЧЧ:ММ:СС
        System.out.println("\n9. Вывод времени:");

        int wholeSeconds = 86399;

        int hours = wholeSeconds / 3600;
        int minutes = (wholeSeconds % 3600) / 60;
        int seconds = wholeSeconds % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}