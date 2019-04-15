Feature: Testing Assignment
 
Scenario: Fetching List of All the Users
 
Given url 'http://localhost:8080/users'
When method GET
Then status 200

Scenario: Fetching Detail of the Users with Id 1
 
Given url 'http://localhost:8080/users/1'
When method GET
Then status 200

Scenario: Testing POST method
 
Given url 'http://localhost:8080/users'
And request {"name":"Marry","city":"Banglore"}
When method POST
Then status 200

Scenario: Testing Consumer GET method for particular User
 
Given url 'http://localhost:9090/users/1'
When method GET
Then status 200
