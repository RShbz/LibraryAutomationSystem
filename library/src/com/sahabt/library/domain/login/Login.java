package com.sahabt.library.domain.login;

import com.sahabt.library.domain.annotations.Aggregate;
import com.sahabt.library.domain.user.IdentityNo;

@Aggregate(id="")
public class Login {
	private IdentityNo  identityNo;
	private Username  username;
	private Password  password;
}
