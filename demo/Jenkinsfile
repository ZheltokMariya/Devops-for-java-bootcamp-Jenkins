pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Prebuild') {
            steps {
                sh 'mvn clean'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Analysis') {
            steps {
                sh 'mvn spotbugs:check'
            }
        }
    }
}