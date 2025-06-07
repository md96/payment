pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/md96/payment.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("payment")
                }
            }
        }

        stage('Run Container') {
            steps {
                script {
                    docker.image("payment").run()
                }
            }
        }
    }
}