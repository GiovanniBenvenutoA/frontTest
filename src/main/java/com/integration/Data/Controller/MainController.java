package com.integration.Data.Controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.integration.Data.Services.UrlJsonValues;
import com.integration.Data.object.Element;
import com.integration.Data.object.Indicator;
import com.integration.Data.object.IndicatorDate;
import com.integration.Data.service.JsonParseDataService;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
@RequestMapping("/api")
public class MainController {


    @Autowired
    private JsonParseDataService jsonParseData;

    @GetMapping({"/valuesindicator/{indicator}"})
    public String ValuesIndicator(@PathVariable String indicator)
    {
        UrlJsonValues IndicatorValue = new UrlJsonValues();
        String Url = IndicatorValue.URLValues(indicator);
        LinkedHashMap<String ,Indicator> indicators = (LinkedHashMap<String,Indicator>) jsonParseData.parse(Url,Indicator.class);
        Gson gsonAll = new Gson();
        String JsonElement = gsonAll.toJson(indicators,LinkedHashMap.class);
        return JsonElement;
    }

    @GetMapping({"/allindicator"})
    public String lastElement() {
        UrlJsonValues IndicatorAll = new UrlJsonValues();
        String UrlAll = IndicatorAll.URLValuesAll();
        LinkedHashMap<String , Element> element = (LinkedHashMap<String,Element>) jsonParseData.parse(UrlAll,Element.class);
        Gson gsonAll = new Gson();
        String JsonAll = gsonAll.toJson(element,LinkedHashMap.class);
        for(Map.Entry<String,Element> book : element.entrySet())
        {
            String JsonAll1 = gsonAll.toJson(element,LinkedHashMap.class);
            book.getValue();

        }
        return JsonAll;
    }

    @GetMapping({"/indicatordate/{indicator}/{date}"})
    public String ServiceDateElement(@PathVariable String indicator, @PathVariable String date)
    {
        UrlJsonValues IndicatorAll = new UrlJsonValues();
        String UrlIndicatorDate = IndicatorAll.URLValuesDate(indicator,date);
        LinkedHashMap<String , IndicatorDate> elementDate = (LinkedHashMap<String,IndicatorDate>) jsonParseData.parse(UrlIndicatorDate,IndicatorDate.class);
        Gson gsonDate = new Gson();
        String JsonDate = gsonDate.toJson(elementDate,LinkedHashMap.class);
        return JsonDate;
    }



}
