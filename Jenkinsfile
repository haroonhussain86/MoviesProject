pipeline {
    agent any
    tools {
        maven 'Maven3.5'
    }
    stages {
        stage('Initialize'){
            steps{
                echo "PATH = ${M2_HOME}/bin:${PATH}"
                echo "M2_HOME = /opt/maven"
                echo "JAVA_HOME = ${JAVA_HOME}"
            }
        }
        stage('Build') {
            steps {
                dir("/var/lib/jenkins/workspace/demopipelinetask/MoviesProject") {
                sh 'java -version'
                sh 'mvn --version'
                sh 'mvn -B -DskipTests clean package'
                }
            }
        }
     }
    post {
       always {
          junit(
        allowEmptyResults: true,
        testResults: '*/test-reports/.xml'
      )
      }
   } 
}
