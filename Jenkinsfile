
pipeline {
	parameters {
    		string(name: 'Message', defaultValue: 'Hello', description: 'Welcome message')
  		booleanParam(name: 'DEBUG_MODE', defaultValue: false, description: 'Enable debug mode')
    		choice(name: 'ENVIRONMENT', choices: ['DEV', 'STAGING', 'PRODUCTION'], description: 'Select the environment')
    		password(name: 'SECRET', description: 'A secret password')
	}
	agent any
	stages{
		stage('Build') {
			steps{
				echo 'Pipeline Build Step'
				echo "Build ${env.BUILD_NUMBER} on ${env.JENKINS_URL}"
				echo "${params.DEBUG_MODE}"
				echo "${params.ENVIRONMENT}"
				echo "${params.SECRET}"
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
