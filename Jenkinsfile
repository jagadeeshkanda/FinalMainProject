pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building PR..."
                bat 'mvn clean install'
            }
        }
    }
}