package sljava;

public class SearchEmailID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"rajankumar@gmail.com","shanushekhar@gmail.com","amitsatyam@gmail.com","satyamnahar@gmail.com","rahulkumar@gmail.com","utkarshroshan@gmail.com","snehpallav@gmail.com"};
		String emailID="rahulkumar@gmail.com";
		String result="Not found";
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(emailID)) {
				result=arr[i];
			}
		}
		System.out.println("EmailID you searched: "+ result);
	}

}
