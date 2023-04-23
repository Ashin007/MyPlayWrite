pipeline {
     agent {
        docker {
            image 'mcr.microsoft.com/playwright:v1.32.0-focal'
            }
           }

    tools {
        maven 'Local_Maven'
        jdk 'Local_Java'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Test') {
            steps {
                dir(path: "${workspace}"){
                bat 'mvn clean install'
                }
            }
        }


    }


}
