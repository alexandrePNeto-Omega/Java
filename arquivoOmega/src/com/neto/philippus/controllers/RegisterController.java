package com.neto.philippus.controllers;

public class RegisterController 
{
	public String registerType(int val) 
	{
		switch(val)
		{
			case 1:
				return "Header-arquivo";
				
			case 2:
				return "Terminais";
				
			case 3:
				return "Transacoes";
				
			case 4:
				return "Parcelas-transacoes";
				
			case 5:
				return "Ajustes";
				
			case 6:
				return "Trailer-arquivo";
				
			case 7:
				return "Lotes-venda";
				
			case 8:
				return "Parcelas-pagas-lote";
				
			case 9:
				return "Antecipacao-lote";
				
			default:
				return null;
		}	//	switch	
	}	//	registerType
	
	
	
}