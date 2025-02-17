package com.github.hcsp.controlflow;

public class Main {
    /**
     * 判断一个给定的年份数字是不是闰年。一个年份是闰年的条件是： 如果该年份能被100整除，那当且仅当它被400整除时，它才是闰年； 否则，当它能被4整除，就是闰年。
     *
     * <p>例如，1999年不是闰年；2000年是闰年；1900年不是闰年。
     *
     * @param year 给定的年份数字
     * @return 如果该年份是闰年，返回true，否则返回false
     */
    public static boolean isLeapYear(int year) {
        // 判断能否被100整除：能就判断是否能被400整除，不能不是闰年，能是闰年
        // 不能被100整除，判断能否被4整除
        boolean divisible100 = year % 100 == 0;
        if (divisible100) {
            return year % 400 == 0;
        }
        return year % 4 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1999));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2004));
    }
}
