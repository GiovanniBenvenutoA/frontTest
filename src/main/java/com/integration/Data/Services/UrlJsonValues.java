package com.integration.Data.Services;

import java.util.Date;

public class UrlJsonValues {

    private static final String JSON_URLValues  = "https://www.indecon.online/values/";
    private static final String JSON_URL_LAST  = "https://www.indecon.online/last";
    private static final String JSON_URL_DATE  = "https://www.indecon.online/date/";

    public String URLValues (String value)
    {
       String URLParameter = JSON_URLValues + value;
        return URLParameter;
    }

    public String URLValuesAll ()
    {
        String URLParameterAll = JSON_URL_LAST;
        return URLParameterAll;
    }

    public String URLValuesDate (String value, String date)
    {
        String URLParameterDate = JSON_URL_DATE + value+"/"+date;
        return URLParameterDate;
    }

}
