pipeline {
   agent { docker { image 'mcr.microsoft.com/playwright:v1.32.0-focal' } }
   stages {
      stage('e2e-tests') {
         steps {
            // Depends on your language / test framework
               sh 'java -version'
              sh 'mvn -version'
            sh 'mvn clean install'
         }
      }
   }
}
