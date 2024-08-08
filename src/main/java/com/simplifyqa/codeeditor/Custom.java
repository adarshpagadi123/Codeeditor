package com.simplifyqa.codeeditor;

import java.util.logging.Logger;

import com.simplifyqa.abstraction.driver.IQAWebDriver;
import com.simplifyqa.pluginbase.codeeditor.annotations.AutoInjectWebDriver;
import com.simplifyqa.pluginbase.codeeditor.annotations.SyncAction;
import com.simplifyqa.pluginbase.plugin.annotations.ObjectTemplate;
import com.simplifyqa.pluginbase.common.enums.TechnologyType;
import com.simplifyqa.web.base.search.FindBy;

public class Custom {

    @AutoInjectWebDriver
    private IQAWebDriver driver;
    private static final Logger log = Logger.getLogger(Custom.class.getName());
   
    public Custom(){

    }

    @SyncAction(uniqueId = "MyProject-Sample-103",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public boolean waitUntilElementNotPresent(String xpath){
        boolean de = driver.findElement(FindBy.xpath(xpath)).waitUntilElementNotPresent();
        if(de){
            log.info("custom click is executed ");
        return true;
        }
        log.info("custom click is executed ");
        return false;
    }

    @SyncAction(uniqueId = "MyProject-Sample-104",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public boolean elementNotExist(String xpath){
        boolean de = driver.findElement(FindBy.xpath(xpath)).elementNotExist();
      if(de){
        log.info("custom click is executed ");
         return true;
        }
        log.info("custom click is executed ");
        return false;
    }

    @SyncAction(uniqueId = "MyProject-Sample-105",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public boolean elementIsNotDisplayed(String xpath) {
        try {
           boolean de = driver.findElement(FindBy.xpath(xpath)).elementIsNotDisplayed();
            // Check if the element is not displayed
            if (de) {
                log.info("Element is present but not displayed.");
                return true;
            } else {
                log.info("Element is present and displayed.");
                return false;
            }
        } catch (Exception e) {
            log.info("Element does not exist.");
            return false;
        }
    }

    //elementIsChecked()
    @SyncAction(uniqueId = "MyProject-Sample-106",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public boolean elementIsChecked(String xpath){
        boolean de = driver.findElement(FindBy.xpath(xpath)).elementIsChecked();
      if(de){
        log.info("custom click is executed ");
         return true;
        }
        log.info("custom click is executed ");
        return false;
    }

    //elementIsClickable
    @SyncAction(uniqueId = "MyProject-Sample-107",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public boolean elementIsClickable(String xpath){
        boolean de = driver.findElement(FindBy.xpath(xpath)).elementIsClickable();
      if(de){
        log.info("custom click is executed ");
         return true;
        }
        log.info("custom click is executed ");
        return false;
    }

    //elementIsEnabled
    @SyncAction(uniqueId = "MyProject-Sample-108",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public boolean elementIsEnabled(String xpath){
        boolean de = driver.findElement(FindBy.xpath(xpath)).elementIsEnabled();
      if(de){
        log.info("custom click is executed ");
         return true;
        }
        log.info("custom click is executed ");
        return false;
    }

    //elementIsDisabled
    @SyncAction(uniqueId = "MyProject-Sample-109",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public boolean elementIsDisabled(String xpath){
        boolean de = driver.findElement(FindBy.xpath(xpath)).elementIsDisabled();
      if(de){
        log.info("custom click is executed ");
         return true;
        }
        log.info("custom click is executed ");
        return false;
    }

    //elementIsNotChecked
    @SyncAction(uniqueId = "MyProject-Sample-110",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public boolean elementIsNotChecked(String xpath){
        boolean de = driver.findElement(FindBy.xpath(xpath)).elementIsNotChecked();
      if(de){
        log.info("custom click is executed ");
         return true;
        }
        log.info("custom click is executed ");
        return false;
    }



}