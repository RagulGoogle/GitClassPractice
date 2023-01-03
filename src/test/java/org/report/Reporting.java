package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Reporting {

	public static void generateJvmReport(String jsonfile) {
		File file = new File("C:\\Users\\mullai\\eclipse-workspace\\Cucumber\\target");
		Configuration c = new net.masterthought.cucumber.Configuration(file, "Adactin Hotel Automation");
		c.addClassifications("Browser Name", "Chrome");
		c.addClassifications("Browser Version", "107");
		c.addClassifications("os", "Win 11");
		c.addClassifications("Sprint", "11");
		
		List<String> a = new ArrayList<String>();
		a.add(jsonfile);
		
		ReportBuilder builder = new ReportBuilder(a, c);
		builder.generateReports();
		
		
		
		
		
	}
}
