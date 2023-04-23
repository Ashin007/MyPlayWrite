pipeline {
   agent {
        docker { image 'mcr.microsoft.com/playwright:v1.32.0-focal' } }
   tools {
   maven 'maven'
   }
   stage('Build') {
               steps {
                   sh 'mvn clean package'
               }
           }
   stages {
      stage('E2E Test') {
         steps {
            sh 'mvn test'
         }
      }
   }
}