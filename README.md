### Scenario
Users intermittently receive a **500 Internal Server Error** when they call `/books/{id}`.

### Objective
Locate and fix the root cause (a `NullPointerException`).

### Acceptance
* Endpoint must return HTTP 200 with valid JSON book data.
* No unchecked exceptions should appear in logs.


#### Steps to Reproduce
1. Compile with `mvn clean package`.
2. Run unit tests or invoke main method to observe failure.
