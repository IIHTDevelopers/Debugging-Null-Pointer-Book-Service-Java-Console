### Scenario
Users intermittently receive a a `NullPointerException` when they call `getBookById()`.

### Objective
Locate and fix the root cause (a `NullPointerException`).

### Acceptance
* Method must return valid book data Object.
* No unchecked exceptions should appear in logs.


#### Steps to Reproduce
1. Compile with `mvn clean package`.
2. Run unit tests to observe failure using 'mvn test'
3. Final objective is to make test case pass.
4. You can run test cases as many number of times and refactor you code.

#### Points to remember
1. Do not modify the method signatures in Main class
   
