pipeline
{
    agent any
    stages 
    {
        stage('git repo & clean') 
        {
            steps
            {
               bat "rmdir  /s /q assesmentfile"
                bat "git clone https://github.com/Anoopanu9633/assesmentfile.git"
                bat "mvn clean -f assesmentfile"
            }
        }
       
        stage('package')
        {
            steps 
            {
                bat "mvn package -f assesmentfile"
            }
        }
    }
}
