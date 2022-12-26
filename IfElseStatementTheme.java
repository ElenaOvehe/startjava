import java.util.Scanner;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");

        int age = 27 ;
        if (age < 20) {
            System.out.println("Вы младше 20 лет");
        } else {
            System.out.println("Вы старше 20 лет");
        }
        boolean maleGender = true;
        if (maleGender) {
            System.out.println("Пользователь - мужчина");
        } else {
            System.out.println("Пользователь - женщина");
        }
        float heigh = (float) 169 / 100;
        System.out.println("heigh = " + heigh);
        if (heigh < 1.80) {
            System.out.println("Ваш рост ниже 1 м 80 см, и составляет: " + (int) (heigh*100) + " см");
        } else {
            System.out.println("Ваш рост выше 180 см, и составляет: " + (int) (heigh*100) + " см");
        }
        char capitalLetter = "Bary".charAt(0);
        if (capitalLetter == 'M') {
            System.out.println("Ваше имя начинается на букву \"M\"");
        } else if (capitalLetter == 'I') {
            System.out.println("Ваше имя начинается на букву \"I\"");
        } else {
            System.out.println("\nПриятно познакомиться! Ваше имя начинается на букву " 
                    + "\"" + capitalLetter + "\"");
        }


        System.out.println("\n2. Поиск max и min числа");
        int numb1 = 16;
        int numb2 = -22;
        if (numb1 < numb2) {
            System.out.println("Число " + numb1 + " меньше, чем число: " + numb2);
        } else if (numb1 > numb2) {
            System.out.println("Число " + numb1 + " больше, чем число: " + numb2);
        } else {
            System.out.println("Числа: " + numb1 + " и " + numb2 + " равны!");
        }

        System.out.println("\n3. Проверка числа");
        int numb3 = -177;
        if (numb3 == 0) {
            System.out.println("число " + numb3 + " = 0!");
        } else if (numb3 < 0 && numb3 % 2 == 0) {
            System.out.println(numb3 + " - число отрицательное и четное");
        } else if (numb3 < 0 && numb3 % 2 != 0) {
            System.out.println(numb3 + " - число отрицательное и не четное");
        } else if (numb3 > 0 && numb3 % 2 == 0) {
            System.out.println(numb3 + " - число положительное и четное");
        } else if (numb3 > 0 && numb3 % 2 != 0) {
            System.out.println(numb3 + " - число положительное и не четное");
        }


        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int scrNum1 = 222;
        int scrNum2 = 715;
        int hundred1 = scrNum1 / 100;
        int tens1 = scrNum1 / 10 % 10;
        int ones1 = scrNum1 % 10;
        int hundred2 = scrNum2 / 100;
        int tens2 = scrNum2 / 10 % 10;
        int ones2 = scrNum2 % 10;
        System.out.println("\nИсходные числа " + scrNum1 + " и " + scrNum2 );

        if (hundred1 == hundred2) {
            System.out.println("Одинаковые в них цифры первого разряда: " + 
                    hundred1 + " = " + hundred2);
        } 
        if (tens1 == tens2) {
            System.out.println("Одинаковые в них цифры второго разряда: " + tens1 + " = " + tens2);
        } 
        if (ones1 == ones2) {
            System.out.println("Одинаковые в них цифры третьего разряда: " + ones1 + " = " + ones2);
        } 
        if (hundred1 != hundred2 && tens1 != tens2 && ones1 != ones2){
            System.out.println("равных цифр нет!");
        }


        System.out.println("\n5. Определение символа по его коду\n");
        char unknownChar = '\u0057';
        if (('A' <= unknownChar) && (unknownChar <= 'Z')) { //A = 65 Z=90
            System.out.println("код обозначает: " + unknownChar + " - большую букву");
        } else if (('a' <= unknownChar) && (unknownChar < 'z')) {
            System.out.println("код обозначает: " + unknownChar + " - маленькую букву");
        } else if (('0' <= unknownChar) && (unknownChar <= '9')) {
            System.out.println("код является: " + unknownChar + " - цифрой");
        } else {
            System.out.println("исходный код является не буквой и не цифрой!");
        }
        System.out.println(unknownChar + " - номер кода " + (int) unknownChar);

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        int accrual = depositAmount*10/100;
        int amountYear = depositAmount + accrual;
        if (depositAmount < 100_000) {
            System.out.println("\nНа данный вклад начисления составят: 5%");
        } else if ((100_00 <= depositAmount) && (depositAmount < 300_000)) {
            System.out.println("\nНа данный вклад начисления составят: 7%");
        } else if (depositAmount >= 300_000) {
            System.out.println("\nНа данный вклад начисления составят: 10%");
        } else {
            System.out.println("\nПроверьте введенные данные.");
        }
        System.out.println("Клиент внес: " + depositAmount + "\nНачисления составят: " + 
                accrual + "\nИтоговая сумма к выплате за год: " + amountYear);

        System.out.println("\n7. Определение оценки по предметам\n");
        int ratingHistory = 59;
        int ratingProgramming = 91;
        int averageRating = (ratingHistory + ratingProgramming) / 2;
        int resultHistory = 2 ;
        int resultProgramming = 4;
        int averageScore = (resultHistory + resultProgramming) / 2;
        if (ratingHistory <= 60) {
            System.out.println("2 балла" + " - История" );
        } else if (ratingHistory > 60 && ratingHistory <= 73) {
            System.out.println("3 балла" + " - История");
        }else if (ratingHistory > 73 && ratingHistory <= 91) {
            System.out.println("4 балла" + " - История");
        } else if (ratingHistory > 91 && ratingHistory <= 100){
            System.out.println("5 баллов" + " - История");
        } 
        if (ratingProgramming <= 60) {
            System.out.println("2 балла" + " - Программирование");
        } else if (ratingProgramming > 60 && ratingProgramming <= 73) {
            System.out.println("3 балла" + " - Программирование");
        } else if (ratingProgramming > 73 && ratingProgramming <= 91) {
            System.out.println("4 балла - Программирование");
        } else if (ratingProgramming > 91 && ratingProgramming <= 100){
            System.out.println("5 баллов" + " - Программирование");
        }
        System.out.println("Средний балл оценок по предметам: " + averageScore +
                "\nСредний % по предметам: " + averageRating + " %");

        System.out.println("\n8. Расчет прибыли за год\n");
        int expensisRent = 5_000;
        int expensisGoods = 9_000;
        int profitGoods = 13_000;
        int calculationYear = (profitGoods - (expensisRent + expensisGoods))*12;
        if (calculationYear > 0) {
            System.out.println("+" + calculationYear);
        } else {
            System.out.println(calculationYear);
        }

        System.out.println("\n9. Подсчет количества банкнот\n");
        //нужно снять
        int needMoney = 567;
        //делим это число чтоб получить в количестве банкнот
        int hundredBanknotes = needMoney / 100;
        int tensBanknotes = needMoney / 10 % 10;
        int onesBanknotes = needMoney % 10;
        System.out.println("Требуемое количество банкнот. " + needMoney + " USD \n"
            + hundredBanknotes + " сотен " + tensBanknotes + " десятков " + onesBanknotes + " единиц");
        //есть в наличии количество банкнот
        int thereAreHundredsUSD = 10;
        int thereAreTensUSD = 5;
        int thereAreOnesUSD = 50;
        int jarTotalMoney = 10*100+5*10+50*1;
        int remainderOnes = thereAreOnesUSD - onesBanknotes;
        int remainderTens = thereAreTensUSD - tensBanknotes;
        System.out.println("В банкомате имеется количество банкнот: \n" + thereAreHundredsUSD + 
                " банкнот номиналом 100 USD, \n" + thereAreTensUSD + " банкнот номиналом 10 USD, \n" 
                + thereAreOnesUSD + " банкнот номиналом 1 USD");
        if (needMoney <= jarTotalMoney){
            System.out.println("Транзакция пройдет, к выдаче: " + needMoney + " USD");
        } else {
            System.out.println("недостаточно средств в банкомате");
        }

        if (thereAreHundredsUSD >= hundredBanknotes) {
            System.out.println("к выдаче "+ hundredBanknotes + " банкнот номиналом 100 USD");
        } else if (thereAreHundredsUSD + (remainderTens/10) > hundredBanknotes) {
            int calculTensBanknotes = (hundredBanknotes-thereAreHundredsUSD)*10;
            if (remainderTens >= calculTensBanknotes) {
                System.out.println("к выдаче "+ thereAreHundredsUSD + " банкнот номиналом 10 USD" + 
                    " и " + calculTensBanknotes + " банкнот по 10 USD");
            }
        } else { 
            System.out.println("В банкомате не хватает банкнот для совершения транзакции");
        }

        if (thereAreTensUSD >= tensBanknotes) {
            System.out.println("к выдаче "+ tensBanknotes + " банкнот номиналом 10 USD");
        } else if (thereAreTensUSD + (remainderOnes/10) > tensBanknotes) {
            int calculOnesBanknotes = (tensBanknotes-thereAreTensUSD) * 10;
            if (remainderOnes >= calculOnesBanknotes) {
                System.out.println("к выдаче "+ thereAreTensUSD + " банкнот номиналом 10 USD" + 
                    " и " + calculOnesBanknotes + " банкнот номиналом 1 USD");
            }
        }

        if (thereAreOnesUSD >= onesBanknotes) {
            System.out.println("к выдаче "+ onesBanknotes + " банкнот номиналом 1 USD");
        } else {
            System.out.println("в банкомате нет банкнот номиналом 1 USD");
        }

    }
}