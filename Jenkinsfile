pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('compile'){
            steps{
                sh 'mvn --version'
                sh 'mvn clean compile'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}