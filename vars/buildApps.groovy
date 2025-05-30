def call(String goal = 'package'){
  stage('build'{
    sh "mvn ${goal}"
  })
}