package array;

public class array {

	public static void main(String[] args) {
	
		int[] scoreChemistry = {100,99,98,97,96,95,94};
		
		int[] scoreChemistry2 = {100,99,98,97,96,95,94};
		
		int[] scoreChemistry3 = new int[7];
		
		int scoreChemistry4[] = new int[7];

		System.out.println("scoreChemistry[0]: "+scoreChemistry[0]);
		System.out.println("scoreChemistry[6]: "+scoreChemistry[6]);
		
		
		for(int i=0; i<scoreChemistry.length; i++) {
			System.out.println("scoreChemistry["+i+"]:"+scoreChemistry[i]);
		}
			System.out.println("scoreChemistry.length: "+scoreChemistry.length);
		
	
		scoreChemistry3[0]=100;
		scoreChemistry3[1]=99;
		scoreChemistry3[2]=98;
		scoreChemistry3[3]=97;
		scoreChemistry3[4]=96;
		scoreChemistry3[5]=95;
		scoreChemistry3[6]=94;
		
		System.out.println("scoreChemistry4.length: "+scoreChemistry4.length);
		
		for(int i=0; i<scoreChemistry3.length-1; i++) {
			System.out.println("scoreChemistry3["+i+"]:"+scoreChemistry3[i]);
		}
		
		System.out.println("---------------------------------------------------");
		int i=0;
		for(int a: scoreChemistry3) {
			System.out.println("scoreChemistry3["+i+"]: "+a);
			i++;
		}
		
	
}
}
