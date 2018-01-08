import geb.Browser;
//import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

def browser = new Browser()

//def chromeDriver = new File('src/test/resources/chromedriver.exe')
//System.setProperty('webdriver.chrome.driver', "C:\\Users\\madhubabuv\\IdeaProjects\\Test\\src\\test\\resources\\chromedriver.exe")
//driver = { new ChromeDriver() }
driver = { new FirefoxDriver()}

browser.drive {

    go "http://gebish.org"
    assert title == "Geb - Very Groovy Browser Automation"

    $('div.menu a.manuals').click()
    waitFor { !$("#manuals-menu").hasClass("animating") }

    $("#manuals-menu a")[0].click()

    assert title.startsWith("The Book Of Geb")

}