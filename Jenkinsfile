pipeline {
  agent {
    docker {
      image 'markhobson/maven-chrome'
    }

  }
  stages {
    stage('Download Feature Files'){
            steps {
                downloadFeatureFiles serverAddress: 'http://rutadelservidor:puertodelservidor',
                    projectKey: 'keydelproyecto',
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
      publishTestResults  serverAddress: 'http://rutadelservidor:puertodelservidor',
                          projectKey: 'keydelproyecto',
                          filePath:'target/cucumber-report/cucumber.json',
                          format: 'Cucumber',
                          autoCreateTestCases: false
    }
  }
}