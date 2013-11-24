/*
 * Author : AkhilDas ( AkhlD )
 * Email  : akhld@darktech.ca
 * Website: CodeBreach.in
 * Date   : 24/05/2013 
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class WikiCrawler {
	
	private static String inputFile="";
	private static Document document;
	private static String url ="http://en.wikipedia.org/wiki/";
	
	
	
	public static void main(String[] args){
		
		if(args.length > 0){
			
			inputFile = args[0];
			
			startCrawler(inputFile);
			
			
		}
	}

	private static void startCrawler(String filename) {
		
		try{
			
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String topic ="";
						 
			while ((topic = br.readLine()) != null) {
				
				topic = topic.replace(" ", "_");
				System.out.println(topic);

				document = Jsoup.connect(url + topic).get();
				
				File file = new File(topic + ".txt");
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(document.text());
				bw.close();
				
				System.out.println(document.text());
				
			}
			
			
			br.close();
			
			
		}catch(Exception e) { System.out.println("Whoops! It failed :"  + e); }
		
	}

}
