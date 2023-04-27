pipeline {
     agent {
        docker {
            image 'mcr.microsoft.com/playwright:v1.32.0-focal'
            }
           }


    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Test') {
            steps {
                bat 'mvn clean install'
            }
        }


    }


}
