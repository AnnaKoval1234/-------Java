package lab_1;

public class Lab_1
{
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
}