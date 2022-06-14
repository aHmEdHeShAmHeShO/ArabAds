# swag labs Automation Web Site
## Selenium-Java-Allure Framework
> A Maven framework in which to build Selenium tests written in Java with Allure reports of test results.

## Tools
- Eclipse Or Intellij
- Maven Framework.
- Selenium.
- TestNG.
- WebDriverManager.
- Allure-framework Report.

## Requirements for Installation

- Download and Install Java JDK 17.
- Set Up Java Environment Variable.
- Download and Install Maven.
- Set up Maven Environment Variable.
- Download and Install Allure from github.
- Set up Allure Environment Variable.
- Update the Path Variables.
- Test Java , Maven And Allure Installation.
- Install dependencies that in POM.xml.

## The Project Desgin or Structure

> The project depends on Page objects design patterns that describe any web page in terms of a hierarchical domain specific language.

> The pattern depends on abstract implementation details.

> The project is designed to inherit from Page Base for main java and Test Base for test java.

> The page base contains page factory, driver, Select.

> The Test Base contains driver, web driver manager , open the browser , close the browser and screen shot for Failure.

## Usage Method

> Right click the Test case  and select "Run" or "Debug" to start the test by TestNG.

> Project uses Maven so you can use commend line(mvn clean test -P( give profile youe need) from cmd.

> You can run the tests from the Command Shell.

> You can E2ETc.xml files to run the test cases.

## Reporting

> To get Allure report you need to run the commend line(allure.bat serve allure-results) or use the shell file.

> You can get TestNG report from Test-output (index.html).