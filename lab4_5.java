
public class lab4_5 {
    public static void main(String[] args) {

        Calculate calc = new Calculate(5, 2);

        Percentage percentage = new Percentage(5, 2);

        int sum = calc.add();
        int sub = calc.subtract();
        int mut = calc.multiply();
        float div = calc.divide();

        double percent = percentage.getPercentage();

        System.out.println("Sum: " + sum);
        System.out.println("sub: " + sub);
        System.out.println("mut: " + mut);
        System.out.println("div: " + div);
        System.out.println("Percentage: " + percent);
    }

}
