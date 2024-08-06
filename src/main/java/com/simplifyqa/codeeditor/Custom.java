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
       // driver.findElement(FindBy.xpath(xpath));
        boolean de = driver.exist(FindBy.xpath(xpath));
        if(!de){
            log.info("custom click is executed ");
        return true;
        }
        log.info("custom click is executed ");
        return false;
    }

    @SyncAction(uniqueId = "MyProject-Sample-104",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public boolean elementNotExist(String xpath){
        driver.findElement(FindBy.xpath(xpath));
      boolean de = !driver.exist(FindBy.xpath(xpath));
      if(de){
        log.info("custom click is executed ");
         return true;
        }
        log.info("custom click is executed ");
        return false;
    }

    @SyncAction(uniqueId = "MyProject-Sample-105",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public boolean elementIsClickable(String xpath){
       boolean de= driver.elementIsClickable(FindBy.xpath(xpath));
        //driver.findElement(FindBy.xpath(xpath));
       // boolean de = !driver.exist(FindBy.xpath(xpath));
      if(de){
        log.info("custom click is executed ");
         return true;
        }
        log.info("custom click is executed ");
        return false;
    }

    @SyncAction(uniqueId = "MyProject-Sample-105",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public boolean elementIsEnabled(String xpath){
        driver.elementIsEnabled(FindBy.xpath(xpath));
        //driver.findElement(FindBy.xpath(xpath));
      boolean de = driver.elementIsEnabled(FindBy.xpath(xpath));
      if(de){
        log.info("custom click is executed ");
         return true;
        }
        log.info("custom click is executed ");
        return false;
    }



    


    
}
