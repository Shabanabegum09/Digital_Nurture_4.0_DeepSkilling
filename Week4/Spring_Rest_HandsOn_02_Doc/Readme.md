REST - Country Web Service :

1. What Happens in the Controller Method?

When a GET request is made to /country, Spring dispatches it to the getCountryIndia() method.

Inside the method:

A Spring ApplicationContext is instantiated with country.xml, which contains bean definitions.

The method retrieves the countryIN bean, representing India, using the bean ID.

The method returns a Country object. Since the controller is annotated with @RestController, the object is automatically serialized into a JSON response.

2. How the Bean Is Converted into JSON Response?

Spring Boot includes Jackson as a default dependency (spring-boot-starter-web).

The returned Java object (Country) is handled by Spring’s MappingJackson2HttpMessageConverter.

This converter:

Inspects the return type.

Uses reflection to call getters like getCode() and getName().

Converts the result into JSON format.

This happens automatically with @RestController or @ResponseBody.

3. In Network Tab of Developer Tools – View HTTP Headers

SME Steps (Browser like Chrome):
Open the application: http://localhost:8083/country

Press F12 to open Developer Tools

Click the "Network" tab

Reload the page

Click the /country request

Click on the "Headers" tab

Request Headers :
GET /country HTTP/1.1
Host: localhost:8083
Accept: application/json
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64)

Response headers:
HTTP/1.1 200 OK
Content-Type: application/json
Content-Length: 38
Date: Sun, 13 Jul 2025 11:00:00 GMT
Connection: keep-alive

These headers confirm:

The request was accepted

The response is JSON

The request/response followed HTTP/1.1 protocol


4. In Postman – View HTTP Headers
SME Steps:
Open Postman

Set method to GET and URL to: http://localhost:8083/country

Click Send

View headers in the two locations: request header -top header and response header -bottom header.
