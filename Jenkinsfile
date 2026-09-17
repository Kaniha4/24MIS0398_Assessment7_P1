pipeline {
    agent any

    parameters {
        choice(name: 'ENVIRONMENT', choices: ['dev', 'staging', 'prod'], description: 'Select the deployment environment')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'YOUR_GITHUB_REPOSITORY_URL'
            }
        }

        stage('Build') {
            steps {
                bat 'javac StudentManagement.java'
            }
        }

        stage('Show Parameter') {
            steps {
                echo "Selected environment: ${params.ENVIRONMENT}"
                echo "Student Management System built for ${params.ENVIRONMENT}"
            }
        }
    }
}
