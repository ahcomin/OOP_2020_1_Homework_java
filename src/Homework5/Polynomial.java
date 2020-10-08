/**
 * <h1> Polynomial </h1>
 * <p>
 * The program that makes a polynomial.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac Polynomial.java
 * @Run : java Polynomial
 * Programming Assignment 3.
 * @since 05-29-2020
 */
package Homework5;

public class Polynomial {
    private int degree;
    private double[] coefficients; //array of coefficients


    public Polynomial(int max) {//constructor have one parameter.
        degree = max; //가장 큰 차수.

        coefficients = new double[degree +1]; //create an array for coefficients.
        for (int i = 0; i < coefficients.length; i++) {

            coefficients[i] = 0; //store 0 for all coefficients in the array.
        }
    }

    public void setConstant(int ai, double value) { //The method to set coefficients in the array.

        coefficients[ai] = value;
    }

    //returns a value of the polynomial function.
    public double evaluate(double x) {
        double result = 0.0;

        //calculate the value of the polynomial
        for (int j = 0; j < coefficients.length; j++) {
            result += coefficients[j] * Math.pow(x, j);
        }
        //round the value of result up to two decimals
        result = Math.round(result * 100.0) / 100.0;

        return result;
    }
}
