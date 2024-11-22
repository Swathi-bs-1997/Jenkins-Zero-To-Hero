pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Clone the repository
                git 'https://github.com/<your-username>/HelloWorld-Java.git'
            }
        }
        stage('Build') {
            steps {
                // Compile the Java program
                sh 'javac HelloWorld.java'
            }
        }
        stage('Run') {
            steps {
                // Run the Java program
                sh 'java HelloWorld'
            }
        }
    }
}
