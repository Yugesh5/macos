package jvm.reports;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void JVMRe(String h) {
		File f = new File("/Users/yugesh/eclipse-workspace/CUCUMBER/src/test/resources/Reports/JVMReports");
		Configuration c = new Configuration(f, "facebook");
		List<String> li = new LinkedList<String>();
		li.add(h);
		ReportBuilder b = new ReportBuilder(li, c);
		b.generateReports();
	}
}
