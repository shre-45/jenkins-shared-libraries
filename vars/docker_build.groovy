def call(String ProjectName, String ImageTag, String ContextDir){
  sh "docker build -t ${ProjectName}:${ImageTag} -f ${ContextDir}/Dockerfile ${ContextDir}"
}

