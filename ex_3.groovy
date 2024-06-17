

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
				echo "Build ${env.BUILD_NUMBER} on ${env.JENKINS_URL} and the job_name is: ${env.JOB_NAME}"
				echo "${params.Message}"
				echo "${params.DEBUG_MODE}"
				echo "${params.ENVIRONMENT}"
				echo "${params.SECRET}"
			}
			post{
				success {
					echo 'The steps were a success Horray!!'
				}
				failure {
					echo 'The steps were a failure Whomp Whomp :('
				}
				cleanup {
					echo 'Cleanup on aisle 3 please, cleanup on aisle 3'
				}
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
