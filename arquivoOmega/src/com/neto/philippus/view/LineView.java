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

		for(LineModel s : lc.getLinesVerif(lc.getValReq(), lc.getLines())) {
			System.out.println(s.getContent());
			System.out.println("Qtd: " + s.getContentVals());
			System.out.println();
		}
		input.close();
	}	//	start
}	//	LineView