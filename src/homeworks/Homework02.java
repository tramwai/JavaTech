package homeworks;


import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        System.out.println("=====================TASK1=====================");
        int num1,num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("The number 1 entered by user is = " );
        num1 = scanner.nextInt();

        System.out.println("The number 2 entered by user is = " );
        num2 = scanner.nextInt();
        System.out.println("The sum of number 1 and 2 entered by user is = " + (num1 + num2));

        System.out.println("=====================TASK2=====================");

        int firstNumber,secondNumber;

        System.out.println("Please enter the first number ");
        firstNumber = scanner.nextInt();

        System.out.println("Please enter the second number ");
        secondNumber = scanner.nextInt();

        System.out.println("The product of the given 2 number is " + firstNumber * secondNumber);

        System.out.println("=====================TASK3=====================");

        double number1Task3,number2Task3;

        System.out.println("Please enter the first number ");
        number1Task3 = scanner.nextFloat();
        System.out.println("Please enter the second number ");
        number2Task3 = scanner.nextFloat();

        double sumTask3 = number1Task3 + number2Task3;
        double productTask3 = number1Task3 * number2Task3;
        double subtractionTask3 = number1Task3 - number2Task3;
        double divisionTask3 = number1Task3 / number2Task3;
        double remainderTask3 = number1Task3 % number2Task3;

        System.out.println("The sum of the given numbers is " + sumTask3);
        System.out.println("The product of the given numbers is " + productTask3);
        System.out.println("The subtraction of the given numbers is " + subtractionTask3);
        System.out.println("The division of the given numbers is " + divisionTask3);
        System.out.println("The remainder of the given numbers is " + remainderTask3);

        System.out.println("=====================TASK4=====================");

        System.out.println("1.\t" +(-10 + 7 * 5));
        System.out.println("2.\t" +((72+24) % 24));
        System.out.println("3.\t" +(10 + -3 * 9 / 9));
        System.out.println("4.\t" +(5 + 18 / 3 * 3 - (6 % 3)));

        System.out.println("=====================TASK5=====================");

        int number1Task5, number2Task5;

        System.out.println("Please enter the first number ");
        number1Task5 = scanner.nextInt();
        System.out.println("Please enter the second number ");
        number2Task5 = scanner.nextInt();
        System.out.println("The average of the given number is: " + (number1Task5 + number2Task5) / 2);

        System.out.println("=====================TASK6=====================");

        int num1Task6, num2Task6, num3Task6, num4Task6, num5Task6;

        System.out.println("Please enter the first number ");
        num1Task6 = scanner.nextInt();
        System.out.println("Please enter the second number ");
        num2Task6 = scanner.nextInt();
        System.out.println("Please enter the third number ");
        num3Task6 = scanner.nextInt();
        System.out.println("Please enter the fourth number ");
        num4Task6 = scanner.nextInt();
        System.out.println("Please enter the fifth number ");
        num5Task6 = scanner.nextInt();

        System.out.println("The average of the given numbers is: " + (num1Task6 + num2Task6 + num3Task6 + num4Task6 + num5Task6) / 5);

        System.out.println("=====================TASK7=====================");

        int num1Task7, num2Task7, num3Task7;

        System.out.println("Please enter the first number ");
        num1Task7 = scanner.nextInt();
        System.out.println("Please enter the second number ");
        num2Task7 = scanner.nextInt();
        System.out.println("Please enter the third number ");
        num3Task7 = scanner.nextInt();

        System.out.println("The " + num1Task7 + " multiplied with " + num1Task7 + " is = " + num1Task7 * num1Task7);
        System.out.println("\nThe " + num2Task7 + " multiplied with " + num2Task7 + " is = " + num2Task7 * num2Task7);
        System.out.println("\nThe " + num3Task7 + " multiplied with " + num3Task7 + " is = " + num3Task7 * num3Task7);

        System.out.println("=====================TASK8=====================");

        int side;
        System.out.println("Please enter the value for the side of the square ");
        side = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Perimeter of the square = " + 4 * side);
        System.out.println("Area of the square = " + side * side);

        System.out.println("=====================TASK9=====================");

        double salary = 90_000;
        System.out.println("A Software Engineer in Test can earn " + salary * 3 + " in 3 years");

        System.out.println("=====================TASK10=====================");

        String favBook, favColor;
        int favNumber;

        System.out.println("What is your favorite book ?");
        favBook = scanner.nextLine();
        scanner.nextLine();

        System.out.println("What is your favorite color ?");
        favColor = scanner.next();

        System.out.println("What is your favorite number ?");
        favNumber = scanner.nextInt();

        System.out.println("User's favorite book is: " + favBook + "\n" +
                "\nUser's favorite color is: " + favColor + "\n" +
                "\nUser's favorite number is: " + favNumber);

        System.out.println("=====================TASK11=====================");

        String firstName, lastName, emailAddress, phoneNumber, address;
        int age;

        System.out.println("What is your first name ?");
        firstName = scanner.next();

        System.out.println("What is your last name ?");
        lastName = scanner.next();

        System.out.println("What is your age ?");
        age = scanner.nextInt();

        System.out.println("What is your email address ?");
        emailAddress = scanner.next();
        scanner.nextLine();

        System.out.println("What is your phone number ?");
        phoneNumber = scanner.nextLine();

        System.out.println("What is your address ?");
        address = scanner.nextLine();

        System.out.print("\tUser who joined this program is " + firstName + " " + lastName + ". " +
                firstName +"'s age is \n" + age + "." + firstName + "'s email address is " +
                emailAddress + ", phone number\nis " + phoneNumber +
                ", " + "and address is " + address + ".");

    }
}
