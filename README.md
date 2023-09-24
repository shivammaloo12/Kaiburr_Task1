
# Task 1:
## Create an API with 4 endpoints:

1. GET `/api/servers/` 
    - Request: (RequestParam)
      - `String id` (optional)
      - `String name` (optional)
    - Workings:
        - if id is present then:
          - if a matching server is available then: returns the Server
          - else: throws HttpStatus.NOT_FOUND
        - if name is present then:
          - if a matching server or servers are available then: returns the List of Servers
          - else: throws HttpStatus NOT_FOUND
        - returns List of all the Servers
    - Response:
      - default i.e., no id and no name
        - `List<Server>` (returns all the server)
        ![image](https://user-images.githubusercontent.com/55663283/163144140-08f3be0c-e6b3-4ae0-9f39-0d945b41c810.png)
      - if id is present
        - `Server` when match is found
        ![image](https://user-images.githubusercontent.com/55663283/163144384-538bb4ab-5e16-472e-8ef9-78f3a75b8918.png)
        - `HttpStatus.NOT_FOUND` when no match is found
        ![image](https://user-images.githubusercontent.com/55663283/163144488-17b4a4d6-085c-4147-a4c4-7340839044a3.png)
      - if name is present
        - `List<Server>` when match is found
        ![image](https://user-images.githubusercontent.com/55663283/163144893-d49ac16e-91c2-490d-aeb6-e63ceebd12bf.png)
        - `HttpStatus.NOT_FOUND` when no match is found
        ![image](https://user-images.githubusercontent.com/55663283/163144690-ab731bc6-8736-4b8a-977c-7ed77aa36185.png)
2. GET `/api/servers/{id}` 
    - Request: (PathVariable)
      - `String id`
    - Workings:
        - returns the Server with matching id or null if no match found
    - Response:
      - `Server` if match is found
      ![image](https://user-images.githubusercontent.com/55663283/163145265-94057d20-9f71-4004-baf2-6b428d4684e0.png)
      - `HttpStatus.NOT_FOUND` when no match is found
      ![image](https://user-images.githubusercontent.com/55663283/163145386-05e731b8-936e-4e16-890d-fd5e4fac28a6.png)
3. PUT `/api/servers/` 
    - Request: (RequestBody)
      - `Server server` i.e., a json object with
        - `String id` 
        - `String name`
        - `String language`
        - `String framework`
    - Workings:
        - saves the Server to the database
        - returns the Server
    - Response:
      - `Server`
      ![image](https://user-images.githubusercontent.com/55663283/163145748-cbd58326-b6e2-42bd-8b83-16bfa9b121c6.png)
4. DELETE `/api/servers/{id}` 
    - Request: (PathVariable)
      - `String id`
    - Workings:
        - deletes the Server from the database
    - Response:
      - `No Response`
      ![image](https://user-images.githubusercontent.com/55663283/163146006-14ece2fd-c26f-4c52-bedf-0230c5396df3.png)
