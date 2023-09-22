package com.infosys.Service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infosys.beans.User;
import com.infosys.repo.UserRepo;

@Service
public class UserService implements UserRepo{
	List<String> ulist;

	@Override
	public void setUserList() {
		// TODO Auto-generated method stub
		ulist = new LinkedList<String>();
		ulist.add("aayush");
	    ulist.add("sanjay");
		
		
	}

	@Override
	public void getUseretList() {
		// TODO Auto-generated method stub
		for(String u:ulist)
		{
			System.out.println(u);
		}
	}

}
