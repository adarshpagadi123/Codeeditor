package com.simplifyqa.codeeditor;

import com.simplifyqa.abstraction.driver.IQAWebDriver;
import com.simplifyqa.pluginbase.GeneralMethods.IGeneral;
import com.simplifyqa.pluginbase.codeeditor.annotations.*;
import com.simplifyqa.pluginbase.common.enums.TechnologyType;
import com.simplifyqa.pluginbase.plugin.annotations.ObjectTemplate;
import com.simplifyqa.web.base.search.FindBy;

import java.util.logging.Logger;

/**
 * Hello there!!, please keep the following things in mind while creating custom class
 * Your class should have a public default constructor.
 * @Sync methods should return a boolean value not void or anything else
 * @AutoInjectWebDriver/ @AutoInjectAndroidDriver /
 * @AutoInjectIOSDriver indicates the driver you want to use.
 */
public class SampleClass
{
    @AutoInjectWebDriver
    private IQAWebDriver driver;
    private static final Logger log = Logger.getLogger(SampleClass.class.getName());
    public SampleClass() {
    }

    @SyncAction(uniqueId = "MyProject-Sample-001",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public boolean customSampleClick(String xpath){
        driver.findElement(FindBy.xpath(xpath)).click();
        log.info("custom click is executed ");
        return true;
    }

    @SyncAction(uniqueId = "MyProject-Sample-002",groupName = "Type Text",description = "Save to db using db url",objectTemplate = @ObjectTemplate(name = TechnologyType.ANDROID,description = "This action belongs to ANDROID"))
    public boolean customSampleTypeText(String xpath,String text){
        driver.findElement(FindBy.xpath(xpath)).enterText(text);
        log.info("enter text is executed");
        return true;
    }
    @SyncAction(uniqueId = "MyProject-Sample-003",groupName = "Type Text",objectTemplate = @ObjectTemplate(name = TechnologyType.IOS,description = "This action belongs to IOS"))
    public boolean customSampleEnterTextWithJS(String xpathOfElement,String valueToEnter){
        driver.findElement(FindBy.xpath(xpathOfElement)).enterText(valueToEnter);
        log.info("enter text is executed");
        return true;
    }
    @SyncAction(uniqueId = "MyProject-Sample-004",groupName = "Generic",objectTemplate = @ObjectTemplate(name = TechnologyType.GENERIC,description = "This action belongs to GENERIC"))
    public boolean customAddition(int... ints){
        driver.getGeneral().additionOfValues(ints);
        log.info("addition of values performed");
        return true;
    }
}
