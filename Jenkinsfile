pipeline {
    agent any
    tools {
        maven 'maven_3_6_3'
    }
    stages {
        stage('Build maven') {
            steps {
                script {
                    checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Alessio-Zubiani/github-jenkins-docker-automation']])
                    sh 'mvn clean install'   
                }
            }
        }
        stage('Build docker image') {
            steps {
                script {
                    sh 'docker build -t alessiozubiani1996/github-jenkins-docker-integration .'
                }
            }
        }
        stage('Push image to Hub') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerhub_pwd', variable: 'dockerhub_pwd')]) {
                        sh 'docker login -u alessiozubiani1996 -p ${dockerhub_pwd}'
                    }
                    
                    sh 'docker push alessiozubiani1996/github-jenkins-docker-integration'
                }
            }
        }
    }
}