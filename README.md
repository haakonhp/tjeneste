# Gruppe 23 Software Engineering og Testing gruppeoppgave

This is a project from the course Software Engineering og Testing at Østfold University College, the task was making a 
prototype and documentation of an application where a user can rent out a car.

## Table of contents
- Getting Started
- Prerequisites
  - Requirements for the software and other tools to build, test and push
- Start the prototype
- Running the tests
    - Running the tests with coverage
- Deployment

- Authors
- Acknowledgments

- Usefull links used under development

### Getting Started

Make sure to have a full copy of the project files stored locally on your computer and install all the necessary 
software which is described under. 


### Prerequisites

The project should be able to run on any computer but, we have experienced some difficulty to make the project run. 
The most reliable way has been running a clean installation of ubuntu linux in a virtual machine. We have mostly been 
using Windows 11 for developing and running the project. <br>


#### Requirements for the software and other tools to build, test and push
- Download and install IntelliJ: [IntelliJ Download](https://www.jetbrains.com/idea/download/#section=windows) 
- Make sure to have java JDK 18.0.2 installed: [Java Download](https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html)
  - If java commands doesn't run from the terminal make sure that environment variables are set correctly: http://www.codebind.com/windows-11-tutorials/how-to-set-environment-variables-in-windows-11/ <br>
- Then install Node.js 16.17.0 on your computer: [Node Download](https://nodejs.org/en/) 
- IntelliJ have built in support for maven, but if you want to use maven commands from terminal you have to install maven on your computer: [Maven Download](https://maven.apache.org/) 
  - Make sure that maven is in your enviroment variables: https://www.qamadness.com/knowledge-base/how-to-install-maven-and-configure-environment-variables/
- For some features from the framework to work a valid licence might be required, you can get a educational licence for free here: 
  - [Github Student Developer Pack](https://education.github.com/pack) 
  - [Vaadin Student Program](https://vaadin.com/student-program) 
  - Then download the Vaadin Designer plug-in in IntelliJ: [Vaadin Designer Plug-in](https://plugins.jetbrains.com/plugin/9519-vaadin-designer) 
    - Try to open a TypeScript file in the ~frontend directory to open Vaadin Designer to log in to activate your license on your machine.    
- For usage of GitHub install [Git](https://git-scm.com/) and log in to your GutHub account in settings -> version control -> GitHub in IntelliJ.

### Start the prototype
Build project module
```bash
mvn install -f pom.xml
```
Alternatively you can right-click on pom.xml or the project directory in IntelliJ and select Build Module 'tjenestedk' <br>
<br>
Install dependencies:
```bash
npm install
```
If nessessary run:
```bash
npm audit fix --force
```

To start application right-click Application class and select Run 'Application'. Directory path: ~src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/Application.java <br>
Alternatively you can run the terminal command:
```bash
mvn
```

If that did not work try to run these commands. According to Vaadin's documentation are these the commands meant to be used for starting the application, but they did not work for us.
```bash
# Windows
mvnw
# Linux and macOS
./mvnw
```
Then open [http://localhost:8080](http://localhost:8080) in your browser if it doesn't appear automatically.


### Running the tests

There are some different ways you can run the tests for the project, keep in mind that the tests that extends the UIUnitTest class require a Vaadin license to run, how to obtain a licence and log in is explained above in prerequisites.

Before running tests make sure that the ~src/test/java directory is marked as Test Sources Root in IntelliJ: https://resources.jetbrains.com/help/img/idea/2022.2/test-s-root.png <br>
The recommended way to run the tests are by right-clicking on the project folder in IntelliJ and Run 'All tests' or right-click the test class and selecting "Run 'TestClassName'", all tests are located in the ~src/test/java directory<br>

To run all tests from terminal use this command:
```bash
mvn test 
```

#### Running the tests with coverage
<br>
If you want to run the tests with coverage right-click the test or folder to run multiple tests, the click More Run/Debug and Run 'All tests' with Coverage.
We have previously run the test wit coverage and generated a report that's available if you open this HTML document in a browser: [Coverage report](src/main/resources/db-JSON-files/coverage report/index.html) <br>
<br>

## Deployment to production

To create a production build, call `mvnw clean package -Pproduction` (Windows),
or `./mvnw clean package -Pproduction` (Mac & Linux).
This will build a JAR file with all the dependencies and front-end resources,
ready to be deployed. The file can be found in the `target` folder after the build completes.

Once the JAR file is built, you can run it using
`java -jar target/tjenestedk-1.0-SNAPSHOT.jar`

```Taken from Vaadins offcial README file```

## Authors
- Mats-Hansen (Mats Hansen)
- haakonhp (Håkon Pedersen)
- fredandhiof (Fredrik Andersen)
- HaakonAtw (Håkon Nerby)
- Nozdub (Christian Aasen)

## Sources / Reference list
- **Billie Thompson** - *Provided README Template* -
  [PurpleBooth](https://github.com/PurpleBooth/a-good-readme-template)
- GSON JSON file handling
  - https://www.javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/com/google/gson/Gson.html
  - https://github.com/google/gson/blob/master/UserGuide.md#TOC-Finer-Points-with-Objects
  - https://jenkov.com/tutorials/java-json/gson.html


## Acknowledgments

- Thanks to JetBrains, GutHub and Vaadin for providing us with free tools and licenses that made this project possible.
- Thanks to Google for GSON which we use for JSON file handling.
- Thanks to the team for good team effort in the making of this project. 


<br>____________________________________________________________________________________________________________<br>
# Usefull links used under development: <br>

#  Prosjektet: <br>
## Repo navn: Tjeneste https://github.com/SoftEng2022Gruppe23/Tjeneste
## App navn:  no.hiof.softeng2022gruppe23.tjeneste
### Inkluderer Docker og Kubernetes config
## Manual/Vaadin readme: README_vaadin.md https://github.com/SoftEng2022Gruppe23/Tjeneste/blob/7f932ada91169f95aab48e97fc0f3e19d9a4e9e7/README_vaadin.md <br>

## Framework: <br>
https://github.com/vaadin <br>
https://start.vaadin.com/app <br>
<br>
### Vaadin guides (coding): <br>
### _Hvordan importere prosjektet til IntelliJ:_ <br>
https://vaadin.com/docs/latest/guide/step-by-step/importing/intellij <br>
### _Introduction to Vaadin Designer with IntelliJ IDEA:_ <br>
https://youtu.be/oFBe8DLCn-s  <br>
### _Building Modern Web Applications with Spring Boot and Vaadin:_ <br>
https://vaadin.com/docs/latest/tutorial/overview <br>
### _Vaadin Docs Develop Web Apps in Java:_ <br>
https://vaadin.com/docs/latest/ <br>
### _Quick Start Guide:_ <br>
https://vaadin.com/docs/latest/guide <br>
### _Training videos and certifications:_ <br>
https://vaadin.com/learn/training <br>
### Hele Kurs: <br>
_Spring Boot Web App Tutorial (Java) | Full Course_ <br> https://youtu.be/bxy2JgqqKDU <br>
____________________________________________________________________________________________________________<br>
## Testing: <br>
### _Testing Vaadin Applications Using TestBench:_ <br>
https://vaadin.com/docs/latest/testing <br>
### _UI Unit Testing:_ <br>
https://vaadin.com/docs/latest/testing/ui-unit  <br>
### _Getting Started with UI Unit Testing:_  <br>
https://vaadin.com/docs/latest/testing/ui-unit/getting-started
### _TestBench Demo:_ <br>
https://github.com/vaadin/testbench-demo  <br>
____________________________________________________________________________________________________________<br>
### Essential guides GitHub: <br>
_Git 101 Basics - Computer Stuff They Didn't Teach You #4_ <br> https://www.youtube.com/watch?v=WBg9mlpzEYU <br>
_Git Pull Requests explained - Computer Stuff They Didn't Teach You #5_ <br> https://www.youtube.com/watch?v=Mfz8NQncwiQ <br>
_GitHub branch rules (protect your git branches)_ <br> https://www.youtube.com/watch?v=CNCE1gts2Yw <br>
_Best Practices for Branch Protection_ <br> https://youtu.be/gUJ52Shwtm0 <br>
<br>
____________________________________________________________________________________________________________<br>
### Issue and Pull Request templates: <br>
#### _Git Configuration:_ <br> 
_To add an Issue template to a repository create a file called ISSUE_TEMPLATE in the root directory._ <br>
_A file extension is optional, but Markdown files (.md) are supported._ <br>
_Markdown support makes it easy to add things like headings, links, @-mentions, and task lists to your templates._ <br>

_Pull Request templates follows the same pattern: add a file called PULL_REQUEST_TEMPLATE to the root directory of your repository._ <br>

_If you’re worried about the added clutter in the root directory of your project, we also added support for a .github/ folder._ <br>
_You can put CONTRIBUTING.md, ISSUE_TEMPLATE.md, and PULL_REQUEST_TEMPLATE.md files in .github/ and everything will work as expected._ <br>
<br>
https://github.com/devspace/awesome-github-templates <br>
https://github.blog/2016-02-17-issue-and-pull-request-templates <br>
https://docs.github.com/en/communities/setting-up-your-project-for-healthy-contributions <br>
____________________________________________________________________________________________________________<br>
### Gitignore / Gitignore Global USAGE: <br>
#### _Git Configuration:_ <br>
https://docs.github.com/en/get-started/getting-started-with-git/ignoring-files <br>
https://github.com/github/gitignore <br>
<br>
_To tell Git to use the template file (globally, not just in the current repo), I used the following command:_ <br>
**IMPORTANT** <br>
``git config --global core.excludesfile ~/.gitignore_global`` <br>
_In the current project directory_ <br>
KAN være at du må kopiere .gitmessage til working directoryen til GIT, denne skal være c:\users\$dinbruker$ <br>
**IMPORTANT** <br>
<br>
https://docs.github.com/en/get-started/getting-started-with-git/ignoring-files <br>
https://github.com/github/gitignore <br>
____________________________________________________________________________________________________________<br>
### Commit Template USAGE:  <br>
#### _Git Configuration:_ <br>
_To tell Git to use the template file (globally, not just in the current repo), I used the following command:_ <br>
**IMPORTANT** <br>
``git config --global commit.template ~/.gitmessage`` <br>
_In the current project directory_ <br>
KAN være at du må kopiere .gitmessage til working directoryen til GIT, denne skal være c:\users\$dinbruker$ <br>
Se på følgende bilde guide: <br>
![Step1](/img/step1.png) <br>
![Step2](/img/step2.png) <br>
**IMPORTANT** <br>
<br>
https://gist.github.com/median-man/3a7c4324005e96f02691f3a20aeac26b <br>
https://thoughtbot.com/blog/better-commit-messages-with-a-gitmessage-template <br>
____________________________________________________________________________________________________________<br>
### Set-up IntelliJ: <br>
#### Install the following plug-ins: <br>
https://hiof.sharepoint.com/:x:/r/sites/SoftEng2022Bibliotek/_layouts/15/Doc.aspx?sourcedoc=%7B12CBB9EC-70AC-4D79-8976-B0F70CE11820%7D&file=1301%20Versjonsliste%20over%20programvare%20for%20prosjektet.xlsx&action=default&mobileredirect=true <br>
<br>
#### or look at the project version dependency: <br>
``.github/.install/VERSION_DEPENDENCY.md`` <br>
https://github.com/SoftEng2022Gruppe23/Tjeneste/blob/7f932ada91169f95aab48e97fc0f3e19d9a4e9e7/.github/.install/VERSION_DEPENDENCY.md <br>
<br>
#### And look at what you need to have as enivorment variables in windows: <br>
``.github/.install/enviroment_variables.md`` <br>
https://github.com/SoftEng2022Gruppe23/Tjeneste/blob/7f932ada91169f95aab48e97fc0f3e19d9a4e9e7/.github/.install/enviroment_variables.md <br>
<br>
#### How to change settings/default settings: <br>
https://www.jetbrains.com/help/idea/configuring-project-and-ide-settings.html <br>
https://www.jetbrains.com/help/idea/configure-project-settings.html <br>
https://www.jetbrains.com/idea/guide/tutorials/configuring-intellij-idea/configuring-preferences-settings/ <br>

____________________________________________________________________________________________________________ <br>

<br>____________________________________________________________________________________________________________ <br>
