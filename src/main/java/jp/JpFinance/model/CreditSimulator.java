package jp.JpFinance.model;

import java.util.List;

import lombok.Data;

@Data
public class CreditSimulator {

	private float value;
	private float interest;
	private float valueTotal;
	private int numberFee;
	private String description;
	private List<MonthlyFee> fee;
	
}

