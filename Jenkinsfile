pipeline {
agent any
  stages 
    {
    stage('Clean') {
       
      steps {
        sh 'mvn clean'
      }
    }
    stage('Compile') {
      steps {
        sh 'mvn compile'
      }
    }
    stage('Build jar file') {
      steps {
        sh 'mvn install -DskipTests'
      }
	}
    stage('Building docker image with jar file'){
     steps{
      sh 'docker build -t siddarthdesu/test_devops .'
     }
     }  
    }
  }

