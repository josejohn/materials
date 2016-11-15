package fact.temp;

import java.util.ArrayList;


public class SumNum {

	public static void main(String[] args) {
		
		int num = 643755;
		int sum = 10;
		
		ArrayList<Integer> list = new ArrayList<Integer>();  
		int tempNum1=num,tempNum2=0;
		String answer="";
		
		while(tempNum1 != 0){
			list.add(tempNum1%10);
			tempNum1 = tempNum1/10;			
		}
		
		
		for(int i= 0; i<list.size(); i++){
			tempNum2=tempNum1 = list.get(i);
			for(int j=i+1; j<list.size()&&tempNum2!=-1; j++){
				tempNum2 = list.get(j);
				if(tempNum1+tempNum2 ==sum){
					list.set(j, -1);
					answer+="["+tempNum1+","+tempNum2+"]";
					break;
				}
			}
		}
		
		System.out.println(answer);
	}
	
	
	
}
