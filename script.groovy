def buildApp() {
    echo 'Building the applcation....'
}
def testApp() {
    echo 'Testing the applcation....'
}
def deployApp() {
    echo 'Deploying the applcation....'
    echo "Deploying version ${params.VERSION}"
}
return this
