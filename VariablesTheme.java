public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("Задачки на тему\n \"Переменные: примитивные типы данных\"\n");
        byte byte1 = 4;
        short short1 = 10;
        int int1 = 19045;
        long long1 = 745;
        char char1 = ':';
        float float1 = 1.0f;
        double double1 = 4.95;
        boolean bool = byte1 < int1;
        if (bool) {
            System.out.println("1. Вывод значений переменных на консоль\n");
            System.out.println("Имя ОС: Windows " + short1 + "\nВерсия 10.0.1945" + 
                    " Cборка " + int1 + "\nКоличество ядер" + char1 + byte1 + 
                    "\nПолный объем физической памяти: " + double1 + "\nДоступно физической памяти: " +
                     long1 + " Мб " + "\nВерсия основной платы: " + float1);
        } else {
            System.out.println("Проверить заданные параметры!");
        }

        int pricePen = 100;
        int priceBook = 200;
        int discount = 11;
        int sumGoods = pricePen + priceBook;
        int sumDiscount = sumGoods * discount / 100;
        int discountPrice = sumGoods - sumDiscount;
        System.out.println("\n2. Расчет стоимости товара со скидкой:\n");
        System.out.println("Сумма скидки: " + sumDiscount + " руб." + 
                "\nОбщая стоимость товара с учетом скидки: " + discountPrice + " руб.");

        System.out.println("\n3. Отобразите в консоли слово JAVA\n");
        System.out.println("   J    a  V     V  a    \n" + "   J   a a  V   V  a a\n" + 
                "J  J  aaaaa  V V  aaaaa\n" + " JJ  a     a  V  a     a");

        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        System.out.println("byte: " + byteMax + "; " + (++byteMax) + "; " + (--byteMax) + "; " +
                "\nshort: " + shortMax + "; " + (++shortMax) + "; " + (--shortMax) +  "; " +
                "\nint: " + intMax + "; " + (++intMax) + "; " + (--intMax) + ";" +
                "\nlong: " + longMax + "; "+ (++longMax) + "; " + (--longMax)+ ";" );

        int num1 = 2;
        int num2 = 5;
        //Первый способ
        int tmp = num2; 
        num2 = num1; 
        num1 = tmp;  
        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("5.1 с помощью третьей переменной " + 
                "\nИсходные значения переменной:" + " \n" + "число 1 = " + num2 + "; " + 
                "число 2 = " + num1 + "\nНовые значения переменной: " + "\nчисло 1 = " + num1 + 
                "; " + " число 2 = " + num2);
        //Арифметический способ
        num1 += num2; 
        num2 = num1 - num2; 
        num1 -= num2;
        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("5.2 с помощью арифметических операций ");
        System.out.println("Исходные значения переменной: " + "\nчисло 1 = " + num2 + "; " + 
                "число 2 = " + num1+ "\n"+"Новые значения переменной: " + "\nчисло 1 = " + num1 + 
                "; " + "число 2 = " + num2);
        //С помощью побитовой операции
        num1 ^= num2; 
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("5.3 с помощью побитовой операции ");
        System.out.println("Исходные значения переменной: " + "\nчисло 1 = " + num2 + "; " + 
                "число 2 = " + num1 + "\nНовые значения переменной: " + "\nчисло 1 = " + num1 + 
                "; " + "число 2 = " + num2);

        char ch35 = '#';
        char ch38 = '&';
        char ch64 = '@';
        char ch94 = '^';
        char ch95 = '_';
        System.out.println("\n6. Вывод символов и их кодов\n");
        System.out.println("35 = " + ch35 + "\n" + "38 = " + ch38 + "\n" + "64 = " + ch64 +
                 "\n" + "94 = "+ch94+"\n" + "95 = " + ch95);

        ch95 = '_';    //переменная определена выше в задании 6
        char ch47 = '/';
        char ch92 = '\\';
        char ch40 = '(';
        char ch41 = ')';
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");
        System.out.println("    " + ch47 + ch92 + "     " + "\n" + "   " + ch47 + "  " +
                ch92 + "    " + "\n" + "  " + ch47 + ch95 + ch40 + " " + ch41 + ch92 + "  " + 
                "\n" + " " + ch47 + "      " + ch92 + " " + "\n" + ch47 + ch95 + ch95 + ch95 + 
                ch95 + ch47 + ch92 + ch95 + ch95 + ch92);

        int numN = 123;
        int numX = numN / 100;
        int numY = numN / 10;
        int numZ = numN / 1;
        int numSumm = 1+2+3;
        int numMult = 1*2*3;
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");
        System.out.println("Число " + numN + " содержит:\n" + numX + " сотен\n" +
                numY + " десятков\n" + numZ + " единиц"+"\nСумма его цифр " + numSumm + 
                "\nА произведение " + numMult);

        int secTotal = 86399;
        int hour = secTotal / 3600; //делим общ.кол-во сек на кол-во сек в часе
        int minutes = (secTotal % 3600) / 60; //от остатка часа деленного на минуты в часе - получаем минуты
        int second = secTotal % 3600 % 60; //получаем остаток - это секунды
        System.out.println("\n9. Вывод времени\n");
        System.out.println(hour + ":"+ minutes + ":" + second);

    }
}
