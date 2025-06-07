pipeline {
    agent any

    tools {
        maven 'Maven 3.9.5' // Must match name in Jenkins → Global Tool Configuration
        jdk 'Java 17'       // Same here
    }

    environment {
        DOCKER_IMAGE = 'payment'
    }

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/md96/payment.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Docker Build & Run') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
                sh 'docker run -d -p 8081:8080 $DOCKER_IMAGE'
            }
        }
    }
}
