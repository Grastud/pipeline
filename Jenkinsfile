pipeline {

         agent any

         tools {
         maven 'Maven 3.6'
         jdk 'JDK11'
         }

         stages {

                 stage('Compile') {

                 steps {

                   mvn compile

                 }

                 }

                 stage('Unit Test') {

                 steps {

                   mvn resources: testResources

                   mvn compiler: testCompile

                   mvn surefire: test

                 }

                 }


                 stage('Four') {

                 parallel {

                            stage('Unit Test') {

                           steps {

                                echo "Running the unit test..."

                           }

                           }

                            stage('Integration test') {

                              agent {

                                    docker {

                                            reuseNode true

                                            image 'ubuntu'

                                           }

                                    }

                              steps {

                                echo "Running the integration test..."

                              }

                           }

                           }

                           }

              }

}