
package com.swift.kyc.java_client.example;

import org.junit.Ignore;
import org.junit.Test;

import com.swift.kyc.java_client.ApiClient;
import com.swift.kyc.java_client.ApiException;
import com.swift.kyc.java_client.Configuration;
import com.swift.kyc.java_client.api.ConsumptionApi;
import com.swift.kyc.java_client.auth.OAuth;
import com.swift.kyc.java_client.model.EntityList;
import com.swift.kyc.java_client.model.ListOfCounterparties;

@Ignore
public class ConsumptionApiExampleTest {

	@Test
	public void getMyCounterpartiesTest() throws ApiException {
		ApiClient defaultClient = Configuration.getDefaultApiClient();

		// Configure OAuth2 access token for authorization: Bearer
		OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
		Bearer.setAccessToken("YOUR ACCESS TOKEN");

		ConsumptionApi apiInstance = new ConsumptionApi();
		try {
			ListOfCounterparties result = apiInstance.getMyCounterparties();
			System.out.println(result);
		} catch (ApiException e) {
			System.err.println("Exception when calling ConsumptionApi#getMyCounterparties");
			e.printStackTrace();
		}
	}

	@Test
	public void getMyEntitiesTest() throws ApiException {
		ApiClient defaultClient = Configuration.getDefaultApiClient();

		// Configure OAuth2 access token for authorization: Bearer
		OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
		Bearer.setAccessToken("YOUR ACCESS TOKEN");

		ConsumptionApi apiInstance = new ConsumptionApi();
		try {
			EntityList result = apiInstance.getMyEntities();
			System.out.println(result);
		} catch (ApiException e) {
			System.err.println("Exception when calling ConsumptionApi#getMyEntities");
			e.printStackTrace();
		}
	}

}
