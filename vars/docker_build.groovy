def call(String ProjectName, String ImageTag, String ACrName){
  sh "docker build -t ${Project}:${ImageTag} ${acrName}.azurecr.io/${Project}:${ImageTag} ."
}
