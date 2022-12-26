package com.springBoot.Service;

import com.springBoot.model.Login;
import com.springBoot.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginData {

    @Autowired
    LoginRepository loginRepository;


    public void checkData(String username, String password)
    {
        Login login = new Login(username,password);
    }

    public void saveData(String username, String password)
    {
        Login login = new Login(username,password);
        loginRepository.save(login);
    }


}
