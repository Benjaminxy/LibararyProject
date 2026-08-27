package Repository;

import model.Book;
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

    public int getUserCount() {

        return size;
    }

    public User[] getAllUsers(int number) {
        User []userList = new User[number];
        for (int i = 0; i < userList.length; i++) {

            userList [i]=users[i];
        }

        return userList;
    }

    public User findUserByNationalCode(String nationalCode) {
        for (int i = 0; i < users.length; i++) {
            if(users[i] != null && users[i].getNationalCode().equals(nationalCode))
            {
                return users[i];
            }
            
        }
        return null;
    }
}
