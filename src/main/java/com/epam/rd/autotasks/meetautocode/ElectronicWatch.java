package com.epam.rd.autotasks.meetautocode;

import java.text.DecimalFormat;
import java.util.Scanner;
public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int h, m, s;
        h = seconds/3600%24;
        m = seconds%3600/60;
        s = seconds%3600%60;
        DecimalFormat df = new DecimalFormat("00");
        System.out.println(h + ":" + df.format(m) + ":" + df.format(s));
    }
}
