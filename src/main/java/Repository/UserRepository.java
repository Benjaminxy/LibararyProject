package Repository;

import model.User;

public class UserRepository {

    private static  User [] users = new User[200];

    private static int size;


    public boolean addUser(User user) {

        if(user==null)
        {

            return false;
        }

        for (int i = 0; i < users.length; i++) {
            if(users[i]==null)
            {
                users[i] = user ;
                size++;
                return true;

            }

        }
       return  false;
    }
}
