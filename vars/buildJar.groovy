def call(skipTests = false) {
    def mvnCommand = "mvn clean install"
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