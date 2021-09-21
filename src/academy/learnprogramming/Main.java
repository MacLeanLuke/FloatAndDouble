package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum Value = " + myMinFloatValue);
        System.out.println("Float max Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum Value = " + myMinDoubleValue);
        System.out.println("Double max Value = " + myMaxDoubleValue);

        int myIntValue = 5/2;
        float myFloatValue = 5f / 3;
        double myDoubleValue = 5.00 / 3;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberOfPounds = 235d;
        double numberOfKilos = numberOfPounds * 0.45359237d;
        System.out.println("Converted Pounds: " + numberOfKilos);
    }
}
