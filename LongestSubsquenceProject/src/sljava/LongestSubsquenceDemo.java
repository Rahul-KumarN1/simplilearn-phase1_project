package sljava;
import java.util.HashSet;

class LongestSubsquenceDemo {
	public static void main(String[] args) {
		int[] arr= {3,2,15,68,4,9,16,8,34};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		int long_subs=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!hs.contains(arr[i]-1)) {
				int number=arr[i];
				while(hs.contains(number))
				{
					number++;
				}
				if(long_subs<number-arr[i])
				{
					long_subs=number-arr[i];
				}
			}
		}
		System.out.println("Longest subsquence length is "+ long_subs);
	}

}
