package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import controllers.Secure;

public class Security extends Secure.Security{
    static boolean authenticate(String username, String password) {
        return "user".equals(username);
    }
    
    static Set<String> roles() {
    	return new HashSet<String>(Arrays.asList("user"));
    }
}
