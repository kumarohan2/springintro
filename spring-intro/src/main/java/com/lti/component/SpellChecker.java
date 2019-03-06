package com.lti.component;

import org.springframework.stereotype.Component;

@Component("splChecker")

public class SpellChecker {
	public void checkSpellingMistakes(String doc) {
System.out.println("Spell check done for "+doc);
	}
}
