package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D04_SimpleExtentReport {

	public static void main(String[] args) {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("MyReport.html");
		//Represents the report File
		ExtentReports report = new ExtentReports();
		//Represents the report
		report.attachReporter(htmlReport);
		//This will store the report in html file
		ExtentTest test;
		//This object represents the test
		
		//Adding environment details for report
		report.setSystemInfo("Machine Name","Apple");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("User Name", "VPLab");
		report.setSystemInfo("OS", "Mac");
		
		//Report configuration
		htmlReport.config().setDocumentTitle("My First Report");
		htmlReport.config().setReportName("Google Test Report");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd - MMM - yyyy");
		
		test = report.createTest("Google Title");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
		System.out.println("Title: " + driver.getTitle());
		driver.close();
		test.log(Status.PASS,MarkupHelper.createLabel("Verified Google Title", ExtentColor.GREEN));
		report.flush();
	}

}
