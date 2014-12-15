/*
 * Created by kevindamazyn on 12/12/14
Problem

The Latin alphabet contains 26 characters and telephones only have ten digits on the keypad.
We would like to make it easier to write a message to your friend using a sequence of keypresses
to indicate the desired characters. The letters are mapped onto the digits as shown below. To insert
the character B for instance, the program would press 22. In order to insert two characters in sequence
from the same key, the user must pause before pressing the key a second time. The space character ' ' should
be printed to indicate a pause. For example, 2 2 indicates AA whereas 22 indicates B.

Input

The first line of input gives the number of cases, N. N test cases follow. Each case is a line of text formatted as

desired_message

Each message will consist of only lowercase characters a-z and space characters ' '. Pressing zero emits a space.

Output

For each test case, output one line containing "Case #x: " followed by the message translated into the sequence of keypresses.

Limits

1 ≤ N ≤ 100.

Small dataset

1 ≤ length of message in characters ≤ 15.

Large dataset

1 ≤ length of message in characters ≤ 1000.

Sample

Input
4
hi
yes
foo  bar
hello world

Output
Case #1: 44 444
Case #2: 999337777
Case #3: 333666 6660 022 2777
Case #4: 4433555 555666096667775553


 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;


public class tNineSpelling {

    public static void main(String[] args){
        int trial = 1;
        try {
            if (args.length < 1){
                throw new IOException();
            }
            BufferedReader in = new BufferedReader(new FileReader(new File(".").getAbsolutePath() + "/" + args[0]));
            int testCases = Integer.parseInt(in.readLine());
            char[] phrase;
            while (testCases != 0){
                phrase = in.readLine().toCharArray();
                StringBuilder numberedPhrase = new StringBuilder();

                char firstCharacter = phrase[0];
                String numberRepresentation;
                numberedPhrase.append(findNumber(firstCharacter));
                for (int i = 1; i < phrase.length; i++){
                    numberRepresentation = findNumber(phrase[i]);
                    if (numberRepresentation.charAt(0) == numberedPhrase.toString().charAt(numberedPhrase.length()-1)){
                        numberedPhrase.append(" ");
                    }
                    numberedPhrase.append(numberRepresentation);
                }
                System.out.printf("Case #%d: ",trial);
                System.out.println(numberedPhrase);
                testCases--;
                trial++;
            }
            in.close();

        } catch (java.io.IOException exception){
            System.out.println("Problems Reading File. Please put input file in same directory as this file.");
            System.out.println("Usage: java tNineSpelling input_file");
        }
    }

    public static String findNumber(char letter) {
        String number = "";
        switch (letter){
            case 'a': number += 2; break;
            case 'b': number += 22; break;
            case 'c': number += 222; break;
            case 'd': number += 3; break;
            case 'e': number += 33; break;
            case 'f': number += 333; break;
            case 'g': number += 4; break;
            case 'h': number += 44; break;
            case 'i': number += 444; break;
            case 'j': number += 5; break;
            case 'k': number += 55; break;
            case 'l': number += 555; break;
            case 'm': number += 6; break;
            case 'n': number += 66; break;
            case 'o': number += 666; break;
            case 'p': number += 7; break;
            case 'q': number += 77; break;
            case 'r': number += 777; break;
            case 's': number += 7777; break;
            case 't': number += 8; break;
            case 'u': number += 88; break;
            case 'v': number += 888; break;
            case 'w': number += 9; break;
            case 'x': number += 99; break;
            case 'y': number += 999; break;
            case 'z': number += 9999; break;
            default: number += 0; break;
        }

        return number;
    }
}
