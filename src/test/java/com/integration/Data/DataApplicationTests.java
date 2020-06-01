package com.integration.Data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.integration.Data.Controller.MainController;
import com.integration.Data.object.Element;
import com.integration.Data.object.Indicator;
import com.integration.Data.service.JsonParseDataService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.applet.Main;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.LinkedHashMap;

import static io.restassured.RestAssured.get;


@RunWith(SpringRunner.class)
@WebMvcTest(value = MainController.class)
class DataApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    JsonParseDataService jsonParseDataService;
    private static final String JSON_URL_LAST  = "https://www.indecon.online/last";




    @Test
    public void IndicatorAll() throws Exception {


        LinkedHashMap<String,Element> element = new LinkedHashMap<>();

        Mockito.when(jsonParseDataService.parse(JSON_URL_LAST, Element.class)).thenReturn(element);

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/api/allindicator").accept(
                MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());

    }

    @Test
    public void indactorValues() throws Exception {


        LinkedHashMap<String,Element> element = new LinkedHashMap<>();

        Mockito.when(jsonParseDataService.parse(JSON_URL_LAST, Element.class)).thenReturn(element);

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/api/allindicator/").accept(
                MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());

    }



}
