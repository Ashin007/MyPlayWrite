pipeline {
    agent any

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
                bat 'mvn clean install'
            }
        }


    }


}
