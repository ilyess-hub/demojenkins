pipeline{

  agent any
  tools {
   maven 'maven-3.96'
    
  }

  stages {
        stage("build jar"){

                steps{
                      script {
                        echo "building jar"
                        sh 'mvn package'
                      }
    
                      }
                  }


            stage("build image"){

                steps{
                      script {
                    echo "building image"
                         withCredentials([
                      usernamePassword(credentials: 'docker-hub-repo',usernameVariable: 'USER', passwordVariable: 'PWD')
                      ]) {

                           sh 'docker build -t ilyes10/my-repo:3.0 .'
                           sh "echo $PWD | docker login -u $USER --password-stdin"
                           sh 'docker push ilyes10/my-repo:3.0'
                      }
                      }
    
                      }
                  }


            stage("deploy"){

                steps{
                    script {
                      echo "deploy"
                    }
                      }
                  }
    
  }  
}
