package br.fellipe.programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class JavaIO {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream arquivo = new FileInputStream("leitura.txt");
		InputStreamReader leitura = new InputStreamReader(arquivo);
		BufferedReader br = new BufferedReader(leitura);
		
		OutputStream out = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		
		String readLine = br.readLine();
		while( readLine  != null){
			bw.append(readLine);
			bw.newLine();
			
			readLine = br.readLine();
		}
		
		bw.close();		
		br.close();
		
	}

}
