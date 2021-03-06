package taxcalculator;

import java.math.BigDecimal;

public class Item {
	
	private String Name;
	private BigDecimal price;
	private boolean basicTax;
	private boolean extendedTax;
	//added to calculate/print salesTax in class Calculation, function printBill
	private BigDecimal salesTax;
	//added to fix issues with extendedTax calculation in class Calculation function calculateFinalPrice
	private BigDecimal exTax;
	
	public Item(String itemName, BigDecimal itemPrice, boolean bT, boolean eT) {
		this.Name = itemName;
		this.price = itemPrice;
		this.basicTax = bT;
		this.extendedTax = eT;
	};
	
	public String getName() {
		return this.Name;
	}
	
	public void setName(String itemName) {
			this.Name = itemName;
	}
	
	public BigDecimal getPrice() {
		return this.price;
	}
	
	public void setPrice(BigDecimal itemPrice) {
		//this.price = new BigDecimal(itemPrice.toString());
		this.price = itemPrice;
	}
	
	//get Information, if basicTax gets calculated for this item, not the taxrate!
	//taxrates var can be found in calculations
	public boolean getBasicTax() {
		return this.basicTax;
	}
	
	//set Information, if basicTax gets calculated for this item, not the taxrate!
	//taxrates var can be found in calculations
	public void setBasicTax(boolean bT) {
		this.basicTax = bT;
	}
	
	//get Information, if extendedTax gets calculated for this item, not the taxrate!
	//taxrates var can be found in calculations
	public boolean getExtendedTax() {
		return this.extendedTax;
	}
	
	//set Information, if extendedTax gets calculated for this item, not the taxrate!
	//taxrates var can be found in calculations
	public void setExtendedTax(boolean eT) {
		this.extendedTax = eT;
	}
	
	public BigDecimal getSalesTax() {
		BigDecimal retVal;
		if(this.salesTax != null) {
			retVal = this.salesTax;
		}
		else {
			retVal = new BigDecimal("0.00");
		}
		
		return retVal;
	}
	
	public void setSalesTax(BigDecimal sT) {
		//this.salesTax = new BigDecimal(sT.toString());
		this.salesTax = sT;
	}
	
	public BigDecimal getExTax() {
		BigDecimal retVal;
		if(this.exTax != null) {
			retVal = this.exTax;
		}
		else {
			retVal = new BigDecimal("0.00");
		}
		
		return retVal;
	}
	
	public void setExTax(BigDecimal exT) {
	
		this.exTax = exT;
	}
}
