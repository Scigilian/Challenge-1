## Scigilian Challenge 1

#### In order to evaluate your skills we would like you to develop a web application satisfying the following requirements:
1. Parse a user-supplied CSV-formatted text file, the attached file should serve as a template of the structure of the file.
 - Values in column 1 are maximum binding values (Max), the average of these is considered the 100% drug effect threshold.
 - Values in column 12 are non-specific binding values (Min), the average of these is considered the 0% drug effect threshold.
 - Values in columns 2 through 11 are drug response values (Measured Binding). Each value is a separate drug's response.
 - Parsing should be performed on the server.
2. Calculate the following statistics:
 - Averages of the max binding and the non-specific binding values
 - Standard deviations of the max binding and non-specific binding values
 - Background-subtracted percent inhibition of each of the drug responses, defined as:
	```Inhibition (%) = 100 - ((Measured Binding - Min) / (Max - Min)) x 100```
 - The calculations should be performed on the server
3. Present the results on a web-page:
 - Plot on a chart the observed values and calculated statistics such that it would be easy to visually detect abnormal results. Use any client-side plotting libraries you feel comfortable with.
 - Present the drug responses as well as their inhibitions such that it would be easy to identify abnormal or interesting drugs. Present them in any way you think would make it easy for users to identify potent medicines.
 - The web-page rendering should be performed on the client. You may use any client-side technology to do so (e.g. AngularJS, Backbone, Ember.js, Knockout, React, ...)

#### You will be asked to demonstrate the application as well as discuss its design and the reasons for your choices. Also, be prepared to discuss the following:
1. How would you handle an experiment comprised of more than one such files?
2. How would you handle needing to omit certain values from the calculations, for example, because of a robotic malfunction?
3. How would you handle varying the analysis performed (different calculations)?
4. How would you handle experiments where controls (max binding, non-specific binding) are in different locations?

#### Application structure
The application is a Spring Boot MVC application. The com.scigilian.challenge.controllers.BasicController rest controller is the entrypoint for the CSV upload. This will probably be your starting point for parsing the CSV and extracting the data.

#### Pre-requisites
You will need the following installed on your development system:
 - Java 8
 - Maven 3.2.5

#### Publishing your solution
Please don't fork the repo since that would publish your solution to all candidates. Instead, clone the repo locally and, once you're done, ZIP it up and send it to us.

### Good luck!
