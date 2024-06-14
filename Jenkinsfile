
pipeline {
	parameters {
    		string(name: 'Message', defaultValue: 'Hello', description: 'Welcome message')
  	}
	agent any
	stages{
		stage('Build') {
			steps{
				echo 'Pipeline Build Step'
				echo "Build ${env.BUILD_NUMBER} on ${env.JENKINS_URL}"
				echo "${params.Message}"
			}
		}
		stage('Test') {
			steps{
				echo 'Pipeline Test Step'
			}
		}
		stage('Deploy') {
			steps {
				echo 'Pipeline Deploy Step'
			}
		}

		      
	
	}
}
