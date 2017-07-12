package javaSession4Assignment4;

import java.util.ArrayList;

class Aliquot {
	
	public boolean isPerfectNumber(int num) // method to calculate aliquot sum
    {
        boolean isPerfect = false;
        int sum=1;
         
        //if(num<6)return false;
         
        for(int i=2; i<=num/2; i++)
        {
            if(num%i == 0)
            {
                sum += i;
            }
        }
        if(num!=1)
        System.out.println("Aliquot Sum for "+num+": "+sum);
        
        if(sum==num && num!= 1)return true;
         
        return isPerfect;
    }

}

public class PerfectNumberDemo extends Aliquot{
	
	public static void main(String[] args) {
		
		int range = 100;
        ArrayList<Integer> perfectNums = new ArrayList<Integer>();
        Aliquot obj = new Aliquot();
        for(int i=1; i<=range;i++)
        {
            if(obj.isPerfectNumber(i))
                perfectNums.add(i);
        }
        System.out.format("Perfect numbers within %s: %s\n",range,perfectNums.toString());
	}

}