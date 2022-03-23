package com.sahabt.library.applications;

import java.util.Optional;

import com.sahabt.library.domain.user.User;

public interface UserApplication {

	Optional<User> hireUser(User user);
	Optional<User> fireUser(User userId);
	Optional<User> editUser(User user);
	Optional<User> getInformationUser(User userId);
	

}
