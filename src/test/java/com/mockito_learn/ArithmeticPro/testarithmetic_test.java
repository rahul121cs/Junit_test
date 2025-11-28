package com.mockito_learn.ArithmeticPro;

import com.mockito_learn.JunitDemo.Arithmetic_Project;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Date;

public class testarithmetic_test {
    @Before
    public  void init(){
        System.out.println("before run test "+"\n"+"after that test method "+new Date());
    }

@Test(timeout = 2000)         // itne time 2000ms tk wait kregha iske baad terminate ho jaygha
    public void AddtoSum_test(){
    System.out.println("test method is AddtoSum_test:");
       int result = Arithmetic_Project.AddtoSum(14,45);
       int excepet =59;
        Assert.assertEquals(excepet,result);

    }
    @AfterClass
    public static void cleanup(){
        System.out.println("ended test cases:" +new Date());
    }
}
