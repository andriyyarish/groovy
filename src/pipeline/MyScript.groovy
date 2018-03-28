package pipeline

import groovy.transform.Field

@Field def constant = "My constant"

def copy(projectname){
    println(projectname)
}

def printConst(){
    println constant
}

copy("some name")
printConst()



