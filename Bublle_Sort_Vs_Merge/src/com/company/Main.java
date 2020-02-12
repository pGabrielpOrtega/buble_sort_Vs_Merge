package com.company;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
	// write your code here
        xd x = new xd();
        int [] variable = new int[10000];

        Random r = new Random();

        for (int i = 0; i < variable.length; i++) {
            variable[i] = Math.abs(r.nextInt(1000));
        }
        Long t1 =System.currentTimeMillis();

     x.mer(variable,t1);
     x.Bub(variable,t1);





    }
}
