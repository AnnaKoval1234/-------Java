import java.util.Scanner;

public class Main
{
    public Scanner in = new Scanner(System.in);

    // методы
    //задача 1
    public double fraction (double x)
    {
        return Math.abs(x - (int)x);
    }
    //задача 3
    public int charToNum (char x)
    {
        return x - 48;
    }
    //задача 5
    public boolean is2Digits (int x)
    {
        return 10 <= abs(x) && abs(x) <= 99;
    }
    //задача 7
    public boolean isInRange (int a, int b, int num)
    {
        if (a > b)
        {
            int c = a;
            a = b;
            b = c;
        }
        return a <= num && num <= b;
    }
    //задача 9
    public boolean isEqual (int a, int b, int c)
    {
        return a == b && b == c;
    }

    //условия
    //задача 1
    public int abs (int x)
    {
        return x > 0 ? x : -x;
    }
    //задача 3
    public boolean is35 (int x)
    {
        return (x % 3 == 0 || x % 5 == 0) && x % 15 != 0;
    }
    //задача 5
    public int max3 (int x, int y, int z)
    {
        if (x < y)
            x = y;
        if (x < z)
            x = z;
        return x;
    }
    //задача 7
    public int sum2 (int x, int y)
    {
        return 10 <= x + y && x + y <= 19 ? 20 : x + y; 
    }
    //задача 9
    public String day (int x)
    {
        return switch (x) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "это не день недели";
        };
    }

    //циклы
    //задача 1
    public String listNums (int x)
    {
        String line = "";
        for (int i = 0; i <= x; i++)
            line += i + " ";    
        return line;
    }
    //задача 3
     public String chet (int x)
     {
        String line = "";
        for (int i = 0; i <= x; i += 2)
            line += i + " ";    
        return line;
     }
     //задача 5
     public int numLen (long x)
     {
        int count = 0;
        if (x <= 0)
            count++;
        while (x != 0)
        {
            x /= 10;
            count++;
        }
        return count;
     }
     //задача 7
     public void square (int x)
     {
        String line = "";
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++)
                line += "*";
            line += "\n";
        }
        System.out.println(line);
     }
     //задача 9
     public void rightTriangle (int x)
     {
        String line = "";
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) 
                line += " ";
            for (int k = 1; k <= i; k++)
                line += "*";
            line += "\n";
        }
        System.out.println(line);
     }

    //массивы
    //задание 1
    public int findFirst (int[] arr, int x)
    {
        for (int i = 0; i < arr.length; i++)
            if (x == arr[i])
                return i;
        return -1;
    }
    //задание 3
    public int maxAbs (int[] arr)
    {
        int max = 0;
        for (int i = 0; i < arr.length; i++)
            if (abs(max) < abs(arr[i]))
                max = arr[i];
        return max;
    }
    //задание 5
    public int[] add (int[] arr, int[] ins, int pos)
    {
        int len = arr.length + ins.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++)
        {
            if (i < pos)
                res[i] = arr[i];
            else if (pos <= i && i < pos + ins.length)
                res[i] = ins[i - pos];
            else
                res[i] = arr[i - ins.length];
        }
        return res;
    }
    //задание 7
     public int[] reverseBack (int[] arr)
     {
        int[] res = new int[arr.length];
        for (int i = 0; i < res.length; i++)
            res[i] = arr[arr.length - 1 - i];
        return res;
     }
     //задание 9
     public int[] findAll (int[] arr, int x)
     {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (x == arr[i])
                count++;
        int[] res = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++)
            if (x == arr[i])
            {
                res[count] = i;
                count++;
            }
        return res;
     }

    public int inputInteger(String text)
    {   
        int number = 0;
        boolean flag = false;
        while (!flag) 
        {
            try
            {
                System.out.println(text);
                number = in.nextInt();
                flag = true;
            }
            catch (Exception ex)
            {
                System.out.println("Введено не целое число!");
                in.nextLine();
            }
        }
        return number;
    }

    public int inputNotNegativeInteger(String text)
    {   
        int number = 0;
        boolean flag = false;
        while (!flag) 
        {
            number = inputInteger(text);
            if (number < 0)
            {
                System.out.println("Введено отрицательное число!");
                in.nextLine();
            }
            else
                flag = true;
        }
        return number;
    }

    public int inputPositiveInteger(String text)
    {   
        int number = 0;
        boolean flag = false;
        while (!flag) 
        {
            number = inputInteger(text);
            if (number <= 0)
            {
                System.out.println("Введено неположительное число!");
                in.nextLine();
            }
            else
                flag = true;
        }
        return number;
    }

    public int inputIndex(String text, int arraySize)
    {
        int number = 0;
        boolean flag = false;
        while (!flag) 
        {
            number = inputNotNegativeInteger(text);
            if (number >= arraySize)
            {
                System.out.println("Индекс выходит за пределы массива!");
                in.nextLine();
            }
            else
                flag = true;
        }
        return number;
    }

    public double inputDouble(String text)
    {   
        double number = 0.0;
        boolean flag = false;

        while (!flag) 
        {
            try
            {
                System.out.println(text);
                number = in.nextDouble();
                if (Math.abs(number - (int)number) < 0.0000000000000001)
                {
                    System.out.println("Введено целое число!");
                    in.nextLine();
                }
                else
                    flag = true;
            }
            catch (Exception ex)
            {
                System.out.println("Введено не число!");
                in.nextLine();
            }
        }
        return number;
    }

    public char inputCharNumber(String text)
    {   
        String line;
        char symbol = '\0';
        boolean flag = false;

        while (!flag) 
        {
            System.out.println(text);
            line = in.next();
            if (line.length() > 1)
            {
                System.out.println("Введено больше одного символа!");
                in.nextLine();
            }
            else
            {
                symbol = line.charAt(0);
                if (symbol < '0' || symbol > '9')
                {
                    System.out.println("Введена не цифра!");
                    in.nextLine();
                }
                else
                    flag = true;
            } 
        }
        return symbol;
    }

    public long inputLong(String text)
    {   
        long number = 0;
        boolean flag = false;
        while (!flag) 
        {
            try
            {
                System.out.println(text);
                number = in.nextLong();
                flag = true;
            }
            catch (Exception ex)
            {
                System.out.println("Введено не целое число!");
                in.nextLine();
            }
        }
        return number;
    }


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
        double x = inputDouble("Введите дробное число (через запятую): ");
        System.out.println("Ответ: " + fraction(x));
    }
    public void Task_2()
    {
        System.out.println("3. Преревести букву в число");
        char x = inputCharNumber("Введите цифру: ");
        System.out.println("Ответ: " + charToNum(x));
    }
    public void Task_3()
    {
        System.out.println("5. Двузначное ли число?");
        int x = inputInteger("Введите целое число: ");
        System.out.println("Ответ: " + is2Digits(x));
    }
    public void Task_4()
    {
        System.out.println("7. Входит ли число в диапазон?");
        int x = inputInteger("Введите левую границу: ");
        int y = inputInteger("Введите правую границу: ");
        int z = inputInteger("Введите целое число: ");
        System.out.println("Ответ: " + isInRange(x, y, z));
    }
    public void Task_5()
    {
        System.out.println("9. Равны ли три числа?");
        int x = inputInteger("Введите первое число: ");
        int y = inputInteger("Введите второе число: ");
        int z = inputInteger("Введите третье число: ");
        System.out.println("Ответ: " + isEqual(x, y, z));
    }
    public void Task_6()
    {
        System.out.println("1. Вернуть модуль числа");
        int x = inputInteger("Введите целое число: ");
        System.out.println("Ответ: " + abs(x));
    }
    public void Task_7()
    {
        System.out.println("3. Кратно ли число трём или пяти, но не трём и пяти одновременно?");
        int x = inputInteger("Введите целое число: ");
        System.out.println("Ответ: " + is35(x));
    }
    public void Task_8()
    {
        System.out.println("5. Вернуть максимум из трех чисел");
        int x = inputInteger("Введите первое число: ");
        int y = inputInteger("Введите второе число: ");
        int z = inputInteger("Введите третье число: ");
        System.out.println("Ответ: " + max3(x, y, z));
    }
    public void Task_9()
    {
        System.out.println("7. Вернуть сумму двух чисел или 20");
        int x = inputInteger("Введите первое число: ");
        int y = inputInteger("Введите второе число: ");
        System.out.println("Ответ: " + sum2(x, y));
    }
    public void Task_10()
    {
        System.out.println("9. Вернуть день недели");
        int x = inputInteger("Введите целое число: ");
        System.out.println("Ответ: " + day(x));
    }
    public void Task_11()
    {
        System.out.println("1. Вернуть список чисел");
        int x = inputNotNegativeInteger("Введите целое число: ");
        System.out.println("Ответ: " + listNums(x));
    }
    public void Task_12()
    {
        System.out.println("3. Вернуть список четных чисел");
        int x = inputNotNegativeInteger("Введите целое число: ");
        System.out.println("Ответ: " + chet(x));
    }
    public void Task_13()
    {
        System.out.println("5. Вернуть количество знаков в числе");
        long x = inputLong("Введите целое число: ");
        System.out.println("Ответ: " + numLen(x));
    }
    public void Task_14()
    {
        System.out.println("7. Вывести квадрат из звездочек");
        int x = inputPositiveInteger("Введите положительное число: ");
        System.out.println("Ответ: ");
        square(x);
    }
    public void Task_15()
    {
        System.out.println("9. Вывести треугольник из звездочек");
        int x = inputPositiveInteger("Введите положительное число: ");
        System.out.println("Ответ: ");
        rightTriangle(x);
    }
    public void Task_16()
    {
        System.out.println("1. Вернуть индекс первого вхождения");
        int N = inputPositiveInteger("Введите размер массива: ");
        int[] arr = randomFill(N);
        System.out.println("Сгенерированный массив: " + printArray(arr));
        int x = inputInteger("Введите элемент массива: ");
        System.out.println("Ответ: " + findFirst(arr, x));
    }
    public void Task_17()
    {
        System.out.println("3. Вернуть максимум по модулю");
        int N = inputPositiveInteger("Введите размер массива: ");
        int[] arr = randomFill(N);
        System.out.println("Сгенерированный массив: " + printArray(arr));
        System.out.println("Ответ: " + maxAbs(arr));
    }
    public void Task_18()
    {
        System.out.println("5. Добавить массив в массив");
        int N = inputPositiveInteger("Введите размер первого массива: ");
        int M = inputPositiveInteger("Введите размер второго массива: ");
        int[] arr = randomFill(N);
        System.out.println("Первый массив: " + printArray(arr));
        int[] ins = randomFill(M);
        System.out.println("Второй массив: " + printArray(ins));
        int pos = inputIndex("Введите позицию в первом массиве: ", N);
        System.out.println("Ответ: " + printArray(add(arr, ins, pos)));
    }
    public void Task_19()
    {
        System.out.println("7. Вернуть перевернутый массив");
        int N = inputPositiveInteger("Введите размер массива: ");
        int[] arr = randomFill(N);
        System.out.println("Сгенерированный массив: " + printArray(arr));
        System.out.println("Ответ: " + printArray(reverseBack(arr)));
    }
    public void Task_20()
    {
        System.out.println("9. Вернуть все вхождения числа");
        int N = inputPositiveInteger("Введите размер массива: ");
        int[] arr = randomFill(N);
        System.out.println("Сгенерированный массив: " + printArray(arr));
        int x = inputInteger("Введите элемент массива: ");
        System.out.println("Ответ: " + printArray(findAll(arr, x)));
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

    public static void main(String args[])
    {   
        Main m = new Main();
        m.Run();

    }
}