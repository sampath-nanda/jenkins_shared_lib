def call(String IP){
    withCredentials([usernamePassword(
            credentialsId: "jfrog",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
         sh "curl --user '$USER':'$PASS' http://${IP}:8081/artifactory"  
    }
}
