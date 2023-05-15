package com.neto.philippus.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.neto.philippus.interfaces.Line;
import com.neto.philippus.models.LineModel;

public class LineController implements Line
{	
	private ArrayList<LineModel> lines =
			new ArrayList<LineModel>();
	
	private ArrayList<String> valReq =
			new ArrayList<String>();
	
	@Override
	public int countCaracters(String line) {
		int	countOffLine	= 0;
		
		for (int i = 0; i < line.length(); i++)
			countOffLine++;	
		
		return countOffLine;
	}	//	countCaracters
	
	public ArrayList<LineModel> getLinesVerif(ArrayList<String> contents, 
			ArrayList<LineModel> lines) {
		ArrayList<LineModel> retorno =
				new ArrayList<>();
		
		for(LineModel l : lines) {
			int count = 0;
			for(String s : contents)
				if(checkContent(l.getContent(), s))
					count ++;
			if(count > 0) {
				l.setContentVals(count);
				retorno.add(l);
			}	//	if
		}	//	for	
		return retorno;
	}	//	lineWithContent
	
	protected Boolean checkContent(String contentLine, String val) {
		String[] vals = contentLine.toString().split("\\|");
		for(int i = 0; i < vals.length; i++)
			if(vals[i].equals(val))
				return true;
		return false;
	}	//	existContentBoll
	

	public ArrayList<LineModel> getLines() {
		return this.lines;
	}	//	getLines
	
	public Boolean setLines(String path) {
		File file = new File(path);
		try {
			Scanner fileS = new Scanner(file);

			while(fileS.hasNext()) {
				LineModel l = new LineModel();
				
				l.setContent(fileS.nextLine().toString());
			
				this.lines.add(l);
			}	//	while
			
			fileS.close();
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}	//	try_cach
	}	//	setLines
	

	public ArrayList<String> getValReq() {
		return valReq;
	}	//	getValReq
	
	public void setValReq(ArrayList<String> valReq) {
		this.valReq = valReq;
	}	//	setValReq
}