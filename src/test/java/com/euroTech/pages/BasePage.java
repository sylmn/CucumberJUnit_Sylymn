package com.euroTech.pages;

import com.euroTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void navigateToTabs(String tabName){
        WebElement tab = Driver.get().findElement(By.xpath("//span[text()='" + tabName + "']"));
        tab.click();
    }
    public void navigateToTabs(String tabName, String moduleName){
        WebElement tab = Driver.get().findElement(By.xpath("//span[text()='"+tabName+"']"));
        tab.click();
        WebElement module = Driver.get().findElement(By.xpath("//span[text()='"+moduleName+"']"));
        module.click();
    }
}
