package Service;

import Repository.UserRepository;
import model.User;
import utility.Validator;

public class UserService {
    private final UserRepository userRepository= new UserRepository();
    private final Validator validator = new Validator();

    public boolean addUser(User user)
    {

        if (!validator.isValidName(user.getName()))
            return false;
        /*if (!validator.isValidName(user.getPassword()))
            return false;


         */


        if (!validator.isValidNationalCode(user.getNationalCode()))
            return false;


        if (!validator.isValidPassword(user.getPassword()))
            return false;




       if ( ! userRepository.addUser(user)  ) {
           return false;
       }
        return true;
    }



}
