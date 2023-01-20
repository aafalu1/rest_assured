package com.rest.assured.get;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ColorValidation {

    @Test
    public void ValidateColor() {
        boolean isBlue=false;
        String color="Orange";
    String [] blueColorList={"Blue1", "Blue2", "Blue3"};
    String [] greyColorList={"Grey1", "Grey12", "Grey13"};
        for (String tab:greyColorList) {
            if(isTabColorBlue(color, tab)){
               isBlue=true;
               break;
            }

        }
        Assert.assertTrue(isBlue, "Invalid background color" + color);

    }


    /*
    given arrayList
    tabName
     */

    private boolean isTabColorBlue(String color, String tabName) {
        if ("Blue".equalsIgnoreCase(color)) {
            return tabName.contains("Blue");
        } else if ("Grey".equalsIgnoreCase(color)) {
            return tabName.contains("Grey");
        }
        throw new IllegalArgumentException("Expect background color Blue or Grey, but found : " + color);
    }
}
