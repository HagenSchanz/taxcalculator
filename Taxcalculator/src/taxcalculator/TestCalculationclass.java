package taxcalculator;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TestCalculationclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Item> Output1= new ArrayList<Item>();
		
		Item book = new Item("Book", new BigDecimal("12.49"), false, false);
		Item musicCD = new Item("music CD", new BigDecimal("14.99"), true, false);
		Item chocolate = new Item("chocolate bar", new BigDecimal("0.85"), false, false);
		
		Output1.add(book);
		Output1.add(musicCD);
		Output1.add(chocolate);
		
		Calculation cal = new Calculation();
		
		cal.printBill(Output1);
		
		
	}

}
