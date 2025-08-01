def call(String app, String tag, String path) {
    dir(path) {
        sh "docker build -t ${app}:${tag} ."
    }
}
