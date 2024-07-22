# Weather_APP

Write a server by using SpringBoot Java and integrate Weather API from Rapid API. On the
basis of that integration, expose your RESTful APIs as follows with JSON response.
Authentication Method: Header-based authentication with random client id and random
client secret

# How to Run Project

1) Download the zip folder
2) Import Project in Tools(Eclips, STS).
3) Build the project
4) Run the Project
Run as-> Spring boot app

# output of 1 API
## API 1: Get the Weather forecast summary of Any city using API (RapidApiGetForecastSummaryByLocationName)
In the below picture geeting output for Forecast Summary By Location Name
![summary](https://github.com/user-attachments/assets/4126b3b2-8862-4ffe-aa94-ed57bfcdfbf2).

for Authentication 
1) step1: Use API [http://localhost:8080/api/credentials/generate
2) Response will be like 
![image](https://github.com/user-attachments/assets/14f6813b-8d68-4846-9b83-9d7631d203e6)
3) Add both client-id and client-seceret in headers of API 1 and authenticate

