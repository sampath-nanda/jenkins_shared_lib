def call(String IP){
    withCredentials([usernamePassword(
            credentialsId: "jfrog",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
    sh "curl -X PUT -u '${USER}:${PASS}' -T target/*.jar http://${IP}:8082/artifactory/example-repo-local/"
    }
} 
