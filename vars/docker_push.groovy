def call(String Project, String ImageTag, String acrName) {
    withCredentials([usernamePassword(credentialsId: 'acr-credentials', usernameVariable: 'acrUser', passwordVariable: 'acrPass')]) {
        sh """
        echo "${acrPass}" | docker login ${acrName}.azurecr.io -u "${acrUser}" --password-stdin
        docker tag ${Project}:${ImageTag} ${acrName}.azurecr.io/${Project}:${ImageTag}
        docker push ${acrName}.azurecr.io/${Project}:${ImageTag}
        """
    }
}
