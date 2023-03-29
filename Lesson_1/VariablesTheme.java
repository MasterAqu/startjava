class VariablesTheme {
    public static void main(String[] args) {
        // Задача первая.
        // Используя характеристики компьютера и примитивов в Java:
        //  - Вывести значение переменных
        //  - Описание к ним
        System.out.println("1. Вывод характеристик компьютера:");
        byte totalCores = 4;
        float freqCpu = 798.1f;
        double cpuVID = 0.7692d;
        short cpuMhz = 3000;
        int ramAmount = 16284;
        long mboardThroughput = 25600;
        char pcRepair = 'n';
        boolean pcIsGood = true;
        System.out.println("Общее количество ядер процессора: " + totalCores);
        System.out.println("Исходная частота процессора: " + cpuMhz + " МГц");
        System.out.println("Частота ЦП: " + freqCpu);
        System.out.println("CPU VID: " + cpuVID + " Вольт");
        System.out.println("Общее количество оперативной памяти: " + ramAmount + " Mb");
        System.out.println("Пропускная способность материнской платы: " 
            + mboardThroughput + " МБ/с");
        System.out.println("Нужен ремонт пк (y/n) ?: " + pcRepair);
        System.out.println("Тру компьютер ?: " + pcIsGood);

        // Задача вторая.
        // Расчитать стоимость товара со скидкой и вывести в консоль:
        //  - общую стоимость товаров без скидки
        //  - сумму скидки
        //  - общую стоимость товаров со скидкой
        System.out.println("\n2. Расчёт стоимости товара со скидкой:");
        int pencil = 100;
        int book = 200;
        int sumTotal = pencil + book;
        int discount = (sumTotal * 11) / 100;
        System.out.println("Стоимость ручки: " + pencil);
        System.out.println("Стоимость книги: " + book);
        System.out.println("Общая стоимость товаров: " + sumTotal);
        System.out.println("Сумма скидки: " + discount);
        System.out.println("Общая стоимость товаров со скидкой: " + (sumTotal + discount));

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
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807l;
        System.out.println("Значение byte: " + num1);
        System.out.println("Значение short: " + num2);
        System.out.println("Значение int: " + num3);
        System.out.println("Значение long: " + num4);
        byte num1Inc = num1;
        short num2Inc = num2;
        int num3Inc = num3;
        long num4Inc = num4;
        System.out.println("Значение byte с [инкрементом]: " + ++num1Inc);
        System.out.println("Значение short с [инкрементом]: " + ++num2Inc);
        System.out.println("Значение int с [инкрементом]: " + ++num3Inc);
        System.out.println("Значение long с [инкрементом]: " + ++num4Inc);
        byte num1Dec = num1;
        short num2Dec = num2;
        int num3Dec = num3;
        long num4Dec = num4;
        System.out.println("Значение byte с (декрементом): " + --num1Dec);
        System.out.println("Значение short с (декрементом): " + --num2Dec);
        System.out.println("Значение int с (декрементом): " + --num3Dec);
        System.out.println("Значение long с (декрементом): " + --num4Dec);

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
        System.out.println("\n5. Перестановка значений переменных.");
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
        digit1 = digit1 + digit2; // digit1 = 5 + 2 = 7
        digit2 = digit1 - digit2; // digit2 = 7 - 2 = 5
        digit1 = digit1 - digit2; // digit1 = 7 - 5 = 2
        System.out.println("Цифра 1: " + digit1);
        System.out.println("Цифра 2: " + digit2);
        System.out.println(" - побитовая операция:");
        System.out.println("Исходная цифра 1: " + digit1);
        System.out.println("Исходная цифра 2: " + digit2);
        digit1 = digit1 ^ digit2;
        digit2 = digit2 ^ digit1;
        digit1 = digit1 ^ digit2;
        System.out.println("Цифра 1: " + digit1); // Ничего не понял,
        System.out.println("Цифра 2: " + digit2); // Вышло с закрытыми глазами.

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
    }
}