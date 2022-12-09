public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("Задачки на тему\n \"Переменные: примитивные типы данных\"\n");
        byte numbCores = 4;
        short nameOS = 10;
        int assemCode = 19045;
        long availMemory = 745;
        char colon = ':';
        float versBoard = 1.0f;
        double numbMemory = 4.95;
        boolean bool = numbCores < assemCode;
        if (bool) {
            System.out.println("1. Вывод значений переменных на консоль\n");
            System.out.println("Имя ОС: Windows " + nameOS + "\nВерсия 10.0.1945" + 
                    " Cборка " + assemCode + "\nКоличество ядер" + colon + numbCores + 
                    "\nПолный объем физической памяти: " + numbMemory + "\nДоступно физической памяти: " +
                     availMemory + " Мб " + "\nВерсия основной платы: " + versBoard);
        } else {
            System.out.println("Проверить заданные параметры!");
        }

        int pricePen = 100;
        int priceBook = 200;
        int discount = 11;
        int sumGoods = pricePen + priceBook;
        int sumDiscount = sumGoods * discount / 100;
        int discountPrice = sumGoods - sumDiscount;
        System.out.println("\nЗадачки на тему\n \"Переменные: примитивные типы данных\"");
        System.out.println("\n2. Расчет стоимости товара со скидкой:\n");
        System.out.println("Сумма скидки: " + sumDiscount + " руб." + 
                "\nОбщая стоимость товара с учетом скидки: " + discountPrice + " руб.");

        System.out.println("\nЗадачки на тему\n \"Переменные: примитивные типы данных\"");
        System.out.println("\n3. Отобразите в консоли слово JAVA\n");
        System.out.println("   J    a  V     V  a    \n" + "   J   a a  V   V  a a\n" + 
                "J  J  aaaaa  V V  aaaaa\n" + " JJ  a     a  V  a     a");

        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("\nЗадачки на тему\n \"Переменные: примитивные типы данных\"");
        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        System.out.println("byte: " + byteMax + "; " + (++byteMax) + "; " + (--byteMax) + "; " +
                "\nshort: " + shortMax + "; " + (++shortMax) + "; " + (--shortMax) +  "; " +
                "\nint: " + intMax + "; " + (++intMax) + "; " + (--intMax) + ";" +
                "\nlong: " + longMax + "; "+ (++longMax) + "; " + (--longMax)+ ";" );

/*
        int num1 = 2;
        int num2 = 5; 
        //Первый способ
        int tmp = num2; //tmp =5
        num2 = num1; //num2 =2
        num1 = tmp;  //num1 = 5
        System.out.println("\nЗадачки на тему\n \"Переменные: примитивные типы данных\"");
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
*/
        int num1 = 2;
        int num2 = 5; {
            System.out.println("\nЗадачки на тему\n \"Переменные: примитивные типы данных\"");
            System.out.println("\n5. Перестановка значений переменных");
            //Выводим исходные значения
            System.out.println("5.1 с помощью третьей переменной " + "\nИсходные значения переменной:" + 
                " \n" + "число 1 = " + num1 + "; " + "число 2 = " + num2);
        }
        //Первый способ
        int tmp = num2; //tmp =5
        num2 = num1; //num2 =2
        num1 = tmp;  //num1 = 5
        //выводим новые полученные значения по первому способу
        System.out.println("Новые значения переменной: " + "\nчисло 1 = " + num1 + 
                "; " + " число 2 = " + num2); {
                    /*вывод арифметического вставлен здесь, чтобы новые-получившиеся значения 
                    первого способа присвоить к исходным значениям второго способа */
                    System.out.println("\n5. Перестановка значений переменных");
                    System.out.println("5.2 с помощью арифметических операций ");
                    System.out.println("Исходные значения переменной: " + "\nчисло 1 = " + num1 + 
                            "; " + "число 2 = " + num2);
        }
        //Арифметический способ
        num1 += num2; 
        num2 = num1 - num2; 
        num1 -= num2;
        System.out.println("Новые значения переменной: " + "\nчисло 1 = " + num1 + "; " + 
                "число 2 = " + num2);{
                    //аналогично, что и выше
                    System.out.println("\n5. Перестановка значений переменных");
                    System.out.println("5.3 с помощью побитовой операции ");
                    System.out.println("Исходные значения переменной: " + "\nчисло 1 = " + num1 + 
                            "; " + "число 2 = " + num2);
        }
        //С помощью побитовой операции
        num1 ^= num2; 
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения переменной: " + "\nчисло 1 = " + num1 + "; " +
                 "число 2 = " + num2);

        char ch35 = '#';
        char ch38 = '&';
        char ch64 = '@';
        char ch94 = '^';
        char ch95 = '_';
        System.out.println("\nЗадачки на тему\n \"Переменные: примитивные типы данных\"");
        System.out.println("\n6. Вывод символов и их кодов\n");
        System.out.println((int)ch35 + " = " + ch35 + "\n" + (int)ch38 + " = " + ch38 + 
                "\n" + (int)ch64 + " = "+ ch64 + "\n" + (int)ch94 + " = " + ch94 + 
                "\n" + (int)ch95 + " = " + ch95);

        ch95 = '_';    //переменная определена выше в задании 6
        char underline95 = ch95; //переопределяем 
        char slash47 = '/';
        char backSlash92 = '\\';
        char openBracket40 = '('; 
        char closedBraket41 = ')';
        System.out.println("\nЗадачки на тему\n \"Переменные: примитивные типы данных\"");
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");
        System.out.println("    " + slash47 + backSlash92 + "     " + "\n" + "   " + slash47 + 
                "  " + backSlash92 + "    " + "\n" + "  " + slash47 + underline95 + openBracket40 + 
                " " + closedBraket41 + backSlash92 + "  " + "\n" + " " + slash47 + "      " + 
                backSlash92 + " " + "\n" + slash47 + underline95 + underline95 + underline95 + 
                underline95 + slash47 + backSlash92 + underline95 + underline95 + backSlash92);

        int scrNum = 123;
        int hundred = scrNum / 100;
        int tens = scrNum / 10;
        int unit = scrNum / 1;
        int sumDigits = hundred + tens + unit;
        int prodDigits = hundred * tens * unit;
        System.out.println("\nЗадачки на тему\n \"Переменные: примитивные типы данных\"");
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");
        System.out.println("Число " + scrNum + " содержит:\n" + hundred + " сотен\n" +
                tens + " десятков\n" + unit + " единиц"+"\nСумма его цифр " + sumDigits + 
                "\nА произведение " + prodDigits);

        int secTotal = 86399;
        int hour = secTotal / 3600; //делим общ.кол-во сек на кол-во сек в часе
        int minutes = (secTotal % 3600) / 60; //от остатка часа деленного на минуты в часе - получаем минуты
        int second = secTotal % 3600 % 60; //получаем остаток - это секунды
        System.out.println("\nЗадачки на тему\n \"Переменные: примитивные типы данных\"");
        System.out.println("\n9. Вывод времени\n");
        System.out.println(hour + ":"+ minutes + ":" + second);

    }
}
