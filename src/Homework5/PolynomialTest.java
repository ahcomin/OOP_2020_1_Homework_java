package Homework5;


public class PolynomialTest {
    public static void main(String[] arg) {//main method is defined here.

        System.out.println("Constriction a polynomial");
        //a0 = 3, a1 = 5, a2 = 0, and a3 = 2.

        Polynomial p = new Polynomial(5);
        p.setConstant(0, 3); //x의 0승에 3의 값 넣기.
        p.setConstant(1, 5); //x의 1승에 5의 값 넣기.
        p.setConstant(2, 0);
        p.setConstant(3, 2);

        System.out.println("Evaluation the polynomial at 0 should give 3 ");
        System.out.println("\tGot: " + p.evaluate(0));
        System.out.println("Evaluating the polynomial at 1 should give 10");
        System.out.println("\tGot: " + p.evaluate(1));
        System.out.println("Evaluating the polynomial at 7 should give 724");
        System.out.println("\tGot: " + p.evaluate(7));
        System.out.println("Evaluating the polynomial at 1/2 should give 5.75");
        System.out.println("\tGot: " + p.evaluate(0.5));
    }

}
