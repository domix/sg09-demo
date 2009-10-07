package com.synergyj.sg09.rules;

import org.apache.camel.builder.RouteBuilder;

public class RoutingRules extends RouteBuilder {

	public void configure() throws Exception {
		//from("jms:Topic.des").to("processorOne").to("jms:Topic.dest1");
		from("jms:Topic.des").choice().
		//when(header("header").endsWith("foo")).to("jms:foo").
		//when(header("header").endsWith("bar")).to("jms:bar").
		
			when(header("header").endsWith("foo")).to("processorOne").
			when(header("header").endsWith("bar")).to("processorTwo").
			
			otherwise().to("jms:error");
	}

}
