package exercises.sailors;

import java.util.Arrays;
import java.util.Calendar;

//Simulates the sailors getting food
public class Sailors {
	private String sailor[];
	private Integer fruits[];
	private Integer fish[];
	
	//constructor
	Sailors(){
		fruits = new Integer[35];
		fish = new Integer[35];
		sailor = new String[35];
		
		Arrays.fill(fruits, 0);
		Arrays.fill(fish, 0);
		
		sailor[0] = "0";
		sailor[1] = "1";
		sailor[2] = "2";
		sailor[3] = "3";
		sailor[4] = "4";
		sailor[5] = "5";
		sailor[6] = "6";
		sailor[7] = "7";
		sailor[8] = "8";
		sailor[9] = "9";
		sailor[10] = "10";
		sailor[11] = "11";
		sailor[12] = "12";
		sailor[13] = "13";
		sailor[14] = "14";
		
		sailor[15] = "15";
		sailor[16] = "16";
		sailor[17] = "17";
		sailor[18] = "18";
		sailor[19] = "19";
		sailor[20] = "20";
		sailor[21] = "21";
		sailor[22] = "22";
		sailor[23] = "23";
		sailor[24] = "24";
		sailor[25] = "25";
		sailor[26] = "26";
		sailor[27] = "27";
		sailor[28] = "28";
		sailor[29] = "29";
		
		sailor[30] = "30";
		sailor[31] = "31";
		sailor[32] = "32";
		sailor[33] = "33";
		sailor[34] = "34";
		
	}
	
	//simulates the pirates choice
	public void simulate() {
		Integer sailorAmount = getNVal();
		Integer sailorNumber = 0;
		Boolean sailorGettingFruit[] = new Boolean[35];
		Arrays.fill(sailorGettingFruit, false);
		
		//sets up the sailors to get the fruit
		while(sailorAmount != 0) {
			if(coinFlip() && !sailorGettingFruit[sailorNumber]) {
				fruits[sailorNumber] = getRandomFive();
				sailorGettingFruit[sailorNumber] = true;
				sailorAmount--;
			}
			sailorNumber++;
			if(sailorNumber > 34)
				sailorNumber = 0;
		}
		
		//anyone left over that isn't getting fruit gets fish
		for(int index=0; index<35; index++) {
			if(!sailorGettingFruit[index]) {
				fish[index] = getRandomFive();
			}
		}
		
	}
	
	//prints table out to console
	public void printResults() {
		System.out.println("NAME\tFRUIT\tFISH");
		System.out.println("----\t-----\t----");
		for(int index=0; index<35; index++) {
			System.out.println(sailor[index]+"\t"+fruits[index]+"\t"+fish[index]);
		}
	}
	
	//gets the number of sailors going out to the fruit island
	private Integer getNVal() {
		Integer n = 0;
		Calendar cal = Calendar.getInstance();
		
		if(isPrime(cal.get(cal.DAY_OF_MONTH))) {
			n = cal.get(cal.DAY_OF_MONTH);
		}
		else if(isEven(cal.get(cal.DAY_OF_MONTH))) {
			n = cal.get(cal.DAY_OF_MONTH)/2;
		}
		else
			n = cal.get(cal.DAY_OF_MONTH + 1)/2;
		return n;
	}
	
	//checks if prime
	private Boolean isPrime(Integer num) {
		Boolean prime = false;
		
		if(num != 2 && num % 2 == 0)
			prime = false;
		else if(num != 3 && num % 3 == 0)
			prime = false;
		else if(num != 5 && num % 5 == 0)
			prime = false;
		else if(num != 7 && num % 7 == 0)
			prime = false;
		else
			prime = true;
		
		return prime;
	}
	
	//checks if even
	private Boolean isEven(Integer Num) {
		if(Num % 2 == 0)
			return true;
		return false;
	}
	
	//gives you a random number between 0 and 5
	private Integer getRandomFive() {
		return (int)(Math.random()*5);
	}
	
	//returns true or false
	private Boolean coinFlip() {
		Integer num = (int)(Math.random()*2);
		if(num == 1)
			return true;
		else
			return false;
	}

}
