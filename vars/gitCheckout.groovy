def gitCheckout(repoUrl,branch="master"){
    checkout([
        $class: 'GitScm'
        branches: [[name: "*/$branch"]],
        userRemoteConfigs:[[
            url: repoUrl
        ]]
    ])
}