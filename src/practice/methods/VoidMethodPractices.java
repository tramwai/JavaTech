package practice.methods;

public class VoidMethodPractices {
    public static void main(String[] args) {
        VoidMethodPractices.flavorPicker("chocolate");
        VoidMethodPractices.flavorPicker("Chocolate");
        VoidMethodPractices.flavorPicker("strawberry");
        VoidMethodPractices.checkAge(19);
        VoidMethodPractices.checkAge(20);
        VoidMethodPractices.checkAge(25);
        VoidMethodPractices.checkAge(-25);
        VoidMethodPractices.checkCreditScore(850);


    }

    /**
    create a public static method which will take an ice cream flavor and prints the message about your ice cream
    examples
    chocolate -> You have great taste
    vanilla -> Not bad
    strawberry -> Enjoy it!
    everything else -> give me a valid flavor!
     */
    public static void flavorPicker (String flavor){
//        if (flavor.equals("chocolate")){
//            System.out.println("You have a great taste");
//        } else if (flavor.equals("vanilla")) {
//            System.out.println("Not bad");
//        }else if (flavor.equals("strawberry")) {
//            System.out.println("Enjoy it");
//        }
//        else System.out.println("Give me a valid flavor!");

    switch (flavor) {
        case "chocolate" :
            System.out.println("You have a great taste");
            break;
        case "vanilla" :
            System.out.println("Not bad");
            break;
        case "strawberry" :
            System.out.println("Enjoy it");
            break;
        default:
            System.out.println("Give me a valid flavor");
        }
    }
    /**
    create a public static method named "checkAge", it takes an age as parameter,
    then prints according to following:
    -> 0 - 19-> You are a teenager
    -> 20 - 21 -> You can drive
    -> 21+ -> You can drink coke
     */
    public static void checkAge(int age){
        if (age >= 0 && age <= 19)
            System.out.println("You are a teenager");
        else if (age == 20 || age == 21) {
            System.out.println("You can drive");
        }
        else if (age > 21){
                System.out.println("You can drink coke");
            } else System.out.println("Give me a valid age!");
        }

    /**
     create a public static method named "checkCreditScore", it takes an balance as parameter,
     then prints according to following:
     -> 0 - 649 -> Low credit score
     -> 650 - 739 -> Medium credit score
     -> 740 - 850 -> Good credit score
     otherwise No valid credit score
     */
    public static void checkCreditScore(int balance){
        if (balance >= 0 && balance <= 650)
            System.out.println("Low credit score");
        else if (balance >= 651 &&  balance <= 739) {
            System.out.println("Medium credit score");
        }
        else if (balance >=  740 && balance <= 850 ){
            System.out.println("Good credit score");
        } else System.out.println("No valid credit score!");
    }
    }


