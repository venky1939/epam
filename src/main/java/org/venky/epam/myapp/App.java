package org.venky.epam.myapp;
import java.io.*;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
class A
{
	private static final Logger LOGGER = LogManager.getLogger(A.class);
	static void meth()
	{
		double pr, rate, t, sim,com;
	    Scanner sc=new Scanner (System. in);
	    LOGGER.info("Enter the amount:");
	    pr=sc.nextDouble();
	    LOGGER.info("Enter the No.of years:");
	    t=sc.nextDouble();
	    LOGGER.info("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    sim=(pr * t * rate)/100;
	    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
	    LOGGER.info("Simple Interest="+sim);
	    LOGGER.info("Compound Interest="+com);
	    
	    LOGGER.info("Method executed successfully");
	}
	
}

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        A.meth();
        
    }
    
   
	
}
