//Create a new controller called DaikichiController

package com.codingdojo.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//...annotate it as a @RestController

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
//	Have an http GET request to 'http://localhost:8080/daikichi' display text that says 'Welcome!'
	
	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}

//	Have an http GET request to 'http://localhost:8080/daikichi/today' display text that says 'Today you will find luck in all your endeavors!'
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
//	Have an http GET request to 'http://localhost:8080/daikichi/tomorrow' display text that says 'Tomorrow, an opportunity will arise, so be sure to be open to new ideas!'
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
//	Daikichi Path Variables tasks:
	
//	Add 2 new routes with corresponding method definitions that will accept path variables.
	
//	Have an http GET request to 'http://localhost:8080/daikichi/travel/kyoto' where the url will take any string for the city, and display text that says for example, 'Congratulations! You will soon travel to kyoto!'.
	
	@RequestMapping("/travel/{place}")
	public String travel(@PathVariable("place") String place) {
		return "Congratulations! You will soon travel to " + place + "!";
	}
	
//	Have an http GET request to 'http://localhost:8080/daikichi/lotto/8', where the url will take any integer. If the number is even, display text that says 'You will take a grand journey in the near future, but be weary of tempting offers'. If it is odd, display text that says "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends."
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int guess) {
		if(guess % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
	
}
