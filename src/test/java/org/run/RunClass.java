package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import jvm.reports.JVMReport;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature", glue = "org.step", dryRun = false, tags = "@smoke", plugin = {"pretty",
"html:/Users/yugesh/eclipse-workspace/CUCUMBER/src/test/resources/Reports",
"json:/Users/yugesh/eclipse-workspace/CUCUMBER/src/test/resources/Reports/jso.json",
"junit:/Users/yugesh/eclipse-workspace/CUCUMBER/src/test/resources/Reports/xml.xml",
"rerun:/Users/yugesh/eclipse-workspace/CUCUMBER/src/test/resources/Rerun/rerun.txt"}, monochrome = true)
public class RunClass {
	@AfterClass
	public static void Aftercla() {
		JVMReport.JVMRe("/Users/yugesh/eclipse-workspace/CUCUMBER/src/test/resources/Reports/jso.json");
		System.out.println("Done");
	}
}
