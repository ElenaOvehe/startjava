public class VariablesTheme {
    public static void main(String[] args) {
        String strVersion = "10.0.1945";
        byte b = 4;
        short s = 10;
        int i = 19045;
        long l = 745;
        char ch = ':';
        float fl = 1.0f;
        double doub = 4.95;
        boolean bool = b < i;
        if (bool) {
            System.out.println("1. Вывод значений переменных на консоль");
            System.out.println("Имя ОС: Windows " + s + "\nВерсия " + strVersion + 
                    " Cборка " + i + "\nКоличество ядер" + ch + b + 
                    "\nПолный объем физической памяти: " + doub + "\nДоступно физической памяти: " +
                     l + " Мб " + "\nВерсия основной платы: " + fl);
        } else {
            System.out.println("Проверить заданные параметры!");
        }

        int pricePen = 100;
        int priceBook = 200;
        int discount = 11;
        int sumGoods = pricePen + priceBook;
        int sumDisc = sumGoods * discount / 100;
        int discountPrice = sumGoods - sumDisc;
        System.out.println("\n2. Расчет стоимости товара со скидкой: ");
        System.out.println("Сумма скидки: " + sumDisc + " руб." + 
                "\nОбщая стоимость товара с учетом скидки: " + discountPrice + " руб.");

        char j = 'J';
        char a = 'a';
        char v = 'V';
        String str1 = "   " + j + "    " + a + "  " + v + "     " + v + "  " + a +"    ";
        String str2 = "   " + j + "    " + a + "  " + v + "     " + v + "  " + a +"    ";
        String str3 = "   " + j + "   " + a + " " + a + "  " + v + "   " + v +"  " + a + 
                " " + a +"  ";
        String str4 = j + "  " + j + "  " + a + a + a + a + a + "  " + v + " " + v + "  " + 
                a + a + a + a + a + " ";
        String str5 = " " + j + j + "  " + a + "     " + a + "  " + v + "  " + a + "     " + a;
        System.out.println("\n3. Отобразите в консоли слово JAVA: ");
        System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4+ "\n" + str5);

        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("\n4. Вывод min и max значений целых числовых типов ");
        System.out.println("byte: " + byteMax + "; " + (++byteMax) + "; " + (--byteMax) + "; " +
            "\nshort: " + shortMax + "; " + (++shortMax) + "; " + (--shortMax) +  "; " +
            "\nint: " + intMax + "; " + (++intMax) + "; " + (--intMax) + ";" +
            "\nlong: " + longMax + "; "+ (++longMax) + "; " + (--longMax)+ ";" );

        int num1 = 2;
        int num2 = 5;
            //Первый способ
        int tmp = num2; //tmp=5
        num2 = num1; //num2=2 
        num1 = tmp;  //num2=5 
        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("5.1 с помощью третьей переменной " + 
                "\nИсходные значения переменной:" + " \n" + "число 1 = " + "2" + "; " + 
                "число 2 = " + "5" + "\nНовые значения переменной: " + "\nчисло 1 = " + num1 + 
                "; "+ " число 2 = " + num2);
            //Арифметический способ
        num1 = num1 + num2; //sum numbers = 7
        num2 = num1 - num2; // num2 = 7 - 2 = 2 | num2 = 5
        num1 = num1 - num2;  // num1 = 7 - 5 =2 | num1 = 2 
        System.out.println("\n5.2 с помощью арифметических операций ");
        System.out.println("Исходные значения переменной: " + "\nчисло 1 = " + "5" + "; " + 
                "число 2 = " + "2"+ "\n"+"Новые значения переменной: " + "\nчисло 1 = " + num1 + 
                "; " + "число 2 = " + num2);
            //С помощью побитовой операции
        num1 = num1 ^ num2; 
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("\n5.3 с помощью побитовой операции ");
        System.out.println("Исходные значения переменной: " + "\nчисло 1 = " + "2" + "; " + 
                "число 2 = " + "5" + "\nНовые значения переменной: " + "\nчисло 1 = " + num1 + 
                "; " + "число 2 = " + num2);

        char ch35 = '#';
        char ch38 = '&';
        char ch64 = '@';
        char ch94 = '^';
        char ch95 = '_';
        System.out.println("\n6. Вывод символов и их кодов ");
        System.out.println("35 = " + ch35 + "\n" + "38 = " + ch38 + "\n" + "64 = " + ch64 +
                 "\n" + "94 = "+ch94+"\n" + "95 = " + ch95);

        ch95 = '_';    //переменная определена выше в задании 6
        char ch47 = '/';
        char ch92 = '\\';
        char ch40 = '(';
        char ch41 = ')';
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка ");
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
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа ");
        System.out.println("Число " + numN + " содержит:\n" + numX + " сотен\n" +
                numY + " десятков\n" + numZ + " единиц"+"\nСумма его цифр " + numSumm + 
                "\nА произведение " + numMult);

        int secTotal = 86399;
        int hour = secTotal / 3600; //делим общ.кол-во сек на кол-во сек в часе
        int minutes = (secTotal % 3600) / 60; //от остатка часа деленного на минуты в часе - получаем минуты
        int second = secTotal % 3600 % 60; //получаем остаток - это секунды
        System.out.println("\n9. Вывод времени");
        System.out.println(hour + ":"+ minutes + ":" + second);

    }
}
