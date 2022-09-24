package org.ntesla.itets;

import org.jetbrains.annotations.NotNull;

public interface Test {

    @MyNonNull
    //@NotNull
    static String testMetoda(String testParametar){

        if(testParametar.equals("hi"))
            return null;
        else
            return "hi";
    }

}
