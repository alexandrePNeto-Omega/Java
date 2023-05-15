package com.neto.philippus.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.neto.philippus.controllers.LineController;
import com.neto.philippus.models.LineModel;

public class LineView 
{
	public static void start() 
	{
		//	other var's
		Scanner input = new Scanner(System.in);
		LineController lc = new LineController();
			
		//	path do arquivo.
		System.out.print("Insira o path do aquivo: ");
		String path = input.nextLine().replace("\"", "");
		lc.setLines(path);
		
		ArrayList<String> val_line = new ArrayList<>();
		System.out.println("Digite o valores desejados da linha: ");
		System.out.println("Digite \"sair\", para sair.");
		System.out.println();
		Boolean keep = true;
		do {
			String valS = input.nextLine();

			if(valS.contains("sair"))
				keep = false;
			else
				val_line.add(valS);
		} while(keep != false);
		lc.setValReq(val_line);
		
		System.out.println();

		System.out.println("--------------");

		System.out.println();

		orderByQtd(lc.getLinesVerif(lc.getValReq(), lc.getLines()));
		
		input.close();
	}	//	start
	
	protected static void orderByQtd (ArrayList<LineModel> lines) {
		LineModel max = new LineModel();
		max.setContentVals(0);
		
		for(LineModel l : lines) {
			if(l.getContentVals() > 1 
					&& l.getContentVals() > max.getContentVals())
				max = l;
		}	//	for
		
		for(LineModel lo : lines) {
			if(lo.equals(max))
				System.out.println("A linha abaixo tem a maior equivalencia");

			System.out.println("Linha: " + lo.getContent());
			System.out.println("Qtd:" + lo.getContentVals());
			System.out.println();	
		}	//	for
	}	//	orderByQtd
}	//	LineView