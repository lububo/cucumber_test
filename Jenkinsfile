pipeline {
    agent any

    tools {
        maven 'Maven_3_5_0'
        jdk 'java8'
    }

    stages {
        stage('Initialize') {
            steps {
            bat '''
                echo "PATH = %PATH%"
                echo "M2_HOME = %M2_HOME%"
                echo "Initializing.."
                '''
            }
        }
        stage('Test') {
            steps {
              bat  '''
                mvn clean install
                mvn --version
                '''
                }
                    post {
                    success{
                           junit 'target/surefire-reports/**/*.xml'
                        }
                    }
        }
                stage('Reporting') {
                    steps {
                      mvn verify
                        }
                            post {
                            success{
                                cucumber buildStatus: null, fileIncludePattern: '**/*.json', sortingMethod: 'ALPHABETICAL'
                                }
                            }
                }
    }
}