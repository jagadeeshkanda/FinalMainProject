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
    post {
    success {
        emailext (
            subject: "✅ PR Build Passed",
            body: "The PR build passed successfully.",
            recipientProviders: [[$class: 'DevelopersRecipientProvider']]
        )
    }
    failure {
        emailext (
            subject: "❌ PR Build Failed",
            body: "The PR build failed. Please check the logs.",
            recipientProviders: [[$class: 'CulpritsRecipientProvider']]
        )
    }
}
}
