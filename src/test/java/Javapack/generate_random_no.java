package Javapack;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class generate_random_no {
public static void main(String[] args) {
	Random ran=new Random();
	//int raan = ran.nextInt(1000);
	//double raan=ran.nextDouble();
	//System.out.println(raan);
	String raan = RandomStringUtils.randomNumeric(10);
	System.out.println(raan);
	
	String raan1 = RandomStringUtils.randomAlphabetic(10);
	System.out.println(raan1);
}
}
