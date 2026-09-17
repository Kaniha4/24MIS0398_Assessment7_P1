pipeline {
    agent any

    parameters {
        choice(name: 'ENVIRONMENT', choices: ['dev', 'staging', 'prod'], description: 'Select the deployment environment')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Kaniha4/24MIS0398_Assessment7_P1.git'
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
