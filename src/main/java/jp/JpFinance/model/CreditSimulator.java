package jp.JpFinance.model;

import java.util.List;

import lombok.Data;

@Data
public class CreditSimulator {

	private double value;
	private double interest;
	private double valueTotal;
	private int numberFee;
	private String description;
	private List<MonthlyFee> fee;
	
}

