pipeline {
   agent { docker { image 'mcr.microsoft.com/playwright:v1.32.0-focal' } }
   stages {
      stage('e2e-tests') {
         steps {
            mvn clean test -DsuiteXmlFile=testng.xml
         }
      }
   }
}