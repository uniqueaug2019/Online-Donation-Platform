package spring.donation.donation.service;

import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import spring.donation.donation.daos.IUserDao;
import spring.donation.donation.pojos.User;
@Service
public class UserServiceImpl implements IUserService {
	IUserDao dao;
	@Override
	public User authnticate(User user) {
		User temp=new User();
		temp.setEmail(user.getEmail());
		temp.setName(user.getName());
		temp.setPassword(user.getPassword());
		/*
		 * Example<User> eu=Example.of(temp);//search obj in table
		 * Optional<User>optional=dao.findOne(eu); if(optional.isPresent())//check user
		 * avail or not { return optional.get(); }
		 */
		return temp;
	}

}
