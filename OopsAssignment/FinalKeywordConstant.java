//Final Keyword + Constant
//Create a class GovernmentRules with a final variable MAX_WORKING_HOURS = 8
//Try modifying it inside main and observe compile-time restriction.

package OopsAssignment;

class GovernmentRules
{
	final int MAX_WORKING_HOURS = 8;
}
public class FinalKeywordConstant {

	public static void main(String[] args) {
		
		GovernmentRules gr = new GovernmentRules();
		
		System.out.println(gr.MAX_WORKING_HOURS);

	}

}
