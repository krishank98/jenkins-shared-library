def call(Map parameters){
    def imageName = parameters.imageName
    def Dockerfile = parameters.Dockerfile
    script {
                        sh "docker build -t ${imageName} -f ${Dockerfile} ."
                    }
}