login_user:
	curl -i -H "Content-Type: application/json" -X POST -d '{ \
		"username": "admin", \
		"password": "password" \
	    }' \
	    http://localhost:8080/login
register_user:
	curl -H "Content-Type: application/json" -X POST -d '{ \
		"username": "admin", \
		"password": "password" \
	    }' \
	    http://localhost:8080/user/register
