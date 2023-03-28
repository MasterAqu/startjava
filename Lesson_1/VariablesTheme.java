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
    }
}