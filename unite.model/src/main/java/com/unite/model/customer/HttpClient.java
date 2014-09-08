package com.unite.model.customer;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class HttpClient {
	private String customerId;// should this be here or should it be imported?
	CloseableHttpClient httpclient = HttpClients.createDefault();
	HttpGet httpGet = new HttpGet("http://172.16.101.206/HMSOnline/rest/customerDetails?customerID="+ customerId);
	CloseableHttpResponse response1 = httpclient.execute(httpGet);
	
	try {
		System.out.println(response1.getStatusLine());
		HttpEntity entity1 = response1.getEntity();
		EntityUtils.consume(entity1);
		if ("Status Line".equals("200"))
		{
		//statement if condition is false	
		}	
		
		{
		//statement if condition is false
		}
		
	
		}finally {
		response1.close();
	}
	
  }

}
