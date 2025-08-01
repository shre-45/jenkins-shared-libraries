def call(String app, String tag) {
    dir(path) {
        sh "docker build --no-cache -t ${app}:${tag} ."
    }
}
