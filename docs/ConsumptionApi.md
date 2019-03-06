# ConsumptionApi

All URIs are relative to *https://sandbox.swift.com/kyc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDocumentById**](ConsumptionApi.md#getDocumentById) | **GET** /entities/folders/document/download | Document Retrieval API
[**getEntityFoldersByBic**](ConsumptionApi.md#getEntityFoldersByBic) | **GET** /entities/folders/{BIC} | Data Retrieval API
[**getEntityFoldersProfileByBic**](ConsumptionApi.md#getEntityFoldersProfileByBic) | **GET** /entities/folders/{BIC}/download | Profile Retrieval API
[**getMyCounterparties**](ConsumptionApi.md#getMyCounterparties) | **GET** /entities/counterparty | Counterparty Listing API
[**getMyEntities**](ConsumptionApi.md#getMyEntities) | **GET** /entities/my | My Listing API


<a name="getDocumentById"></a>
# **getDocumentById**
> Object getDocumentById(BIC, documentId)

Document Retrieval API

This API is a consumption query that enables you to download an evidencing document for the BIC specified.

### Example
```java
// Import classes:
//import com.swift.kyc.java_client.ApiClient;
//import com.swift.kyc.java_client.ApiException;
//import com.swift.kyc.java_client.Configuration;
//import com.swift.kyc.java_client.auth.*;
//import com.swift.kyc.java_client.api.ConsumptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Bearer
OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
Bearer.setAccessToken("YOUR ACCESS TOKEN");

ConsumptionApi apiInstance = new ConsumptionApi();
String BIC = "BIC_example"; // String | BIC of the entity for which the data needs to be extracted
String documentId = "documentId_example"; // String | This Id is generated for each document
try {
    Object result = apiInstance.getDocumentById(BIC, documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsumptionApi#getDocumentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BIC** | **String**| BIC of the entity for which the data needs to be extracted |
 **documentId** | **String**| This Id is generated for each document |

### Return type

**Object**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="getEntityFoldersByBic"></a>
# **getEntityFoldersByBic**
> Entity getEntityFoldersByBic(BIC, lastPublishedSince)

Data Retrieval API

This API is a consumption query that enables you to extract all KYC data points spread across the 5 folder categories of baseline for the BIC specified. Please take note that only Identification of Customer folder is shown in the sample response. For access to complete response, please contact KYC.Registry@swift.com

### Example
```java
// Import classes:
//import com.swift.kyc.java_client.ApiClient;
//import com.swift.kyc.java_client.ApiException;
//import com.swift.kyc.java_client.Configuration;
//import com.swift.kyc.java_client.auth.*;
//import com.swift.kyc.java_client.api.ConsumptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Bearer
OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
Bearer.setAccessToken("YOUR ACCESS TOKEN");

ConsumptionApi apiInstance = new ConsumptionApi();
String BIC = "BIC_example"; // String | BIC of the entity for which the data needs to be extracted
String lastPublishedSince = "lastPublishedSince_example"; // String | This is an optional parameter that enables you to restrict the consumption query to KYC data published after a given date (in the format YYYY-MM-DD).
try {
    Entity result = apiInstance.getEntityFoldersByBic(BIC, lastPublishedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsumptionApi#getEntityFoldersByBic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BIC** | **String**| BIC of the entity for which the data needs to be extracted |
 **lastPublishedSince** | **String**| This is an optional parameter that enables you to restrict the consumption query to KYC data published after a given date (in the format YYYY-MM-DD). | [optional]

### Return type

[**Entity**](Entity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

<a name="getEntityFoldersProfileByBic"></a>
# **getEntityFoldersProfileByBic**
> Object getEntityFoldersProfileByBic(BIC, lastPublishedSince)

Profile Retrieval API

This API is a consumption query that enables you to extract the KYC profile in zip data folder which includes all data points (in PDFs, json, and xml) and evidencing documents spread across the 5 folder categories of the baseline for the BIC specified. Please note this API will not include the annual report and signatory list which can be downloaded via GetKYCDocument.

### Example
```java
// Import classes:
//import com.swift.kyc.java_client.ApiClient;
//import com.swift.kyc.java_client.ApiException;
//import com.swift.kyc.java_client.Configuration;
//import com.swift.kyc.java_client.auth.*;
//import com.swift.kyc.java_client.api.ConsumptionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Bearer
OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
Bearer.setAccessToken("YOUR ACCESS TOKEN");

ConsumptionApi apiInstance = new ConsumptionApi();
String BIC = "BIC_example"; // String | BIC of the entity for which the data needs to be extracted
String lastPublishedSince = "lastPublishedSince_example"; // String | This is an optional delta parameter that enables you to restrict the consumption query to KYC data published after a given date (in the format YYYY-MM-DD).
try {
    Object result = apiInstance.getEntityFoldersProfileByBic(BIC, lastPublishedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsumptionApi#getEntityFoldersProfileByBic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BIC** | **String**| BIC of the entity for which the data needs to be extracted |
 **lastPublishedSince** | **String**| This is an optional delta parameter that enables you to restrict the consumption query to KYC data published after a given date (in the format YYYY-MM-DD). | [optional]

### Return type

**Object**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip

<a name="getMyCounterparties"></a>
# **getMyCounterparties**
> ListOfCounterparties getMyCounterparties()

Counterparty Listing API

This API is a list retrieval query that enables you to extract a list of all counterparties which granted access to your KYC group. Triggering this API will activate/re-activate the passive relationships.

### Example
```java
// Import classes:
//import com.swift.kyc.java_client.ApiClient;
//import com.swift.kyc.java_client.ApiException;
//import com.swift.kyc.java_client.Configuration;
//import com.swift.kyc.java_client.auth.*;
//import com.swift.kyc.java_client.api.ConsumptionApi;

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
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListOfCounterparties**](ListOfCounterparties.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

<a name="getMyEntities"></a>
# **getMyEntities**
> EntityList getMyEntities()

My Listing API

This API is a list retrieval query that enables you to extract a list of all entities which belong to your KYC group

### Example
```java
// Import classes:
//import com.swift.kyc.java_client.ApiClient;
//import com.swift.kyc.java_client.ApiException;
//import com.swift.kyc.java_client.Configuration;
//import com.swift.kyc.java_client.auth.*;
//import com.swift.kyc.java_client.api.ConsumptionApi;

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
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EntityList**](EntityList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

