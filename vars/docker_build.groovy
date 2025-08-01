def docker_build(app, tag, path) {
    dir(path) {
        sh "docker build -t ${app}:${tag} ."
    }
}

