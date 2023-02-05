def call(skipTests = false) {
    def mvnCommand = skipTests ? "mvn clean install -DskipTests" : "mvn clean install"

    def process = mvnCommand.execute()
    process.waitFor()

    if (process.exitValue() == 0) {
        println "Build successful"
    } else {
        println "Build failed"
    }
}