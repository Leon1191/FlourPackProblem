package com.alex;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(2,10,22));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){

if (bigCount < 0 || smallCount < 0 || goal < 0){return false;}

if (goal - 5 * bigCount - smallCount > 0){return false;}

if (goal - smallCount <= 0) {return true;}

if (goal/5 <= bigCount + smallCount/5 && goal%5 <= smallCount){return true;}
return false;
    }
}
