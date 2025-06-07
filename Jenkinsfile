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
                git branch: 'main', url: 'https://github.com/md96/payment.git'
            }
        }


     stages {
            steps {
                chmod +x build.sh
                ./build.sh
            }
        }






    }
}
