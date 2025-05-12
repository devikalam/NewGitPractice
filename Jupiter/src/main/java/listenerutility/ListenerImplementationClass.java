package listenerutility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementationClass implements ITestListener, ISuiteListener {
	ExtentReports report;
	public void onStart(ISuite suite) {
	ExtentSparkReporter spark=new ExtentSparkReporter("");
	spark.config().setDocumentTitle("jupiter suite results");
	spark.config().setReportName("jupiter report");
	spark.config().setTheme(Theme.DARK);
	 report=new ExtentReports();
	report.attachReporter(spark);
	}
	public void onFinish(ISuite suite) {
	report.flush();
	}
	public void onTestStart(ITestResult result) {
		
		report.createTest()
	}
	public void onTestSuccess(Itest) {
		
	}
	public void onTestFailure() {
		
	}
	

}
