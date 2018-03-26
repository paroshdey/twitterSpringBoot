package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.social.twitter.api.Trend;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("svc/v1/trends")
public class TrendScontroller
{
	@Autowired
	Twitter twitter ;
	
	@RequestMapping(produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Tweet> gettrends( ){
		System.out.println("function called ");
		return twitter.timelineOperations().getUserTimeline("parosh_pd");
	}
	

}
