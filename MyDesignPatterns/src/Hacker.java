public class Hacker implements User{

    private User realUser;

    public Hacker(User realUser, boolean isTheRealUser) {
        this.realUser = new ActualUser();
        this.isTheRealUser = isTheRealUser;
    }

    boolean isTheRealUser;

    @Override
    public String logIn() {
        if(isTheRealUser==true)
        {
            return realUser.logIn();
        }
        else{
            return "Unauthorized access";
        }
    }
}
