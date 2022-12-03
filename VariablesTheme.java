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
                System.out.println("1. Вывод значений переменных на консоль" + ch + 
                        "\nИмя ОС: Windows " + s + "\nВерсия " + strVersion + " Cборка " + i + 
                        "\nКоличество ядер: " + b + "\nПолный объем физической памяти: " + doub + 
                        "\nДоступно физической памяти: " + l + " Мб " + 
                        "\nВерсия основной платы: " + fl);
            } else {
                System.out.println("Проверить заданные параметры!");
            }

        int pricePen = 100;
        int priceBook = 200;
        int discount = 11;    //% скидка 
        int sumProduct = pricePen + priceBook;
        int calcSumDisc = sumProduct * discount / 100;
        int calcSumCost = sumProduct - calcSumDisc;
        System.out.println("\n2. Расчет стоимости товара со скидкой: "+ "\nСумма скидки: " + 
                calcSumDisc + " руб." + "\nОбщая стоимость товара с учетом скидки: " 
                + calcSumCost + " руб.");

        String j = "J";
        String a = "a";
        String v = "V";
        System.out.println("\n3. Отобразите в консоли слово JAVA: "+ 
                "\n" + "\n   " + j + "    " + a + "  " + v + "     " + v + "  " + a +"    " +
                "\n" + "   " + j + "   " + a + " " + a + "  " + v + "   " + v +"  " + a + " " + a +
                "  " + "\n" + j + "  " + j + "  " + a + a + a + a + a + "  " + v + " " + v + "  " +
                a + a + a + a + a + " " + "\n" + " " + j + j + "  " + a + "     " + a + "  " + v + 
                "  " + a + "     " + a);

        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("\n4. Вывод min и max значений целых числовых типов: " +
                "\nbyte: " + byteMax + "; " + (++byteMax) + "; " + (--byteMax) + "; " +
                "\nshort: " + shortMax + "; " + (++shortMax) + "; " + (--shortMax) +  "; " +
                "\nint: " + intMax + "; " + (++intMax) + "; " + (--intMax) + ";" +
                "\nlong: " + longMax + "; "+ (++longMax) + "; " + (--longMax)+ ";" );

        int initNumb1 = 2; //для вывода изначальных значений числа 1
        int initNumb2 = 5; //для вывода изначальных значений числа 2
        int x1 = 2;
        int x2 = 5;
            //Первый способ
        int x3 = x2; //x3=5
        x2 = x1; //x2=2 
        x1 = x3;  //x2=5 
        System.out.println("\n5. Перестановка значений переменных" + 
                "\n5.1 с помощью третьей переменной " + "\nИсходные значения переменной:" + " \n" + 
                "число 1 = " + initNumb1 + "; " + "число 2 = " + initNumb2 + 
                "\nНовые значения переменной: " + "\nчисло 1 = " + x1 + "; "+ " число 2 = " + x2);
            //Арифметический способ
        x1 = x1 + x2; //sum numbers = 7
        x2 = x1 - x2; // x2 = 7 - 2 = 2 | x2 = 5
        x1 = x1 - x2;  // x1 = 7 - 5 =2 | x1 = 2 
        System.out.println("\n5.2 с помощью арифметических операций " + 
                "\nИсходные значения переменной: " + "\nчисло 1 = " + "5" + "; " + "число 2 = " + "2"+
                "\n"+"Новые значения переменной: " + "\nчисло 1 = " + x1 + "; " + "число 2 = " + x2);
            //С помощью побитовой операции
        x1 = x1 ^ x2; 
        x2 = x1 ^ x2;
        x1 = x1 ^ x2;
        System.out.println("\n5.3 с помощью побитовой операции " + 
                "\nИсходные значения переменной: " + "\nчисло 1 = " + "2" + "; " + "число 2 = " + 
                "5" + "\nНовые значения переменной: " + "\nчисло 1 = " + x1 + "; " + "число 2 = " + x2);

        char ch35 = '#';
        char ch38 = '&';
        char ch64 = '@';
        char ch94 = '^';
        char ch95 = '_';
        System.out.println("\n6. Вывод символов и их кодов" + "\n" + "35 = " + ch35 + "\n" +
                "38 = " + ch38 + "\n" + "64 = " + ch64 + "\n" + "94 = "+ch94+"\n" + "95 = " + ch95);

        ch95 = '_';    //переменная определена выше в задании 6
        char ch47 = '/';
        char ch92 = '\\';
        char ch40 = '(';
        char ch41 = ')';
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка " + "\n" + "    " + ch47 + ch92 + 
                "     " + "\n" + "   " + ch47 + "  " + ch92 + "    " + "\n" + "  " + ch47 + ch95 + 
                ch40 + " " + ch41 + ch92 + "  " + "\n" + " " + ch47 + "      " + ch92 + " " + "\n" +
                ch47 + ch95 + ch95 + ch95 + ch95 + ch47 + ch92 + ch95 + ch95 + ch92);

        int numN = 123;
        int numX = numN / 100;
        int numY = numN / 10;
        int numZ = numN / 1;
        int numSumm = 1+2+3;
        int numMult = 1*2*3;
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа" + "\nЧисло " +
                numN + " содержит: " + "\n" + numX + " сотен" + "\n" + numY + " десятков" + "\n" +
                numZ + " единиц"+"\nСумма его цифр " + numSumm + "\nА произведение " + numMult);

        String str9 = "9. Вывод времени";
        int secTotal = 86399;
        int hour = secTotal / 3600; //делим общ.кол-во сек на кол-во сек в часе
        int minutes = (secTotal % 3600) / 60; //от остатка часа деленного на минуты в часе - получаем минуты
        int second = secTotal % 3600 % 60; //получаем остаток - это секунды
        System.out.println("\n"+str9+"\n"+hour+":"+minutes+":"+second);

    }
}
