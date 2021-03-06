# KYC Java Client

## Overview

The client classes are generated by swagger-codegen, we added unit tests, example tests and a helper class to help you
consume the KYC API.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

## Test

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.swift.kyc</groupId>
    <artifactId>java-client</artifactId>
    <version>1.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/java-client-1.1.0.jar


## Example for API Endpoints

All URIs are relative to *https://sandbox.swift.com/kyc/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConsumptionApi* | [**getMyCounterparties**](docs/ConsumptionApi.md#getMyCounterparties) | **GET** /entities/counterparty | Counterparty Listing API
*ConsumptionApi* | [**getMyEntities**](docs/ConsumptionApi.md#getMyEntities) | **GET** /entities/my | My Listing API


## Documentation for Models

 - [Data](docs/Data.md)
 - [DataIoc](docs/DataIoc.md)
 - [DataIocInner](docs/DataIocInner.md)
 - [DataMycounterparty](docs/DataMycounterparty.md)
 - [DataMyentity](docs/DataMyentity.md)
 - [DocumentModel](docs/DocumentModel.md)
 - [Entity](docs/Entity.md)
 - [EntityList](docs/EntityList.md)
 - [Folders](docs/Folders.md)
 - [IndustryClassifications](docs/IndustryClassifications.md)
 - [LicenceInfo](docs/LicenceInfo.md)
 - [LicenceTypes](docs/LicenceTypes.md)
 - [LicencesInfo](docs/LicencesInfo.md)
 - [ListOfCounterparties](docs/ListOfCounterparties.md)
 - [SICCodes](docs/SICCodes.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: OAuth
- **Flow**: password
- **Authorization URL**: https://sandbox.swift.com/oauth2/v1
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

Hassan.MOLLAH@swift.com


