def call(mavenHome , skipTests = false) {
    def mvnCommand = "${mavenHome}/mvn clean install"
    if (skipTests) {
        mvnCommand += " -DskipTests"
    }

    def process = mvnCommand.execute()
    process.waitFor()

    if (process.exitValue() == 0) {
        println "Build successful"
    } else {
        println "Build failed"
    }
}