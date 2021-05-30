package jp.JpFinance.model;

import lombok.Data;

@Data
public class MonthlyFee {

	private double value;
	private double totalValue;
	private double interest;
	private String description;
	
	
}
