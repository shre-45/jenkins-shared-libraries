def call(String ProjectName, String ImageTag, String AcrName){
  sh "docker build -t ${Project}:${ImageTag} ${AcrName}.azurecr.io/${Project}:${ImageTag} ."
}
