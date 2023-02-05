def call(repoUrl, branch = "master") {
  checkout([
    $class: 'GitSCM',
    branches: [[name: "*/$branch"]],
    doGenerateSubmoduleConfigurations: false,
    extensions: [],
    submoduleCfg: [],
    userRemoteConfigs: [[
      url: repoUrl
    ]]
  ])
}
