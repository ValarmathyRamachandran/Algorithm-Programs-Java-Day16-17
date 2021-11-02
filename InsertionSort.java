package com.AlgorithmsProgram;

public class InsertionSort { 
	    public static String[] insertionSort(String[] arr1) {  
	    	String temp = " ";
	        int n = arr1.length;  
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (arr1[i].compareToIgnoreCase(arr1[j]) > 0) {
	                    temp = arr1[i];
	                    arr1[i] = arr1[j];
	                    arr1[j] = temp;
	                }
	            }
	        }
	        return arr1;
	    }
	       
	    public static void main(String a[]){    
	        String[] arr1 = {"java","html","javascript","csharp","dotnot"};
	        System.out.println("Before Insertion Sort");    
	        for(String i:arr1){    
	            System.out.print(i+" ");    
	        }    
	        System.out.println();    
	            
	        insertionSort(arr1);//sorting array using insertion sort    
	           
	        System.out.println("After Insertion Sort");    
	        for(String i:arr1){    
	            System.out.print(i+" ");    
	        }    
	    }    
	}    
