package com.umkc.ashok;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Parse {
	
	 public static Tweet1 parseJsonToTweet(String jsonLine) {

		    ObjectMapper objectMapper = new ObjectMapper();
		    Tweet1 tweet = null;

		    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		    try {
		      tweet = objectMapper.readValue(jsonLine, Tweet1.class);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		    return tweet;
		  }

}
