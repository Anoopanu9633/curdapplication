pipeline
{
    agent any
     stages 
    {
        stage("git repo & cleans") 
        {
            steps
            {
              //bat "rmdir  /s /q curdapplication"
              bat "git clone https://github.com/Anoopanu9633/curdapplication.git"
                bat "mvn clean -f curdapplication"
            }
        }
       
        stage('package')
        {
            steps 
            {
                bat "mvn package -f curdapplication"
            }
        }
        
       stage('Building docker image')
        {
           steps
            {
               bat 'docker build -t anoop9633/curdapplication .'
             //bat 'docker pull anoop9633/curdapplication'
              //  docker.build registry        
            }
        }   
         stage('Pushing docker image')
        {
            steps
            {
                bat "docker login -u anoop9633 -p Preetha123"   
                bat 'docker push anoop9633/curdapplication'
            }
         }
             }
    
    
 }
