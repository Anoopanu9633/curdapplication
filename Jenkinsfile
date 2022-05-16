pipeline
{
    agent any
    stages 
    {
        stage('git repo & clean') 
        {
            steps
            {
               bat "rmdir  /s /q TicketBookingServiceJunitTesting"
                bat "git clone https://github.com/kishancs2020/TicketBookingServiceJunitTesting.git"
                bat "mvn clean -f TicketBookingServiceJunitTesting"
            }
        }
       
        stage('package')
        {
            steps 
            {
                bat "mvn package -f TicketBookingServiceJunitTesting"
            }
        }
    }
}
