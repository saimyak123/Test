package com.lti.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"Hi","How","are","you"};
		List<String> arrList=new ArrayList<>(Arrays.asList(arr));
		if(arrList.removeIf((String s)->(return s.length()<=2;))){
			System.out.println(s+"removed");
		}
		

	}

}
