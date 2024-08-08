package com.simplifyqa.codeeditor;

import java.util.logging.Logger;

import com.simplifyqa.abstraction.driver.IQAWebDriver;
import com.simplifyqa.pluginbase.codeeditor.annotations.AutoInjectWebDriver;

public class Sushmamouse {

    @AutoInjectWebDriver
    private IQAWebDriver driver;
    private static final Logger log = Logger.getLogger(Custom.class.getName());
    
    public Sushmamouse(){   
      //simpleconstructor //done  
    }
    

}
