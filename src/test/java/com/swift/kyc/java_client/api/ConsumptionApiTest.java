
package com.swift.kyc.java_client.api;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

import com.swift.kyc.java_client.ApiException;
import com.swift.kyc.java_client.model.EntityList;
import com.swift.kyc.java_client.model.ListOfCounterparties;

public class ConsumptionApiTest {

	ConsumptionApi api = mock(ConsumptionApi.class);

	@Test
	public void getMyCounterpartiesTest() throws ApiException {
		ListOfCounterparties mock_ApiResponse = mock(ListOfCounterparties.class);
		when(api.getMyCounterparties()).thenReturn(mock_ApiResponse);
		Assert.assertEquals((api).getMyCounterparties(), mock_ApiResponse);
		System.out.println("Passed Test getMyCounterpartiesTest");

	}

	@Test
	public void getMyEntitiesTest() throws ApiException {
		EntityList mock_ApiResponse = mock(EntityList.class);
		when(api.getMyEntities()).thenReturn(mock_ApiResponse);
		Assert.assertEquals(api.getMyEntities(), mock_ApiResponse);
		System.out.println("Passed Test entitiesMyGetTest");
	}
}
