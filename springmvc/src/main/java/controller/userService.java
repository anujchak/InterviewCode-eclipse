package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class userService {
@Autowired
private userDao d;
public int createUser(users u)
{
	return this.d.insert(u);
}
}
