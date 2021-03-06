package taxcalculator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
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
				
				//sets salesTax to price multiplied with baseTaxrate
				it.get(i).setSalesTax(it.get(i).getPrice().multiply(this.baseTaxrate));
			}
			
			
			if(it.get(i).getExtendedTax() == true) {
				
				//sets price to price multiplied with extendedTaxrate
				it.get(i).setExTax(it.get(i).getPrice().multiply(this.extendedTaxrate));
			}
			
			//add taxes, when all taxvalues are calculated 
			it.get(i).setSalesTax(roundPrice(it.get(i).getSalesTax()));
			it.get(i).setExTax(roundPrice(it.get(i).getExTax()));
			
			if(it.get(i).getBasicTax() == true) {
				//added salesTax to price
				it.get(i).setPrice(it.get(i).getPrice().add(it.get(i).getSalesTax()));
			}
			
			if(it.get(i).getExtendedTax() == true) {
				
				it.get(i).setPrice(it.get(i).getPrice().add(it.get(i).getExTax()));
			}
			
			it.get(i).setPrice(roundPrice(it.get(i).getPrice()));
		}


	}
	
	/*puts out multiple items of same type and price as 1item, 1item, 1item and not as 3items, works this way, maybe change later ->high work on code 
	for just a bit better program, could work more easy if DB or JSON is implemented*/
	public void printBill(ArrayList<Item> it) {
		
		BigDecimal finalPrice = new BigDecimal("0.00");
		BigDecimal salesTaxes = new BigDecimal("0.00");
		
		
		calculateFinalPrice(it);
		
		for(int i = 0; i < it.size(); i++) {
			
			//to add to imported goods, so you don't have to add this to the item name itself anymore
			if(it.get(i).getExtendedTax() == true) {
				System.out.println(String.format("1 imported %s at %02.02f ", it.get(i).getName(), it.get(i).getPrice()));
			}
			else {
				System.out.println(String.format("1 %s at %02.02f ", it.get(i).getName(), it.get(i).getPrice()));
			}
			
			
			if(it.get(i).getBasicTax() == true) {
				salesTaxes = salesTaxes.add(it.get(i).getSalesTax());
			}
			
			if(it.get(i).getExtendedTax() == true) {
				salesTaxes = salesTaxes.add(it.get(i).getExTax());
			}
			
			finalPrice = finalPrice.add(it.get(i).getPrice()); 
		}
		
		System.out.println(String.format("Sales Taxes: %02.02f", salesTaxes));
		//System.out.println(salesTaxes);
		System.out.println(String.format("%02.02f", finalPrice));
	}

	public BigDecimal roundPrice(BigDecimal price) {
			
			BigDecimal divVal = new BigDecimal("0.05");
			BigDecimal toRound;
			BigDecimal multValue =  new BigDecimal("1000.00");
			BigDecimal roundValue = new BigDecimal("10.0");
			BigDecimal zero = new BigDecimal("0.00");
			if(price.multiply(multValue).remainder(roundValue).compareTo(zero) != 0) {
				toRound = price.divide(divVal, 0, RoundingMode.UP).multiply(divVal);
			}
			else {
				toRound = price;
			}
		
			return toRound;
		
	}
}
