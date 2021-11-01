package com.technoelevate.assignments;

public class Native7 {

	    static {
	        System.loadLibrary("Native library path");
	    }

	 	    public native void m();
	
  public static void main(String[] args) {
	       
	        Native7 n = new Native7();

	       
	        n.m();
	    }
	}


