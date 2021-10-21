package taxcalculator;

import java.math.BigDecimal;

public class TestItemclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//some random testdata, not based on the values from the assigment
		Item book = new Item("Book", new BigDecimal("10.55"), true, false);
		Item book2 = new Item("redBook", new BigDecimal("106.75"), false, false);
		Item chocolate = new Item("Chocolate", new BigDecimal("0.74"), true, true);
		
		System.out.println(String.format("Name: %s,  Price: %.2f$, has basicTax: %b, has extendedTax: %b",
		book.getName(), book.getPrice(), book.getBasicTax(), book.getExtendedTax() ));
		
		System.out.println(String.format("Name: %s,  Price: %.2f$, has basicTax: %b, has extendedTax: %b",
				book2.getName(), book2.getPrice(), book2.getBasicTax(), book2.getExtendedTax() ));
		
		System.out.println(String.format("Name: %s,  Price: %.2f$, has basicTax: %b, has extendedTax: %b",
				chocolate.getName(), chocolate.getPrice(), chocolate.getBasicTax(), chocolate.getExtendedTax() ));
		
	}

}
