package taxcalculator;

import java.math.BigDecimal;

public class TestItemclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//some random testdata, not based on the values from the assigment
		Item book = new Item("Book", new BigDecimal("10.55"), true, false);
		
		System.out.println(String.format("Name: %s,  Price: %.2f$, has basicTax: %b, has extendedTax: %b",
		book.getName(), book.getPrice(), book.getBasicTax(), book.getExtendedTax() ));
		
	}

}