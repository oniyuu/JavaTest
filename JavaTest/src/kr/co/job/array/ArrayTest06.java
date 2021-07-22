/*
 *p208 
 */
package kr.co.job.array;

public class ArrayTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] hex = { 'C', 'A', 'F', 'E', };
		String[] binary = {  "0000", "0001", "0010", "0011"
						   , "0100", "0101", "0110", "0111"
						   , "1000", "1001", "1010", "1011"
						   , "1100", "1101", "1110", "1111" };
		//A=1010=binary[10]
		//B=1011=binary[11]
		//C=1100=binary[12]
		//D=1101=binary[13]
		//E=1110=binary[14]
		//F=1111=binary[15]
				
		String result="";

		for (int i=0; i<hex.length; i++) {
			if (hex[i]>='A' && hex[i] <='F') {
				result += binary[hex[i]-'A'+10];	
			} else if (hex[i]>='0' && hex[i] <='9') {
				result += binary[hex[i]-'0'];
			}
		}
		System.out.println("hex:"+new String(hex));
		System.out.println("binary:"+result);

	}

}
