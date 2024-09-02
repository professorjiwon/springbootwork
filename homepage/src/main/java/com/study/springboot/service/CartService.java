package com.study.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.domain.Cart;
import com.study.springboot.repository.CartRepository;

@Service
public class CartService {
	@Autowired
	CartRepository cartRepository;

	public Cart addcart(Cart cart) {
		return cartRepository.save(cart);
	}

	public List<Cart> getCart(String memId) {
		return cartRepository.findByMemIdOrderById(memId);
	}
}
