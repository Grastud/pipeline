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
         }

  }
