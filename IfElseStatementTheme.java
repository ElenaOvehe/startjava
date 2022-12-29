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
        int num1 = 16;
        int num2 = -22;
        if (num1 < num2) {
            System.out.println("Число " + num1 + " меньше, чем число: " + num2);
        } else if (num1 > num2) {
            System.out.println("Число " + num1 + " больше, чем число: " + num2);
        } else {
            System.out.println("Числа: " + num1 + " и " + num2 + " равны!");
        }

        System.out.println("\n3. Проверка числа");
        int num3 = -33;
        if (num3 == 0) {
            System.out.println("число " + num3);
        } else if (num3 > 0) {
            System.out.println(num3 + " - число положительное");
            if (num3 % 2 == 0) {
                System.out.println(num3 + " - число четное");
            } else if (num3 % 2 != 0) {
                System.out.println(num3 + " - число не четное");
            } 
        } else if (num3 < 0) {
            System.out.println(num3 + " - число отрицательное");
            if (num3 % 2 == 0) {
                System.out.println(num3 + " - число четное");
            } else if (num3 % 2 != 0) {
                System.out.println(num3 + " - число не четное");
            }
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
        if ((unknownChar >= 'A') && (unknownChar <= 'Z')) { //A = 65 Z=90
            System.out.println("код обозначает: " + unknownChar + " - большую букву");
        } else if ((unknownChar >= 'a') && (unknownChar < 'z')) {
            System.out.println("код обозначает: " + unknownChar + " - маленькую букву");
        } else if ((unknownChar >= '0') && (unknownChar <= '9')) {
            System.out.println("код является: " + unknownChar + " - цифрой");
        } else {
            System.out.println("исходный код является не буквой и не цифрой!");
        }
        System.out.println(unknownChar + " - номер кода " + (int) unknownChar);

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        int accrual = 5;
        if ((depositAmount >= 100_000) && (depositAmount < 300_000)) {
            accrual = 7;
        } else if (depositAmount >= 300_000) {
            accrual = 10;
        } 
        int accrualCalcul = depositAmount * accrual/100;
        int amountYear = depositAmount + accrualCalcul;
        System.out.println("\nНа данный вклад начисления составят: " + accrual + " %");
        System.out.println("Клиент внес: " + depositAmount + "\nНачисления составят: " + 
                accrualCalcul + "\nИтоговая сумма к выплате за год: " + amountYear);

        System.out.println("\n7. Определение оценки по предметам\n");
        int ratingHistory = 59;
        int ratingProgramming = 91;
        int averageRating = (ratingHistory + ratingProgramming) / 2;
        int scoresHistory = 2 ;
        int scoresProgramming = 2;
        
        if (ratingHistory > 60 && ratingHistory <= 73) {
            scoresHistory = 3; 
        }else if (ratingHistory > 73 && ratingHistory <= 91) {
            scoresHistory = 4; 
        } else if (ratingHistory > 91 && ratingHistory <= 100){
            scoresHistory = 5; 
        } 

        if (ratingProgramming > 60 && ratingProgramming <= 73) {
            scoresProgramming = 3;
        } else if (ratingProgramming > 73 && ratingProgramming <= 91) {
            scoresProgramming = 4;
        } else if (ratingProgramming > 91 && ratingProgramming <= 100){
            scoresProgramming = 5;
        }

        int averageScore = (scoresHistory + scoresProgramming) / 2;
        System.out.println("Ученик получил следующие оценки: \n" + scoresHistory + 
                " балла по истории\n" + scoresProgramming + " балла по программированию" );
        System.out.println("Средний балл оценок по предметам: " + averageScore +
                "\nСредний % по предметам: " + averageRating + " %");

        System.out.println("\n8. Расчет прибыли за год\n");
        int expensisRent = 5_000;
        int expensisGoods = 9_000;
        int profitGoods = 13_000;
        int calculationYear = ((profitGoods - (expensisRent + expensisGoods)) * 12);
        if (calculationYear > 0) {
            System.out.println("+" + calculationYear + " руб.");
        } else {
            System.out.println(calculationYear + " руб.");
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
        } else if (thereAreHundredsUSD + (remainderTens / 10) > hundredBanknotes) {
            int calculTensBanknotes = (hundredBanknotes-thereAreHundredsUSD) * 10;
            if (remainderTens >= calculTensBanknotes) {
                System.out.println("к выдаче "+ thereAreHundredsUSD + " банкнот номиналом 10 USD" + 
                    " и " + calculTensBanknotes + " банкнот по 10 USD");
            }
        } else { 
            System.out.println("В банкомате не хватает банкнот для совершения транзакции");
        }

        if (thereAreTensUSD >= tensBanknotes) {
            System.out.println("к выдаче "+ tensBanknotes + " банкнот номиналом 10 USD");
        } else if (thereAreTensUSD + (remainderOnes / 10) > tensBanknotes) {
            int calculOnesBanknotes = (tensBanknotes-thereAreTensUSD) * 10;
            if (remainderOnes >= calculOnesBanknotes) {
                System.out.println("к выдаче " + thereAreTensUSD + " банкнот номиналом 10 USD" + 
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