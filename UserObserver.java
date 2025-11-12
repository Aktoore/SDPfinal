public class UserObserver implements Observer{
    private String username;
    public UserObserver(String username)
    {
        this.username = username;
    }

    @Override
    public void update(String Vmodel, boolean available){

        if(available){
            System.out.println("Notification for "+username+"  "+Vmodel+"is available now");
        }
        else{
            System.out.println("Notification for "+username+"  "+Vmodel+"is not available now");
        }
    }
}
