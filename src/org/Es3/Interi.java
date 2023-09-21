package org.Es3;

import java.util.Arrays;

public class Interi {
	private int   numInt = 0;
	private int[] interi = new int[numInt];
	private int   i;
	
	public Interi (int[] interi, int numInt) {
		setNumInt(numInt);
		setInteri(interi);
	}
	
	public int getElementoSuccessivo() {
		int    n = interi[i++];	
		return n;
	}
	
	public boolean hasAncoraElementi() {
		boolean res = true;
		if (i >= getNumInt()) res = false;
		return  res;
	}
	
//	public void addElemento(int newInt) {
//
//	}

	public int[] getInteri() {
		return interi;
	}

	public void setInteri(int[] interi) {
		this.interi = interi;
	}
	
	public int getNumInt() {
		return numInt;
	}
	
	public void setNumInt(int numInt) {
		this.numInt = numInt;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(interi);
	}
}
