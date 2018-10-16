package edu.sbcc.cs105;

public class AlignedNumbers {
	private int firstNumber;
	private int secondNumber;
	
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public int getSum() {
		return this.firstNumber + this.secondNumber;
	}
	
	public double getAverage() {
		return (this.firstNumber + this.secondNumber) /2.0;
	}
	
	public int getDifference() {
		return this.secondNumber - this.firstNumber;
	}
	
	public int getProduct() {
		return this.firstNumber * this.secondNumber;
	}
	
	public int getDistance() {
		int distance = this.firstNumber - this.secondNumber;
		if (distance < 0)
			return distance * -1;
		else return distance;
		
	}
	
	public int getMaximum() {
		if (this.firstNumber > this.secondNumber)
			return this.firstNumber;
		else return this.secondNumber;
	}
	
	public int getMinimum() {
		if (this.firstNumber < this.secondNumber)
			return this.firstNumber;
		else return this.secondNumber;
	}
	
	public void printStats() {
		System.out.printf("%-14s %15d\n", "Sum:", getSum());
		System.out.printf("%-14s %18.2f\n", "Average:", getAverage());
		System.out.printf("%-14s %15d\n", "Difference:", getDifference());
		System.out.printf("%-14s %15d\n", "Product:", getProduct()); 
		System.out.printf("%-14s %15d\n", "Distance:", getDistance());
		System.out.printf("%-14s %15d\n", "Maximum:", getMaximum());
		System.out.printf("%-14s %15d\n", "Minimum:", getMinimum()); 
		
	}
	
	
	
	
}
