package core.general;

public class StringFunctions {

	public static void main(String[] args) {
		String s="somestring";
		char t = s.charAt(0);
		System.out.println("CharAT:"+t);
		//concat
		String newstring = s.concat("added");
		System.out.println("Added String:"+newstring);
		//getbytes
		String s1="AZa";  
		byte[] barr=s1.getBytes();  
		for(int i=0;i<barr.length;i++){  
		System.out.println(barr[i]);
		//intern
		String sl=new String("hello");  
		String s2="hello";  
		String s3=sl.intern();//returns string from pool, now it will be same as s2 
		String s4=s1;
		System.out.println(sl==s2);//false because reference is different  
		System.out.println(s2==s3);//true because reference is same
		System.out.println(s2==s4);//false 
		//isEmpty
		System.out.println(s2.isEmpty());
		//valueof
		int a= 10;
		System.out.println(String.valueOf(a));
		}  

	}

}
