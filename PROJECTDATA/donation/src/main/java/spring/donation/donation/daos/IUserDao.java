package spring.donation.donation.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.donation.donation.pojos.User;
@Repository
public interface IUserDao extends JpaRepository<User, String>{
//jpa repository auto provides CRUD operations
}
