package pages;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class BasePage {
    
    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action ;
 
    static{
        
        System.setProperty("webdriver.chrome.driver", "D:\\MIS_PROYECTOS\\Selenium-Java-Cucumber\\v1\\chromedriver_win32\\108\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();

        driver = new ChromeDriver(chromeOptions);
        
        wait = new WebDriverWait(driver,10);
        action = new Actions(driver);       

    }

public BasePage(WebDriver driver){
    BasePage.driver = driver;
    wait = new WebDriverWait(driver,10);
    
}

public static void navegateTo(String url){
    driver.get(url);
}

public static void CloseNavegate (){
    driver.quit();
}

private WebElement find(String locator){
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
}


public void click(String locator){
    find(locator).click();
}

public void escribir_Text_WebElement(String locator, String text){
    find(locator).clear();
    find(locator).sendKeys(text);
}

public void selectFromDropdownByValue(String locator, String valueToSelect){
        Select Dropdown = new Select(find(locator));
        Dropdown.selectByValue(valueToSelect);
}

public void selectFromDropdownByIndex(String locator, int valueToSelect){
    Select Dropdown = new Select(find(locator));
    Dropdown.selectByIndex(valueToSelect);
}

public void selectFromDropdownByText(String locator, String valueToSelect){
    Select Dropdown = new Select(find(locator));
    Dropdown.selectByVisibleText(valueToSelect);

}

public String getFirstSelected(String locator){
    Select mySelect = new Select(find(locator));
       return mySelect.getFirstSelectedOption().getText().toString();
}

public void scrollDown(String pixels){
    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0," + pixels + ")");
}

public void Maximize(){
        driver.manage().window().maximize();
}



public void sleep (Integer milisegundos) throws InterruptedException{
    Thread.sleep(milisegundos);;
}

public void hoverOverElement(String locator){
     action.moveToElement(find(locator));
}

public void dobleClick(String locator){
     action.doubleClick(find(locator)).perform();;
}

public void rigthClick(String locator){
    action.contextClick(find(locator)).perform();;
} 

public String getValueFromTable(String locator, int row, int columna){
        String celda = locator + "/table/tbody/tr["+row+"]/td["+columna+"]";
        return find(celda).getText();
}
public void setValueOnTable(String locator, int row, int columna, String value){
    String celda = locator + "/table/tbody/tr["+row+"]/td["+columna+"]";
     find(celda).sendKeys(value);
}
public void aceptAlert() {
    try {
        driver.switchTo().alert().dismiss();
    } catch (Exception e) {
        e.printStackTrace();
    }
    
}

public void swichToiFrame(int iFrameIndex) {
    driver.switchTo().frame(iFrameIndex);
}
public void swichToParentFrame(int iFrameIndex) {
    driver.switchTo().parentFrame();
}

public String GetTextoFromElement(String locator){
    return find(locator).getText();
}

public boolean elementIsEnabled(String locator){
    return find(locator).isEnabled();
}

public boolean elementIsDisplayed(String locator){
    return find(locator).isDisplayed();
}

public boolean elementIsSelected(String locator){
    return find(locator).isSelected();
}


public List<WebElement> traermeTodosLosElementos(String locator){
    return driver.findElements(By.className(locator));
}  
    
}
