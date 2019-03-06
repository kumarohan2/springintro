package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txtEditor")
public class TextEditor {
	
	@Autowired // DI
	private SpellChecker spell;
	public void loadDocument(String doc) {
		
		System.out.println("Loaded" +doc);
	//	SpellChecker spell = new SpellChecker();
		
	spell.checkSpellingMistakes(doc);
	}
}
