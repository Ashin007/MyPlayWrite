pipeline {
    agent any

    tools {
        maven 'maven-3.8.1'
        jdk 'jdk8'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }


    }


}
