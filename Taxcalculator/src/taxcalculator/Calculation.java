package taxcalculator;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Calculation {
	
	//normally never changes, set by requirements of the coding assignment
	// 10%
	private BigDecimal baseTaxrate = new BigDecimal("0.10");
	//5%
	private BigDecimal extendedTaxrate = new BigDecimal("0.05");
	
	//dosn't need a return, values get changed right into the object
	public void calculateFinalPrice (ArrayList<Item> it) {
			
		//foreach not working, for(int i : it)
		for(int i = 0; i < it.size(); i++){
			if(it.get(i).getBasicTax() == true) {
				
				//sets price to price multiplied with basetaxrate
				it.get(i).setPrice(it.get(i).getPrice().multiply(this.baseTaxrate));
			}
			
			if(it.get(i).getExtendedTax() == true) {
				
				//sets price to price multiplied with extendedTaxrate
				it.get(i).setPrice(it.get(i).getPrice().multiply(this.extendedTaxrate));
			}
			
		}
		
	}
	
}
