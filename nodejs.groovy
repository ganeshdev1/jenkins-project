job('NodeJS example') {
    	scm {
        	git('https://github.com/ganeshdev1/nodejs-app.git') {  node -> // is hudson.plugins.git.GitSCM
            	node / gitConfigName('DSL User')
            	node / gitConfigEmail('jenkins-dsl@gmail.com')
        	}
    	}
    	triggers {
        	scm('H/5 * * * *')
    	}
    	wrappers {
        	nodejs('nodejs') // this is the name of the NodeJS installation in 
                         
    	}
    	steps {
        	shell("npm install")
    	}
	}
