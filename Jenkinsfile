@Library('jenkins-shared-library') _
pipeline{
    agent any
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
