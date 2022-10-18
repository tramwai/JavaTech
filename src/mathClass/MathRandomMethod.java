package mathClass;

public class MathRandomMethod {
    public static void main(String[] args) {

        double myRandom = Math.random() ;
        int myRandomBetween0to10 = (int) (Math.random() * 10);

        // Formula : (randomNumber *(big point- small point +1) + start)
        int myDice = (int) (Math.random() * 6) +1;
        //System.out.println("random number is " + Math.random());
        System.out.println("random number is " + myRandom);
        System.out.println("random number between 0 to 10 is " + myRandomBetween0to10);
        System.out.println("random my dice is " + myDice);

        // get 2 numbers between 50 and 100
        int myRandomBetween50And100 = (int) (Math.random() * (100-50 +1) + 50);
        System.out.println("random number is " + myRandomBetween50And100);
        // Create a number between 20 and 40;
        int myRandomBetween20And40 = (int) (Math.random() * (40-20 +1) + 20);
        System.out.println("random number is " + myRandomBetween20And40);




    }
}
