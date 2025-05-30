def call(String goal = 'package'){
  
    sh "mvn ${goal}"
  
}
