Unit Testing With JUnit & Mockito
==================================
	Testing individual components of the application is called as Unit Testing.
	Unit testing is used to identify bugs in the code.
	Unit testing will help us in developing Quality code (bug free code)
	To perform Unit testing we will use JUnit with Mockito.

What is JUnit  
===================
	JUnit is java based framework.
	JUnit is used to implement unit testing for java application.

What is Mocking 
======================
	The process of creating dummy object is called as Mocking.
	Mock Objects are used only for unit testing.

Note : We can define behavior of the mock object.

What is Code Coverage 
========================
	The process of identifying which lines of code is executed in unit testing and which lines of code is not executed in unit testing is called as Code Coverage.
	Industry standard is 80% of code coverage for the project.
	To identify code coverage of the project we have several tools.
a.	SonarQube
b.	Jacocco
	Using code coverage reports, we can identify which lines of code is missed in unit testing so that we can write effective unit test cases.

Rest API Unit Testing 
===========================
	@WebMvcTest 		: To represent our target class.
	@MockBean			: To create mock obj for given class or interface.
	@MockBeanRequestBuilder	:  It is used to prepare HTTP Request.
	@MockMvc 			:  It provided methods to send the request.
	@MvcResult 			:  It is used to hold response given by REST API.

Code Coverage 
===================
	To check which lines of code executed in unit testing and which lines of code not executing in unit testing.
	Add the JaCoCo Plugin to Your pom.xml and execute maven goals clean package.

Note : Code coverage Report will be available in target/site/jacoco/index.html

<!-- JaCoCo Maven Plugin -->
	        <plugin>
	            <groupId>org.jacoco</groupId>
	            <artifactId>jacoco-maven-plugin</artifactId>
	            <version>0.8.12</version> <!-- Use the latest version available -->
	            <configuration>
      					<excludes>
      						<exclude>**/com/ram/binding/</exclude>
      						<exclude>**/com/ram/Application.class</exclude>
      					</excludes>
      				</configuration>
	            <executions>
	                <execution>
	                    <goals>
	                        <goal>prepare-agent</goal> <!-- Prepares JaCoCo agent before test execution -->
	                    </goals>
	                </execution>
	                <execution>
						<id>report</id>
						<phase>test</phase> <!-- You can specify when the report should be generated -->
	                    <goals>
	                        <goal>report</goal> <!-- Generates the code coverage report -->
	                    </goals>
	                </execution>
	            </executions>
	        </plugin>

Note : in the plugin we should have to add exclude for non testing package becouse Jacoco will check everything so we have to tell jacoco dont 
        include 

        <configuration>
      			<excludes>
      				<exclude>**/com/ram/binding/</exclude>
      				<exclude>**/com/ram/Application.class</exclude>
      			</excludes>
      	</configuration>
