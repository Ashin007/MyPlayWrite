pipeline {
   agent {
        any
        //docker { image 'mcr.microsoft.com/playwright:v1.32.0-focal' } }
   tools {
        maven 'maven-3.8.1'
        jdk 'jdk8'
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
