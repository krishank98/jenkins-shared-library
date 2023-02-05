@Library('jenkins-shared-library') _
pipeline{
    agent any
    parameters {
        string(name: 'repoUrl', defaultValue: '<repo_url>', description: 'The URL of the repository')
        string(name: 'branch', defaultValue: '<branch_name>', description: 'The name of the branch')
        booleanParam(name: 'skipTests', defaultValue: false, description: 'Whether to skip tests during the build')
    }
     environment {
        MAVEN_HOME = '/usr/local/sdkman/candidates/maven/current/'
    }
    stages{
        stage('init'){
            steps{
                
                checkoutGitRepo("https://github.com/krishank98/springboot-app-pipeline", branch="main")
            
            }
        }
        stage ('mvn build'){
            steps{
                buildJar("/usr/local/sdkman/candidates/maven/current/",false)
            }
        }
}
}
