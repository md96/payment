pipeline {
    agent any

    tools {
        maven 'Maven 3.9.5' // Must match name in Jenkins → Global Tool Configuration
        jdk 'Java 17'       // Same here
    }

    environment {
        DOCKER_IMAGE = 'payment'
    }

    stage('Clone') {
        steps {
        git branch: 'main', url: 'https://github.com/md96/payment.git'
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
                sh 'docker build -t payment .'
                sh 'docker images'
                sh 'docker run -d -p 8081:8080 payment'
                sh 'docker ps'
                 sh 'docker logs $(docker ps -lq)'
                 }
            }
    }
}
