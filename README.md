# java-8-demos

* Create a Porject in IntelliJ IDEA and then push the code to GitHub as belo steps

	• To configure User details to Git
	git config --global user.email "vijay.techgeek@gmail.com"
	git config --global user.name "vijayktech"

	• Initialize the project
	git init
	git add .
	git commit -m "comment here.."
	git log
	
	• Create Repo name in GitHub with same name of project created in IntelliJ.
	
	• Add the local project to remote Repo
	git remote add origin <git https url>
	Eg: 
	git remote add origin https://github.com/vijayktech/java-8-demos.git
	
	• git branch -M master
	git push -u origin master

