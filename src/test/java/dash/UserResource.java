package dash;

import dash.core.util.EmailAddress;

/**
 * Created by mglanvill on 2015/03/17.
 */
public class UserResource {
    public String usernameX;

    public String passwordX;

    public String firstnameX;

    public String lastnameX;

    public EmailAddress emailX;

    public Boolean enabledB;

    public String saltX;

    public Authority authority;

    static class Authority {

        public Role role;

        static class Role {
            String descX;
        }
    }

}
