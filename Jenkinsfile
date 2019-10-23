pipeline {

         agent any

         tools {
            maven 'Maven 3.6.2'
            jdk 'JDK11'
         }

         stages {

                stage('Compile') {
                steps {

                   sh 'mvn compile'
                           }
                           }


                 stage('Unit Test') {
                 steps {

                    sh 'mvn test'

                 }
                 }

                  stage('Build') {
                  steps {

                    sh 'mvn verify'
                  }
                  }


         }

  }
