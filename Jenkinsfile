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
            to: "jagadeeshkanda@gmail.com"
        )
    }
    failure {
        emailext (
            subject: "❌ PR Build Failed",
            body: "The PR build failed. Please check the logs.",
            to: "${env.CHANGE_AUTHOR_EMAIL}"
        )
    }
}
}
