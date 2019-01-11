package arrayList;




public class split {

	public static void main(String[] args) {		
		
		
		String glAmtAssign="102.00 DR";
		String[] glAmt=glAmtAssign.split(" ");
		String glAmtAssgn=glAmt[0];				
		double glAmtAssigned=Double.parseDouble(glAmtAssgn);
		double glAmtAssigned1=glAmtAssigned/2;
		String glAmtAssigned2=Double.toString(glAmtAssigned1);
		System.out.println(glAmtAssigned2);

	}

}
