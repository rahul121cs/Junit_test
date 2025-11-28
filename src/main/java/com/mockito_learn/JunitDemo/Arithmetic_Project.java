package com.mockito_learn.JunitDemo;

public  class Arithmetic_Project {
    public static int AddtoSum(int a, int b){
        return a+b;
    }

    public static  int product(int a, int b){
        return a*b;
    }
    public static  int sumAnyNUmber(int...numbers){
      int s =0;
      for(int num : numbers){
          s+=num;
      }
        return s;
    }
}
