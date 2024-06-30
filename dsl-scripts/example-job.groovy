job('example-job') {
    description('This is an example job created using Job DSL')
    scm {
        git('https://github.com/VarlaAmov/DSLs.git')
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        shell('echo Hello World')
    }
}
