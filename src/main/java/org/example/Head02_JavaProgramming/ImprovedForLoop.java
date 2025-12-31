package org.example.Head02_JavaProgramming;

public class ImprovedForLoop {
    public static  void main(String[] arge) {
        int[] score = {90, 85, 78};

        for (int s : score) {
            System.out.println("점수: " + s);
        }
    }
}
