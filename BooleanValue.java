package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BooleanValue {

	public static void main(String[] args) {
		boolean[] array=new boolean[10];
		
		int a=10;
		int b=5;
		
		if(a==b){
			Arrays.fill(array, Boolean.TRUE);
		}
		else{
			Arrays.fill(array, Boolean.FALSE);
		}
		System.out.println(array[0]);
	}

}
