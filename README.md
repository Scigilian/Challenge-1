Scigilian Challenge 1

In order to evaluate your skills we would like you to develop a web application satisfying the following requirements:

	Parse a user-supplied CSV-formatted text file, the attached file should serve as a template of the structure of the file.
		Values in column 1 are maximum binding values (Max), the average of these is considered the 100% drug effect threshold.
		Values in column 12 are non-specific binding values (Min), the average of these is considered the 0% drug effect threshold.
		Values in columns 2 through 11 are drug response values (Measure Binding). Each value is a separate drug's response.

	Calculate the following statistics:
		Averages of the max binding and the non-specific binding values
		Standard deviations of the max binding and non-specific binding values
		Background-subtracted percent inhibition of each of the drug responses, defined as:
			Inhibition (%) = 100 - ((Measured Binding - Min) / (Max - Min)) x 100

	Plot on a chart the observed values and calculated statistics such that it would be easy to visually detect abnormal results.

	Present the drug responses as well as their inhibitions in a table such that it would be easy to identify abnormal or interesting drugs.

You will be asked to demonstrate the application as well as discuss its design and the reasons for your choices. Also, be prepared to discuss the following:
	How would you handle the situation where an experiment was comprised of multiple such files?
	How would you handle the situation where a user needed to omit certain values from the calculations because of a robotic malfunction?
	How would you handle the situation where a user needed a different analysis performed (different calculations)?
	How would you handle the situation where some experiments placed their controls (max binding, non-specific binding) in different locations?

You may develop this in any technology you feel comfortable using but it has to be web based.

Good luck!
