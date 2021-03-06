package taxcalculator;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TestCalculationclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test following coding assigment I/O 1:
		ArrayList<Item> Output1= new ArrayList<Item>();
		
		Item book = new Item("book", new BigDecimal("12.49"), false, false);
		Item musicCD = new Item("music CD", new BigDecimal("14.99"), true, false);
		Item chocolate = new Item("chocolate bar", new BigDecimal("0.85"), false, false);
		
		Output1.add(book);
		Output1.add(musicCD);
		Output1.add(chocolate);
		
		Calculation cal = new Calculation();
		
		cal.printBill(Output1);
		System.out.println("\n\n");
		
		//Test following coding assigment I/O 2:
		
		ArrayList<Item> Output2= new ArrayList<Item>();
		Item impChocolate = new Item("box of chocolates", new BigDecimal("10.00"), false, true);
		Item impPerfume = new Item("bottle of perfume", new BigDecimal("47.50"), true, true);
		
		//System.out.println(impChocolate.getPrice());
		//System.out.println(String.format("%.2f", impChocolate.getPrice()));
		
		Output2.add(impChocolate);
		Output2.add(impPerfume);
		
		//System.out.println(Output2.get(0).getPrice());
		
		//Calculation cal2 = new Calculation();
		
		//cal2.printBill(Output2);
		cal.printBill(Output2);
		System.out.println("\n\n");
		
		//Test following coding assigment I/O 3:
		
		ArrayList<Item> Output3= new ArrayList<Item>();
		
		Item impPerfume2 = new Item("bottle of perfume", new BigDecimal("27.99"), true, true);
		Item perfume = new Item("bottle of perfume", new BigDecimal("18.99"), true, false);
		Item pills = new Item("packet of headache pills", new BigDecimal("9.75"), false, false);
		Item impChocolate2 = new Item("box of chocolates", new BigDecimal("11.25"), false, true);
		
		Output3.add(impPerfume2);
		Output3.add(perfume);
		Output3.add(pills);
		Output3.add(impChocolate2);
		
		cal.printBill(Output3);
		
	}

}
