package test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Demo {
	public static void main (String[] args) {
		// fetch data
final String url = "https://www.imdb.com/chart/top/";

	try { 
		final Document document = Jsoup.connect(url).get();
	
	for (Element row : document.select(
			"table.chart.full-width tr")) {
		final String title = row.select(".titleColumn").text();
		final String rating = row.select(".imdbRating").text();
		
		System.out.println(title +  " -> Rating: " + rating);
	}
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
	}
}	
