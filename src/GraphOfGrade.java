/**
 * <h1> Graph Of Grade </h1>
 * <p>
 * This program get the number of subjects and grades from user.
 * And it presents the percentage of grade as the asterisks.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac GraphOfGrade.java
 * @Run : java GraphOfGradeu7
 * Programming Assignment 3.
 * @since 04-30-2020
 */


import java.util.Scanner;//import scanner

public class GraphOfGrade {//각 성적의 수와 과목 수 선언.
    private double subject;
    public int numberA;
    public int numberB;
    public int numberC;
    public int numberD;
    public int numberF;

    // Set the number of each of the letter grades A, B, C, D, and F.
    public void readInput() { //과목 수 와 성적을 유저로부터 받아오는 매서드.

        //총 과목의 수를 유저로부터 받아옴
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many do you have subject?");
        subject = keyboard.nextInt();

        //A의 수를 유저로부터 받아옴
        System.out.println("How many do you have A grade?");
        keyboard = new Scanner(System.in);
        numberA = keyboard.nextInt();

        //B의 수를 유저로부터 받아옴
        System.out.println("How many do you have B grade?");
        keyboard = new Scanner(System.in);
        numberB = keyboard.nextInt();

        //C의 수를 유저로부터 받아옴
        System.out.println("How many do you have C grade?");
        keyboard = new Scanner(System.in);
        numberC = keyboard.nextInt();

        //D의 수를 유저로부터 받아옴
        System.out.println("How many do you have D grade?");
        keyboard = new Scanner(System.in);
        numberD = keyboard.nextInt();

        //F의 수를 유저로부터 받아옴
        System.out.println("How many do you have F grade?");
        keyboard = new Scanner(System.in);
        numberF = keyboard.nextInt();
    }

    public void writeOutPut() {//show what user input
        System.out.println("your number of subject is " + subject);
        System.out.println("you have A = " + numberA);
        System.out.println("you have B = " + numberB);
        System.out.println("you have C = " + numberC);
        System.out.println("you have D = " + numberD);
        System.out.println("you have F = " + numberF);
    }


    //Return the total number of grades.
    public double getSubject() {
        return subject;

    }


    //Read the number of each of the letter grades A, B, C, D, and F.
    public int getNumberA() {
        return numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public int getNumberC() {
        return numberC;
    }

    public int getNumberD() {
        return numberD;
    }

    public int getNumberF() {
        return numberF;
    }


    //Draw a bar graph of the grade distribution.
    public void draw() {
        System.out.println("0   10   20   30   40   50   60   70   80   90   100"); //to show percentage of graph
        System.out.println("|    |    |    |    |    |    |    |    |    |    |");
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println();

        //make percentage
        double PA = ((getNumberA() / getSubject()) * 100);
        double PB = ((getNumberB() / getSubject())) * 100;
        double PC = ((getNumberC() / getSubject())) * 100;
        double PD = ((getNumberD() / getSubject())) * 100;
        double PF = ((getNumberF() / getSubject())) * 100;


        //퍼센트에서 별의 개수를 구한 후 갯수만큼 별을 그려주는
        for (int i = 0; i <= Math.round(PA / 2) - 1; i++) {
            System.out.print("*");
        }
        System.out.print(" A");
        System.out.println();

        for (int i = 0; i <= Math.round(PB / 2) - 1; i++) {
            System.out.print("*");
        }
        System.out.print(" B");
        System.out.println();

        for (int i = 0; i <= Math.round(PC / 2) - 1; i++) {
            System.out.print("*");
        }
        System.out.print(" C");
        System.out.println();

        for (int i = 0; i <= Math.round(PD / 2) - 1; i++) {
            System.out.print("*");
        }
        System.out.print("D");
        System.out.println();

        for (int i = 0; i <= Math.round(PF / 2) - 1; i++) {
            System.out.print("*");
        }
        System.out.print("F");
        System.out.println();
    }


    public void percentage() {
        if (getSubject() > 0) {//모든 퍼센트를 반올림 하였습니다.
            if (getSubject() >= numberA) {//(getSubject() - numberA) > 0 과 결과가 같은 식.
                System.out.print("The percentage of A = ");
                double percentageA = (getNumberA() / getSubject()) * 100;
                System.out.println(Math.round(percentageA) + "%");

                System.out.println();
            }

            if (getSubject() >= (numberA + numberB)) {
                System.out.print("The percentage of B = ");
                double percentageB = ((getNumberB() / getSubject())) * 100;
                System.out.println(Math.round(percentageB) + "%");

                System.out.println();
            }
            if (getSubject() >= (numberA + numberB + numberC)) {
                System.out.print("The percentage of C = ");
                double percentageC = ((getNumberC() / getSubject())) * 100;
                System.out.println(Math.round(percentageC) + "%");

                System.out.println();
            }
            if (getSubject() >= (numberA + numberB + numberC + numberD)) {
                System.out.print("The percentage of D = ");
                double percentageD = ((getNumberD() / getSubject())) * 100;
                System.out.println(Math.round(Math.round(percentageD)) + "%");

                System.out.println();
            }
            if (getSubject() >= (numberA + numberB + numberC + numberD + numberF)) {
                System.out.print("The percentage of F = ");
                double percentageF = ((getNumberF() / getSubject())) * 100;
                System.out.println(Math.round(percentageF) + "%");

                System.out.println();
            } else { //과목 수 보다 성적이 많은 경
                System.out.println("과목 수 보다 많은 성적을 입력했습니다. ");
            }
        } else {//과목 수에 마이너스 숫자를 입력했을 경우
            System.out.println("you enter negative number in subject");
        }


    }


    public static void main(String[] args) {

        GraphOfGrade A = new GraphOfGrade(); //create object
        A.readInput(); // 유저로 부터 값 입력 받기.
        A.writeOutPut(); // 유저로 부터 받은 값들을 출력.


        A.percentage(); //성적 퍼센트 구하기.
        System.out.println("<Graph>");
        A.draw(); //성적 그래프 그리기.

    }


}
