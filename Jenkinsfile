pipeline {
   agent {
        docker { image 'mcr.microsoft.com/playwright:v1.32.0-focal' } }
   tools {
   maven 'maven'
   }
   stages {
      stage('E2E Test') {
         steps {
            mvn clean test -DsuiteXmlFile=testng.xml
         }
      }
   }
}