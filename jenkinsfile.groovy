pipeline{
  agent any
  stages{
    stage('Build'){
      steps{
        echo "Building a project"
      }
    }
    stage('Test'){
      steps{
        echo "Testing a project"
      }
    }
    stage('Deploy'){
      steps{
        echo "Deploying a project"
      }
    }
  }
}
