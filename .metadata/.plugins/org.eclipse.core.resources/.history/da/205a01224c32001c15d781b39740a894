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
				
				//sets price to price plus product of taxcost (the price multiplied with basetaxrate)
				it.get(i).setPrice(it.get(i).getPrice().add(it.get(i).getPrice().multiply(this.baseTaxrate)));
			}
			
			//system of sales tax works different, this part now in printBill function
			/*if(it.get(i).getExtendedTax() == true) {
				
				//sets price to price multiplied with extendedTaxrate
				it.get(i).setPrice(it.get(i).getPrice().multiply(this.extendedTaxrate));
			}*/
			
		}
		
	}
	
	/*puts out multiple items of same type and price as 1item, 1item, 1item and not as 3items, works this way, maybe change later ->high work on code 
	for just a bit better programm, could work more easy if DB or JSON is implemented*/
	public void printBill(ArrayList<Item> it) {
		
		BigDecimal finalPrice = new BigDecimal("0.00");
		
		calculateFinalPrice(it);
		
		for(int i = 0; i < it.size(); i++) {
			
			System.out.println(String.format("1 %S at %.2f ", it.get(i).getName(), it.get(i).getPrice()));
			finalPrice = finalPrice.add(it.get(i).getPrice()); 
			
			if(it.get(i).getExtendedTax() == true) {
				System.out.println(String.format("Sales Taxes: %.2f", it.get(i).getPrice().multiply(extendedTaxrate) ));
				finalPrice = finalPrice.add(it.get(i).getPrice().multiply(extendedTaxrate));
			}
			
			
			System.out.println(finalPrice);
		}
		
		
		
	}
	
}
