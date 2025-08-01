def call(String ProjectName, String ImageTag, String ServicePath){
  sh "docker build -t ${ProjectName}:${ImageTag} ${ServicePath}"

}
