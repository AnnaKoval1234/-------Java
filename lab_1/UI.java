package lab_1;
import common.Check;

public class UI
{
    Lab_1 lab_1 = new Lab_1();

    public int[] randomFill(int N)
    {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
        {
            arr[i] = (int)(Math.random() * 100);
            arr[i] = arr[i] * (int)(Math.pow(-1, arr[i] % 2));
        }
        return arr;
    }
    public String printArray(int[] arr)
    {
        String line = "";
        line += "[ ";
        for (int i = 0; i < arr.length; i++)
        {
            line += arr[i] + " ";
        }
        line += "]\n";
        return line;
    }

    public void Task_1()
    {
        System.out.println("1. Вернуть дробную часть");
        double x = Check.inputDouble("Введите дробное число (через запятую): ");
        System.out.println("Ответ: " + lab_1.fraction(x));
    }
    public void Task_2()
    {
        System.out.println("3. Преревести букву в число");
        char x = Check.inputCharNumber("Введите цифру: ");
        System.out.println("Ответ: " + lab_1.charToNum(x));
    }
    public void Task_3()
    {
        System.out.println("5. Двузначное ли число?");
        int x = Check.inputInteger("Введите целое число: ");
        System.out.println("Ответ: " + lab_1.is2Digits(x));
    }
    public void Task_4()
    {
        System.out.println("7. Входит ли число в диапазон?");
        int x = Check.inputInteger("Введите левую границу: ");
        int y = Check.inputInteger("Введите правую границу: ");
        int z = Check.inputInteger("Введите целое число: ");
        System.out.println("Ответ: " + lab_1.isInRange(x, y, z));
    }
    public void Task_5()
    {
        System.out.println("9. Равны ли три числа?");
        int x = Check.inputInteger("Введите первое число: ");
        int y = Check.inputInteger("Введите второе число: ");
        int z = Check.inputInteger("Введите третье число: ");
        System.out.println("Ответ: " + lab_1.isEqual(x, y, z));
    }
    public void Task_6()
    {
        System.out.println("1. Вернуть модуль числа");
        int x = Check.inputInteger("Введите целое число: ");
        System.out.println("Ответ: " + lab_1.abs(x));
    }
    public void Task_7()
    {
        System.out.println("3. Кратно ли число трём или пяти, но не трём и пяти одновременно?");
        int x = Check.inputInteger("Введите целое число: ");
        System.out.println("Ответ: " + lab_1.is35(x));
    }
    public void Task_8()
    {
        System.out.println("5. Вернуть максимум из трех чисел");
        int x = Check.inputInteger("Введите первое число: ");
        int y = Check.inputInteger("Введите второе число: ");
        int z = Check.inputInteger("Введите третье число: ");
        System.out.println("Ответ: " + lab_1.max3(x, y, z));
    }
    public void Task_9()
    {
        System.out.println("7. Вернуть сумму двух чисел или 20");
        int x = Check.inputInteger("Введите первое число: ");
        int y = Check.inputInteger("Введите второе число: ");
        System.out.println("Ответ: " + lab_1.sum2(x, y));
    }
    public void Task_10()
    {
        System.out.println("9. Вернуть день недели");
        int x = Check.inputInteger("Введите целое число: ");
        System.out.println("Ответ: " + lab_1.day(x));
    }
    public void Task_11()
    {
        System.out.println("1. Вернуть список чисел");
        int x = Check.inputNotNegativeInteger("Введите целое число: ");
        System.out.println("Ответ: " + lab_1.listNums(x));
    }
    public void Task_12()
    {
        System.out.println("3. Вернуть список четных чисел");
        int x = Check.inputNotNegativeInteger("Введите целое число: ");
        System.out.println("Ответ: " + lab_1.chet(x));
    }
    public void Task_13()
    {
        System.out.println("5. Вернуть количество знаков в числе");
        long x = Check.inputLong("Введите целое число: ");
        System.out.println("Ответ: " + lab_1.numLen(x));
    }
    public void Task_14()
    {
        System.out.println("7. Вывести квадрат из звездочек");
        int x = Check.inputPositiveInteger("Введите положительное число: ");
        System.out.println("Ответ: ");
        lab_1.square(x);
    }
    public void Task_15()
    {
        System.out.println("9. Вывести треугольник из звездочек");
        int x = Check.inputPositiveInteger("Введите положительное число: ");
        System.out.println("Ответ: ");
        lab_1.rightTriangle(x);
    }
    public void Task_16()
    {
        System.out.println("1. Вернуть индекс первого вхождения");
        int N = Check.inputPositiveInteger("Введите размер массива: ");
        int[] arr = randomFill(N);
        System.out.println("Сгенерированный массив: " + printArray(arr));
        int x = Check.inputInteger("Введите элемент массива: ");
        System.out.println("Ответ: " + lab_1.findFirst(arr, x));
    }
    public void Task_17()
    {
        System.out.println("3. Вернуть максимум по модулю");
        int N = Check.inputPositiveInteger("Введите размер массива: ");
        int[] arr = randomFill(N);
        System.out.println("Сгенерированный массив: " + printArray(arr));
        System.out.println("Ответ: " + lab_1.maxAbs(arr));
    }
    public void Task_18()
    {
        System.out.println("5. Добавить массив в массив");
        int N = Check.inputPositiveInteger("Введите размер первого массива: ");
        int M = Check.inputPositiveInteger("Введите размер второго массива: ");
        int[] arr = randomFill(N);
        System.out.println("Первый массив: " + printArray(arr));
        int[] ins = randomFill(M);
        System.out.println("Второй массив: " + printArray(ins));
        int pos = Check.inputIndex("Введите позицию в первом массиве: ", N);
        System.out.println("Ответ: " + printArray(lab_1.add(arr, ins, pos)));
    }
    public void Task_19()
    {
        System.out.println("7. Вернуть перевернутый массив");
        int N = Check.inputPositiveInteger("Введите размер массива: ");
        int[] arr = randomFill(N);
        System.out.println("Сгенерированный массив: " + printArray(arr));
        System.out.println("Ответ: " + printArray(lab_1.reverseBack(arr)));
    }
    public void Task_20()
    {
        System.out.println("9. Вернуть все вхождения числа");
        int N = Check.inputPositiveInteger("Введите размер массива: ");
        int[] arr = randomFill(N);
        System.out.println("Сгенерированный массив: " + printArray(arr));
        int x = Check.inputInteger("Введите элемент массива: ");
        System.out.println("Ответ: " + printArray(lab_1.findAll(arr, x)));
    }

    public void Run()
    {
        System.out.println("Задание 1. Методы");
        Task_1();
        Task_2();
        Task_3();
        Task_4();
        Task_5();

        System.out.print("\n");
        System.out.println("Задание 2. Условия");
        Task_6();
        Task_7();
        Task_8();
        Task_9();
        Task_10();

        System.out.print("\n");
        System.out.println("Задание 3. Циклы");
        Task_11();
        Task_12();
        Task_13();
        Task_14();
        Task_15();

        System.out.println("Задание 4. Массивы");
        Task_16();
        Task_17();
        Task_18();
        Task_19();
        Task_20();
    }
}