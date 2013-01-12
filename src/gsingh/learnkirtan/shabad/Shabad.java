package gsingh.learnkirtan.shabad;

import gsingh.learnkirtan.note.Note;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Map;

public class Shabad implements Serializable {

	private LinkedList<Note> notes = new LinkedList<Note>();
	private Map<String, Integer> labelPos;
	private String shabadText;
	private String words;

	public Shabad(String shabadText) {
		this.shabadText = shabadText;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public LinkedList<Note> getNotes() {
		return notes;
	}

	public LinkedList<Note> getNotes(String start, String end) {
		return notes;
	}

	public String getShabadText() {
		return shabadText;
	}

	public void addNote(Note note) {
		notes.add(note);
	}

	public void addLabel(String label, int pos) {
		labelPos.put(label, pos);
	}

	@Override
	public String toString() {
		return String.format("ShabadObject[%s]", getShabadText());
	}

	public void addLongNote() {
		Note note = notes.get(notes.size() - 1);
		note.setLength(note.getLength() + 1000);
	}
}
