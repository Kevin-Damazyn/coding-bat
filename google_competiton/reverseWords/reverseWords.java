/*
 * Created by kevindamazyn on 12/12/14
 Problem

Given a list of space separated words, reverse the order of the words. Each line of text contains L letters and W words. A line will only consist of letters and space characters. There will be exactly one space character between each pair of consecutive words.

Input

The first line of input gives the number of cases, N.
N test cases follow. For each test case there will a line of letters and space characters indicating a list of space separated words. Spaces will not appear at the start or end of a line.

Output

For each test case, output one line containing "Case #x: " followed by the list of words in reverse order.

Limits

Small dataset

N = 5
1 ≤ L ≤ 25

Large dataset

N = 100
1 ≤ L ≤ 1000

Sample


Input 
3
this is a test
foobar
all your base

Output
Case #1: test a is this
Case #2: foobar
Case #3: base your all

 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;


public class reverseWords {

    public static void main(String[] args){
        int trial = 1;
        try {
            if (args.length < 1){
                throw new IOException();
            }
            BufferedReader in = new BufferedReader(new FileReader(new File(".").getAbsolutePath() + "/" + args[0]));
            int testCases = Integer.parseInt(in.readLine());
            String phrase;
            while (testCases != 0){
                phrase = in.readLine();
                StringBuilder reversePhrase = new StringBuilder();
                String[] words = phrase.split(" ");
                for (int i = words.length-1; i >= 0; i--){
                    reversePhrase.append(words[i]);
                    if (i-1 >= 0){
                        reversePhrase.append(" ");
                    }
                }
                System.out.printf("Case #%d: ",trial);
                System.out.println(reversePhrase);
                testCases--;
                trial++;
            }
            in.close();

        } catch (java.io.IOException exception){
            System.out.println("Problems Reading File. Please put input file in same directory as this file.");
            System.out.println("Usage: java reverseWords input_file");
        }
    }
}
