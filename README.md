✅ EXPERIMENT 2 – FINAL STEPS
🔹 1. Create Maven Project
IntelliJ → New Project → Maven
GroupId: org.example
ArtifactId: lab1

🔹 2. Update pom.xml
Add:
Selenium dependency
TestNG dependency
Maven resources plugin

🔹 3. Create Resources
Path: src/main/resources
Add file: index.html

🔹 4. Build Project
mvn clean install

🔹 5. Verify Output
Check docs/ folder created
index.html inside docs

🔹 6. Push to GitHub
git init
git add .
git commit -m "initial commit"
git remote add origin <repo-url>
git push -u origin master

🔹 7. Deploy Website
GitHub → Settings → Pages
Branch: master
Folder: /docs
Save
Copy website URL

🔹 8. Create Test Package
src/test/java
Package: org.test.Webpage

🔹 9. Create Test Class
Name: WebpageTest.java
Paste Selenium code

🔹 10. Update URL + Title
URL = your GitHub Pages link
Title = exact page title

🔹 11. Run Test
Right click → Run

🔹 12. Verify
Browser opens
Website loads
Test passes




pom file 
