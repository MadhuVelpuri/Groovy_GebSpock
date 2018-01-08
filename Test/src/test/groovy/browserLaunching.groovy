
import geb.Browser;
//import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

def browser = new Browser()

//def chromeDriver = new File('src/test/resources/chromedriver.exe')
//System.setProperty('webdriver.chrome.driver', "C:\\Users\\madhubabuv\\IdeaProjects\\Test\\src\\test\\resources\\chromedriver.exe")
//driver = { new ChromeDriver() }
driver = { new FirefoxDriver()}

browser.drive {
    go "http://google.com"

    $("#lst-ib").value("Hello Geb!")
    println("Value Entered...")

}