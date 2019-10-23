pipeline {

         agent any

         tools {
            maven 'Maven 3.6.2'
            jdk 'JDK11'
         }

         stages {

                stage('Compile') {
                steps {

                   sh 'mvn compiler:compile'
                           }
                           }


                 stage('Unit Test') {
                 steps {

                   sh 'mvn resources:testResources'
                   sh 'mvn compiler:testCompile'
                   sh 'mvn surefire:test'

                 }
                 }

                  stage('Integration Test') {
                  steps {

                    sh 'mvn pre-integration-test'
                    sh 'mvn integration-test'
                    sh 'mvn post-integration-test'
                  }
                  }


         }

  }
