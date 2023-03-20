def buildApp() {
    echo 'Building the applcation....'
}
def testApp() {
    echo 'Testing the applcation....'
}
def deployApp() {
    echo 'Deploying the applcation....'
    echo "Deploying version ${params.VERSION}"
    GIT_COMMIT_HASH = sh "(git log -n 1 --pretty=format:'%H')"

                echo "**************************************************"
                echo "${GIT_COMMIT_HASH}"
                echo "**************************************************"
}
return this
