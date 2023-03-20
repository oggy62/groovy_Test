def buildApp() {
    echo 'Building the applcation....'
}
def testApp() {
    echo 'Testing the applcation....'
}
def deployApp() {
    echo 'Deploying the applcation....'
    echo "Deploying version ${params.VERSION}"
    git branch: 'main', url: 'https://github.com/oggy62/groovy_Test.git'
    sh 'echo "Commit ID: ${GIT_COMMIT}"'
}
return this
