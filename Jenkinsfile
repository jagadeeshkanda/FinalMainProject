pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building PR..."
                sh 'mvn clean install'
            }
        }
    }
}