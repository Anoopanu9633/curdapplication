pipeline
{
    agent any
  environment {
        registry = "public.ecr.aws/b8j5j7c4/anoopanu"
    }
    stages 
    {
        stage("git repo & clean") 
        {
            steps
            {
              //bat "rmdir  /s /q curdapplication"
              // bat "git clone https://github.com/Anoopanu9633/curdapplication.git"
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
              bat 'docker pull anoop9633/curdapplication'
                //docker.build registry        
            }
        }
     stage('Pushing into ecr')
         {
             steps
            {
             bat 'aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws/b8j5j7c4'
              bat 'docker push public.ecr.aws/b8j5j7c4/anoopanu:latest'
            }
         }
        
        //  stage('Pushing docker image')
        // {
        //     steps
        //     {
        //         bat "docker login -u anoop9633 -p Preetha123"   
        //         bat 'docker push anoop9633/curdapplication'
        //     }
         // }
             }
    
    
 }
