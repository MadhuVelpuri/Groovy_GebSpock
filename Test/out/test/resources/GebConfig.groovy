import org.openqa.selenium.firefox.FirefoxDriver

driver = { new FirefoxDriver() }

baseUrl = "http://www.jdriven.com/"

reportsDir = new File("target/geb-reports")
reportOnTestFailureOnly = true
