pipeline {
    agent any

    tools {
        maven 'Maven 3.9.5' // Must match Jenkins global tool config
        jdk 'Java 17'       // Must match Jenkins global tool config
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

        stage('Check OS') {
  steps {
    sh 'uname -a'  // for Linux agents
    // or
    bat 'ver'      // for Windows agents
  }
}

       
    }
}
