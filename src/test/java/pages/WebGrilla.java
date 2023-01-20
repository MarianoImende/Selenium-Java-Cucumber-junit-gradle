package pages;

public class WebGrilla extends BasePage{

    private String  GrillaLocator = "/html/body/";     //    "//*[@id='root']/div/";
    private String table = "/html/body/table";
    public WebGrilla() {
        super(driver);
    }

    public void navegateToWebGrilla() {
        navegateTo("file:///D:/MIS_PROYECTOS/Selenium-Java-Cucumber/v1/editable-table-js/edit-table.html");  //https://1v2njkypo4.csb.app
    }    
    
    public String getValueFromTable(int row, int columna) {
             return getValueFromTable(GrillaLocator,row, columna);
    }

    public void setValueOnTable( int row, int columna, String value){
        
        String loc = GrillaLocator + "table/tbody/tr["+row+"]/td["+columna+"]";
    
        dobleClick(loc);
    
        setValueOnTable(GrillaLocator, row, columna, value);
    }
public boolean getStatusCell() {
    return elementIsDisplayed(table);
}    
}

