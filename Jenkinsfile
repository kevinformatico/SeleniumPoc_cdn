pipeline {
   agent {

    }
  stages {
    stage('Download Feature Files'){
            steps {
                downloadFeatureFiles serverAddress: 'http://35.235.105.137',
                    projectKey: 'TBDD',
                    targetPath:'src/test/resources/features'
            }
        }
    stage('Clean Work Space'){
        steps {
            sh 'mvn clean'
            }
         }
    stage('Integration Test') {
      steps {
        sh 'mvn install'
      }
    }
  }
  post {
    always {
      archiveArtifacts(artifacts: 'target/', fingerprint: true)
      junit 'target/cucumber.xml'
      publishTestResults  serverAddress: 'http://35.235.105.137',
                          projectKey: 'TBDD',
                          filePath:'target/cucumber-report/cucumber.json',
                          format: 'Cucumber',
                          autoCreateTestCases: false
    }
  }
}