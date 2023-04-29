package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The Nams Is: Emmanuel Mathekga Makgabo");
		int [] nums =  {2,7,11,15};
		int target = 9;
		
		int [] results = getIndices(nums, target);
		
		for(int i = 0; i < results.length; i++) {
			System.out.println(i);
		}

	}
	
	public static int[] getIndices(int [] arr_values, int check_val) {
		List<Integer> indices = new ArrayList<>(); 
		
		for(int i = 0; i < arr_values.length; i++) {
			for(int j = 1; j < arr_values.length ; j++) {
				if( i != j) {
					if( arr_values[i] + arr_values[j] == check_val)   {
						indices.add(i);
						indices.add(j);
					}
				}				
			}
		}
		
		int [] the_inds = new int[ indices.size()]; 
		
		for(int i = 0; i < indices.size(); i++) {
			the_inds[i] = indices.indexOf(i);
		}
		return the_inds; 
	}

}
