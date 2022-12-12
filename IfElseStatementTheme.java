import java.util.Scanner;

public class IfElseStatementTheme {
    public static void main(String[] args) {
    System.out.println("\n1. Перевод псевдокода на язык Java\n");
    Scanner scannerAge = new Scanner(System.in);
    System.out.println("Введите сколько Вам полных лет: ");
    int age = scannerAge.nextInt();
    if(age<20) {
        System.out.println("Вы младше 20 лет");
    } else {
        System.out.println("Вы старше 20 лет");
    }
    //решение проблемы - для кириллицы 
    Scanner scannerRequestGender = new Scanner(System.in, "cp866");
    System.out.println("\nВведите ваш пол русскими буквами: ");
    String requestGender = scannerRequestGender.nextLine();
    String trueGender = "мужской";
    if (requestGender.equalsIgnoreCase(trueGender)){
        System.out.println("Пользователь - мужчина");
    } else {
        System.out.println("Пользователь - женщина");
    }
    Scanner scannerHeight = new Scanner (System.in);
    System.out.println("\nВведите ваш рост в см: ");
    float heigh = scannerHeight.nextFloat()/100;
    if (heigh < 1.80){
        System.out.println("Ваш рост ниже 1 м 80 см, и составляет: " + (int) (heigh*100) + " см");
    } else {
        System.out.println("Ваш рост выше 180 см, и составляет: " + (int) (heigh*100) + "см");
    }
    String name = "Mary";
    char firstLetterName = name.charAt(0);
    if (firstLetterName == 'M'){
        System.out.println("Ваше имя начинается на букву \"M\"");
    } else if (firstLetterName == 'I') {
        System.out.println("Ваше имя начинается на букву \"I\"");
    } else {
        System.out.println("Приятно познакомиться - " + name +"! Ваше имя начинается на букву " 
                + firstLetterName);
    }

    }
}