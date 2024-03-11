def call(String IP){
    withCredentials([usernamePassword(
            credentialsId: "jfrog",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) 
    sh "curl -X PUT -u '$USER' -p '$PASS' -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://${IP}:8082/artifactory/example-repo-local/"  
}
