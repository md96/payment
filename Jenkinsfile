pipeline {
    agent any

    tools {
        maven 'Maven 3.9.5'  // Must match Jenkins global tool config
        jdk 'Java 17'        // Must match Jenkins global tool config
    }

    environment {
        DOCKER_IMAGE = 'payment'
    }

    stages {
        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/md96/payment.git'
            }
        }

        stage('Build and Run Docker') {
            steps {
                sh '''
                    docker build -t ${DOCKER_IMAGE} .
                    docker run -d -p 8080:8080 ${DOCKER_IMAGE}
                '''
                echo 'Docker build and run commands executed'
            }
        }
    }
}
