# list-code-validator

List Code Validator will check to see if a LISP code's parenthesis are balanced. <br />
Examples:<br />
&nbsp;	1.()<br />
&nbsp;	2.(())<br />
&nbsp;	3.(Some(Text)AndStuff)

## Installation and Execution
Clone the repo at https://github.com/lbc2k1385/list-code-validator.git.

<strong>From the command line:</strong> <br/>
Navigate to the project home directory in your local repo and run mvn clean install. This should generate the following jar file in the target folder:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;lisp-code-validator-0.0.1-SNAPSHOT-jar-with-dependencies.jar<br/>

To run this program use the following example command:<br/>
java -jar target/lisp-code-validator-0.0.1-SNAPSHOT-jar-with-dependencies.jar '(())'

<strong>From Eclipse:</strong> <br/>
Open Eclipse, navigate to File->Import->Existing Maven Projects<br/>
In the root directory drop down, navigate to the project directory in your local repo, select the POM file, and click Finish.<br/>
Right click on the project in the Project Explorer View click on Run As-> Maven Install<br/>
To Run, navigate to Run->Run Configuration->Arguments->Program Arguments, add any argument you like, and click Run.

