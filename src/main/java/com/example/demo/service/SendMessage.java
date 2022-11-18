package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demo.model.RouteMcg;
import com.example.demo.repository.DlsRespo;
import com.example.demo.util.Constants;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SendMessage {

    @Autowired
    private DlsRespo dlsRespo;

    public String sendMcg(RouteMcg routeMcg) {

        System.out.println("service class line 23");
        Logger log = LoggerFactory.getLogger(SendMessage.class);
//        dlsRespo.save(routeMcg);

        try {
            System.out.println("service class line 28");
            //   Unirest.setTimeouts(10000, 60000);
            HttpResponse<String> response1 = Unirest.post(Constants.MCGURL)
                    .header("Content-Type", "application/json")
                    .body("{\n    \"Mcg\" :\"" + routeMcg.getMcg() + "\",\n    \"Shortcode\":\"" + routeMcg.getShortcode() + "\",\n    \"msisdn\":\"" +
                            routeMcg.getMsisdn() + "\",\n    \"Connectivitypointid\":\"" + routeMcg.getConnectivitypointid() +"\",\n    \"Delieveryreport\":\"" +routeMcg.getDelieveryreport() +"\",\n  \"Id\",:\"" +routeMcg.getId() + "\", \n     \"serviceid\":\"" + routeMcg.getServiceid() + "\"\n}")
                    .asString();
            System.out.println("service class line 36");
            log.info("Response From mcg for msisdn is   " +  routeMcg.getId());


        } catch (UnirestException e) {
            log.info("Exception Sending message: "+e.getMessage() +" for id "+routeMcg.getId());

            e.printStackTrace();
            return "error occured";
        }
        return "Success";

    }
}
