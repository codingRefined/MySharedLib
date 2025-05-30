def call(String repoUrl, String branch = 'main') {
    stage('Clone Repo') {
        git branch: branch, url: repoUrl
    }
}
