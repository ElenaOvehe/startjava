public class VariablesTheme {
    public static void main(String[] args){
        String str1 = "1. Вывод значений переменных на консоль";
        String strVersion = "10.0.1945";
        byte b = 4;
        short s = 10;
        int i = 19045;
        long l = 745;
        char ch = ':';
        float fl = 1.0f;
        double doub = 4.95;
        boolean bool = b < i;
            if (bool) {System.out.println(str1 + ch + "\n\nИмя ОС: Windows " + s + "\nВерсия " +
            strVersion + " Cборка " + i + "\nКоличество ядер: " + b + 
            "\nПолный объем физической памяти: " + doub + "\nДоступно физической памяти: " + l + 
            " Мб " + "\nВерсия основной платы: " + fl);
            } 
            else {System.out.println("Проверить заданные параметры!");
            }


        String str2 = "2. Расчет стоимости товара со скидкой: ";
        String sumDisc = "Сумма скидки: ";
        String sumCost = "Общая стоимость товара с учетом скидки: ";
        String rub = " руб.";
        int pen = 100;
        int book = 200;
        int discount = 11;    //% скидка 

        int sumProduct = pen + book;
        int calcSumDisc = sumProduct * discount / 100;
        int calcSumCost = sumProduct - calcSumDisc;

            System.out.println("\n" + str2 + "\n" + sumDisc + calcSumDisc + rub + "\n" + sumCost +
            calcSumCost + rub);

        String str3 = "3. Отобразите в консоли слово JAVA: ";
        char j = 'J';
        char a = 'a';
        char v = 'V';
            System.out.println("\n" + str3 + 
            "\n" + "\n   " + j + "    " + a + "  " + v + "     " + v + "  " + a +"    " +
            "\n" + "   " + j + "   " + a + " " + a + "  " + v + "   " + v +"  " + a + " " + a + "  " +
            "\n" + j + "  " + j + "  " + a + a + a + a + a + "  " + v + " " + v + "  " + a + a + a + a + a + " " +
            "\n" + " " + j + j + "  " + a + "     " + a + "  " + v + "  " + a + "     " + a);

        String str4 = "4. Вывод min и max значений целых числовых типов: ";
        byte byte4 = 127;
        short short4 = 32_767;
        int int4 = 2_147_483_647;
        long long4 = 9_223_372_036_854_775_807L;

        byte incrByte = (++byte4);
        byte decrByte = --byte4;                         
        short incrShort = ++short4;
        short decrShort = --short4;
        int incrInt = ++int4;
        int decrInt = --int4;
        long incrLong = ++long4;
        long decrLong = --long4;
            System.out.println("\n" + str4 + "\nbyte: " + byte4 + "; " + incrByte + "; " + decrByte + "; " +
            "\n" + "short: " + short4 + "; " + incrShort + "; " + decrShort +  "; " +
            "\n" + "int: " + int4 + "; " + incrInt + "; " + decrInt + ";" +
            "\n" +"long: " + long4 + "; " + incrLong + "; " + decrLong + ";" );

        String str5 = "5. Перестановка значений переменных";
        String opt1 = "5.1 с помощью третьей переменной ";
        String opt2 = "5.2 с помощью арифметических операций ";
        String opt3 = "5.3 с помощью побитовой операции ";
        String numb1 = "число 1 = ";
        String numb2 = " число 2 = ";
        String initVal = "Исходные значения переменной: ";
        String initNew = "Новые значения переменной: ";

        int initNumb1 = 2; //для вывода изначальных значений числа 1
        int initNumb2 = 5; //для вывода изначальных значений числа 2

        int x1 = 2;
        int x2 = 5;

        //Первый способ
        int x3 = x2; //x3=5
        x2 = x1; //x2=2 
        x1 = x3;  //x2=5 
            System.out.println("\n" + str5 + "\n" + opt1 +"\n" + initVal + "\n" + numb1 + initNumb1 +
            "; " + numb2 + initNumb2 + "\n" + initNew + "\n" + numb1 + x1 + "; "+ numb2 + x2);

        //Арифметический способ
        x1 = x1 + x2; //sum numbers = 7
        x2 = x1 - x2; // x2 = 7 - 2 = 2 | x2 = 5
        x1 = x1 - x2;  // x1 = 7 - 5 =2 | x1 = 2 
            System.out.println("\n"+opt2+"\n"+initVal+"\n"+numb1+"5"+"; "+numb2+"2"+
            "\n"+initNew+"\n"+numb1+x1+"; "+numb2+x2);

        //С помощью побитовой операции
        x1 = x1 ^ x2; 
        x2 = x1 ^ x2;
        x1 = x1 ^ x2;
            System.out.println("\n"+opt3+"\n"+initVal+"\n"+numb1+"2"+"; "+numb2+"5"+
            "\n"+initNew+"\n"+numb1+x1+"; "+numb2+x2);

        String str6 = "6. Вывод символов и их кодов";
        char ch35 = '#';
        char ch38 = '&';
        char ch64 = '@';
        char ch94 = '^';
        char ch95 = '_';
            System.out.println("\n"+str6+"\n"+"35 = "+ch35+"\n"+ "38 = "+ch38+"\n"+"64 = "+ch64+"\n"+
            "94 = "+ch94+"\n"+"95 = "+ch95);

        String str7 = "7. Вывод в консоль ASCII-арт Дюка ";
        //System.out.println((int)'/'); узнать код элемента
        ch95 = '_'; //переменная определена выше в задании 6
        char ch47 = '/';
        char ch92 = '\\';
        char ch40 = '(';
        char ch41 = ')';
            System.out.println("\n"+str7+"\n"+"    "+ch47+ch92+"     "+"\n"+
            "   "+ch47+"  "+ch92+"    "+"\n"+
            "  "+ch47+ch95+ch40+" "+ch41+ch92+"  "+"\n"+
            " "+ch47+"      "+ch92+" "+"\n"+
            ch47+ch95+ch95+ch95+ch95+ch47+ch92+ch95+ch95+ch92);

        String str8 = "8. Вывод количества сотен, десятков и единиц числа";
        String strNumBeg = "Число N содержит: ";
        String strX = " сотен ";
        String strY = " десятков ";
        String strZ = " единиц ";
        String strSumm = "Сумма его цифр ";
        String strMult = "А произведение ";
        int numN = 123;
        int numX = numN / 100;
        int numY = numN / 10;
        int numZ = numN / 1;
        int numSumm = 1+2+3;
        int numMult = 1*2*3;
            System.out.println("\n"+str8+"\n"+"Число "+numN+" содержит: "+"\n"+numX+strX+"\n"+
            numY+strY+"\n"+numZ+strZ+"\n"+strSumm+numSumm+"\n"+strMult+numMult);

        String str9 = "9. Вывод времени";
        int secTotal = 86399;
        int hour = secTotal / 3600; //делим общ.кол-во сек на кол-во сек в часе
        int minutes = (secTotal % 3600) / 60; //от остатка часа деленного на минуты в часе - получаем минуты
        int second = secTotal % 3600 % 60; //получаем остаток - это секунды
            System.out.println("\n"+str9+"\n"+hour+":"+minutes+":"+second);

    }
}
