/**
 * <h1> AlphabetOrder </h1>
 * <p>
 * 사용자에게 입력 받은 단어를 알파벳 순서로 나열해 주고 입력된 알파벳의 개수를 출력해 주는
 * 프로그램입니다.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac AlphabetOrder.java
 * @Run : java AlphabetOrder
 * Programming Assignment 5.
 * @since 05-26-2020
 */
package Homework5;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabetOrder { //알파벳 순서로 바꿔주는 메서드.
    public static String order(String str) {
        String[] temp = str.split(""); //문자열을 잘라주는(분리) 오브젝트.
        Arrays.sort(temp); //temp 배열을 오름차순으로 정렬해준다.

        String change = ""; //String 타입 변수를 초기화 시켜준다.

        //for 문이 1부터 시작하는 이유는 .(period)을 제외하고 출력해주기 위해서 입니다.
        for (int i = 1; i < temp.length; i++) { //temp 배열의 길이만큼
            change += temp[i]; //오름차순으로 정렬된 temp 를 change 에 넣어 합쳐준다.
            System.out.println(temp[i]); // 한 줄에 한글자로 출력해 주기 위해.
        }
        return change;
    }

    public static void main(String[] arg) {
        int[] BigAlpha = new int[26]; // array of lowercase
        int[] SmallAlpha = new int[26];// array of uppercase
        Scanner keyboard = new Scanner(System.in);
        String text;

        String refuse = "NO"; // while 문을 끝내기 위해 NO 를 입력하면 프로그램 반복이 없어진다.
        while (true) {


            System.out.println("Enter any word with a period!");
            System.out.println("If you wanna stop it, enter NO.");

            text = keyboard.nextLine(); //to get text from user.
            if (text.contains(".")) {

                System.out.println(order(text)); //알파벳 순서로 출력.


                char character;

                for (int i = 0; i < text.length(); i++) {//아스키코드를 이한 알파벳 갯수 구하기.
                    character = text.charAt(i);
                    if (character >= 97 && character <= 122) {
                        SmallAlpha[character - 97]++;
                    } else if (character >= 65 && character <= 90) {
                        BigAlpha[character - 65]++;
                    }

                }
                for (int i = 0; i < SmallAlpha.length; i++) { // for printing out
                    System.out.println((char) (i + 97) + " + " + (char) (i + 65) + "의 갯수 : " +
                            (BigAlpha[i] + SmallAlpha[i]));


                }


            }else {
                System.out.println("Please enter a period!");
                System.out.println();
            }
            if (text.equalsIgnoreCase(refuse)) {
                break;
            }
        }
    }
}


