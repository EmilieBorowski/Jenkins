@Library('my-library') _
pipeline{
 agent any
 stages{
 stage('Build'){
 steps {
 echo 'Pipeline Build Step'
 script {
 myLogger.info 'Starting'
 myLogger.warning 'Build stage Ending'
 }
 }
 }
 }
}
