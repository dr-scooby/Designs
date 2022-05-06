/**
 * 
 */
package plans;

/**
 * @author jismailx
 *
 */
public class GetPlanFactory {
	
	
	// return Plan class based on Plan type
	public Plan getPlan(String plan) {
		
		// if null is entered, default to DomesticPlan
		if(plan == null) {
			return new DomesticPlan();
		}
		
		if(plan.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}else 	if(plan.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		}else 	if(plan.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}else {
			// default to DomesticPlan
			return new DomesticPlan();
		}
		
		
	}

}
