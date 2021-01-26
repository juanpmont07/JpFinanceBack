package jp.JpFinance.model;

import lombok.Data;

@Data
public class MonthlyFee {

	private float value;
	private float totalValue;
	private float interest;
	private String description;
	
	
}
