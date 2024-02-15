def buildApp(){
  echo 'building the app'
}

def testApp(){
  echo 'testing the app'
}

def deployApp(){
  echo 'deploying the app'
    echo "deploying the app with ${params.VERSION}"
}

return this
